package interfaz;

import SQL.conexionSQL;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumn;
import java.sql.ResultSetMetaData;
import javax.swing.JButton;

public class presupuestosGuardados extends javax.swing.JFrame {

    private DefaultTableModel model;
    private int idSeleccionado;

    public presupuestosGuardados() {
        initComponents();
        this.setLocationRelativeTo(null);
        FlatDarkLaf.setup();
        tablaBD.getTableHeader().setBackground(new Color(0, 102, 255));
        tablaBD.getTableHeader().setFont(new Font("Roboto Medium", Font.PLAIN, 16));
        tablaBD.getTableHeader().setForeground(Color.WHITE);
        editarTablaBD.getTableHeader().setBackground(new Color(0, 102, 255));
        editarTablaBD.getTableHeader().setFont(new Font("Roboto Medium", Font.PLAIN, 16));
        editarTablaBD.getTableHeader().setForeground(Color.WHITE);
        editarTablaBD.setDefaultEditor(Object.class, null);
        verTablaBD.getTableHeader().setBackground(new Color(0, 102, 255));
        verTablaBD.getTableHeader().setFont(new Font("Roboto Medium", Font.PLAIN, 16));
        verTablaBD.getTableHeader().setForeground(Color.WHITE);
        presupuestosBD();
        menuTablaBD();
        menuEditarBD();
        deseleccionarTabla();
        deseleccionarTablaEditar();
        this.model = (DefaultTableModel) tablaBD.getModel();
        TableColumn idColumn = tablaBD.getColumnModel().getColumn(0);
        idColumn.setPreferredWidth(20);
        TableColumn descripcionColumn = tablaBD.getColumnModel().getColumn(2);
        descripcionColumn.setPreferredWidth(200);
        deseleccionarTablaTxt(txtMaterialBD, txtCantidadBD, txtUnidadVBD, txtPrecioUBD, txtTotalBD);
        deseleccionarTablaBtn(btnAgregarBD);
        btnAgregarBD.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTablaBD = new javax.swing.JPopupMenu();
        editarBD = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        editarTablaBD = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotalBD = new javax.swing.JTextField();
        txtMaterialBD = new javax.swing.JTextField();
        txtCantidadBD = new javax.swing.JTextField();
        txtUnidadVBD = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnAgregarBD = new javax.swing.JButton();
        txtPrecioUBD = new javax.swing.JTextField();
        menuTablaEditarBD = new javax.swing.JPopupMenu();
        verPresupuesto = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        volverVer = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtVerTotalBD = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        verTablaBD = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBD = new javax.swing.JTable();

        editarBD.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        editarBD.setTitle("Editar presupuesto");
        editarBD.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(45, 45, 45));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setBackground(new java.awt.Color(255, 102, 102));
        volver.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        volver.setForeground(new java.awt.Color(0, 0, 0));
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/volver.png"))); // NOI18N
        volver.setText("Volver");
        volver.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel2.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        editarTablaBD.setBackground(new java.awt.Color(153, 153, 153));
        editarTablaBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        editarTablaBD.setForeground(new java.awt.Color(0, 0, 0));
        editarTablaBD.setModel(new javax.swing.table.DefaultTableModel(
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
        editarTablaBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarTablaBD.setFocusable(false);
        editarTablaBD.setGridColor(new java.awt.Color(0, 0, 0));
        editarTablaBD.setSelectionBackground(new java.awt.Color(102, 204, 255));
        editarTablaBD.setSelectionForeground(new java.awt.Color(0, 0, 0));
        editarTablaBD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        editarTablaBD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        editarTablaBD.setShowGrid(true);
        editarTablaBD.getTableHeader().setResizingAllowed(false);
        editarTablaBD.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(editarTablaBD);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 1270, 460));

