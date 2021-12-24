package apps.cronometro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class cronometro implements ActionListener {
    
    private JFrame frame = new JFrame();
    private JButton startButton = new JButton("INICIAR");
    private JButton resetButton = new JButton("RENICIAR");
    private JLabel timeLabel = new JLabel();
    private int elapsedTime = 0;
    private int seconds =0;
    private int minutes =0;
    private int hours =0;
    private boolean started = false;
    private String seconds_string = String.format("%02d", seconds);
    private String minutes_string = String.format("%02d", minutes);
    private String hours_string = String.format("%02d", hours);
    
    Timer timer = new Timer(1000, new ActionListener() {

    public void actionPerformed(ActionEvent e) {

        elapsedTime=elapsedTime+1000;
        hours = (elapsedTime/3600000);
        minutes = (elapsedTime/60000) % 60;
        seconds = (elapsedTime/1000) % 60;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        hours_string = String.format("%02d", hours);
        timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
    }
    });

    public cronometro(){

        timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
        timeLabel.setBounds(0,0,200,100);
        timeLabel.setFont(new Font("Arial",Font.BOLD,35));
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setBackground(Color.GRAY);
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(0,100,100,50);
        startButton.setFont(new Font("Arial",Font.BOLD,16));
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(Color.GREEN);
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setBounds(100,100,100,50);
        resetButton.setFont(new Font("Arial",Font.BOLD,15));
        resetButton.setForeground(Color.WHITE);
        resetButton.setBackground(Color.ORANGE);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(startButton);
        frame.add(resetButton);
        frame.add(timeLabel);
 
        URL iconURL = getClass().getResource("/img/icons/mini-cronometro.png");
        ImageIcon icon = new ImageIcon(iconURL);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(215,190);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

     if(e.getSource()==startButton) {

        if(started==false) {
          started=true;
          startButton.setText("PARAR");
          startButton.setBackground(Color.RED);
          resetButton.setBackground(Color.ORANGE);
          start();
        }
        else {
          started=false;
          startButton.setText("INICIAR");
          startButton.setBackground(Color.GREEN);
          stop();
        }

       }
       if(e.getSource()==resetButton) {
          started=false;
          startButton.setText("INICIAR");
          startButton.setBackground(Color.GREEN);
          resetButton.setBackground(Color.RED);
          reset();
       }
    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        elapsedTime=0;
        seconds =0;
        minutes=0;
        hours=0;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        hours_string = String.format("%02d", hours);       
        timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
    }
   }
