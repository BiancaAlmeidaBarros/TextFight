package telas;

import java.io.*;
import Codigos.*;
import javax.swing.JOptionPane;

public class Luta2 extends javax.swing.JFrame {

    int tipoAtq;
    int atqInim = 5;
    int vidaPlay = 120;
    int vidaInim = 130;
    int coragem;

    Inimigo inim;
    Player play;
    Possibilidades pos;

    public Luta2() {
        initComponents();

        inim = new Inimigo(atqInim, vidaInim);
        play = new Player("", tipoAtq, vidaPlay);
        pos = new Possibilidades(inim, play);

        txtVidPlay.setText(String.valueOf(play.getVida()));
        txtvidInim.setText(String.valueOf(inim.getVida()));
        txtNmInimigo.setText("Coelho");
        try {
            FileReader fr = new FileReader("C:\\Intel\\nome.txt");
            BufferedReader br = new BufferedReader(fr);
            String nm = br.readLine();
            txtnome.setText(nm);

        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(rootPane, "Você continua a seguir o caminho e encontra um monte de coelhos.");
        JOptionPane.showMessageDialog(rootPane, "Ao chegar perto eles fogem e fica apenas um.");
        JOptionPane.showMessageDialog(rootPane, "Como você estava faminto, e não parecia que aquela bolsa ia te dar algo para comer, você decide matar o coelho.");
        JOptionPane.showMessageDialog(rootPane, "Mas ao dar o seu primeiro ataque ele desvia e começa a flutuar.");
        JOptionPane.showMessageDialog(rootPane, "??????");
        JOptionPane.showMessageDialog(rootPane, "Você sente que esse coelho é muito podero.");
        JOptionPane.showMessageDialog(rootPane, "Na bolsa aparece um graveto, uma tocha acesa, uma espada e um Spray de pimenta");
        JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
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
        txtcoel = new javax.swing.JLabel();
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

        especial.setText("Tocha");
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

        ultimate.setText("Spray");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtplay, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcoel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtplay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txtcoel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVidPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(normal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(especial)))
                        .addGap(18, 18, 18)
                        .addComponent(pro)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtvidInim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txtNmInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ultimate)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        coragem = coragem + 2;
        tipoAtq = 4;
        vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
        vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
        txtVidPlay.setText(String.valueOf(vidaPlay));
        txtvidInim.setText(String.valueOf(vidaInim));
        txtCoragem.setText(String.valueOf(coragem));
        txtplay.setText("você bate com graveto no coelho.");
        txtcoel.setText("O coelho te morde.");

        if (vidaInim <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você mata o coelho e agora tem algo para comer, demorou um tempo para as coisas desaparecerem, então deu pra usar a tocha para acender uma fogueira.");
                JOptionPane.showMessageDialog(rootPane, "Depois de comer você percebe que suas feridas se curaram. Sua vida almenta para 170");
            JOptionPane.showMessageDialog(rootPane, "Você começa a se esquentar da fogueira e acaba ouvindo vozes.");
            JOptionPane.showMessageDialog(rootPane, "Bandidos aparecem e parecem interessados na sua bolsa.");
            JOptionPane.showMessageDialog(rootPane, "Aparece na sua bolsa um soco ingles, punhal, espada e um arco e flechas");
            JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
            Luta2.this.dispose();
            new Luta3().setVisible(true);
        } else if (vidaPlay <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você perdeu, o coelho te mordeu tanto que você morre de hemorragia");
            Luta2.this.dispose();
            new Luta2().setVisible(true);
        }

    }//GEN-LAST:event_normalActionPerformed

    private void ultimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimateActionPerformed
        if (coragem >= 14) {
            coragem = coragem - 14;
            tipoAtq = 22;
            vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
            vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
            txtVidPlay.setText(String.valueOf(vidaPlay));
            txtvidInim.setText(String.valueOf(vidaInim));
            txtCoragem.setText(String.valueOf(coragem));
            txtplay.setText("você usa o spray de pimenta no coelho.");
            txtcoel.setText("O coelho usa uma magia de fogo em você, mas era meio fraca.");

            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você mata o coelho e agora tem algo para comer, demorou um tempo para as coisas desaparecerem, então deu pra usar a tocha para acender uma fogueira.");
                JOptionPane.showMessageDialog(rootPane, "Depois de comer você percebe que suas feridas se curaram. Sua vida almenta para 170");
                JOptionPane.showMessageDialog(rootPane, "Você começa a se esquentar da fogueira e acaba ouvindo vozes.");
                JOptionPane.showMessageDialog(rootPane, "Bandidos aparecem e parecem interessados na sua bolsa.");
                JOptionPane.showMessageDialog(rootPane, "Aparece na sua bolsa um soco ingles, punhal, espada e um arco e flechas");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
                Luta2.this.dispose();
                new Luta3().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, quem diria que aquele monte de magias de fogo fracas conseguiriam te queimar tanto.");
                Luta2.this.dispose();
                new Luta2().setVisible(true);
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
            txtplay.setText("você usa a tocha para queimar o coelho.");
            txtcoel.setText("O coelho cria uma barreira e parte do dano volta para você.");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você mata o coelho e agora tem algo para comer, demorou um tempo para as coisas desaparecerem, então deu pra usar a tocha para acender uma fogueira.");
                JOptionPane.showMessageDialog(rootPane, "Depois de comer você percebe que suas feridas se curaram. Sua vida almenta para 170");
                JOptionPane.showMessageDialog(rootPane, "Você começa a se esquentar da fogueira e acaba ouvindo vozes.");
                JOptionPane.showMessageDialog(rootPane, "Bandidos aparecem e parecem interessados na sua bolsa.");
                JOptionPane.showMessageDialog(rootPane, "Aparece na sua bolsa um soco ingles, punhal, espada e um arco e flechas");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
                Luta2.this.dispose();
                new Luta3().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, aquelas barreiras acabaram reflentindo muito o dano dos seus ataques");
                Luta2.this.dispose();
                new Luta2().setVisible(true);
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
            txtplay.setText("você tenta dar uma espadada no coelho.");
            txtcoel.setText("O coelho cria uma barreira e parte do dano volta para você.");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você mata o coelho e agora tem algo para comer, demorou um tempo para as coisas desaparecerem, então deu pra usar a tocha para acender uma fogueira.");
                JOptionPane.showMessageDialog(rootPane, "Depois de comer você percebe que suas feridas se curaram. Sua vida almenta para 170");
                JOptionPane.showMessageDialog(rootPane, "Você começa a se esquentar da fogueira e acaba ouvindo vozes.");
                JOptionPane.showMessageDialog(rootPane, "Bandidos aparecem e parecem interessados na sua bolsa.");
                JOptionPane.showMessageDialog(rootPane, "Aparece na sua bolsa um soco ingles, punhal, espada e um arco e flechas");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara para a luta.");
                Luta2.this.dispose();
                new Luta3().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, aquelas barreiras acabaram reflentindo muito o dano dos seus ataques");
                Luta2.this.dispose();
                new Luta2().setVisible(true);
            }
        }
    }//GEN-LAST:event_proActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Luta2().setVisible(true);
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
    private javax.swing.JLabel txtcoel;
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtplay;
    private javax.swing.JLabel txtvidInim;
    private javax.swing.JButton ultimate;
    // End of variables declaration//GEN-END:variables

}
