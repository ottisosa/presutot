package interfaz;

// IMPORTACIONES DE LIBRERIAS //
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import SQL.conexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class calculadoraCantidades extends javax.swing.JFrame {

    private DefaultTableModel model;

    public calculadoraCantidades() {
        initComponents();
        tabla.getTableHeader().setBackground(new Color(0, 102, 255));
        tabla.getTableHeader().setFont(new Font("Roboto Medium", Font.PLAIN, 16));
        tabla.getTableHeader().setForeground(Color.WHITE);
        this.setLocationRelativeTo(null);
        FlatDarkLaf.setup();
        btnAgregar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnGuardarBD.setEnabled(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        menuTabla();
        deseleccionarTabla();
        deseleccionarTablaTxt(txtMaterial, txtCantidad, txtUnidadV, txtPrecioU, txtTotal);
        deseleccionarTablaBtn(btnAgregar, btnGuardar);
        this.model = (DefaultTableModel) tabla.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTabla = new javax.swing.JPopupMenu();
        guardarBD = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnGuardarBD = new javax.swing.JButton();
        btnCancelarBD = new javax.swing.JButton();
        txtNombreBD = new javax.swing.JTextField();
        txtDescripcionBD = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaterial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtUnidadV = new javax.swing.JTextField();
        txtPrecioU = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        guardarBD.setTitle("Guardar");
        guardarBD.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(45, 45, 45));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Descripcion");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 66));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/guardar-datos.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("BRICK WALL", 0, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 102));
        jLabel18.setText("Guardar");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 66));

        jLabel19.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 102));
        jLabel19.setText("Nombre");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 66));

        btnGuardarBD.setBackground(new java.awt.Color(0, 102, 0));
        btnGuardarBD.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnGuardarBD.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarBD.setText("Guardar");
        btnGuardarBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnGuardarBD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBDActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 140, 40));

        btnCancelarBD.setBackground(new java.awt.Color(102, 0, 0));
        btnCancelarBD.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnCancelarBD.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarBD.setText("Cancelar");
        btnCancelarBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnCancelarBD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBDActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 140, 40));

        txtNombreBD.setBackground(new java.awt.Color(153, 153, 153));
        txtNombreBD.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtNombreBD.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtNombreBD.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNombreBD.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtNombreBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreBDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreBDKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombreBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, 30));

        txtDescripcionBD.setBackground(new java.awt.Color(153, 153, 153));
        txtDescripcionBD.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDescripcionBD.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcionBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtDescripcionBD.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDescripcionBD.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtDescripcionBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionBDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionBDKeyTyped(evt);
            }
        });
        jPanel2.add(txtDescripcionBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 220, 30));

        javax.swing.GroupLayout guardarBDLayout = new javax.swing.GroupLayout(guardarBD.getContentPane());
        guardarBD.getContentPane().setLayout(guardarBDLayout);
        guardarBDLayout.setHorizontalGroup(
            guardarBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        guardarBDLayout.setVerticalGroup(
            guardarBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(45, 45, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("BRICK WALL", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 690, 70, 38));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cemento (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("BRICK WALL", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Calculadora de presupuestos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 66));

        jLabel4.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Precio por unidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, -1, 50));

        jLabel5.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Material");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 106, 40));

        jLabel6.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Unidad de venta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 40));

        txtMaterial.setBackground(new java.awt.Color(153, 153, 153));
        txtMaterial.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtMaterial.setForeground(new java.awt.Color(0, 0, 0));
        txtMaterial.setToolTipText("");
        txtMaterial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtMaterial.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMaterial.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaterialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaterialKeyTyped(evt);
            }
        });
        jPanel1.add(txtMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 194, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/acero.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        txtCantidad.setBackground(new java.awt.Color(153, 153, 153));
        txtCantidad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setToolTipText("");
        txtCantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtCantidad.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCantidad.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 160, 36));

        jLabel8.setFont(new java.awt.Font("BRICK WALL", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("$");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 690, 33, -1));

        btnAgregar.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAgregar.setForeground(java.awt.Color.black);
        btnAgregar.setText("Agregar a la plantilla");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 4, new java.awt.Color(0, 0, 0)));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 174, 49));

        tabla.setBackground(new java.awt.Color(153, 153, 153));
        tabla.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Unidad de venta", "Cantidad", "Precio por unidad", "Total del material"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setFocusable(false);
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setSelectionBackground(new java.awt.Color(102, 204, 255));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setShowGrid(true);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 252, 1260, 410));

        btnGuardar.setBackground(new java.awt.Color(45, 45, 45));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salvar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 70, 70));

        jLabel9.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Cantidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, 38));

        jLabel10.setFont(new java.awt.Font("BRICK WALL", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText("$");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 33, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(153, 153, 153));
        txtTotal.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 102, 0));
        txtTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtTotal.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTotal.setSelectionColor(new java.awt.Color(255, 153, 153));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 690, 200, 30));

        txtUnidadV.setBackground(new java.awt.Color(153, 153, 153));
        txtUnidadV.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtUnidadV.setForeground(new java.awt.Color(0, 0, 0));
        txtUnidadV.setToolTipText("");
        txtUnidadV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtUnidadV.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtUnidadV.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtUnidadV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnidadVKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadVKeyTyped(evt);
            }
        });
        jPanel1.add(txtUnidadV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 190, 36));

        txtPrecioU.setBackground(new java.awt.Color(153, 153, 153));
        txtPrecioU.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtPrecioU.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioU.setToolTipText("");
        txtPrecioU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtPrecioU.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPrecioU.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtPrecioU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioUKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioUKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 176, 36));

        btnVolver.setBackground(new java.awt.Color(255, 102, 102));
        btnVolver.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/volver.png"))); // NOI18N
        btnVolver.setText("Volver al menu");
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/construccion.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cajas.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cemento.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/venta.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1295, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuTabla() {

        JMenuItem Editar = new JMenuItem("Editar", getIcon("/IMG/editar.png", 25, 25));
        JMenuItem Borrar = new JMenuItem("Eliminar", getIcon("/IMG/borrar.png", 25, 25));

        menuTabla.add(Editar);
        menuTabla.add(Borrar);

        tabla.setComponentPopupMenu(menuTabla);

        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // OBTENER FILA Y COLUMNA SELECCIONADA //
                int filaSeleccionada = tabla.getSelectedRow();
                int columnaSeleccionada = tabla.getSelectedColumn();

                // VERIFICAR QUE HAYA UNA FILA Y COLUMNA SELECCIONADA //
                if (filaSeleccionada != -1 && columnaSeleccionada != -1) {

                    // VERIFICAR QUE LA COLUMNA NO SEA "TOTAL" //
                    if (columnaSeleccionada != 4) {
                        // GUARDAR EL TEXTO ORIGINAL EN CASO DE SER NECESARIO RESTAURARLO //
                        String valorOriginal = model.getValueAt(filaSeleccionada, columnaSeleccionada).toString();

                        // APLICAR RESTRICCIONES SEGÚN LA COLUMNA //
                        JTextField editorCampo = new JTextField(valorOriginal); // Se inicializa con el valor original

                        if (columnaSeleccionada == 2 || columnaSeleccionada == 3) {
                            editorCampo.addKeyListener(new java.awt.event.KeyAdapter() {
                                public void keyTyped(java.awt.event.KeyEvent evt) {
                                    restriccion_L_S_E(evt); // RESTRICCIÓN PARA NÚMEROS
                                }
                            });
                        } else if (columnaSeleccionada == 0 || columnaSeleccionada == 1) {
                            editorCampo.addKeyListener(new java.awt.event.KeyAdapter() {
                                public void keyTyped(java.awt.event.KeyEvent evt) {
                                    restriccion_N_S(evt); // RESTRICCIÓN PARA LETRAS
                                }
                            });
                        }

                        // ASIGNAR EL EDITOR PERSONALIZADO A LA COLUMNA SELECCIONADA //
                        tabla.getColumnModel().getColumn(columnaSeleccionada).setCellEditor(new DefaultCellEditor(editorCampo));

                        // HABILITAR EDICIÓN EN LA CELDA SELECCIONADA //
                        tabla.editCellAt(filaSeleccionada, columnaSeleccionada);
                        Component editor = tabla.getEditorComponent();
                        if (editor != null) {
                            editor.requestFocusInWindow(); // ENFOCAR AUTOMÁTICAMENTE PARA PERMITIR LA ESCRITURA
                        }

                        // ESCUCHAR CAMBIOS EN EL MODELO PARA RECALCULAR LOS VALORES //
                        model.addTableModelListener(event -> {

                            // VERIFICAR SI LA COLUMNA EDITADA ES "CANTIDAD", "PRECIO POR UNIDAD", "MATERIAL" O "UNIDAD" //
                            if (event.getColumn() == 2 || event.getColumn() == 3 || event.getColumn() == 0 || event.getColumn() == 1) {

                                try {
                                    // OBTENER EL VALOR INGRESADO
                                    String valor = model.getValueAt(filaSeleccionada, columnaSeleccionada).toString().trim();

                                    // VERIFICAR SI EL CAMPO ESTÁ VACÍO
                                    if (valor.isEmpty()) {
                                        if (columnaSeleccionada == 2 || columnaSeleccionada == 3) {
                                            model.setValueAt("1", filaSeleccionada, columnaSeleccionada); // CANTIDAD Y PRECIO POR UNIDAD SE PONEN EN 1
                                        } else {
                                            model.setValueAt(valorOriginal, filaSeleccionada, columnaSeleccionada); // MATERIAL Y UNIDAD SE RESTAURAN
                                        }
                                        JOptionPane.showMessageDialog(null, "EL CAMPO NO PUEDE ESTAR VACÍO", "Error", JOptionPane.ERROR_MESSAGE);
                                        return;
                                    }

                                    // SI LA COLUMNA ES "CANTIDAD" O "PRECIO POR UNIDAD", RECALCULAR
                                    if (event.getColumn() == 2 || event.getColumn() == 3) {
                                        int cantidad = Integer.parseInt(model.getValueAt(filaSeleccionada, 2).toString());
                                        int precioPorUnidad = Integer.parseInt(model.getValueAt(filaSeleccionada, 3).toString());

                                        // RECALCULAR EL TOTAL DE LA FILA
                                        int totalFila = cantidad * precioPorUnidad;
                                        model.setValueAt(totalFila, filaSeleccionada, 4);

                                        // RECALCULAR EL TOTAL GENERAL
                                        calcularTotal();
                                    }

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "INGRESE VALORES NUMÉRICOS VÁLIDOS", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                    } else {
                        JOptionPane.showMessageDialog(null, "NO SE PUEDE EDITAR ESTA COLUMNA", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NO HAY UNA CELDA SELECCIONADA PARA EDITAR", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //  OBTENER FILA SELECCIONADA  //
                int filaSeleccionada = tabla.getSelectedRow();

                //  VERIFICAR QUE HAYA FILA SELECCIONADA  //
                if (filaSeleccionada != -1) {

                    //  ELIMINAR LA FILA SELECCIONADA  //
                    model.removeRow(filaSeleccionada);

                    calcularTotal();
                } else {
                    JOptionPane.showMessageDialog(null, "NO HAY UNA FILA SELECCIONADA PARA ELIMINAR", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    public Icon getIcon(String ruta, int width, int height) {

        Icon icono = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, height, 0));

        return icono;

    }

    private void deseleccionarTabla() {

        this.addMouseListener(new MouseAdapter() {
            @Override

            public void mouseClicked(MouseEvent e) {

                if (!tabla.contains(e.getPoint())) {

                    if (tabla.isEditing()) {
                        tabla.getCellEditor().stopCellEditing();
                    }

                    tabla.clearSelection();
                }
            }
        });
    }

    private void deseleccionarTablaTxt(JTextField... textFields) {
        for (JTextField textField : textFields) {
            textField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (tabla.isEditing()) {
                        tabla.getCellEditor().stopCellEditing();
                    }
                    tabla.clearSelection();
                }
            });
        }
    }

    private void deseleccionarTablaBtn(JButton... buttons) {
        for (JButton button : buttons) {
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (tabla.isEditing()) {
                        tabla.getCellEditor().stopCellEditing();
                    }
                    tabla.clearSelection();
                }
            });
        }
    }

    private void confirmacionCierre() {

        String botones[] = {"Cerrar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "Seguro que desea cerrar la aplicacion ?                                        RECUERDE QUE SI NO GUARDO NO PODRA VOLVER A VER NI EDITAR ESTE FORMULARIO", "Cerrar", 0, 0, null, botones, this);

        if (eleccion == JOptionPane.YES_OPTION) {

            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {

            System.out.println("Se cancelo el cierre");
        }
    }

    private void restriccion_L_S_E(java.awt.event.KeyEvent evt) {
        // METODO PARA EVITAR LETRAS, ESPACIOS Y SIMBOLOS EN TXTBOX //

        if ((evt.getKeyChar() >= 65 && evt.getKeyChar() <= 90)
                || (evt.getKeyChar() >= 97 && evt.getKeyChar() <= 122)
                || (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 47)
                || (evt.getKeyChar() >= 58 && evt.getKeyChar() <= 64)
                || (evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96)
                || (evt.getKeyChar() >= 123 && evt.getKeyChar() <= 255)) {

            evt.consume();
            Toolkit.getDefaultToolkit().beep();

            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN NÚMEROS EN ESTE CAMPO", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void restriccion_N_S(java.awt.event.KeyEvent evt) {

        char c = evt.getKeyChar();

        if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "NO SE PERMITEN SÍMBOLOS EN ESTE CAMPO", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void validarCampos() {

        if (!txtMaterial.getText().isEmpty() && !txtCantidad.getText().isEmpty() && !txtUnidadV.getText().isEmpty() && !txtPrecioU.getText().isEmpty()) {

            btnAgregar.setEnabled(true);

        } else {

            btnAgregar.setEnabled(false);

        }

    }

    private void validarCamposBD() {

        if (!txtNombreBD.getText().isEmpty() && !txtDescripcionBD.getText().isEmpty()) {

            btnGuardarBD.setEnabled(true);

        } else {

            btnGuardarBD.setEnabled(false);

        }

    }

    private void habilitarGuardado() {
        btnGuardar.setEnabled(model.getRowCount() > 0);
    }

    private void calcularTotal() {

        int total = 0;

        //  RECORRER LA COLUMNA DE LA TABLA TOTAL DE MATERIAL  //
        for (int i = 0; i < model.getRowCount(); i++) {
            total += (int) model.getValueAt(i, 4);
        }

        //  MOSTRAR RESULTADO EN EL TXTBOX  //
        txtTotal.setText(String.valueOf(total));
    }

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped

        //  LIMITE DE CARACTERES PARA EL TEXTBOX DE MATERIALES  //
        restriccion_L_S_E(evt);

        if (txtCantidad.getText().length() >= 10) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 10 CIFRAS DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);


        }    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        //  BOTON PARA AGREGAR LOS CAMPOS A LA TABLA  //
        //  PARA HABILITAR EL BOTON DE GUARDAR  //
        tabla.setModel(model);

        tabla.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                habilitarGuardado();
            }
        });

        //  OBTENER LOS VALORES DE LOS CAMPOS  //
        String material = txtMaterial.getText();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        String unidadVenta = txtUnidadV.getText();
        int precioUnidad = Integer.parseInt(txtPrecioU.getText());

        //  CALCULAR TOTAL DEL MATERIAL  //
        int totalMaterial = cantidad * precioUnidad;

        //  AGREGAR LOS VALORES A LA TABLA  //
        model.addRow(new Object[]{material, unidadVenta, cantidad, precioUnidad, totalMaterial});

        //  LIMPIAR LOS CAMPOS LUEGO DE CLICKEAR  //   
        txtMaterial.setText("");
        txtCantidad.setText("");
        txtUnidadV.setText("");
        txtPrecioU.setText("");

        validarCampos();
        calcularTotal();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        validarCampos();
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtUnidadVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadVKeyReleased
        validarCampos();
    }//GEN-LAST:event_txtUnidadVKeyReleased

    private void txtPrecioUKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUKeyReleased
        validarCampos();
    }//GEN-LAST:event_txtPrecioUKeyReleased

    private void txtUnidadVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadVKeyTyped

        restriccion_N_S(evt);

        if (txtUnidadV.getText().length() >= 20) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 20 CARACTERES DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_txtUnidadVKeyTyped

    private void txtPrecioUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUKeyTyped

        restriccion_L_S_E(evt);

        if (txtPrecioU.getText().length() >= 10) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 10 CIFRAS DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_txtPrecioUKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        confirmacionCierre();
    }//GEN-LAST:event_formWindowClosing

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        //  BOTON PARA VOLVER A EL MENU PRINCIPAL  //
        menuPrincipal menuPrincipal = new menuPrincipal();

        //  CERRAR VENTANA ACTUAL  //
        this.dispose();

        //  HACER VISIBLE EL MENU PRINCIPAL  //
        menuPrincipal.setVisible(true);

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        btnGuardarBD.setEnabled(false);

        guardarBD.setVisible(true);
        guardarBD.pack();
        guardarBD.setLocationRelativeTo(null);
        guardarBD.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBDKeyTyped

        restriccion_N_S(evt);

        if (txtNombreBD.getText().length() >= 30) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 30 CARACTERES DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_txtNombreBDKeyTyped

    private void txtDescripcionBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionBDKeyTyped
        restriccion_N_S(evt);

        if (txtDescripcionBD.getText().length() >= 50) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 50 CARACTERES DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }    }//GEN-LAST:event_txtDescripcionBDKeyTyped

    private void btnCancelarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBDActionPerformed

        //  BOTON PARA CANCELAR GUARDADO DE BD  //
        guardarBD.dispose();
    }//GEN-LAST:event_btnCancelarBDActionPerformed

    private void btnGuardarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBDActionPerformed

        //  BOTON PARA GUARDAR EN LA BD LOS PRESUPUESTOS  //
        String nombre = txtNombreBD.getText();
        String descripcion = txtDescripcionBD.getText();
        String materiales = materialesBD();
        String cantidades = cantidadesBD();
        String unidadVenta = unidadVentaBD();
        String precioUnidad = precioUnidadBD();
        String totalMaterial = totalMaterialBD();

        conexionSQL con = new conexionSQL();
        Connection conexion = con.conec();

        if (conexion != null) {
            try {
                String sql = "INSERT INTO presupuestos (nombre, descripcion, materiales, unidad_venta, cantidades,precio_unidad, total_material) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = conexion.prepareStatement(sql);
                pstmt.setString(1, nombre);
                pstmt.setString(2, descripcion);
                pstmt.setString(3, materiales);
                pstmt.setString(5, unidadVenta);
                pstmt.setString(4, cantidades);
                pstmt.setString(6, precioUnidad);
                pstmt.setString(7, totalMaterial);

                int estado = pstmt.executeUpdate();

                if (estado > 0) {
                    JOptionPane.showMessageDialog(null, "Presupuesto guardado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    Window window = SwingUtilities.getWindowAncestor(btnGuardarBD);
                    model.setRowCount(0);

                    txtMaterial.setText("");
                    txtCantidad.setText("");
                    txtUnidadV.setText("");
                    txtPrecioU.setText("");

                    if (window != null) {
                        window.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar el presupuesto", "Error", JOptionPane.ERROR_MESSAGE);
                }

                pstmt.close();
                conexion.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        txtNombreBD.setText("");
        txtDescripcionBD.setText("");


    }//GEN-LAST:event_btnGuardarBDActionPerformed

    private void txtNombreBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBDKeyReleased
        validarCamposBD();
    }//GEN-LAST:event_txtNombreBDKeyReleased

    private void txtDescripcionBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionBDKeyReleased
        validarCamposBD();
    }//GEN-LAST:event_txtDescripcionBDKeyReleased

    private void txtMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaterialKeyTyped

        //  LIMITE DE CARACTERES PARA EL TEXTBOX DE MATERIALES  //
        restriccion_N_S(evt);

        if (txtMaterial.getText().length() >= 30) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 30 CARACTERES DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_txtMaterialKeyTyped

    private void txtMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaterialKeyReleased
        validarCampos();
    }//GEN-LAST:event_txtMaterialKeyReleased

    public String materialesBD() {

        StringBuilder materiales = new StringBuilder();
        for (int i = 0; i < model.getRowCount(); i++) {
            materiales.append(model.getValueAt(i, 0).toString());
            if (i < model.getRowCount() - 1) {
                materiales.append(", ");
            }
        }
        return materiales.toString();
    }

    public String cantidadesBD() {

        StringBuilder cantidades = new StringBuilder();
        for (int i = 0; i < model.getRowCount(); i++) {
            cantidades.append(model.getValueAt(i, 1).toString());
            if (i < model.getRowCount() - 1) {
                cantidades.append(", ");
            }
        }

        return cantidades.toString();

    }

    public String unidadVentaBD() {

        StringBuilder unidadVenta = new StringBuilder();
        for (int i = 0; i < model.getRowCount(); i++) {
            unidadVenta.append(model.getValueAt(i, 2).toString());
            if (i < model.getRowCount() - 1) {
                unidadVenta.append(", ");
            }
        }

        return unidadVenta.toString();
    }

    public String precioUnidadBD() {

        StringBuilder precioUnidad = new StringBuilder();
        for (int i = 0; i < model.getRowCount(); i++) {
            precioUnidad.append(model.getValueAt(i, 3).toString());
            if (i < model.getRowCount() - 1) {
                precioUnidad.append(", ");
            }
        }

        return precioUnidad.toString();
    }

    public String totalMaterialBD() {

        StringBuilder totalMaterial = new StringBuilder();
        for (int i = 0; i < model.getRowCount(); i++) {
            totalMaterial.append(model.getValueAt(i, 4).toString());
            if (i < model.getRowCount() - 1) {
                totalMaterial.append(", ");
            }
        }

        return totalMaterial.toString();
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(calculadoraCantidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraCantidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraCantidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraCantidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraCantidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelarBD;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarBD;
    private javax.swing.JButton btnVolver;
    private javax.swing.JFrame guardarBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu menuTabla;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcionBD;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtNombreBD;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnidadV;
    // End of variables declaration//GEN-END:variables
}
