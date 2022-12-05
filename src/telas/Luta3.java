package telas;

import java.io.*;
import Codigos.*;
import javax.swing.JOptionPane;

public class Luta3 extends javax.swing.JFrame {

    int tipoAtq;
    int atqInim = 6;
    int vidaPlay = 170;
    int vidaInim = 170;
    int coragem;

    Inimigo inim;
    Player play;
    Possibilidades pos;

    public Luta3() {
        initComponents();

        inim = new Inimigo(atqInim, vidaInim);
        play = new Player("", tipoAtq, vidaPlay);
        pos = new Possibilidades(inim, play);

        txtVidPlay.setText(String.valueOf(play.getVida()));
        txtvidInim.setText(String.valueOf(inim.getVida()));
        txtNmInimigo.setText("Bandidos");
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
        txtband = new javax.swing.JLabel();
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

        normal.setText("Socos");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });

        especial.setText("Punhal");
        especial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialActionPerformed(evt);
            }
        });

        pro.setText("Espada");
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });

        ultimate.setText("Arco e flechas");
        ultimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimateActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtplay.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtband, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtplay, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtplay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtband, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Vida:");

        jLabel3.setText("Vida:");

        txtvidInim.setText("0");

        txtVidPlay.setText("0");

        jLabel4.setText("Coragem:");

        txtCoragem.setText("0");

        txtNmInimigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVidPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(normal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(especial)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(txtNmInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(pro)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtvidInim, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(ultimate)))))
                                .addContainerGap(16, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNmInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtvidInim)
                    .addComponent(txtVidPlay)
                    .addComponent(jLabel4)
                    .addComponent(txtCoragem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(normal)
                    .addComponent(especial)
                    .addComponent(pro)
                    .addComponent(ultimate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        coragem = coragem + 2;
        tipoAtq = 5;
        vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
        vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
        txtVidPlay.setText(String.valueOf(vidaPlay));
        txtvidInim.setText(String.valueOf(vidaInim));
        txtCoragem.setText(String.valueOf(coragem));
        txtplay.setText("Você soca um dos bandidos.");
        txtband.setText("Os outros vem para cima e te atacam, mas você consegue desviar de alguns golpes");

        if (vidaInim <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você ganhou, apôs lutar muito os bandidos perseberam que você era o protagonista e decidem ir embora.");
            JOptionPane.showMessageDialog(rootPane, "Eles acabaram deixando um frasco cair e ao pergar você percebe que é um poção de cura.");
            JOptionPane.showMessageDialog(rootPane, "você toma e sua feridas se curam. Sua vida aumenta para 200");
            JOptionPane.showMessageDialog(rootPane, "Depois você dorme ao lado da fogueira, ao acordar você continuou seguindo o caminho e acaba chegando em uma mansão");
            JOptionPane.showMessageDialog(rootPane, "Ao bater na porta uma figura aparece atras de você.");
            JOptionPane.showMessageDialog(rootPane, "Ao se virar você percebe que era um vampiro, ele te ataca e por pouco você desvia");
            JOptionPane.showMessageDialog(rootPane, "Na sua bolsa aparece uma cruz, uma garrafa com água benta, uma estaca e alho.");
            JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
            Luta3.this.dispose();
            new Luta4().setVisible(true);
        } else if (vidaPlay <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você perdeu, os bandidos conseguem te matar e roubam a sua bolsa");
            Luta3.this.dispose();
            new Luta3().setVisible(true);
        }

    }//GEN-LAST:event_normalActionPerformed

    private void ultimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimateActionPerformed
        if (coragem >= 14) {
            coragem = coragem - 14;
            tipoAtq = 24;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));
            txtplay.setText("Com o arco e flechas voce ataca os bandidos.");
            txtband.setText("Os outros vem para cima e te atacam, mas você consegue desviar de alguns golpes");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você ganhou, apôs lutar muito os bandidos perseberam que você era o protagonista e decidem ir embora.");
                JOptionPane.showMessageDialog(rootPane, "Eles acabaram deixando um frasco cair e ao pergar você percebe que é um poção de cura.");
                JOptionPane.showMessageDialog(rootPane, "você toma e sua feridas se curam. Sua vida aumenta para 200");
                JOptionPane.showMessageDialog(rootPane, "Depois você dorme ao lado da fogueira, ao acordar você continuou seguindo o caminho e acaba chegando em uma mansão");
                JOptionPane.showMessageDialog(rootPane, "Ao bater na porta uma figura aparece atras de você.");
                JOptionPane.showMessageDialog(rootPane, "Ao se virar você percebe que era um vampiro, ele te ataca e por pouco você desvia");
                JOptionPane.showMessageDialog(rootPane, "Na sua bolsa aparece uma cruz, uma garrafa com água benta, uma estaca e alho.");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
                Luta3.this.dispose();
                new Luta4().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, os bandidos conseguem te matar e roubam a sua bolsa");
                Luta3.this.dispose();
                new Luta3().setVisible(true);
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
            txtplay.setText("Você usa o punhal e esfaqueia um dos bandidos.");
            txtband.setText("Os outros vem para cima e te atacam, mas você consegue desviar de alguns golpes");

            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você ganhou, apôs lutar muito os bandidos perseberam que você era o protagonista e decidem ir embora.");
                JOptionPane.showMessageDialog(rootPane, "Eles acabaram deixando um frasco cair e ao pergar você percebe que é um poção de cura.");
                JOptionPane.showMessageDialog(rootPane, "você toma e sua feridas se curam. Sua vida aumenta para 200");
                JOptionPane.showMessageDialog(rootPane, "Depois você dorme ao lado da fogueira, ao acordar você continuou seguindo o caminho e acaba chegando em uma mansão");
                JOptionPane.showMessageDialog(rootPane, "Ao bater na porta uma figura aparece atras de você.");
                JOptionPane.showMessageDialog(rootPane, "Ao se virar você percebe que era um vampiro, ele te ataca e por pouco você desvia");
                JOptionPane.showMessageDialog(rootPane, "Na sua bolsa aparece uma cruz, uma garrafa com água benta, uma estaca e alho.");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
                Luta3.this.dispose();
                new Luta4().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, os bandidos conseguem te matar e roubam a sua bolsa");
                Luta3.this.dispose();
                new Luta3().setVisible(true);
            }
        }
     }//GEN-LAST:event_especialActionPerformed

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        if (coragem >= 8) {
            coragem = coragem - 8;
            tipoAtq = 14;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));
            txtplay.setText("Com a espada voce consegue atacar varios bandidos.");
            txtband.setText("Os outros vem para cima e te atacam, mas você consegue desviar de alguns golpes");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você ganhou, apôs lutar muito os bandidos perseberam que você era o protagonista e decidem ir embora.");
                JOptionPane.showMessageDialog(rootPane, "Eles acabaram deixando um frasco cair e ao pergar você percebe que é um poção de cura.");
                JOptionPane.showMessageDialog(rootPane, "você toma e sua feridas se curam. Sua vida aumenta para 200");
                JOptionPane.showMessageDialog(rootPane, "Depois você dorme ao lado da fogueira, ao acordar você continuou seguindo o caminho e acaba chegando em uma mansão");
                JOptionPane.showMessageDialog(rootPane, "Ao bater na porta uma figura aparece atras de você.");
                JOptionPane.showMessageDialog(rootPane, "Ao se virar você percebe que era um vampiro, ele te ataca e por pouco você desvia");
                JOptionPane.showMessageDialog(rootPane, "Na sua bolsa aparece uma cruz, uma garrafa com água benta, uma estaca e alho.");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
                Luta3.this.dispose();
                new Luta4().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Parabens você perdeu, essa rodada irá recomeçar");
                Luta3.this.dispose();
                new Luta3().setVisible(true);
            }
        }
    }//GEN-LAST:event_proActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Luta3().setVisible(true);
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
    private javax.swing.JLabel txtband;
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtplay;
    private javax.swing.JLabel txtvidInim;
    private javax.swing.JButton ultimate;
    // End of variables declaration//GEN-END:variables

}