        jLabel4.setFont(new java.awt.Font("BRICK WALL", 0, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("$");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ladrillos.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Precio por unidad");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, 40));

        jLabel7.setFont(new java.awt.Font("BRICK WALL", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Total");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 720, -1, 30));

        jLabel8.setFont(new java.awt.Font("BRICK WALL", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Editar presupuesto");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 66));

        jLabel9.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Material");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 40));

        jLabel10.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Cantidad");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, 40));

        jLabel11.setFont(new java.awt.Font("BRICK WALL", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Unidad de venta");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, 40));

        txtTotalBD.setEditable(false);
        txtTotalBD.setBackground(new java.awt.Color(153, 153, 153));
        txtTotalBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtTotalBD.setForeground(new java.awt.Color(0, 102, 0));
        txtTotalBD.setToolTipText("");
        txtTotalBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtTotalBD.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTotalBD.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTotalBD.setSelectionColor(new java.awt.Color(255, 153, 153));
        jPanel2.add(txtTotalBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 720, 194, 30));

        txtMaterialBD.setBackground(new java.awt.Color(153, 153, 153));
        txtMaterialBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtMaterialBD.setForeground(new java.awt.Color(0, 0, 0));
        txtMaterialBD.setToolTipText("");
        txtMaterialBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtMaterialBD.setCaretColor(new java.awt.Color(0, 0, 0));
        txtMaterialBD.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMaterialBD.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtMaterialBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaterialBDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaterialBDKeyTyped(evt);
            }
        });
        jPanel2.add(txtMaterialBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 194, 36));

        txtCantidadBD.setBackground(new java.awt.Color(153, 153, 153));
        txtCantidadBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtCantidadBD.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidadBD.setToolTipText("");
        txtCantidadBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtCantidadBD.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCantidadBD.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCantidadBD.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtCantidadBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadBDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadBDKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidadBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 194, 36));

        txtUnidadVBD.setBackground(new java.awt.Color(153, 153, 153));
        txtUnidadVBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtUnidadVBD.setForeground(new java.awt.Color(0, 0, 0));
        txtUnidadVBD.setToolTipText("");
        txtUnidadVBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtUnidadVBD.setCaretColor(new java.awt.Color(0, 0, 0));
        txtUnidadVBD.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtUnidadVBD.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtUnidadVBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnidadVBDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadVBDKeyTyped(evt);
            }
        });
        jPanel2.add(txtUnidadVBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 194, 36));

        jLabel12.setFont(new java.awt.Font("BRICK WALL", 0, 35)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("$");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, -1, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/venta.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/construccion.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cemento.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cajas.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        btnAgregarBD.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregarBD.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAgregarBD.setForeground(java.awt.Color.white);
        btnAgregarBD.setText("Agregar a la plantilla");
        btnAgregarBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 4, new java.awt.Color(0, 0, 0)));
        btnAgregarBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBDActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 150, 174, 49));

        txtPrecioUBD.setBackground(new java.awt.Color(153, 153, 153));
        txtPrecioUBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtPrecioUBD.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioUBD.setToolTipText("");
        txtPrecioUBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtPrecioUBD.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPrecioUBD.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPrecioUBD.setSelectionColor(new java.awt.Color(255, 153, 153));
        txtPrecioUBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioUBDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioUBDKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecioUBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 194, 36));

        javax.swing.GroupLayout editarBDLayout = new javax.swing.GroupLayout(editarBD.getContentPane());
        editarBD.getContentPane().setLayout(editarBDLayout);
        editarBDLayout.setHorizontalGroup(
            editarBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1328, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        editarBDLayout.setVerticalGroup(
            editarBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        verPresupuesto.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        verPresupuesto.setTitle("Presupuesto");
        verPresupuesto.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(45, 45, 45));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverVer.setBackground(new java.awt.Color(255, 102, 102));
        volverVer.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        volverVer.setForeground(new java.awt.Color(0, 0, 0));
        volverVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/volver.png"))); // NOI18N
        volverVer.setText("Volver");
        volverVer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        volverVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverVerActionPerformed(evt);
            }
        });
        jPanel3.add(volverVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        jLabel21.setFont(new java.awt.Font("BRICK WALL", 0, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 102));
        jLabel21.setText("Presupuesto");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, 66));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/dinero.png"))); // NOI18N
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        txtVerTotalBD.setEditable(false);
        txtVerTotalBD.setBackground(new java.awt.Color(153, 153, 153));
        txtVerTotalBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtVerTotalBD.setForeground(new java.awt.Color(0, 102, 0));
        txtVerTotalBD.setToolTipText("");
        txtVerTotalBD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        txtVerTotalBD.setCaretColor(new java.awt.Color(0, 0, 0));
        txtVerTotalBD.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtVerTotalBD.setSelectionColor(new java.awt.Color(255, 153, 153));
        jPanel3.add(txtVerTotalBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 670, 194, 30));

        jLabel23.setFont(new java.awt.Font("BRICK WALL", 0, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 102, 102));
        jLabel23.setText("Total");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, -1, 30));

        jLabel24.setFont(new java.awt.Font("BRICK WALL", 0, 35)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 0));
        jLabel24.setText("$");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, -1, 50));

        verTablaBD.setBackground(new java.awt.Color(153, 153, 153));
        verTablaBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        verTablaBD.setForeground(new java.awt.Color(0, 0, 0));
        verTablaBD.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        verTablaBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verTablaBD.setEnabled(false);
        verTablaBD.setFocusable(false);
        verTablaBD.setGridColor(new java.awt.Color(0, 0, 0));
        verTablaBD.setSelectionBackground(new java.awt.Color(102, 204, 255));
        verTablaBD.setSelectionForeground(new java.awt.Color(0, 0, 0));
        verTablaBD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        verTablaBD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        verTablaBD.setShowGrid(true);
        verTablaBD.getTableHeader().setResizingAllowed(false);
        verTablaBD.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(verTablaBD);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1150, 530));

        javax.swing.GroupLayout verPresupuestoLayout = new javax.swing.GroupLayout(verPresupuesto.getContentPane());
        verPresupuesto.getContentPane().setLayout(verPresupuestoLayout);
        verPresupuestoLayout.setHorizontalGroup(
            verPresupuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        verPresupuestoLayout.setVerticalGroup(
            verPresupuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Presupuestos guardados");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 45, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        jLabel3.setFont(new java.awt.Font("BRICK WALL", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Presupuestos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 66));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/presupuesto.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 6, 76, 82));

        jScrollPane1.setForeground(new java.awt.Color(153, 153, 153));

        tablaBD.setBackground(new java.awt.Color(153, 153, 153));
        tablaBD.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tablaBD.setForeground(new java.awt.Color(0, 0, 0));
        tablaBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Ultima modificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaBD.setFocusable(false);
        tablaBD.setGridColor(new java.awt.Color(0, 0, 0));
        tablaBD.setSelectionBackground(new java.awt.Color(102, 204, 255));
        tablaBD.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaBD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaBD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaBD.setShowGrid(true);
        tablaBD.getTableHeader().setResizingAllowed(false);
        tablaBD.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaBD);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1030, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deseleccionarTablaTxt(JTextField... textFields) {
        for (JTextField textField : textFields) {
            textField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (editarTablaBD.isEditing()) {
                        editarTablaBD.getCellEditor().stopCellEditing();
                    }
                    editarTablaBD.clearSelection();
                }
            });
        }
    }

    private void deseleccionarTablaBtn(JButton... buttons) {
        for (JButton button : buttons) {
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (editarTablaBD.isEditing()) {
                        editarTablaBD.getCellEditor().stopCellEditing();
                    }
                    editarTablaBD.clearSelection();
                }
            });
        }
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        //  BOTON PARA VOLVER A EL MENU PRINCIPAL  //
        menuPrincipal menuPrincipal = new menuPrincipal();

        //  CERRAR VENTANA ACTUAL  //
        this.dispose();

        //  HACER VISIBLE EL MENU PRINCIPAL  //
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        presupuestosGuardados presu = new presupuestosGuardados();
        //  CERRAR VENTANA ACTUAL  //
        editarBD.dispose();

        //  HACER VISIBLE EL MENU PRINCIPAL  //
        presu.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void txtCantidadBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBDKeyTyped

        restriccion_L_S_E(evt);

        if (txtCantidadBD.getText().length() >= 10) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 10 CIFRAS DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_txtCantidadBDKeyTyped

    private void txtPrecioUBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUBDKeyTyped

        restriccion_L_S_E(evt);

        if (txtPrecioUBD.getText().length() >= 10) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 10 CIFRAS DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_txtPrecioUBDKeyTyped

    private void txtMaterialBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaterialBDKeyReleased
        validarCampos();
    }//GEN-LAST:event_txtMaterialBDKeyReleased

    private void txtCantidadBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBDKeyReleased
        validarCampos();
    }//GEN-LAST:event_txtCantidadBDKeyReleased

    private void txtUnidadVBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadVBDKeyReleased
        validarCampos();
    }//GEN-LAST:event_txtUnidadVBDKeyReleased

    private void txtPrecioUBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUBDKeyReleased
        validarCampos();
    }//GEN-LAST:event_txtPrecioUBDKeyReleased

    private void txtUnidadVBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadVBDKeyTyped
        restriccion_N_S(evt);

        if (txtUnidadVBD.getText().length() >= 20) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 20 CARACTERES DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }    }//GEN-LAST:event_txtUnidadVBDKeyTyped

    private void txtMaterialBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaterialBDKeyTyped

        //  LIMITE DE CARACTERES PARA EL TEXTBOX DE MATERIALES  //
        restriccion_N_S(evt);

        if (txtMaterialBD.getText().length() >= 30) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PERMITEN MAS DE 30 CARACTERES DE LARGO", "Error", JOptionPane.ERROR_MESSAGE);

        }    }//GEN-LAST:event_txtMaterialBDKeyTyped

    private void volverVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverVerActionPerformed

        presupuestosGuardados presu = new presupuestosGuardados();
        //  CERRAR VENTANA ACTUAL  //
        verPresupuesto.dispose();

        presu.setVisible(true);
    }//GEN-LAST:event_volverVerActionPerformed

    private void btnAgregarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBDActionPerformed

        //  BOTON PARA AGREGAR ALGO AL PRSUPUESTO  //
        //  OBTENER LOS VALORES DE LOS CAMPOS  //
        String material = txtMaterialBD.getText();
        int cantidad = Integer.parseInt(txtCantidadBD.getText());
        String unidadVenta = txtUnidadVBD.getText();
        int precioUnidad = Integer.parseInt(txtPrecioUBD.getText());

        //  CALCULAR TOTAL DEL MATERIAL  //
        int totalMaterial = cantidad * precioUnidad;

        conexionSQL con = new conexionSQL();
        Connection conexion = con.conec();

        try {

            String sql = "UPDATE presupuestos "
                    + "SET materiales = CONCAT(materiales, ', ', ?), "
                    + "    unidad_venta = CONCAT(unidad_venta, ', ', ?), "
                    + "    cantidades = CONCAT(cantidades, ', ', ?), "
                    + "    precio_unidad = CONCAT(precio_unidad, ', ', ?), "
                    + "    total_material = CONCAT(total_material, ', ', ?) "
                    + "WHERE id = ?";

            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, material);
            stmt.setString(2, unidadVenta);
            stmt.setInt(3, cantidad);
            stmt.setInt(4, precioUnidad);
            stmt.setInt(5, totalMaterial);
            stmt.setInt(6, idSeleccionado);
            int filasActualizadas = stmt.executeUpdate();

            if (filasActualizadas > 0) {
                actualizarTabla(idSeleccionado);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el ID en la base de datos");
            }

            stmt.close();
            conexion.close();

            //  LIMPIAR LOS CAMPOS LUEGO DE CLICKEAR  //   
            txtMaterialBD.setText("");
            txtCantidadBD.setText("");
            txtUnidadVBD.setText("");
            txtPrecioUBD.setText("");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al actualizar la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnAgregarBDActionPerformed

    private void validarCampos() {

        if (!txtMaterialBD.getText().isEmpty() && !txtCantidadBD.getText().isEmpty() && !txtUnidadVBD.getText().isEmpty() && !txtPrecioUBD.getText().isEmpty()) {

            btnAgregarBD.setEnabled(true);

        } else {

            btnAgregarBD.setEnabled(false);

        }

    }

    private void presupuestosBD() {

        conexionSQL con = new conexionSQL();
        Connection conexion = con.conec();

        if (conexion != null) {
            try {
                String sql = "SELECT id, nombre, descripcion, ultima_modificacion FROM presupuestos";
                PreparedStatement pstmt = conexion.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                DefaultTableModel model = (DefaultTableModel) tablaBD.getModel();
                model.setRowCount(0);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String descripcion = rs.getString("descripcion");
                    String ultimaModificacion = rs.getString("ultima_modificacion");

                    model.addRow(new Object[]{id, nombre, descripcion, ultimaModificacion});
                }

                rs.close();
                pstmt.close();
                conexion.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void cerrarEditar() {

        this.dispose();
    }

    private void menuTablaBD() {

        JMenuItem Ver = new JMenuItem("Ver presupuesto", getIcon("/IMG/ojo.png", 25, 25));
        JMenuItem EditarNombre = new JMenuItem("Editar nombre", getIcon("/IMG/texto.png", 25, 25));
        JMenuItem EditarDescripcion = new JMenuItem("Editar descripcion", getIcon("/IMG/descripcion.png", 25, 25));
        JMenuItem Editar = new JMenuItem("Editar", getIcon("/IMG/editar.png", 25, 25));
        JMenuItem Borrar = new JMenuItem("Eliminar", getIcon("/IMG/borrar.png", 25, 25));

        menuTablaBD.add(Ver);
        menuTablaBD.add(EditarNombre);
        menuTablaBD.add(EditarDescripcion);
        menuTablaBD.add(Editar);
        menuTablaBD.add(Borrar);

        tablaBD.setComponentPopupMenu(menuTablaBD);

        Ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = tablaBD.getSelectedRow();

                if (filaSeleccionada != -1) {

                    conexionSQL con = new conexionSQL();
                    Connection conexion = con.conec();

                    int id = Integer.parseInt(model.getValueAt(filaSeleccionada, 0).toString());

                    try {
                        String sql = "SELECT materiales, unidad_venta, cantidades, precio_unidad, total_material FROM presupuestos WHERE id = ?";
                        PreparedStatement stmt = conexion.prepareStatement(sql);
                        stmt.setInt(1, id);
                        ResultSet rs = stmt.executeQuery();

                        DefaultTableModel model = new DefaultTableModel();
                        JTable tablaVer = verTablaBD;
                        tablaVer.setModel(model);

                        ResultSetMetaData metaData = rs.getMetaData();
                        int columnCount = metaData.getColumnCount();

                        for (int i = 1; i <= columnCount; i++) {
                            model.addColumn(metaData.getColumnName(i));
                        }

                        int sumaTotal = 0;

                        while (rs.next()) {
                            String materiales = rs.getString("materiales");
                            String unidadVenta = rs.getString("unidad_venta");
                            String cantidades = rs.getString("cantidades");
                            String precioUnidad = rs.getString("precio_unidad");
                            String totalMaterial = rs.getString("total_material");

                            String[] matArray = materiales.split(", ");
                            String[] unVentaArray = unidadVenta.split(", ");
                            String[] cantArray = cantidades.split(", ");
                            String[] precioArray = precioUnidad.split(", ");
                            String[] totalArray = totalMaterial.split(", ");

                            int totalFilas = matArray.length;
                            for (int i = 0; i < totalFilas; i++) {
                                int total = Integer.parseInt(totalArray[i]);
                                sumaTotal += total;

                                model.addRow(new Object[]{
                                    matArray[i],
                                    unVentaArray[i],
                                    cantArray[i],
                                    precioArray[i],
                                    total
                                });
                            }
                        }

                        txtVerTotalBD.setText(String.valueOf(sumaTotal));

                        cerrarEditar();
                        verPresupuesto.pack();
                        verPresupuesto.setLocationRelativeTo(null);
                        verPresupuesto.setVisible(true);

                        rs.close();
                        stmt.close();
                        conexion.close();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al obtener los datos de la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Error al convertir los valores numéricos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NO HAY UNA FILA SELECCIONADA PARA VER", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        EditarNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = tablaBD.getSelectedRow();

                conexionSQL con = new conexionSQL();
                Connection conexion = con.conec();

                if (filaSeleccionada != -1) {

                    int columnaEditar = 1;
                    String valorOriginal = model.getValueAt(filaSeleccionada, columnaEditar).toString();

                    JTextField textField = new JTextField(valorOriginal, 30);
                    textField.addKeyListener(new KeyAdapter() {
                        public void keyTyped(KeyEvent evt) {
                            if (textField.getText().length() >= 30) {

                                Toolkit.getDefaultToolkit().beep();
                                JOptionPane.showMessageDialog(null, "El nombre no puede tener mas de 30 caracteres de largo.", "Error", JOptionPane.ERROR_MESSAGE);

                                evt.consume();
                            }
                            restriccion_N_S(evt);
                        }
                    });

                    JPanel panel = new JPanel();
                    panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
                    panel.add(new JLabel("Ingrese el nuevo nombre:"));
                    panel.add(textField);

                    int opcion = JOptionPane.showConfirmDialog(null, panel, "Editar Nombre", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                    if (opcion != JOptionPane.OK_OPTION) {
                        return;
                    }

                    String nuevoValor = textField.getText().trim();

                    if (nuevoValor.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "EL CAMPO NO PUEDE ESTAR VACÍO", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int id = Integer.parseInt(model.getValueAt(filaSeleccionada, 0).toString());

                    try {
                        con.conec();
                        String sql = "UPDATE presupuestos SET nombre = ? WHERE id = ?";

                        PreparedStatement stmt = conexion.prepareStatement(sql);
                        stmt.setString(1, nuevoValor);
                        stmt.setInt(2, id);

                        int filasActualizadas = stmt.executeUpdate();

                        if (filasActualizadas > 0) {
                            model.setValueAt(nuevoValor, filaSeleccionada, columnaEditar);
                            presupuestosBD();
                            JOptionPane.showMessageDialog(null, "Dato actualizado correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        stmt.close();
                        conexion.close();

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EN LA BASE DE DATOS: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA PARA EDITAR EL NOMBRE", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        EditarDescripcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = tablaBD.getSelectedRow();

                conexionSQL con = new conexionSQL();
                Connection conexion = con.conec();

                if (filaSeleccionada != -1) {

                    int columnaEditar = 2;
                    String valorOriginal = model.getValueAt(filaSeleccionada, columnaEditar).toString();

                    JTextField textField = new JTextField(valorOriginal, 50);
                    textField.addKeyListener(new KeyAdapter() {
                        public void keyTyped(KeyEvent evt) {
                            if (textField.getText().length() >= 50) {

                                Toolkit.getDefaultToolkit().beep();
                                JOptionPane.showMessageDialog(null, "La descripcion no puede tener mas de 50 caracteres de largo.", "Error", JOptionPane.ERROR_MESSAGE);

                                evt.consume();
                            }

                            restriccion_N_S(evt);

                        }
                    });

                    JPanel panel = new JPanel();
                    panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
                    panel.add(new JLabel("Ingrese la nueva descripcion:"));
                    panel.add(textField);

                    int opcion = JOptionPane.showConfirmDialog(null, panel, "Editar Descripcion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                    if (opcion != JOptionPane.OK_OPTION) {
                        return;
                    }

                    String nuevoValor = textField.getText().trim();

                    if (nuevoValor.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "EL CAMPO NO PUEDE ESTAR VACÍO", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int id = Integer.parseInt(model.getValueAt(filaSeleccionada, 0).toString());

                    try {
                        con.conec();
                        String sql = "UPDATE presupuestos SET descripcion = ? WHERE id = ?";

                        PreparedStatement stmt = conexion.prepareStatement(sql);
                        stmt.setString(1, nuevoValor);
                        stmt.setInt(2, id);

                        int filasActualizadas = stmt.executeUpdate();

                        if (filasActualizadas > 0) {
                            model.setValueAt(nuevoValor, filaSeleccionada, columnaEditar);
                            presupuestosBD();
                            JOptionPane.showMessageDialog(null, "Dato actualizado correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        stmt.close();
                        conexion.close();

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EN LA BASE DE DATOS: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA PARA EDITAR", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = tablaBD.getSelectedRow();

                if (filaSeleccionada != -1) {

                    conexionSQL con = new conexionSQL();
                    Connection conexion = con.conec();

                    idSeleccionado = Integer.parseInt(model.getValueAt(filaSeleccionada, 0).toString());

                    try {
                        String sql = "SELECT materiales, unidad_venta, cantidades, precio_unidad, total_material FROM presupuestos WHERE id = ?";
                        PreparedStatement stmt = conexion.prepareStatement(sql);
                        stmt.setInt(1, idSeleccionado);
                        ResultSet rs = stmt.executeQuery();

                        DefaultTableModel model = new DefaultTableModel();
                        JTable tablaEditar = editarTablaBD;
                        tablaEditar.setModel(model);

                        ResultSetMetaData metaData = rs.getMetaData();
                        int columnCount = metaData.getColumnCount();

                        for (int i = 1; i <= columnCount; i++) {
                            model.addColumn(metaData.getColumnName(i));
                        }

                        int sumaTotal = 0;

                        while (rs.next()) {
                            String materiales = rs.getString("materiales");
                            String unidadVenta = rs.getString("unidad_venta");
                            String cantidades = rs.getString("cantidades");
                            String precioUnidad = rs.getString("precio_unidad");
                            String totalMaterial = rs.getString("total_material");

                            String[] matArray = materiales.split(", ");
                            String[] unVentaArray = unidadVenta.split(", ");
                            String[] cantArray = cantidades.split(", ");
                            String[] precioArray = precioUnidad.split(", ");
                            String[] totalArray = totalMaterial.split(", ");

                            int totalFilas = matArray.length;
                            for (int i = 0; i < totalFilas; i++) {
                                int total = Integer.parseInt(totalArray[i]);
                                sumaTotal += total;

                                model.addRow(new Object[]{
                                    matArray[i],
                                    unVentaArray[i],
                                    cantArray[i],
                                    precioArray[i],
                                    total
                                });
                            }
                        }

                        txtTotalBD.setText(String.valueOf(sumaTotal));

                        cerrarEditar();
                        editarBD.pack();
                        editarBD.setLocationRelativeTo(null);
                        editarBD.setVisible(true);

                        rs.close();
                        stmt.close();
                        conexion.close();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al obtener los datos de la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Error al convertir los valores numéricos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NO HAY UNA FILA SELECCIONADA PARA EDITAR", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tablaBD.getSelectedRow();

                if (filaSeleccionada != -1) {

                    int id = Integer.parseInt(model.getValueAt(filaSeleccionada, 0).toString());

                    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este presupuesto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                    if (confirmacion == JOptionPane.YES_OPTION) {

                        conexionSQL con = new conexionSQL();
                        Connection conexion = con.conec();

                        try {
                            String sql = "DELETE FROM presupuestos WHERE id = ?";
                            PreparedStatement stmt = conexion.prepareStatement(sql);
                            stmt.setInt(1, id);

                            int filasEliminadas = stmt.executeUpdate();

                            if (filasEliminadas > 0) {
                                model.removeRow(filaSeleccionada);

                            } else {
                                JOptionPane.showMessageDialog(null, "No se pudo eliminar el presupuesto en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                            stmt.close();
                            conexion.close();

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Error al eliminar la fila de la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NO HAY UNA FILA SELECCIONADA PARA ELIMINAR", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

    private void menuEditarBD() {

        JMenuItem Editar = new JMenuItem("Editar", getIcon("/IMG/editar.png", 25, 25));
        JMenuItem Borrar = new JMenuItem("Eliminar", getIcon("/IMG/borrar.png", 25, 25));

        menuTablaEditarBD.add(Editar);
        menuTablaEditarBD.add(Borrar);

        editarTablaBD.setComponentPopupMenu(menuTablaEditarBD);

        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = editarTablaBD.getSelectedRow();
                int columnaSeleccionada = editarTablaBD.getSelectedColumn();

                if (columnaSeleccionada == 4) {

                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "NO SE PUEDE MODIFICAR LA COLUMNA DE TOTAL", "Error", JOptionPane.ERROR_MESSAGE);

                    return;
                }

                if (filaSeleccionada != -1 && columnaSeleccionada != -1) {
                    String nombreColumna = editarTablaBD.getColumnName(columnaSeleccionada);
                    Object valorActual = editarTablaBD.getValueAt(filaSeleccionada, columnaSeleccionada);

                    String nuevoValor = JOptionPane.showInputDialog(null,
                            "Modificar " + nombreColumna,
                            valorActual);

                    if (nuevoValor != null && !nuevoValor.trim().isEmpty()) {
                        try {
                            conexionSQL con = new conexionSQL();
                            Connection conexion = con.conec();

                            String sqlObtener = "SELECT materiales, unidad_venta, cantidades, precio_unidad, total_material FROM presupuestos WHERE id = ?";
                            PreparedStatement stmtObtener = conexion.prepareStatement(sqlObtener);
                            stmtObtener.setInt(1, idSeleccionado);
                            ResultSet rs = stmtObtener.executeQuery();

                            if (rs.next()) {

                                String materialesActuales = rs.getString("materiales");
                                String unidadesActuales = rs.getString("unidad_venta");
                                String cantidadesActuales = rs.getString("cantidades");
                                String preciosUActuales = rs.getString("precio_unidad");
                                String totalesUActuales = rs.getString("total_material");

                                String[] materiales = materialesActuales.split(", ");
                                String[] unidades = unidadesActuales.split(", ");
                                String[] cantidades = cantidadesActuales.split(", ");
                                String[] precios = preciosUActuales.split(", ");
                                String[] totales = totalesUActuales.split(", ");

                                if (filaSeleccionada >= cantidades.length) {
                                    JOptionPane.showMessageDialog(null, "Error: No puedes modificar una posición inexistente.");
                                    return;
                                }

                                if (nombreColumna.equals("materiales")) {
                                    materiales[filaSeleccionada] = nuevoValor;
                                }

                                if (nombreColumna.equals("unidad_venta")) {
                                    unidades[filaSeleccionada] = nuevoValor;
                                }

                                if (nombreColumna.equals("cantidades")) {
                                    cantidades[filaSeleccionada] = nuevoValor;
                                } else if (nombreColumna.equals("precio_unidad")) {
                                    precios[filaSeleccionada] = nuevoValor;
                                }

                                int nuevaCantidad = Integer.parseInt(cantidades[filaSeleccionada]);
                                int nuevoPrecio = Integer.parseInt(precios[filaSeleccionada]);
                                int nuevoTotal = nuevaCantidad * nuevoPrecio;
                                totales[filaSeleccionada] = String.valueOf(nuevoTotal);

                                String nuevosMateriales = String.join(", ", materiales);
                                String nuevasUnidades = String.join(", ", unidades);
                                String nuevasCantidades = String.join(", ", cantidades);
                                String nuevosPrecios = String.join(", ", precios);
                                String nuevosTotales = String.join(", ", totales);

                                String sqlActualizar = "UPDATE presupuestos SET materiales = ?,unidad_venta = ?, cantidades = ?, precio_unidad = ?, total_material = ? WHERE id = ?";
                                PreparedStatement stmtActualizar = conexion.prepareStatement(sqlActualizar);

                                stmtActualizar.setString(1, nuevosMateriales);
                                stmtActualizar.setString(2, nuevasUnidades);
                                stmtActualizar.setString(3, nuevasCantidades);
                                stmtActualizar.setString(4, nuevosPrecios);
                                stmtActualizar.setString(5, nuevosTotales);
                                stmtActualizar.setInt(6, idSeleccionado);

                                int filasActualizadas = stmtActualizar.executeUpdate();

                                if (filasActualizadas > 0) {
                                    actualizarTabla(idSeleccionado);
                                    JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro.");
                                }

                                stmtActualizar.close();
                            } else {
                                JOptionPane.showMessageDialog(null, "No se encontraron datos para actualizar.");
                            }

                            rs.close();
                            stmtObtener.close();
                            conexion.close();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Error al actualizar la base de datos: " + ex.getMessage());
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona una celda para editar.");
                }
            }
        });

        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) editarTablaBD.getModel();


                if (model.getRowCount() == 1) {
                    JOptionPane.showMessageDialog(null, "La tabla no puede quedar vacia.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int filaSeleccionada = editarTablaBD.getSelectedRow();

                if (filaSeleccionada != -1) {
                    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar este registro?", "Confirmación", JOptionPane.YES_NO_OPTION);

                    if (confirmacion == JOptionPane.YES_OPTION) {
                        String materialAEliminar = model.getValueAt(filaSeleccionada, 0).toString();

                        conexionSQL con = new conexionSQL();
                        Connection conexion = con.conec();

                        try {
                            String sqlSelect = "SELECT materiales, unidad_venta, cantidades, precio_unidad, total_material FROM presupuestos WHERE id = ?";
                            PreparedStatement stmtSelect = conexion.prepareStatement(sqlSelect);
                            stmtSelect.setInt(1, idSeleccionado);
                            ResultSet rs = stmtSelect.executeQuery();

                            if (rs.next()) {
                                String[] matArray = rs.getString("materiales").split(", ");
                                String[] unVentaArray = rs.getString("unidad_venta").split(", ");
                                String[] cantArray = rs.getString("cantidades").split(", ");
                                String[] precioArray = rs.getString("precio_unidad").split(", ");
                                String[] totalArray = rs.getString("total_material").split(", ");

                                StringBuilder nuevosMateriales = new StringBuilder();
                                StringBuilder nuevasUnidades = new StringBuilder();
                                StringBuilder nuevasCantidades = new StringBuilder();
                                StringBuilder nuevosPrecios = new StringBuilder();
                                StringBuilder nuevosTotales = new StringBuilder();

                                for (int i = 0; i < matArray.length; i++) {
                                    if (!matArray[i].equals(materialAEliminar)) {
                                        if (nuevosMateriales.length() > 0) {
                                            nuevosMateriales.append(", ");
                                            nuevasUnidades.append(", ");
                                            nuevasCantidades.append(", ");
                                            nuevosPrecios.append(", ");
                                            nuevosTotales.append(", ");
                                        }
                                        nuevosMateriales.append(matArray[i]);
                                        nuevasCantidades.append(cantArray[i]);
                                        nuevasUnidades.append(unVentaArray[i]);
                                        nuevosPrecios.append(precioArray[i]);
                                        nuevosTotales.append(totalArray[i]);
                                    }
                                }

                                String sqlUpdate = "UPDATE presupuestos SET materiales = ?, unidad_venta = ?, cantidades = ?, precio_unidad = ?, total_material = ? WHERE id = ?";
                                PreparedStatement stmtUpdate = conexion.prepareStatement(sqlUpdate);
                                stmtUpdate.setString(1, nuevosMateriales.toString());
                                stmtUpdate.setString(2, nuevasUnidades.toString());
                                stmtUpdate.setString(3, nuevasCantidades.toString());
                                stmtUpdate.setString(4, nuevosPrecios.toString());
                                stmtUpdate.setString(5, nuevosTotales.toString());
                                stmtUpdate.setInt(6, idSeleccionado);
                                stmtUpdate.executeUpdate();

                                model.removeRow(filaSeleccionada);
                                actualizarTabla(idSeleccionado);
                            }

                            rs.close();
                            stmtSelect.close();
                            conexion.close();
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
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
                Point puntoConvertido = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(), tablaBD.getParent());

                if (!tablaBD.getBounds().contains(puntoConvertido)) {
                    if (tablaBD.isEditing()) {
                        tablaBD.getCellEditor().stopCellEditing();
                    }
                    tablaBD.clearSelection();
                }

            }
        });
    }

    private void deseleccionarTablaEditar() {

        editarBD.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point puntoConvertido = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(), editarTablaBD.getParent());

                if (!editarTablaBD.getBounds().contains(puntoConvertido)) {
                    if (editarTablaBD.isEditing()) {
                        editarTablaBD.getCellEditor().stopCellEditing();
                    }
                    editarTablaBD.clearSelection();
                }

            }
        });
    }

    public void actualizarTabla(int id) {

        DefaultTableModel model = (DefaultTableModel) editarTablaBD.getModel();
        model.setRowCount(0);

        conexionSQL con = new conexionSQL();
        Connection conexion = con.conec();

        int sumaTotal = 0;

        try {
            String sql = "SELECT materiales, unidad_venta, cantidades, precio_unidad, total_material FROM presupuestos WHERE id = ?";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String materiales = rs.getString("materiales");
                String unidadVenta = rs.getString("unidad_venta");
                String cantidades = rs.getString("cantidades");
                String precioUnidad = rs.getString("precio_unidad");
                String totalMaterial = rs.getString("total_material");

                String[] matArray = materiales.split(", ");
                String[] unVentaArray = unidadVenta.split(", ");
                String[] cantArray = cantidades.split(", ");
                String[] precioArray = precioUnidad.split(", ");
                String[] totalArray = totalMaterial.split(", ");

                int totalFilas = matArray.length;
                for (int i = 0; i < totalFilas; i++) {
                    int total = Integer.parseInt(totalArray[i]);
                    sumaTotal += total;

                    model.addRow(new Object[]{
                        matArray[i],
                        unVentaArray[i],
                        cantArray[i],
                        precioArray[i],
                        total
                    });
                }
            }

            txtTotalBD.setText(String.valueOf(sumaTotal));

            rs.close();
            stmt.close();
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir los valores numéricos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(presupuestosGuardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(presupuestosGuardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(presupuestosGuardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(presupuestosGuardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presupuestosGuardados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBD;
    private javax.swing.JButton btnVolver;
    private javax.swing.JFrame editarBD;
    private javax.swing.JTable editarTablaBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu menuTablaBD;
    private javax.swing.JPopupMenu menuTablaEditarBD;
    private javax.swing.JTable tablaBD;
    private javax.swing.JTextField txtCantidadBD;
    private javax.swing.JTextField txtMaterialBD;
    private javax.swing.JTextField txtPrecioUBD;
    private javax.swing.JTextField txtTotalBD;
    private javax.swing.JTextField txtUnidadVBD;
    private javax.swing.JTextField txtVerTotalBD;
    private javax.swing.JFrame verPresupuesto;
    private javax.swing.JTable verTablaBD;
    private javax.swing.JButton volver;
    private javax.swing.JButton volverVer;
    // End of variables declaration//GEN-END:variables
}
