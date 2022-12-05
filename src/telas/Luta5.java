package telas;

import java.io.*;
import Codigos.*;
import javax.swing.JOptionPane;

public class Luta5 extends javax.swing.JFrame {

    int tipoAtq;
    int atqInim = 8;
    int vidaPlay = 250;
    int vidaInim = 250;
    int coragem;

    Inimigo inim;
    Player play;
    Possibilidades pos;

    public Luta5() {
        initComponents();

        inim = new Inimigo(atqInim, vidaInim);
        play = new Player("", tipoAtq, vidaPlay);
        pos = new Possibilidades(inim, play);

        txtVidPlay.setText(String.valueOf(play.getVida()));
        txtvidInim.setText(String.valueOf(inim.getVida()));
        txtNmInimigo.setText("Cobra gigante");
        try {
            FileReader fr = new FileReader("C:\\Intel\\nome.txt");
            BufferedReader br = new BufferedReader(fr);
            String nm = br.readLine();
            txtnome.setText(nm);

        } catch (Exception e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        normal = new javax.swing.JButton();
        especial = new javax.swing.JButton();
        pro = new javax.swing.JButton();
        ultimate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtplay = new javax.swing.JLabel();
        txtcobra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtvidInim = new javax.swing.JLabel();
        txtVidPlay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCoragem = new javax.swing.JLabel();
        txtnome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNmInimigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Fight");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        normal.setText("Punhal");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });
        getContentPane().add(normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 72, -1, -1));

        especial.setText("Arco e flechas");
        especial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialActionPerformed(evt);
            }
        });
        getContentPane().add(especial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        pro.setText("bola de fogo");
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });
        getContentPane().add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        ultimate.setText("congelamento");
        ultimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimateActionPerformed(evt);
            }
        });
        getContentPane().add(ultimate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtplay.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcobra, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtplay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcobra, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 107, 400, -1));

        jLabel2.setText("Vida:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 44, -1, -1));

        jLabel3.setText("Vida:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 44, -1, -1));

        txtvidInim.setText("0");
        getContentPane().add(txtvidInim, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 44, 51, -1));

        txtVidPlay.setText("0");
        getContentPane().add(txtVidPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 44, 35, -1));

        jLabel4.setText("Coragem:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 44, -1, -1));

        txtCoragem.setText("0");
        getContentPane().add(txtCoragem, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 44, 33, -1));
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 19, 100, 19));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 13, 55, -1));

        txtNmInimigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtNmInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 19, 84, 19));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        coragem = coragem + 5;
        tipoAtq = 4;
        vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
        vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
        txtVidPlay.setText(String.valueOf(vidaPlay));
        txtvidInim.setText(String.valueOf(vidaInim));
        txtCoragem.setText(String.valueOf(coragem));
        txtplay.setText("Você ata a cobra com o punhal");
        txtcobra.setText("A cobra te joga para longe com um golpe.");
        if (vidaInim <= 0) {
            JOptionPane.showMessageDialog(rootPane, "A cobra morre e cai para o fundo do lago");
            JOptionPane.showMessageDialog(rootPane, "Um portal surge e ao entrar nele você apaga.");
            JOptionPane.showMessageDialog(rootPane, "Ao abrir os olhos você vê que esta em uma floresta escura e ao olhar ao redor encontra apenas uma trilha de pedrinhas luminosas");
            JOptionPane.showMessageDialog(rootPane, "...");
            JOptionPane.showMessageDialog(rootPane, "...");
            JOptionPane.showMessageDialog(rootPane, "Parabens você ganhou o jogo.");
        } else if (vidaPlay <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você perdeu e a cobra te engoliu");
            new Luta5().setVisible(true);
        }

    }//GEN-LAST:event_normalActionPerformed

    private void ultimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimateActionPerformed
        if (coragem >= 14) {
            coragem = coragem - 14;
            tipoAtq = 26;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));
            txtplay.setText("Você usa o poder de congelamento para imobilizar a cobra.");
            txtcobra.setText("A cobra se livra do congelamento e te ataca");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "A cobra morre e cai para o fundo do lago");
                JOptionPane.showMessageDialog(rootPane, "Um portal surge e ao entrar nele você apaga.");
                JOptionPane.showMessageDialog(rootPane, "Ao abrir os olhos você vê que esta em uma floresta escura e ao olhar ao redor encontra apenas uma trilha de pedrinhas luminosas");
                JOptionPane.showMessageDialog(rootPane, "...");
                JOptionPane.showMessageDialog(rootPane, "...");
                JOptionPane.showMessageDialog(rootPane, "Parabens você ganhou o jogo.");
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu e a cobra te engoliu");
                new Luta5().setVisible(true);
            }
        }
     }//GEN-LAST:event_ultimateActionPerformed

    private void especialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialActionPerformed
        if (coragem >= 4) {
            coragem = coragem - 4;
            tipoAtq = 8;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));
            txtplay.setText("Você usa o arco e flechas para a atacar a cobra");
            txtcobra.setText("A cobra te joga para longe com um golpe.");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "A cobra morre e cai para o fundo do lago");
                JOptionPane.showMessageDialog(rootPane, "Um portal surge e ao entrar nele você apaga.");
                JOptionPane.showMessageDialog(rootPane, "Ao abrir os olhos você vê que esta em uma floresta escura e ao olhar ao redor encontra apenas uma trilha de pedrinhas luminosas");
                JOptionPane.showMessageDialog(rootPane, "...");
                JOptionPane.showMessageDialog(rootPane, "...");
                JOptionPane.showMessageDialog(rootPane, "Parabens você ganhou o jogo.");
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu e a cobra te engoliu");
                new Luta5().setVisible(true);
            }
        }
     }//GEN-LAST:event_especialActionPerformed

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        if (coragem >= 8) {
            coragem = coragem - 8;
            tipoAtq = 16;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));
            txtplay.setText("Você usa bola de fogo na cobra  ela toma dano");
            txtcobra.setText("A cobra te ataca rapidamente te joga para longe com o golpe.");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "A cobra morre e cai para o fundo do lago");
                JOptionPane.showMessageDialog(rootPane, "Um portal surge e ao entrar nele você apaga.");
                JOptionPane.showMessageDialog(rootPane, "Ao abrir os olhos você vê que esta em uma floresta escura e ao olhar ao redor encontra apenas uma trilha de pedrinhas luminosas");
                JOptionPane.showMessageDialog(rootPane, "...");
                JOptionPane.showMessageDialog(rootPane, "...");
                JOptionPane.showMessageDialog(rootPane, "Parabens você ganhou o jogo.");
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu e a cobra te engoliu");
                new Luta5().setVisible(true);
            }
        }
    }//GEN-LAST:event_proActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Luta5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton especial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton normal;
    private javax.swing.JButton pro;
    private javax.swing.JLabel txtCoragem;
    private javax.swing.JLabel txtNmInimigo;
    private javax.swing.JLabel txtVidPlay;
    private javax.swing.JLabel txtcobra;
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtplay;
    private javax.swing.JLabel txtvidInim;
    private javax.swing.JButton ultimate;
    // End of variables declaration//GEN-END:variables

}
