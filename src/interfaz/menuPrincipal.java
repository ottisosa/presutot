package interfaz;

// IMPORTACIONES DE LIBRERIAS //
import com.formdev.flatlaf.FlatDarkLaf;
import interfaz.calculadoraCantidades;
import interfaz.presupuestosGuardados;
import interfaz.calculadoraHA;
import java.awt.Color;

/**
 *
 * @author ottis
 */
public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        FlatDarkLaf.setup();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCantidades = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnGuardados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnHAguardado = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Presutot");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(45, 45, 45));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("BRICK WALL", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Presutot");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 20, 219, 66));

        btnCantidades.setBackground(java.awt.Color.gray);
        btnCantidades.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnCantidades.setForeground(java.awt.Color.white);
        btnCantidades.setText("Calcular cantidades");
        btnCantidades.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnCantidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCantidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCantidadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCantidadesMouseExited(evt);
            }
        });
        btnCantidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadesActionPerformed(evt);
            }
        });
        jPanel2.add(btnCantidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 258, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ladrillo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/calculadora.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        btnHA.setBackground(java.awt.Color.gray);
        btnHA.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnHA.setForeground(java.awt.Color.white);
        btnHA.setText("Calcular hormigon armado");
        btnHA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnHA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHAMouseExited(evt);
            }
        });
        btnHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHAActionPerformed(evt);
            }
        });
        jPanel2.add(btnHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 258, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/hormigon.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        btnGuardados.setBackground(java.awt.Color.gray);
        btnGuardados.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnGuardados.setForeground(java.awt.Color.white);
        btnGuardados.setText("Ver presupuestos guardados");
        btnGuardados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnGuardados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardadosMouseExited(evt);
            }
        });
        btnGuardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 258, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salvar.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 70, 64));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bajo-construccion.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        btnHAguardado.setBackground(java.awt.Color.gray);
        btnHAguardado.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnHAguardado.setForeground(java.awt.Color.white);
        btnHAguardado.setText("Ver hormigon armado guardados");
        btnHAguardado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnHAguardado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHAguardado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHAguardadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHAguardadoMouseExited(evt);
            }
        });
        btnHAguardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHAguardadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnHAguardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 280, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCantidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadesActionPerformed

        //  BOTON PARA IR A LA CALCULADORA DE CANTIDADES  //
        calculadoraCantidades cantCalc = new calculadoraCantidades();
        cantCalc.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCantidadesActionPerformed

    private void btnHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHAActionPerformed

        //  BOTON PARA IR A LA CALCULADORA DE HORMIGON ARMADO  //
        calculadoraHA calcHA = new calculadoraHA();
        calcHA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHAActionPerformed

    private void btnCantidadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCantidadesMouseEntered

        //  EFECTO HOVER DE BTN CANTIDADES CUANDO SE PARA EL MOUSE ENCIMA //
        btnCantidades.setBackground(Color.LIGHT_GRAY);
        btnCantidades.setForeground(Color.BLACK);

    }//GEN-LAST:event_btnCantidadesMouseEntered

    private void btnCantidadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCantidadesMouseExited

        //  PARA QUITAR EL EFECTO HOVER CUANDO SE SACA EL MOUSE DE ENCIMA  //
        btnCantidades.setBackground(Color.gray);
        btnCantidades.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCantidadesMouseExited

    private void btnHAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHAMouseEntered

        //  EFECTO HOVER DE BTN CANTIDADES CUANDO SE PARA EL MOUSE ENCIMA //
        btnHA.setBackground(Color.LIGHT_GRAY);
        btnHA.setForeground(Color.BLACK);


    }//GEN-LAST:event_btnHAMouseEntered

    private void btnHAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHAMouseExited

        //  PARA QUITAR EL EFECTO HOVER CUANDO SE SACA EL MOUSE DE ENCIMA  //
        btnHA.setBackground(Color.gray);
        btnHA.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnHAMouseExited

    private void btnGuardadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardadosMouseEntered

        //  EFECTO HOVER DE BTN CANTIDADES CUANDO SE PARA EL MOUSE ENCIMA //
        btnGuardados.setBackground(Color.LIGHT_GRAY);
        btnGuardados.setForeground(Color.BLACK);

    }//GEN-LAST:event_btnGuardadosMouseEntered

    private void btnGuardadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardadosMouseExited

        //  PARA QUITAR EL EFECTO HOVER CUANDO SE SACA EL MOUSE DE ENCIMA  //
        btnGuardados.setBackground(Color.gray);
        btnGuardados.setForeground(Color.WHITE);

    }//GEN-LAST:event_btnGuardadosMouseExited

    private void btnGuardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadosActionPerformed

        //  BOTON PARA IR A LOS PRESUPUESTOS GUARDADOS  //
        presupuestosGuardados presupuestosG = new presupuestosGuardados();
        presupuestosG.setVisible(true);
        this.dispose();    }//GEN-LAST:event_btnGuardadosActionPerformed

    private void btnHAguardadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHAguardadoMouseEntered

                //  EFECTO HOVER DE BTN CANTIDADES CUANDO SE PARA EL MOUSE ENCIMA //
        btnHAguardado.setBackground(Color.LIGHT_GRAY);
        btnHAguardado.setForeground(Color.BLACK);

    }//GEN-LAST:event_btnHAguardadoMouseEntered

    private void btnHAguardadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHAguardadoMouseExited

        //  EFECTO HOVER DE BTN CANTIDADES CUANDO SE PARA EL MOUSE ENCIMA //
        btnHAguardado.setBackground(Color.gray);
        btnHAguardado.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnHAguardadoMouseExited

    private void btnHAguardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHAguardadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHAguardadoActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCantidades;
    private javax.swing.JButton btnGuardados;
    private javax.swing.JButton btnHA;
    private javax.swing.JButton btnHAguardado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
