import javax.swing.JOptionPane;

public class Calculo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Calculo.class.getName());
    private double altura;
    private double largura;
    private double comprimento;        
    private double volume;

    public Calculo() {
        initComponents();
        setLocationRelativeTo(null);    //janela inicia no centro da tela
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoAltura = new javax.swing.JTextField();
        campoLargura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoComprimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        calculoVolume = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EFICIÊNCIA ENTREGA AREIA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone-janela.png")).getImage());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Infome as medidas do veículo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Altura (Metros):");

        campoAltura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoAltura.addActionListener(this::campoAlturaActionPerformed);

        campoLargura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoLargura.addActionListener(this::campoLarguraActionPerformed);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Largura (Metros):");

        campoComprimento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoComprimento.addActionListener(this::campoComprimentoActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Comprimento (Metros):");

        calculoVolume.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calculoVolume.setText("Calcular");
        calculoVolume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculoVolume.addActionListener(this::calculoVolumeActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(178, 178, 178))))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(calculoVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(calculoVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAlturaActionPerformed

    }//GEN-LAST:event_campoAlturaActionPerformed

    private void campoLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLarguraActionPerformed
        
    }//GEN-LAST:event_campoLarguraActionPerformed

    private void campoComprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoComprimentoActionPerformed
        
    }//GEN-LAST:event_campoComprimentoActionPerformed

    private void calculoVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoVolumeActionPerformed
        try {
            this.altura = Double.parseDouble(campoAltura.getText());    //transformando um texto em um double
            this.largura = Double.parseDouble(campoLargura.getText());
            this.comprimento = Double.parseDouble(campoComprimento.getText());
            this.volume = this.altura * this.largura * this.comprimento;
            
            TelaPagamento tela = new TelaPagamento(this.volume, this.altura, this.largura, this.comprimento);   //iniciando a janela seguinte
            tela.setVisible(true);  //deixando a janela visível
            
            this.dispose(); //Fechar a janela atual, liberando a memória
        } catch (NumberFormatException e){      //Tratando o erro
            JOptionPane.showMessageDialog(null,
                    "Digite valores numéricos válidos.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calculoVolumeActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Calculo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculoVolume;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoComprimento;
    private javax.swing.JTextField campoLargura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
