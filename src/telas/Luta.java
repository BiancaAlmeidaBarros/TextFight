package telas;

import java.io.*;
import Codigos.*;
import javax.swing.JOptionPane;

public class Luta extends javax.swing.JFrame {

    int tipoAtq;
    int atqInim = 3;
    int vidaPlay = 100;
    int vidaInim = 100;
    int coragem;

    Inimigo inim;
    Player play;
    Possibilidades pos;

    public Luta() {
        initComponents();

        inim = new Inimigo(atqInim, vidaInim);
        play = new Player("", tipoAtq, vidaPlay);
        pos = new Possibilidades(inim, play);

        txtVidPlay.setText(String.valueOf(play.getVida()));
        txtvidInim.setText(String.valueOf(inim.getVida()));
        txtNmInimigo.setText("Lobo");
        try {
            FileReader fr = new FileReader("C:\\Intel\\nome.txt");
            BufferedReader br = new BufferedReader(fr);
            String nm = br.readLine();
            txtnome.setText(nm);

        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(rootPane, "Como você andou muito, decidiu dormir um pouco. Ao acordar não demora muito de perceber que esta de cara com um lobo.");
        JOptionPane.showMessageDialog(rootPane, "Você se afasta rapidamente e percebe que dentro daquela bolsa, antes vazia, tinha um graveto, faca, pedra e isqueiro.");
        JOptionPane.showMessageDialog(rootPane, "Agora preparado para o ataque você decide lutar.");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        normal = new javax.swing.JButton();
        especial = new javax.swing.JButton();
        pro = new javax.swing.JButton();
        ultimate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtInfPlay = new javax.swing.JLabel();
        txtAtqLobo = new javax.swing.JLabel();
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

        normal.setText("Graveto");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });

        especial.setText("Pedra");
        especial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialActionPerformed(evt);
            }
        });

        pro.setText("Faca");
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });

        ultimate.setText("Esqueiro");
        ultimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimateActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtInfPlay.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAtqLobo, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(txtInfPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInfPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAtqLobo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(normal)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVidPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(especial))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pro)
                                .addGap(33, 33, 33)
                                .addComponent(ultimate))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNmInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtvidInim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNmInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
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
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        coragem = coragem + 2;
        tipoAtq = 2;
        vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
        vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
        txtVidPlay.setText(String.valueOf(vidaPlay));
        txtvidInim.setText(String.valueOf(vidaInim));
        txtCoragem.setText(String.valueOf(coragem));

        txtInfPlay.setText("Voce Ataca com o graveto.");
        txtAtqLobo.setText("O lobo te arranha.");

        if (vidaInim <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Parabens consegui matar o lobo, as coisas que você usou na luta sumiram.");
            JOptionPane.showMessageDialog(rootPane, "Mas você sabe que pode contar com sua bolsa mágica.");
            JOptionPane.showMessageDialog(rootPane, "Ao continuar seguindo as pedras brilhantes você encontra um Oasis, você mergulhar nele para limpar suas feridas.");
            JOptionPane.showMessageDialog(rootPane, "Ao sair suas feridas foram curadas e você sente revigorado.");
            JOptionPane.showMessageDialog(rootPane, "Sua vida aumentou para 120");
            Luta.this.dispose();
            new Luta2().setVisible(true);
        } else if (vidaPlay <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você perdeu, o lobo te dou um ataque fatal.");
            Luta.this.dispose();
            new Luta().setVisible(true);
        }

    }//GEN-LAST:event_normalActionPerformed

    private void ultimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimateActionPerformed
        if (coragem >= 14) {
            coragem = coragem - 14;
            tipoAtq = 20;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));

            txtInfPlay.setText("Você usa o isqueiro para queimar o lobo.");
            txtAtqLobo.setText("O lobo te  morde.");

            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Parabens consegui matar o lobo, as coisas que você usou na luta sumiram.");
                JOptionPane.showMessageDialog(rootPane, "Mas você sabe que pode contar com sua bolsa mágica.");
                JOptionPane.showMessageDialog(rootPane, "Ao continuar seguindo as pedras brilhantes você encontra um Oasis, você mergulhar nele para limpar suas feridas.");
                JOptionPane.showMessageDialog(rootPane, "Ao sair suas feridas foram curadas e você sente revigorado.");
                JOptionPane.showMessageDialog(rootPane, "Sua vida aumentou para 120");
                Luta.this.dispose();
                new Luta2().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, agora você é o jantar do lobo.");
                Luta.this.dispose();
                new Luta().setVisible(true);
            }
        }
     }//GEN-LAST:event_ultimateActionPerformed

    private void especialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialActionPerformed
        if (coragem >= 4) {
            coragem = coragem - 4;
            tipoAtq = 6;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));

            txtInfPlay.setText("Você taca a pedra no lobo.");
            txtAtqLobo.setText("O lobo ataca sorrateiramente.");

            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Parabens consegui matar o lobo, as coisas que você usou na luta sumiram.");
                JOptionPane.showMessageDialog(rootPane, "Mas você sabe que pode contar com sua bolsa mágica.");
                JOptionPane.showMessageDialog(rootPane, "Ao continuar seguindo as pedras brilhantes você encontra um Oasis, você mergulhar nele para limpar suas feridas.");
                JOptionPane.showMessageDialog(rootPane, "Ao sair suas feridas foram curadas e você sente revigorado.");
                JOptionPane.showMessageDialog(rootPane, "Sua vida aumentou para 120");
                Luta.this.dispose();
                new Luta2().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu,o lobo te atacou pela costas e você morreu.");
                Luta.this.dispose();
                new Luta().setVisible(true);
            }
        }
     }//GEN-LAST:event_especialActionPerformed

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        if (coragem >= 8) {
            coragem = coragem - 8;
            tipoAtq = 12;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));

            txtInfPlay.setText("Você dá uma facada no lobo, mas ele consegue ser reerguer.");
            txtAtqLobo.setText("O lobo furiosamente pula em você.");

            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Parabens consegui matar o lobo, as coisas que você usou na luta sumiram.");
                JOptionPane.showMessageDialog(rootPane, "Mas você sabe que pode contar com sua bolsa mágica.");
                JOptionPane.showMessageDialog(rootPane, "Ao continuar seguindo as pedras brilhantes você encontra um Oasis, você mergulhar nele para limpar suas feridas.");
                JOptionPane.showMessageDialog(rootPane, "Ao sair suas feridas foram curadas e você sente revigorado.");
                JOptionPane.showMessageDialog(rootPane, "Sua vida aumentou para 120");
                Luta.this.dispose();
                new Luta2().setVisible(true);

            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, o lobo foi mais espero e consegue te matar.");
                Luta.this.dispose();
                new Luta().setVisible(true);

            }
        }
    }//GEN-LAST:event_proActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Luta().setVisible(true);
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
    private javax.swing.JLabel txtAtqLobo;
    private javax.swing.JLabel txtCoragem;
    private javax.swing.JLabel txtInfPlay;
    private javax.swing.JLabel txtNmInimigo;
    private javax.swing.JLabel txtVidPlay;
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtvidInim;
    private javax.swing.JButton ultimate;
    // End of variables declaration//GEN-END:variables

}
