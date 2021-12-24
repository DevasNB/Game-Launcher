package apps.calculadora;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class calculadora extends JFrame {

    double num,ans;
    int calculo;
    
    
    public calculadora() {
        initComponents();
        jTextField1.setEditable(false);
    }
    
    public void operacao_aritmetica()
    {
       switch (calculo)
       {
           case 1:  //Soma
               ans = num + Double.parseDouble(jTextField1.getText());
               jTextField1.setText(Double.toString(ans));
               
               break;
               
           case 2:  //Subtração
               ans = num - Double.parseDouble(jTextField1.getText());
               jTextField1.setText(Double.toString(ans));
               
               break;
               
           case 3:  //Multiplicação
               ans = num * Double.parseDouble(jTextField1.getText());
               jTextField1.setText(Double.toString(ans));
               
               break;
               
           case 4:  //Divisão
               ans = num / Double.parseDouble(jTextField1.getText());
               jTextField1.setText(Double.toString(ans));
               
               break;    
       }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        wallapaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        URL iconURL = getClass().getResource("/img/icons/mini-calculadora.png");
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setTitle("Calculadora");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.gray);
        setLocation(new java.awt.Point(500, 250));
        setMinimumSize(new java.awt.Dimension(315, 435));
        setResizable(false);
        getContentPane().setLayout(null);
        setVisible(true);

        jTextField1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 31, 280, 60);

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(6, 275, 58, 50);

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(82, 275, 58, 50);

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("3");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(158, 275, 58, 50);

        jButton8.setBackground(new java.awt.Color(255, 153, 0));
        jButton8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("5");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(82, 219, 58, 50);

        jButton9.setBackground(new java.awt.Color(255, 153, 0));
        jButton9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("4");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(6, 219, 58, 50);

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("6");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(158, 219, 58, 50);

        jButton11.setBackground(new java.awt.Color(255, 153, 0));
        jButton11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("8");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(82, 163, 58, 50);

        jButton12.setBackground(new java.awt.Color(255, 153, 0));
        jButton12.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("7");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(6, 163, 58, 50);

        jButton13.setBackground(new java.awt.Color(255, 153, 0));
        jButton13.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("9");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(158, 163, 58, 50);

        jButton14.setBackground(new java.awt.Color(255, 153, 0));
        jButton14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("0");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(82, 331, 58, 50);

        jButton16.setBackground(new java.awt.Color(204, 51, 0));
        jButton16.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText(".");
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(6, 331, 58, 50);

        jButton17.setBackground(new java.awt.Color(102, 172, 255));
        jButton17.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("<--");
        jButton17.setBorder(null);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(6, 107, 58, 50);

        jButton18.setBackground(new java.awt.Color(102, 172, 255));
        jButton18.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("C");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(82, 107, 134, 50);

        jButton19.setBackground(new java.awt.Color(0, 204, 102));
        jButton19.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("+");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(234, 107, 58, 50);

        jButton20.setBackground(new java.awt.Color(0, 204, 102));
        jButton20.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("-");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(234, 163, 58, 50);

        jButton21.setBackground(new java.awt.Color(0, 204, 102));
        jButton21.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("/");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(234, 275, 58, 50);

        jButton22.setBackground(new java.awt.Color(102, 172, 255));
        jButton22.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("=");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(158, 331, 134, 50);

        jButton23.setBackground(new java.awt.Color(0, 204, 102));
        jButton23.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("x");
        jButton23.setAlignmentY(0.0F);
        jButton23.setBorder(null);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(234, 219, 58, 50);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 2, 280, 27);

        wallapaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/star sky3.png"))); // NOI18N
        wallapaper.setBorder(null);
        getContentPane().add(wallapaper);
        wallapaper.setBounds(-244, -16, 750, 560);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "1");
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"2");
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"3");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"4");
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"5");
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"6");
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"7");
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"8");
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"9");
    }

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
        num = Double.parseDouble(jTextField1.getText());
        calculo = 1;
        jTextField1.setText("");
        jLabel1.setText(num + "+");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
        num = Double.parseDouble(jTextField1.getText());
        calculo = 2;
        jTextField1.setText("");
        jLabel1.setText(num + "-");
    }

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
        num = Double.parseDouble(jTextField1.getText());
        calculo = 3;
        jTextField1.setText("");
        jLabel1.setText(num + "*");
    }

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
        
        num = Double.parseDouble(jTextField1.getText());
        calculo = 4;
        jTextField1.setText("");
        jLabel1.setText(num + "/");
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +"0");
    }

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() +".");
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
       
        int length= jTextField1.getText().length();
        int number= jTextField1.getText().length() - 1;
        String store;
        
        if(length>0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store=back.toString();
            jTextField1.setText(store);
        }
    }

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
        
        operacao_aritmetica();
        jLabel1.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel wallapaper;
    // End of variables declaration//GEN-END:variables
}
