
import apps.calculadora.calculadora;
import jogos.BrickBreaker.BrickBreaker;
import apps.editor.TextEditor;
import apps.cronometro.cronometro;
import java.awt.Color;
import jogos.SnakeGame.SnakeGame;
import jogos.Galo.galo;
import java.awt.Desktop;
import java.awt.Graphics;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import jogos.Tetris.src.Main.Frame;

/* 
* PROVA DE APTIDÃO PROFISSIONAL
* João Devesa
* STAR LAUNCHER @2021
*/

public class app extends javax.swing.JFrame {
     int mousepX;
     int mousepY;
     
     ButtonGroup group = new ButtonGroup();

    public app() {
        initComponents();
        components2();
    }
    
    private void components2() {
        URL iconURL = getClass().getResource("/img/icons/star.png");
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        
        pp1.setVisible(true);
        pp2.setVisible(false);
        pp3.setVisible(false);
        pp4.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        closebutton = new javax.swing.JLabel();
        closebutton1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        texto1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        texto2 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        texto4 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        texto5 = new javax.swing.JLabel();
        pp4 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g)
            {
                g.setColor( getBackground() );
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);};
        };
        jLabel10 = new javax.swing.JLabel();
        TemaDefault = new javax.swing.JRadioButton();
        TemaSpiderMan = new javax.swing.JRadioButton();
        TemaMetro = new javax.swing.JRadioButton();
        pp1 = new javax.swing.JPanel();
        iconjogo1 = new javax.swing.JButton();
        iconjogo2 = new javax.swing.JButton();
        iconjogo3 = new javax.swing.JButton();
        iconjogo4 = new javax.swing.JButton();
        pp2 = new javax.swing.JPanel();
        iconapp1 = new javax.swing.JButton();
        iconapp2 = new javax.swing.JButton();
        iconapp3 = new javax.swing.JButton();
        pp3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Star Launcher");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1070, 660));
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        header.setBackground(new java.awt.Color(255, 153, 0));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(null);

        title.setFont(new java.awt.Font("Bungee Inline", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/logo-starlauncher4.png"))); // NOI18N
        header.add(title);
        title.setBounds(10, 0, 230, 40);

        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/close-icon.png"))); // NOI18N
        closebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closebuttonMousePressed(evt);
            }
        });
        header.add(closebutton);
        closebutton.setBounds(1040, 0, 30, 40);

        closebutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/hide-icon.png"))); // NOI18N
        closebutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closebutton1MousePressed(evt);
            }
        });
        header.add(closebutton1);
        closebutton1.setBounds(1010, 0, 30, 40);

        getContentPane().add(header);
        header.setBounds(0, 0, 1070, 40);

        bg.setBackground(new java.awt.Color(255, 197, 133));
        bg.setLayout(null);

        p1.setBackground(new java.awt.Color(0, 0, 0));
        p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        p1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
        });
        p1.setLayout(null);

        texto1.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        texto1.setForeground(new java.awt.Color(255, 255, 255));
        texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/icon-jogos.png"))); // NOI18N
        p1.add(texto1);
        texto1.setBounds(0, 0, 200, 50);

        bg.add(p1);
        p1.setBounds(20, 70, 200, 50);

        p2.setBackground(new java.awt.Color(0, 0, 0));
        p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        p2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
        });
        p2.setLayout(null);

        texto2.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        texto2.setForeground(new java.awt.Color(255, 255, 255));
        texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/icon-aplicacoes.png"))); // NOI18N
        p2.add(texto2);
        texto2.setBounds(0, 0, 200, 50);

        bg.add(p2);
        p2.setBounds(20, 140, 200, 50);

        p3.setBackground(new java.awt.Color(0, 0, 0));
        p3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        p3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3.setFocusCycleRoot(true);
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3MouseClicked(evt);
            }
        });
        p3.setLayout(null);

        texto4.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        texto4.setForeground(new java.awt.Color(255, 255, 255));
        texto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/icon-sobre.png"))); // NOI18N
        p3.add(texto4);
        texto4.setBounds(0, 0, 200, 50);

        bg.add(p3);
        p3.setBounds(20, 580, 200, 50);

        p4.setBackground(new java.awt.Color(0, 0, 0));
        p4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        p4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4MouseClicked(evt);
            }
        });
        p4.setLayout(null);

        texto5.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        texto5.setForeground(new java.awt.Color(255, 255, 255));
        texto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/icon-definicoes.png"))); // NOI18N
        p4.add(texto5);
        texto5.setBounds(0, 0, 200, 50);

        bg.add(p4);
        p4.setBounds(20, 510, 200, 50);

        pp4.setBackground(new java.awt.Color(0, 0, 0));
        pp4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), " Definições ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Berlin Sans FB", 1, 24), new java.awt.Color(204, 204, 204))); // NOI18N
        pp4.setFocusCycleRoot(true);
        pp4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Selecionar Tema:");
        pp4.add(jLabel10);
        jLabel10.setBounds(40, 40, 190, 50);

        TemaDefault.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        TemaDefault.setForeground(new java.awt.Color(255, 255, 255));
        TemaDefault.setText("Default");
        TemaDefault.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TemaDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemaDefaultActionPerformed(evt);
            }
        });
        pp4.add(TemaDefault);
        TemaDefault.setBounds(50, 90, 110, 30);
        group.add(TemaDefault);

        TemaSpiderMan.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        TemaSpiderMan.setForeground(new java.awt.Color(255, 255, 255));
        TemaSpiderMan.setText("Spider Man");
        TemaSpiderMan.setToolTipText("");
        TemaSpiderMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TemaSpiderMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemaSpiderManActionPerformed(evt);
            }
        });
        pp4.add(TemaSpiderMan);
        TemaSpiderMan.setBounds(170, 90, 120, 30);
        group.add(TemaSpiderMan);

        TemaMetro.setBackground(new java.awt.Color(0, 0, 0));
        TemaMetro.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        TemaMetro.setForeground(new java.awt.Color(255, 255, 255));
        TemaMetro.setText("Metro");
        TemaMetro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TemaMetro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TemaMetroMouseClicked(evt);
            }
        });
        pp4.add(TemaMetro);
        TemaMetro.setBounds(320, 90, 90, 30);
        group.add(TemaMetro);

        bg.add(pp4);
        pp4.setBounds(240, 270, 810, 370);

        pp1.setBackground(new java.awt.Color(0, 0, 0));
        pp1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), " Jogos ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Berlin Sans FB", 1, 24), new java.awt.Color(204, 204, 204))); // NOI18N
        pp1.setLayout(null);

        iconjogo1.setBackground(new java.awt.Color(0, 0, 0));
        iconjogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/logo-brickbreaker.png"))); // NOI18N
        iconjogo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconjogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconjogo1ActionPerformed(evt);
            }
        });
        pp1.add(iconjogo1);
        iconjogo1.setBounds(30, 40, 200, 250);

        iconjogo2.setBackground(new java.awt.Color(0, 0, 0));
        iconjogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/logo-snakegame.png"))); // NOI18N
        iconjogo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconjogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconjogo2ActionPerformed(evt);
            }
        });
        pp1.add(iconjogo2);
        iconjogo2.setBounds(300, 40, 200, 250);

        iconjogo3.setBackground(new java.awt.Color(0, 0, 0));
        iconjogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/logo-jogodogalo.png"))); // NOI18N
        iconjogo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconjogo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconjogo3ActionPerformed(evt);
            }
        });
        pp1.add(iconjogo3);
        iconjogo3.setBounds(570, 40, 200, 250);

        iconjogo4.setBackground(new java.awt.Color(0, 0, 0));
        iconjogo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jogos/logo-tetris.png"))); // NOI18N
        iconjogo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconjogo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconjogo4ActionPerformed(evt);
            }
        });
        pp1.add(iconjogo4);
        iconjogo4.setBounds(30, 310, 200, 250);

        bg.add(pp1);
        pp1.setBounds(240, 50, 810, 590);

        pp2.setBackground(new java.awt.Color(0, 0, 0));
        pp2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), " Aplicações ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Berlin Sans FB", 1, 24), new java.awt.Color(204, 204, 204))); // NOI18N
        pp2.setFocusCycleRoot(true);
        pp2.setLayout(null);

        iconapp1.setBackground(new java.awt.Color(0, 0, 0));
        iconapp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apps/logo-calculadora.png"))); // NOI18N
        iconapp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconapp1ActionPerformed(evt);
            }
        });
        pp2.add(iconapp1);
        iconapp1.setBounds(30, 40, 200, 250);

        iconapp2.setBackground(new java.awt.Color(0, 0, 0));
        iconapp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apps/logo-cronometro.png"))); // NOI18N
        iconapp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconapp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconapp2ActionPerformed(evt);
            }
        });
        pp2.add(iconapp2);
        iconapp2.setBounds(300, 40, 200, 250);

        iconapp3.setBackground(new java.awt.Color(0, 0, 0));
        iconapp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apps/logo-editordetexto.png"))); // NOI18N
        iconapp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconapp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconapp3ActionPerformed(evt);
            }
        });
        pp2.add(iconapp3);
        iconapp3.setBounds(570, 40, 200, 250);

        bg.add(pp2);
        pp2.setBounds(240, 50, 810, 590);

        pp3.setBackground(new java.awt.Color(0, 0, 0));
        pp3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), " Sobre ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Berlin Sans FB", 1, 24), new java.awt.Color(204, 204, 204))); // NOI18N
        pp3.setFocusCycleRoot(true);
        pp3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/site-parceiro-icon.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pp3.add(jLabel1);
        jLabel1.setBounds(410, 300, 220, 60);
        jLabel1.getAccessibleContext().setAccessibleName("Parceiro/Host: https://drena.xyz/");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/sobre-criador.png"))); // NOI18N
        pp3.add(jLabel2);
        jLabel2.setBounds(30, 190, 110, 50);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("O Star Launcher é um íniciador de alguns jogos e aplicações sem a necessidade de os");
        pp3.add(jLabel3);
        jLabel3.setBounds(30, 120, 740, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/sobre-star.png"))); // NOI18N
        pp3.add(jLabel4);
        jLabel4.setBounds(30, 40, 180, 50);

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Este programa foi feito no âmbito escolar para avaliação da Prova de Aptidão Profissional.");
        pp3.add(jLabel5);
        jLabel5.setBounds(30, 80, 750, 40);

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("João Devesa, 18 anos, estudante da Escola Secundárias de Camões do curso TGPSI, Lisboa");
        pp3.add(jLabel6);
        jLabel6.setBounds(30, 240, 770, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/site-oficial-icon.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        pp3.add(jLabel7);
        jLabel7.setBounds(20, 300, 200, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/logo_drena.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        pp3.add(jLabel8);
        jLabel8.setBounds(610, 290, 160, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/logo-starlauncher-site.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        pp3.add(jLabel9);
        jLabel9.setBounds(210, 290, 170, 60);

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("instalar.");
        pp3.add(jLabel11);
        jLabel11.setBounds(30, 140, 710, 40);

        bg.add(pp3);
        pp3.setBounds(240, 270, 810, 370);

        wallpaper.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/star sky3.png"))); // NOI18N
        wallpaper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        bg.add(wallpaper);
        wallpaper.setBounds(0, 0, 1070, 660);

        getContentPane().add(bg);
        bg.setBounds(0, 0, 1070, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMousePressed
       System.exit(0);
    }//GEN-LAST:event_closebuttonMousePressed

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked
        
        if(evt.getSource()==p1) {
            pp1.setVisible(true);
            pp2.setVisible(false);
            pp3.setVisible(false);
            pp4.setVisible(false);
        }
    }//GEN-LAST:event_p1MouseClicked

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
        
        if(evt.getSource()==p2) {
            pp1.setVisible(false);
            pp2.setVisible(true);
            pp3.setVisible(false);
            pp4.setVisible(false);
        }
    }//GEN-LAST:event_p2MouseClicked

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void iconapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconapp1ActionPerformed
        
        new calculadora();
    }//GEN-LAST:event_iconapp1ActionPerformed

    private void iconjogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconjogo1ActionPerformed
        
        new BrickBreaker();
    }//GEN-LAST:event_iconjogo1ActionPerformed

    private void iconjogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconjogo2ActionPerformed
        
        new SnakeGame();
    }//GEN-LAST:event_iconjogo2ActionPerformed

    private void iconjogo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconjogo3ActionPerformed
        
        new galo();
    }//GEN-LAST:event_iconjogo3ActionPerformed

    private void p3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseClicked
        
        if(evt.getSource()==p3) {
            pp1.setVisible(false);
            pp2.setVisible(false);
            pp3.setVisible(true);
            pp4.setVisible(false);
        }
    }//GEN-LAST:event_p3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        try {
        Desktop.getDesktop().browse(new URI("https://starlauncher.ddns.net"));
        } 
        catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        try {
        Desktop.getDesktop().browse(new URI("https://starlauncher.ddns.net"));
        } 
        catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        try {
        Desktop.getDesktop().browse(new URI("https://drena.xyz"));
        } 
        catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        try {
        Desktop.getDesktop().browse(new URI("https://drena.xyz"));
        } 
        catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void iconjogo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconjogo4ActionPerformed
        
        new Frame().setVisible(true);
    }//GEN-LAST:event_iconjogo4ActionPerformed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        
        int KordinateX = evt.getXOnScreen();
        int KordinateY = evt.getYOnScreen();
        
        this.setLocation(KordinateX-mousepX, KordinateY-mousepY);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void p4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseClicked
        
        if(evt.getSource()==p4) {
            pp1.setVisible(false);
            pp2.setVisible(false);
            pp3.setVisible(false);
            pp4.setVisible(true);
        }
    }//GEN-LAST:event_p4MouseClicked

    private void TemaDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemaDefaultActionPerformed
        
        if(evt.getSource() == TemaDefault) {

            header.setBackground(new java.awt.Color(255, 153, 0));
            header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 1));
            
            closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/close-icon.png")));
            closebutton.setBounds(1040, 3, 35, 35);
            
            closebutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/hide-icon.png")));

            /*bg*/
            p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
            p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
            p3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
            p4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
            
            p1.setBackground(new java.awt.Color(0, 0, 0));
            p2.setBackground(new java.awt.Color(0, 0, 0));
            p3.setBackground(new java.awt.Color(0, 0, 0));
            p4.setBackground(new java.awt.Color(0, 0, 0));
            
            texto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/icon-jogos.png"))); 
            
            texto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/icon-aplicacoes.png")));
            
            texto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/icon-sobre.png"))); 
            
            texto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/icon-definicoes.png")));
            
            pp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
            pp2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
            pp3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
            pp4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
            
            pp1.setBackground(new java.awt.Color(0, 0, 0));
            pp2.setBackground(new java.awt.Color(0, 0, 0));
            pp3.setBackground(new java.awt.Color(0, 0, 0));
            pp4.setBackground(new java.awt.Color(0, 0, 0));
            
            pp1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), " Jogos ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Berlin Sans FB", 1, 24), new java.awt.Color(204, 204, 204)));
            pp2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), " Aplicações ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Berlin Sans FB", 1, 24), new java.awt.Color(204, 204, 204)));
            pp3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), " Sobre ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Berlin Sans FB", 1, 24), new java.awt.Color(204, 204, 204)));
            pp4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), " Definições ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Berlin Sans FB", 1, 24), new java.awt.Color(204, 204, 204)));
            
            wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/star sky3.png"))); 
            wallpaper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            wallpaper.setBounds(0, 0, 1070, 660);
            
            /*p3*/
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/site-parceiro-icon.png"))); 
            
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/sobre-criador.png"))); 
            
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/sobre-star.png"))); 
            
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/site-oficial-icon.png"))); 
            
            revalidate();
            repaint();
        }
    }//GEN-LAST:event_TemaDefaultActionPerformed

    private void TemaSpiderManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemaSpiderManActionPerformed
           
        if(evt.getSource() == TemaSpiderMan) {
            
            /*header*/
            header.setBackground(new java.awt.Color(0, 0, 0));
            header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            
            closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/close-icon.png")));
            closebutton.setBounds(1040, 3, 35, 35);
            
            closebutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/hide-icon.png")));   
            
            /*bg*/
            p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58), 5, true));
            p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58), 5, true));
            p3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58), 5, true));
            p4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58), 5, true));
            
            p1.setBackground(new java.awt.Color(139, 1, 1));
            p2.setBackground(new java.awt.Color(139, 1, 1));
            p3.setBackground(new java.awt.Color(139, 1, 1));
            p4.setBackground(new java.awt.Color(139, 1, 1));
            
            texto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/spider-man/icon-jogos.png"))); 
            texto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/spider-man/icon-aplicacoes.png")));
            texto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/spider-man/icon-sobre.png"))); 
            texto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/spider-man/icon-definicoes.png")));
            
            pp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58), 5, true));
            pp2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58), 5, true));
            pp3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58), 5, true));
            pp4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58), 5, true));
            
            pp1.setBackground(new java.awt.Color(139, 1, 1));
            pp2.setBackground(new java.awt.Color(139, 1, 1));
            pp3.setBackground(new java.awt.Color(139, 1, 1));
            pp4.setBackground(new java.awt.Color(139, 1, 1));
            
            /*p3*/
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/site-parceiro-icon.png"))); 
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/sobre-criador.png"))); 
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/launcher/site-oficial-icon.png")));
            
            wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/spider-man/wallpaper spider.png")));
            wallpaper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            wallpaper.setBounds(0, 5, 1070, 660);
        }
    }//GEN-LAST:event_TemaSpiderManActionPerformed
    
    private void TemaMetroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemaMetroMouseClicked
        
            header.setBackground(new java.awt.Color(0, 0, 0,0));
        
            TemaMetro.setOpaque(false);
            TemaMetro.setBackground(new Color(0,0,0,0));
            
            /*header*/
            header.setBackground(new java.awt.Color(0, 0, 0, 100));
            header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));
            
            closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/close-icon.png")));        
            closebutton.setBounds(1033, 2, 35, 35);
            
            closebutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/hide-icon.png")));    
            
            p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58, 0), 5, true));
            p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58, 0), 5, true));
            p3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58, 0), 5, true));
            p4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 201, 58, 0), 5, true));
            
            p1.setBackground(new java.awt.Color(0, 0, 0, 100));
            p2.setBackground(new java.awt.Color(0, 0, 0, 100));
            p3.setBackground(new java.awt.Color(0, 0, 0, 100));
            p4.setBackground(new java.awt.Color(0, 0, 0, 100));
            
            texto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/icon-jogos.png")));
            
            texto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/icon-aplicacoes.png")));
            
            texto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/icon-sobre.png")));
            
            texto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/icon-definicoes.png")));
            
            pp1.setBorder(null);
            pp2.setBorder(null);
            pp3.setBorder(null);
            pp4.setBorder(null);
            
            pp1.setBackground(new java.awt.Color(0, 0, 0, 100));
            pp2.setBackground(new java.awt.Color(0, 0, 0, 100));
            pp3.setBackground(new java.awt.Color(0, 0, 0, 100));        
            
            pp4.setOpaque(false);
            pp4.setBackground(new java.awt.Color(0, 0, 0, 100));
            
            wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/metro.png")));
            wallpaper.setBounds(0, 0, 1070, 660);
            
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/site-parceiro-icon.png")));
            
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/sobre-criador.png")));

            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temas/metro/site-oficial-icon.png")));
            
            pp1.setVisible(false);
            pp2.setVisible(false);
            pp3.setVisible(false);
            
            revalidate();
            repaint();
    }//GEN-LAST:event_TemaMetroMouseClicked

    private void iconapp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconapp2ActionPerformed
        new cronometro();
    }//GEN-LAST:event_iconapp2ActionPerformed

    private void iconapp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconapp3ActionPerformed
        new TextEditor();
    }//GEN-LAST:event_iconapp3ActionPerformed

    private void closebutton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebutton1MousePressed
        setState(ICONIFIED);
    }//GEN-LAST:event_closebutton1MousePressed
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton TemaDefault;
    private javax.swing.JRadioButton TemaMetro;
    private javax.swing.JRadioButton TemaSpiderMan;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel closebutton;
    private javax.swing.JLabel closebutton1;
    private javax.swing.JPanel header;
    private javax.swing.JButton iconapp1;
    private javax.swing.JButton iconapp2;
    private javax.swing.JButton iconapp3;
    private javax.swing.JButton iconjogo1;
    private javax.swing.JButton iconjogo2;
    private javax.swing.JButton iconjogo3;
    private javax.swing.JButton iconjogo4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel title;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}