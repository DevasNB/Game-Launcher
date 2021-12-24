package jogos.Galo;

import java.awt.Color;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class galo extends javax.swing.JFrame {
    
    private String Ijogo="X";
    private int contX = 0;
    private int contO = 0;

    public galo() { 
        
        initComponents();
    }
    
private void pJogo(){
    
    jLabel4.setText(String.valueOf(contX));
    jLabel5.setText(String.valueOf(contO));
}

private void Ejogador(){
    
    if(Ijogo.equalsIgnoreCase("X"))
    {
        Ijogo="O";
    }
    else
    {
        Ijogo = "X";
    }
}
private void jogadorv(){

    String b1 = jButton1.getText();
    String b2 = jButton2.getText();
    String b3 = jButton3.getText();
    
    String b4 = jButton4.getText();
    String b5 = jButton5.getText();
    String b6 = jButton6.getText();
    
    String b7 = jButton7.getText();
    String b8 = jButton8.getText();
    String b9 = jButton9.getText();
    
    //horizontal X
    if(b1 == "X" && b2=="X" && b3=="X")
    {
        
        jButton1.setBackground(Color.GREEN);
    jButton2.setBackground(Color.GREEN);
    jButton3.setBackground(Color.GREEN);
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-vermelho.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contX++;
    pJogo();
    reset();
   
   
    }
    
    if(b4 == "X" && b5=="X" && b6=="X")
    {
       jButton4.setBackground(Color.GREEN);
    jButton5.setBackground(Color.GREEN);
    jButton6.setBackground(Color.GREEN); 
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-vermelho.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contX++;
    pJogo();
    reset();
    }
    
    if(b7 == "X" && b8=="X" && b9=="X")
    {
     jButton7.setBackground(Color.GREEN);
    jButton8.setBackground(Color.GREEN);
    jButton9.setBackground(Color.GREEN);   
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-vermelho.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contX++;
    pJogo();
    reset();
    }
    
    //................................................................//
    
    //vertical X
    if(b1 == "X" && b4=="X" && b7=="X")
    {
      jButton1.setBackground(Color.GREEN);
    jButton4.setBackground(Color.GREEN);
    jButton7.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-vermelho.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contX++;
    pJogo();
    reset();
    }
    
    if(b2 == "X" && b5=="X" && b8=="X")
    {
      jButton2.setBackground(Color.GREEN);
    jButton5.setBackground(Color.GREEN);
    jButton8.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-vermelho.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contX++;
    pJogo();
    reset();
    }
    
    if(b3 == "X" && b6=="X" && b9=="X")
    {
      jButton3.setBackground(Color.GREEN);
    jButton6.setBackground(Color.GREEN);
    jButton9.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-vermelho.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contX++;
    pJogo();
    reset();
    }
    //...........................................................................//
    //diagonal X
    if(b1 == "X" && b5=="X" && b9=="X")
    {
      jButton1.setBackground(Color.GREEN);
    jButton5.setBackground(Color.GREEN);
    jButton9.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-vermelho.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contX++;
    pJogo();
    reset();
    }
    
    if(b3 == "X" && b5=="X" && b7=="X")
    {
    jButton3.setBackground(Color.GREEN);
    jButton5.setBackground(Color.GREEN);
    jButton7.setBackground(Color.GREEN);   
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-vermelho.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contX++;
    pJogo();
    reset();
    }
    
    //============================================================================================//
     //horizontal O
    if(b1 == "O" && b2=="O" && b3=="O")
    {
     jButton1.setBackground(Color.GREEN);
    jButton2.setBackground(Color.GREEN);
    jButton3.setBackground(Color.GREEN);   
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-azul.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contO++;
    pJogo();
    reset();
    }
    
    if(b4 == "O" && b5=="O" && b6=="O")
    {
     jButton4.setBackground(Color.GREEN);
    jButton5.setBackground(Color.GREEN);
    jButton6.setBackground(Color.GREEN);   
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-azul.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contO++;
    pJogo();
    reset();
    }
    
    if(b7 == "O" && b8=="O" && b9=="O")
    {
      jButton7.setBackground(Color.GREEN);
    jButton8.setBackground(Color.GREEN);
    jButton9.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-azul.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contO++;
    pJogo();
    reset();
    }
    
    //................................................................//
    
    //vertical O
    if(b1 == "O" && b4=="O" && b7=="O")
    {
    jButton1.setBackground(Color.GREEN);
    jButton4.setBackground(Color.GREEN);
    jButton7.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-azul.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contO++;
    pJogo();
    reset();
    }
    
    if(b2 == "O" && b5=="O" && b8=="O")
    {
      jButton2.setBackground(Color.GREEN);
    jButton5.setBackground(Color.GREEN);
    jButton8.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-azul.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contO++;
    pJogo();
    reset();
    }
    
    if(b3 == "O" && b6=="O" && b9=="O")
    {
      jButton3.setBackground(Color.GREEN);
    jButton6.setBackground(Color.GREEN);
    jButton9.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-azul.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contO++;
    pJogo();
    reset();
    }
    //...........................................................................//
    //diagonal O
    if(b1 == "O" && b5=="O" && b9=="O")
    {
     jButton1.setBackground(Color.GREEN);
    jButton5.setBackground(Color.GREEN);
    jButton9.setBackground(Color.GREEN);   
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-azul.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contO++;
    pJogo();
    reset();
    }
    
    if(b3 == "O" && b5=="O" && b7=="O")
    {
    jButton3.setBackground(Color.GREEN);
    jButton5.setBackground(Color.GREEN);
    jButton7.setBackground(Color.GREEN);  
    Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/jogos/jogo do galo/galo-vitoria-azul.png"))); 
    JOptionPane.showMessageDialog(null, "", "Vitória", JOptionPane.PLAIN_MESSAGE, figura);
    contO++;
    pJogo();
    reset();
    }

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jogadorX = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogo do galo");
        URL iconURL = getClass().getResource("/img/icons/mini-galo2.png");

        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setForeground(java.awt.Color.black);
        setResizable(false);
        setMinimumSize(new java.awt.Dimension(840, 585));
        setVisible(true);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(null);
        jPanel4.setLayout(null);

        Title.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/jogo do galo/tilte-galo.png"))); // NOI18N
        Title.setText("");
        jPanel4.add(Title);
        Title.setBounds(0, 0, 830, 60);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(null);
        jPanel1.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel2.setBackground(new java.awt.Color(148, 199, 207));
        jPanel2.setBorder(null);
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(148, 199, 207));
        jPanel3.setBorder(null);
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(148, 199, 207));
        jPanel5.setBorder(null);
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton3.setAlignmentY(0.0F);
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 204, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jogadorX.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        jogadorX.setForeground(new java.awt.Color(255, 255, 255));
        jogadorX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/jogo do galo/galo-jogador-x.png"))); // NOI18N
        jPanel6.add(jogadorX);
        jogadorX.setBounds(12, 1, 150, 159);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 153, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 54)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        jPanel7.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(148, 199, 207));
        jPanel8.setBorder(null);
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(148, 199, 207));
        jPanel9.setBorder(null);
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(148, 199, 207));
        jPanel10.setBorder(null);
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 204, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/jogo do galo/galo-jogador-o.png"))); // NOI18N
        jLabel3.setBorder(null);
        jPanel11.add(jLabel3);
        jLabel3.setBounds(13, 0, 150, 161);

        jPanel1.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 153, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 54)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0");
        jPanel12.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(148, 199, 207));
        jPanel13.setBorder(null);
        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(148, 199, 207));
        jPanel14.setBorder(null);
        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(148, 199, 207));
        jPanel15.setBorder(null);
        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 60)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 51, 51));
        jPanel16.setBorder(null);
        jPanel16.setAlignmentX(0.0F);
        jPanel16.setAlignmentY(0.0F);
        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton10.setBackground(new java.awt.Color(255, 51, 51));
        jButton10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/jogo do galo/galo-apagar.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 51, 51));
        jPanel17.setBorder(null);
        jPanel17.setAlignmentX(0.0F);
        jPanel17.setAlignmentY(0.0F);
        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton11.setBackground(new java.awt.Color(255, 51, 51));
        jButton11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/jogo do galo/galo-reniciar.png"))); // NOI18N
        jButton11.setAlignmentY(0.0F);
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel17);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(0, 60, 825, 487);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>
private JFrame frame;

