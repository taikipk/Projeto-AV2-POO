import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.ParseException;

public class TelaPagamento extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPagamento.class.getName());
    private final double volume;
    private final double altura;
    private final double largura;
    private final double comprimento;
    private final double valorMCubico = 53.39;
    private double valorPagar;
    private double valorTotalBau;
    private double volumePago;
    private double percentualUtilizacao;
    private double percentualValor;
    
    public TelaPagamento(double volume, double altura, double largura, double comprimento) {
        this.volume = volume;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        initComponents();
        setLocationRelativeTo(null);    //Janela inicia no centro da tela

        labelAltura.setText(String.format("%.2f metros", this.altura));    //Mostrando os dados recebidos
        labelLargura.setText(String.format("%.2f metros", this.largura));
        labelComprimento.setText(String.format("%.2f metros", this.comprimento));
        labelVolume.setText(String.format("%.2f m³", this.volume));
        labelTotalValor.setText(String.format("R$ %.2f", this.volume * this.valorMCubico));
        labelAreiaM3.setText(String.format("R$ %.2f", this.valorMCubico));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelTotalValor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoValorPagar = new javax.swing.JTextField();
        calcularPagamento = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelLargura = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelComprimento = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelVolume = new javax.swing.JLabel();
        labelAreiaM3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EFICIÊNCIA ENTREGA AREIA");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone-janela.png")).getImage());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dados do veículo:");

        labelAltura.setBackground(new java.awt.Color(255, 255, 255));
        labelAltura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAltura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAltura.setText("0");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Valor total da carga:");

        labelTotalValor.setBackground(new java.awt.Color(255, 255, 255));
        labelTotalValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTotalValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTotalValor.setText("0");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("O valor da areia é: ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Quantos reais você deseja pagar?");

        campoValorPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoValorPagar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoValorPagar.setMinimumSize(new java.awt.Dimension(300, 22));
        campoValorPagar.addActionListener(this::campoValorPagarActionPerformed);

        calcularPagamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calcularPagamento.setText("Calcular");
        calcularPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcularPagamento.addActionListener(this::calcularPagamentoActionPerformed);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Altura:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Largura:");

        labelLargura.setBackground(new java.awt.Color(255, 255, 255));
        labelLargura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelLargura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLargura.setText("0");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Comprimento:");

        labelComprimento.setBackground(new java.awt.Color(255, 255, 255));
        labelComprimento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelComprimento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelComprimento.setText("0");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Volume do veículo em m³:");

        labelVolume.setBackground(new java.awt.Color(255, 255, 255));
        labelVolume.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelVolume.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelVolume.setText("0");

        labelAreiaM3.setBackground(new java.awt.Color(255, 255, 255));
        labelAreiaM3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAreiaM3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAreiaM3.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAreiaM3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(calcularPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAltura)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLargura)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComprimento)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVolume)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelTotalValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelAreiaM3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcularPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoValorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorPagarActionPerformed

    private void calcularPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPagamentoActionPerformed
        try {
            NumberFormat numBrasil = NumberFormat.getNumberInstance(Locale.of("pt","BR")); //preparando para receber o valor no formato usado no Brasil
            String entradaValor = campoValorPagar.getText().trim(); //recebendo o valor em uma string

            if (!entradaValor.matches("[0-9,]+")) { //validando o valor digitado
                JOptionPane.showMessageDialog(this,
                        "Digite apenas números com virgula.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            this.valorPagar=numBrasil.parse(entradaValor).doubleValue(); //Transformando a string em um double com a formataçao brasileira

            this.valorTotalBau = volume * valorMCubico;
            this.volumePago = valorPagar / valorMCubico;
            this.percentualUtilizacao = (volumePago / volume) * 100;
            this.percentualValor = (valorPagar / valorTotalBau) * 100;

            JOptionPane.showMessageDialog(this, //mostrando os dados em uma janela pop-up
                    "Volume total do baú: " + String.format("%.2f m³", this.volume) + "\n" +
                            "Valor total do baú cheio: R$ " + String.format("%.2f", this.valorTotalBau) + "\n\n" +
                            "Valor pago: R$ " + String.format("%.2f", this.valorPagar) + "\n" +
                            "Volume que pode comprar: " + String.format("%.2f m³", this.volumePago) + "\n" +
                            "Percentual de ocupação do baú: " + String.format("%.2f %%", this.percentualUtilizacao) + "\n" +
                            "Percentual do valor pago: " + String.format("%.2f %%", this.percentualValor), "Análise", JOptionPane.INFORMATION_MESSAGE);
        }
         catch (ParseException | NumberFormatException e) { //Tratando o erro
            JOptionPane.showMessageDialog(this,
                    "Digite um valor válido.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calcularPagamentoActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularPagamento;
    private javax.swing.JTextField campoValorPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelAreiaM3;
    private javax.swing.JLabel labelComprimento;
    private javax.swing.JLabel labelLargura;
    private javax.swing.JLabel labelTotalValor;
    private javax.swing.JLabel labelVolume;
    // End of variables declaration//GEN-END:variables
}
