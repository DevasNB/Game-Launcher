package apps.editor;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

public class TextEditor extends JFrame implements ActionListener {
    
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JLabel fontLabel;
    private JSpinner fontSizeSpinner;
    private JButton fontColorButton;
    private JComboBox fontBox;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem exitItem;

    public TextEditor(){
        
        URL iconURL = getClass().getResource("/img/icons/mini-editordetexto.png");
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Editor de Texto");
        setSize(500, 500);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial",Font.PLAIN,20));

        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(450,450));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        fontLabel = new JLabel("Fonte: ");

        fontSizeSpinner = new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(50,25));
        fontSizeSpinner.setValue(20);
        fontSizeSpinner.addChangeListener(new ChangeListener() {

      @Override
    public void stateChanged(ChangeEvent e) {

        textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN,(int) fontSizeSpinner.getValue())); 
       }
      });

      fontColorButton = new JButton("Cor");
      fontColorButton.addActionListener(this);

      String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

      fontBox = new JComboBox(fonts);
      fontBox.addActionListener(this);
      fontBox.setSelectedItem("Arial");

      // ------ barra de menu ------

       menuBar = new JMenuBar();
       fileMenu = new JMenu("Ficheiro");
       openItem = new JMenuItem("Abrir");
       saveItem = new JMenuItem("Guardar");
       exitItem = new JMenuItem("Sair");

       openItem.addActionListener(this);
       saveItem.addActionListener(this);
       exitItem.addActionListener(this);

       fileMenu.add(openItem);
       fileMenu.add(saveItem);
       fileMenu.add(exitItem);
       menuBar.add(fileMenu);

      // ------ /barra de menu/ ------

      this.setJMenuBar(menuBar);
      this.add(fontLabel);
      this.add(fontSizeSpinner);
      this.add(fontColorButton);
      this.add(fontBox);
      this.add(scrollPane);
      this.setVisible(true);
     }
 
    @Override
    public void actionPerformed(ActionEvent e) {

       if(e.getSource()==fontColorButton) {
        JColorChooser colorChooser = new JColorChooser();

        Color color = colorChooser.showDialog(null, "Escolhe uma cor", Color.black);

        textArea.setForeground(color);
       }

       if(e.getSource()==fontBox) {
        textArea.setFont(new Font((String)fontBox.getSelectedItem(),Font.PLAIN,textArea.getFont().getSize()));
       }

       if(e.getSource()==openItem) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Ficheiros de Texto", "txt");
        fileChooser.setFileFilter(filter);

        int response = fileChooser.showOpenDialog(null);

        if(response == JFileChooser.APPROVE_OPTION) {
         File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
         Scanner fileIn = null;

         try {
          fileIn = new Scanner(file);
          if(file.isFile()) {
           while(fileIn.hasNextLine()) {
            String line = fileIn.nextLine()+"\n";
            textArea.append(line);
           }
          }
         } catch (FileNotFoundException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
         }
         finally {
          fileIn.close();
         }
        }
       }
       if(e.getSource()==saveItem) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));

        int response = fileChooser.showSaveDialog(null);

        if(response == JFileChooser.APPROVE_OPTION) {
         File file;
         PrintWriter fileOut = null;

         file = new File(fileChooser.getSelectedFile().getAbsolutePath());
         try {
          fileOut = new PrintWriter(file);
          fileOut.println(textArea.getText());
         } 
         catch (FileNotFoundException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
         }
         finally {
          fileOut.close();
         }   
        }
       }
       if(e.getSource()==exitItem) {
        System.exit(0);
       }  
      }
     }
    
