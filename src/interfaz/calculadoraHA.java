package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class calculadoraHA extends javax.swing.JFrame {

    public calculadoraHA() {
        initComponents();

        tablaHA.getTableHeader().setBackground(new Color(0, 102, 255));
        tablaHA.getTableHeader().setFont(new Font("Roboto Medium", Font.PLAIN, 16));
        tablaHA.getTableHeader().setForeground(Color.WHITE);
        this.setLocationRelativeTo(null);
        FlatDarkLaf.setup();
        btnAgregar.setEnabled(false);
        btnGuardar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHA = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDisp = new javax.swing.JTextField();
        txtDisp1 = new javax.swing.JTextField();
        txtDisp2 = new javax.swing.JTextField();
        comboFi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mt3 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora hormigon armado");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 45, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaHA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaHA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1140, 460));

        btnVolver.setBackground(new java.awt.Color(255, 102, 102));
        btnVolver.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/volver.png"))); // NOI18N
        btnVolver.setText("Volver al menu");
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 40));

        jLabel1.setFont(new java.awt.Font("BRICK WALL", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 750, 70, 38));

        jLabel8.setFont(new java.awt.Font("BRICK WALL", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("$");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 750, 33, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(153, 153, 153));
        txtTotal.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 102, 0));
        txtTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtTotal.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTotal.setSelectionColor(new java.awt.Color(255, 153, 153));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 760, 200, 30));

        btnGuardar.setBackground(new java.awt.Color(45, 45, 45));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salvar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 70, 70));

        btnInfo.setBackground(new java.awt.Color(0, 153, 255));
        btnInfo.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnInfo.setForeground(java.awt.Color.white);
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/informacion.png"))); // NOI18N
        btnInfo.setText("Info.");
        btnInfo.setToolTipText("");
        btnInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 4, new java.awt.Color(0, 0, 0)));
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.setIconTextGap(-60);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/andamio.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        txtDisp.setBackground(new java.awt.Color(153, 153, 153));
        txtDisp.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtDisp.setForeground(new java.awt.Color(0, 0, 0));
        txtDisp.setToolTipText("");
        txtDisp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtDisp.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDisp.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDisp.setSelectionColor(new java.awt.Color(255, 153, 153));
        jPanel1.add(txtDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 36));

        txtDisp1.setBackground(new java.awt.Color(153, 153, 153));
        txtDisp1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtDisp1.setForeground(new java.awt.Color(0, 0, 0));
        txtDisp1.setToolTipText("");
        txtDisp1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtDisp1.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDisp1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDisp1.setSelectionColor(new java.awt.Color(255, 153, 153));
        jPanel1.add(txtDisp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 110, 36));

        txtDisp2.setBackground(new java.awt.Color(153, 153, 153));
        txtDisp2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtDisp2.setForeground(new java.awt.Color(0, 0, 0));
        txtDisp2.setToolTipText("");
        txtDisp2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtDisp2.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDisp2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDisp2.setSelectionColor(new java.awt.Color(255, 153, 153));
        jPanel1.add(txtDisp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 110, 36));

        comboFi.setBackground(new java.awt.Color(153, 153, 153));
        comboFi.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        comboFi.setForeground(new java.awt.Color(0, 0, 0));
        comboFi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 Φ", "8 Φ", "10 Φ", "12 Φ", "14 Φ", "16 Φ" }));
        comboFi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel1.add(comboFi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("BRICK WALL", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Calculadora de hormigon armado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 66));

        jLabel5.setFont(new java.awt.Font("BRICK WALL", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Dispositivo HA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 106, -1, 50));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/filosofia.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 40, 50));

        jLabel7.setFont(new java.awt.Font("BRICK WALL", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("³ ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 30, 50));

        mt3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        mt3.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.25f), Float.valueOf(0.25f), Float.valueOf(500.0f), Float.valueOf(0.25f)));
        mt3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        mt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mt3.setFocusable(false);
        jPanel1.add(mt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 120, -1));

        jLabel9.setFont(new java.awt.Font("BRICK WALL", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("FI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 40, 50));

        jLabel10.setFont(new java.awt.Font("BRICK WALL", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("M");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 30, 40));

        btnAgregar.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAgregar.setForeground(java.awt.Color.white);
        btnAgregar.setText("Agregar a la plantilla");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 4, new java.awt.Color(0, 0, 0)));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 174, 49));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        //  BOTON PARA VOLVER A EL MENU PRINCIPAL  //
        menuPrincipal menuPrincipal = new menuPrincipal();

        //  CERRAR VENTANA ACTUAL  //
        this.dispose();

        //  HACER VISIBLE EL MENU PRINCIPAL  //
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

        JOptionPane.showMessageDialog(null,
                "Cada metro cúbico de hormigón se compone por:\n"
                + "16 bolsas de portland\n"
                + "1 m³ de arena\n"
                + "1 m³ de piedra"
        );

    }//GEN-LAST:event_btnInfoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadoraHA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraHA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraHA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraHA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraHA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboFi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner mt3;
    private javax.swing.JTable tablaHA;
    private javax.swing.JTextField txtDisp;
    private javax.swing.JTextField txtDisp1;
    private javax.swing.JTextField txtDisp2;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
