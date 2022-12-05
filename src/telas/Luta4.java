package telas;

import java.io.*;
import Codigos.*;
import javax.swing.JOptionPane;

public class Luta4 extends javax.swing.JFrame {

    int tipoAtq;
    int atqInim = 8;
    int vidaPlay = 200;
    int vidaInim = 200;
    int coragem;

    Inimigo inim;
    Player play;
    Possibilidades pos;

    public Luta4() {
        initComponents();

        inim = new Inimigo(atqInim, vidaInim);
        play = new Player("", tipoAtq, vidaPlay);
        pos = new Possibilidades(inim, play);

        txtVidPlay.setText(String.valueOf(play.getVida()));
        txtvidInim.setText(String.valueOf(inim.getVida()));
        txtNmInimigo.setText("Vampiro");
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
        txtvamp = new javax.swing.JLabel();
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

        normal.setText("Cruz");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });

        especial.setText("alho");
        especial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialActionPerformed(evt);
            }
        });

        pro.setText("água benta");
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });

        ultimate.setText("estaca");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtplay, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(txtvamp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtplay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvamp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVidPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(normal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(especial)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pro)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNmInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtvidInim, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ultimate)))
                                .addContainerGap(12, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
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
        coragem = coragem + 4;
        tipoAtq = 5;
        vidaPlay = pos.playerAtaca(vidaPlay, atqInim);
        vidaInim = pos.inimigoAtaca(vidaInim, tipoAtq);
        txtVidPlay.setText(String.valueOf(vidaPlay));
        txtvidInim.setText(String.valueOf(vidaInim));
        txtCoragem.setText(String.valueOf(coragem));
        txtplay.setText("Você usa a cruz e o vampiro toma dano");
        txtvamp.setText("O vampiro vem rapidamente para cima de você e te ataca");
        if (vidaInim <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você derrotou o vampiro, e ele se transform em sinzas e apenas um amuleto resta.");
            JOptionPane.showMessageDialog(rootPane, "Ao colocalo seus ferimentos se curam. Sua vida almenta para 250.");
            JOptionPane.showMessageDialog(rootPane, "Você seguindo o caminho e sente que sua aventura esta para acabar.");
            JOptionPane.showMessageDialog(rootPane, "Você se lembra de todas as suas batalhas e se vê em frete a um lago, era ali que o caminho de pedrinhas brilhantes terminava");
            JOptionPane.showMessageDialog(rootPane, "Uma cobra gigante aparece, em sua bolsa um punhal e um arco e flechas, a bolsa some e fica um bilhete");
            JOptionPane.showMessageDialog(rootPane, "Bilhete: O seu amuleto agora tem o poder de conjurar bolas de fogo e de congelar.");
            JOptionPane.showMessageDialog(rootPane, "Você se prepara a ultima luta.");
            Luta4.this.dispose();
            new Luta5().setVisible(true);
        } else if (vidaPlay <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você perdeu, o vampiro te imobiliza e toma todo o seu sangue");
            Luta4.this.dispose();
            new Luta4().setVisible(true);
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
            txtplay.setText("Você ataca o vampiro com a estaca e ele toma dano");
            txtvamp.setText("O vampiro vira um morcego e te ataca");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você derrotou o vampiro, e ele se transform em sinzas e apenas um amuleto resta.");
                JOptionPane.showMessageDialog(rootPane, "Ao colocalo seus ferimentos se curam. Sua vida almenta para 250.");
                JOptionPane.showMessageDialog(rootPane, "Você seguindo o caminho e sente que sua aventura esta para acabar.");
                JOptionPane.showMessageDialog(rootPane, "Você se lembra de todas as suas batalhas e se vê em frete a um lago, era ali que o caminho de pedrinhas brilhantes terminava");
                JOptionPane.showMessageDialog(rootPane, "Uma cobra gigante aparece, em sua bolsa um punhal e um arco e flechas, a bolsa some e fica um bilhete");
                JOptionPane.showMessageDialog(rootPane, "Bilhete: O seu amuleto agora tem o poder de conjurar bolas de fogo e de congelar.");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara a ultima luta.");
                Luta4.this.dispose();
                new Luta5().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, o vampiro te imobiliza e toma todo o seu sangue");
                Luta4.this.dispose();
                new Luta4().setVisible(true);
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
            txtplay.setText("Você joga alho no vampiro e ele toma dano");
            txtvamp.setText("O vampiro vem rapidamente para cima de você e te ataca");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você derrotou o vampiro, e ele se transform em sinzas e apenas um amuleto resta.");
                JOptionPane.showMessageDialog(rootPane, "Ao colocalo seus ferimentos se curam. Sua vida almenta para 250.");
                JOptionPane.showMessageDialog(rootPane, "Você seguindo o caminho e sente que sua aventura esta para acabar.");
                JOptionPane.showMessageDialog(rootPane, "Você se lembra de todas as suas batalhas e se vê em frete a um lago, era ali que o caminho de pedrinhas brilhantes terminava");
                JOptionPane.showMessageDialog(rootPane, "Uma cobra gigante aparece, em sua bolsa um punhal e um arco e flechas, a bolsa some e fica um bilhete");
                JOptionPane.showMessageDialog(rootPane, "Bilhete: O seu amuleto agora tem o poder de conjurar bolas de fogo e de congelar.");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara a ultima luta.");
                Luta4.this.dispose();
                new Luta5().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, o vampiro te imobiliza e toma todo o seu sangue");
                Luta4.this.dispose();
                new Luta4().setVisible(true);
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
            txtplay.setText("Você joga água benta no vampiro e ele toma dano");
            txtvamp.setText("O vampiro vira um morcego e te ataca");
            if (vidaInim <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você derrotou o vampiro, e ele se transform em sinzas e apenas um amuleto resta.");
                JOptionPane.showMessageDialog(rootPane, "Ao colocalo seus ferimentos se curam. Sua vida almenta para 250.");
                JOptionPane.showMessageDialog(rootPane, "Você seguindo o caminho e sente que sua aventura esta para acabar.");
                JOptionPane.showMessageDialog(rootPane, "Você se lembra de todas as suas batalhas e se vê em frete a um lago, era ali que o caminho de pedrinhas brilhantes terminava");
                JOptionPane.showMessageDialog(rootPane, "Uma cobra gigante aparece, em sua bolsa um punhal e um arco e flechas, a bolsa some e fica um bilhete");
                JOptionPane.showMessageDialog(rootPane, "Bilhete: O seu amuleto agora tem o poder de conjurar bolas de fogo e de congelar.");
                JOptionPane.showMessageDialog(rootPane, "Você se prepara a ultima luta.");
                Luta4.this.dispose();
                new Luta5().setVisible(true);
            } else if (vidaPlay <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Você perdeu, o vampiro te imobiliza e toma todo o seu sangue");
                Luta4.this.dispose();
                new Luta4().setVisible(true);
            }
        }
    }//GEN-LAST:event_proActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Luta4().setVisible(true);
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
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtplay;
    private javax.swing.JLabel txtvamp;
    private javax.swing.JLabel txtvidInim;
    private javax.swing.JButton ultimate;
    // End of variables declaration//GEN-END:variables

}
