package View;

import Controller.Jogo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import Controller.JogoObservador;

/**
 *
 * @author Brenda Paetzoldt
 */
public class Placar extends javax.swing.JFrame implements JogoObservador {

    private Jogo jogo = Jogo.getIntance();
    private String txt_eqpA;
    private String txt_eqpB;
    private Date dataHoraAtual = new Date();
    String hora = new SimpleDateFormat("HH:mm").format(dataHoraAtual);

    public Placar() {
        initComponents();
        jogo.addObs(this);
        setLocationRelativeTo(null);
        btn_PontosA.setEnabled(false);
        btn_PontosB.setEnabled(false);
        jListA.setVisible(false);
        jListB.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_EqpA = new javax.swing.JLabel();
        lbl_EqpB = new javax.swing.JLabel();
        btn_PontosA = new javax.swing.JButton();
        btn_PontosB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListA = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListB = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_novaPartida = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_horario = new javax.swing.JLabel();
        list1 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_EqpA.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_EqpA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_EqpA.setText("Equipe A");
        jPanel1.add(lbl_EqpA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 165, 380, -1));

        lbl_EqpB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_EqpB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_EqpB.setText("Equipe B");
        jPanel1.add(lbl_EqpB, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 165, 360, -1));

        btn_PontosA.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        btn_PontosA.setText("0");
        btn_PontosA.setToolTipText("Clique para pontuar");
        btn_PontosA.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_PontosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PontosAActionPerformed(evt);
            }
        });
        jPanel1.add(btn_PontosA, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 203, 103, 101));

        btn_PontosB.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        btn_PontosB.setText("0");
        btn_PontosB.setMaximumSize(new java.awt.Dimension(100, 100));
        btn_PontosB.setMinimumSize(new java.awt.Dimension(100, 100));
        btn_PontosB.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_PontosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PontosBActionPerformed(evt);
            }
        });
        jPanel1.add(btn_PontosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 203, 103, 101));

        jListA.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jListA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListA.setAutoscrolls(false);
        jListA.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jListA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 110, 90));

        jListB.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jListB.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListB.setAutoscrolls(false);
        jScrollPane2.setViewportView(jListB);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 110, 90));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 149, 780, 10));

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 180, 40, 70));

        btn_novaPartida.setBackground(new java.awt.Color(255, 255, 255));
        btn_novaPartida.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        btn_novaPartida.setText("Iniciar partida");
        btn_novaPartida.setBorderPainted(false);
        btn_novaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novaPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(btn_novaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(btn_novaPartida)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        lbl_horario.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_horario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_horario.setText("00:00");
        lbl_horario.setAlignmentY(0.0F);
        lbl_horario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_horario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 80));
        jPanel1.add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PontosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PontosAActionPerformed
        jogo.Pontuar(1);
    }//GEN-LAST:event_btn_PontosAActionPerformed

    private void btn_PontosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PontosBActionPerformed
        jogo.Pontuar(2);
    }//GEN-LAST:event_btn_PontosBActionPerformed

    private void btn_novaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novaPartidaActionPerformed

        txt_eqpA = JOptionPane.showInputDialog("Digite o nome da equipe (ou deixe em branco para chamar de Equipe A)");
        if (txt_eqpA.isEmpty()) {
            lbl_EqpA.setText("Equipe A");
        } else {
            lbl_EqpA.setText(txt_eqpA);
        }

        txt_eqpB = JOptionPane.showInputDialog("Digite o nome da equipe (ou deixe em branco para chamar de Equipe B");
        btn_PontosA.setEnabled(true);
        btn_PontosB.setEnabled(true);
        if (txt_eqpB.isEmpty()) {
            lbl_EqpB.setText("Equipe B");
        } else {
            lbl_EqpB.setText(txt_eqpB);
        }

        lbl_horario.setText(hora);

        jListA.setListData(new String[5]);
        jListB.setListData(new String[5]);

        jogo.iniciar(txt_eqpA, txt_eqpB, hora);


    }//GEN-LAST:event_btn_novaPartidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_PontosA;
    private javax.swing.JButton btn_PontosB;
    private javax.swing.JButton btn_novaPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListA;
    private javax.swing.JList<String> jListB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_EqpA;
    private javax.swing.JLabel lbl_EqpB;
    private javax.swing.JLabel lbl_horario;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void atualizarPontuacao(int a, int b) {
        btn_PontosA.setText("" + a);
        btn_PontosB.setText("" + b);

    }

    @Override
    public void encerrar(int p) {
        btn_PontosA.setEnabled(false);
        btn_PontosB.setEnabled(false);

        switch (p) {
            case 1:
                JOptionPane.showMessageDialog(null, lbl_EqpA.getText() + " venceu o Jogo.");
            case 2:
                JOptionPane.showMessageDialog(null, lbl_EqpB.getText() + " venceu o Jogo.");
        }

    }

    @Override
    public void setEqpA(String[] listaA) {
        jListA.setVisible(true);
        JOptionPane.showMessageDialog(null, lbl_EqpA.getText() + " venceu o set");
        jListA.setListData(listaA);
    }

    @Override
    public void setEqpB(String[] listaB) {

        jListB.setVisible(true);
        JOptionPane.showMessageDialog(null, lbl_EqpB.getText() + " venceu o set");
        jListB.setListData(listaB);
    }

}