public void reset(){

      jButton1.setText("");
      jButton2.setText("");
      jButton3.setText("");
      jButton4.setText("");
      jButton5.setText("");
      jButton6.setText("");
      jButton7.setText("");
      jButton8.setText("");
      jButton9.setText("");
      
      jButton1.setBackground(Color.LIGHT_GRAY);
      jButton2.setBackground(Color.LIGHT_GRAY);
      jButton3.setBackground(Color.LIGHT_GRAY);
      
      jButton4.setBackground(Color.LIGHT_GRAY);
      jButton5.setBackground(Color.LIGHT_GRAY);
      jButton6.setBackground(Color.LIGHT_GRAY);
      
      jButton7.setBackground(Color.LIGHT_GRAY);
      jButton8.setBackground(Color.LIGHT_GRAY);
      jButton9.setBackground(Color.LIGHT_GRAY);

}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(jButton1.getText().isEmpty())
    {
        jButton1.setText(Ijogo);
    
        if(Ijogo.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.RED);
        }
        else
        {
            jButton1.setForeground(Color.BLUE);
        }  
    Ejogador();
    jogadorv();
    }
    

    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        frame = new JFrame("Reiniciar");
            if(JOptionPane.showConfirmDialog(frame,"Pretende reniciar as cotações","Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                contX = 0;
                contO = 0;
                jLabel4.setText(String.valueOf(contX));
                jLabel5.setText(String.valueOf(contO));
            }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jButton2.getText().isEmpty())
        {
            jButton2.setText(Ijogo);
            
            if(Ijogo.equalsIgnoreCase("X"))
            {
                jButton2.setForeground(Color.RED);
            }
            else
            {
                jButton2.setForeground(Color.BLUE);
            }  
        Ejogador();
        jogadorv();
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jButton3.getText().isEmpty())
        {
            jButton3.setText(Ijogo);
        
            if(Ijogo.equalsIgnoreCase("X"))
            {
                jButton3.setForeground(Color.RED);
            }
            else
            {
                jButton3.setForeground(Color.BLUE);
            }  
        Ejogador();
        jogadorv();
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jButton4.getText().isEmpty())
        {
            jButton4.setText(Ijogo);
            
            if(Ijogo.equalsIgnoreCase("X"))
            {
                jButton4.setForeground(Color.RED);
            }
            else
            {
                jButton4.setForeground(Color.BLUE);
            }  
      Ejogador();
      jogadorv();
      }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jButton5.getText().isEmpty())
        {
            jButton5.setText(Ijogo);
        
            if(Ijogo.equalsIgnoreCase("X"))
            {
                jButton5.setForeground(Color.RED);
            }
            else
            {
                jButton5.setForeground(Color.BLUE);
            }  
        Ejogador();
        jogadorv();
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jButton6.getText().isEmpty())
        {
            jButton6.setText(Ijogo);
            
            if(Ijogo.equalsIgnoreCase("X"))
            {
                jButton6.setForeground(Color.RED);
            }
            else
            {
                jButton6.setForeground(Color.BLUE);
            }  
        Ejogador();
        jogadorv();
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(jButton7.getText().isEmpty())
        {
            jButton7.setText(Ijogo);
        
            if(Ijogo.equalsIgnoreCase("X"))
            {
                jButton7.setForeground(Color.RED);
            }
            else
            {
                jButton7.setForeground(Color.BLUE);
            }
        Ejogador();
        jogadorv();
        }
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(jButton8.getText().isEmpty())
        {
            jButton8.setText(Ijogo);

            if(Ijogo.equalsIgnoreCase("X"))
            {
                jButton8.setForeground(Color.RED);
            }
            else
            {
                jButton8.setForeground(Color.BLUE);
            }  
        Ejogador();
        jogadorv();
        }
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jButton9.getText().isEmpty())
        {
            jButton9.setText(Ijogo);
        
            if(Ijogo.equalsIgnoreCase("X"))
            {
                jButton9.setForeground(Color.RED);
            }
            else
            {
                jButton9.setForeground(Color.BLUE);
            }  
            Ejogador();
            jogadorv();
        }
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     reset();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jogadorX;
    // End of variables declaration//GEN-END:variables
}
