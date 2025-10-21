package calculadora;

import javax.swing.JOptionPane;

public class FormularioCalculadora extends javax.swing.JFrame {

    public FormularioCalculadora() {
        initComponents();
        setTitle("Luis Fuentes 27-3293-2024");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnRaizCuadrada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado.setEditable(false);

        btnSuma.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMultiplicacion.setText("*");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDivision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnRaizCuadrada.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRaizCuadrada.setText("R");
        btnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCuadradaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CALCULADORA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Numero 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Numero 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Resultado");

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSuma)
                                .addGap(63, 63, 63)
                                .addComponent(btnResta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(btnMultiplicacion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnDivision)
                        .addGap(61, 61, 61)
                        .addComponent(btnRaizCuadrada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicacion)
                    .addComponent(btnResta)
                    .addComponent(btnSuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRaizCuadrada)
                    .addComponent(btnDivision))
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnLimpiar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean esNumero(String str) {
        try {
            Double.valueOf(str.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean validarDosNumeros() {
        if (!esNumero(txtNumero1.getText()) || !esNumero(txtNumero2.getText())) {
            JOptionPane.showMessageDialog(this, "Debe ingresar números válidos en ambos campos.");
            return false;
        }
        return true;
    }
    
    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed

        if (validarDosNumeros()) {
            double a = Double.parseDouble(txtNumero1.getText());
            double b = Double.parseDouble(txtNumero2.getText());
            txtResultado.setText(String.valueOf(Calculadora.restar(a, b)));
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed

        if (validarDosNumeros()) {
            double a = Double.parseDouble(txtNumero1.getText());
            double b = Double.parseDouble(txtNumero2.getText());
            txtResultado.setText(String.valueOf(Calculadora.sumar(a, b)));
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed

        if (validarDosNumeros()) {
            double a = Double.parseDouble(txtNumero1.getText());
            double b = Double.parseDouble(txtNumero2.getText());
            txtResultado.setText(String.valueOf(Calculadora.multiplicar(a, b)));
        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed

        if (validarDosNumeros()) {
            double a = Double.parseDouble(txtNumero1.getText());
            double b = Double.parseDouble(txtNumero2.getText());
            try {
                txtResultado.setText(String.valueOf(Calculadora.dividir(a, b)));
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCuadradaActionPerformed
        // TODO add your handling code here:
        if (!esNumero(txtNumero1.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo 1");
            return;
        }

        double a = Double.parseDouble(txtNumero1.getText());
        try {
            txtResultado.setText(String.valueOf(Calculadora.raizCuadrada(a)));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRaizCuadradaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNumero1.setText("");
        txtNumero2.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> new FormularioCalculadora().setVisible(true));
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnRaizCuadrada;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
