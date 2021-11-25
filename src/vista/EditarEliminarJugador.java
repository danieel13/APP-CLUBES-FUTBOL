/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionDB;
import modelo.Jugador;

/**
 *
 * @author Daniel
 */
public class EditarEliminarJugador extends javax.swing.JFrame {
    DefaultTableModel modelo;

    /**
     * Creates new form EditarJugador
     */
    public EditarEliminarJugador() {
        initComponents();
        String[] titulos ={"ID","Nombre","Fecha Nacimiento","Nacionalidad","Estatura","Peso","Posicion","Fecha Ingreso","Goles","PartidosJugados","Asistencia","MinutosJugados","Lesiones"};
        modelo = new DefaultTableModel(null,titulos);
        tblJugadores.setModel(modelo);
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtPosicion = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();
        txtGoles = new javax.swing.JTextField();
        txtPartidos = new javax.swing.JTextField();
        txtMinutos = new javax.swing.JTextField();
        txtAsistencias = new javax.swing.JTextField();
        txtLesiones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1027, 937));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1027, 857));

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Fecha Nacimiento", "Nacionalidad", "Estatura", "Peso", "Posición", "Fecha ingreso", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblJugadores.setColumnSelectionAllowed(true);
        tblJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJugadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblJugadores);
        tblJugadores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblJugadores.getColumnModel().getColumnCount() > 0) {
            tblJugadores.getColumnModel().getColumn(0).setResizable(false);
            tblJugadores.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de Nacimiento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nacionalidad:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Estatura:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Peso:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Posición:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de ingreso:");

        btnEditar.setBackground(new java.awt.Color(255, 51, 51));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Guardar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/psg-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(516, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVolver1.setBackground(new java.awt.Color(255, 51, 51));
        btnVolver1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver1.setText("Volver");
        btnVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre1.setText("Goles:");

        lblNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre2.setText("Partidos Jugados:");

        lblNombre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre3.setText("Asistencias:");

        lblNombre4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre4.setText("Lesiones:");

        lblNombre5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre5.setText("Minutos Jugados:");

        txtGoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGolesActionPerformed(evt);
            }
        });

        txtPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartidosActionPerformed(evt);
            }
        });

        txtMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutosActionPerformed(evt);
            }
        });

        txtAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsistenciasActionPerformed(evt);
            }
        });

        txtLesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLesionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(lblNombre)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(btnEditar))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addComponent(txtEstatura)
                    .addComponent(txtPeso)
                    .addComponent(txtNacionalidad)
                    .addComponent(txtFechaNacimiento)
                    .addComponent(txtId)
                    .addComponent(txtNombre)
                    .addComponent(txtFechaIngreso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(97, 97, 97)
                        .addComponent(btnVolver1)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre4)
                        .addGap(26, 26, 26)
                        .addComponent(txtLesiones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre5)
                                .addGap(26, 26, 26)
                                .addComponent(txtMinutos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre3)
                                    .addComponent(lblNombre1)
                                    .addComponent(lblNombre2))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAsistencias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(txtGoles, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPartidos))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1)
                    .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombre5)
                        .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre4)
                    .addComponent(txtLesiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnVolver1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Jugador jugador = recuperarDatos();
        ConexionDB objConexion = new ConexionDB();
        
        String strSentenciaInsert = String.format("UPDATE Jugadores SET Nombre='%s', FechaNacimiento='%s', Nacionalidad='%s', Estatura='%s', Peso='%s', Posicion='%s', FechaIngreso='%s', Goles='%s', PartidosJugados='%s', Asistencias='%s', MinutosJugados='%s', Lesiones='%s' WHERE id='%d'" ,jugador.getNombre(),jugador.getFechaNacimiento(),jugador.getNacionalidad(),jugador.getEstatura(),jugador.getPeso(),jugador.getPosicion(),jugador.getFechaIngreso(),jugador.getGoles(),jugador.getPartidosJugados(),jugador.getAsistencias(),jugador.getMinutosJugados(),jugador.getLesiones(),jugador.getId()); 
        
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Jugador jugador = recuperarDatos();
        ConexionDB objConexion = new ConexionDB();
        
        String strSentenciaInsert = String.format("DELETE FROM Jugadores WHERE id=%d", jugador.getId());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public Jugador recuperarDatos(){
        Jugador jugador = new Jugador();
            int goles = (txtGoles.getText().isEmpty())?0:Integer.parseInt(txtGoles.getText());
            int partidosJugados = (txtPartidos.getText().isEmpty())?0:Integer.parseInt(txtPartidos.getText());
            int asistencias = (txtAsistencias.getText().isEmpty())?0:Integer.parseInt(txtAsistencias.getText());
            int minutosJugados = (txtMinutos.getText().isEmpty())?0:Integer.parseInt(txtMinutos.getText());            
            int id = (txtId.getText().isEmpty())?0:Integer.parseInt(txtId.getText());
            float estatura = (txtEstatura.getText().isEmpty())?0:Float.parseFloat(txtEstatura.getText());
            float peso = (txtPeso.getText().isEmpty())?0:Float.parseFloat(txtPeso.getText());
            jugador.setId(id);
            jugador.setGoles(goles);
            jugador.setPartidosJugados(partidosJugados);
            jugador.setAsistencias(asistencias);
            jugador.setMinutosJugados(minutosJugados);
            jugador.setNombre(txtNombre.getText());
            jugador.setFechaNacimiento(txtFechaNacimiento.getText());
            jugador.setNacionalidad(txtNacionalidad.getText());
            jugador.setEstatura(estatura);
            jugador.setPeso(peso);
            jugador.setPosicion(txtPosicion.getText());
            jugador.setFechaIngreso(txtFechaIngreso.getText());
            jugador.setLesiones(txtLesiones.getText());
            
            return jugador;
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tblJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJugadoresMouseClicked
        if(evt.getClickCount()==1){
            JTable receptor=(JTable)evt.getSource();
            
            txtId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtFechaNacimiento.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtNacionalidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtEstatura.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtPeso.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
            txtPosicion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());
            txtFechaIngreso.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 7).toString());            
            txtGoles.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 8).toString());
            txtPartidos.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 9).toString());
            txtAsistencias.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 10).toString());
            txtMinutos.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 11).toString());
            //txtLesiones.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 12).toString());
        }
    }//GEN-LAST:event_tblJugadoresMouseClicked

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Opciones op = new Opciones();
        op.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void txtGolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGolesActionPerformed

    private void txtPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPartidosActionPerformed

    private void txtMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutosActionPerformed

    private void txtAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsistenciasActionPerformed

    private void txtLesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLesionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLesionesActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarEliminarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEliminarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEliminarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEliminarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEliminarJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    public javax.swing.JTable tblJugadores;
    public javax.swing.JTextField txtAsistencias;
    public javax.swing.JTextField txtEstatura;
    public javax.swing.JTextField txtFechaIngreso;
    public javax.swing.JTextField txtFechaNacimiento;
    public javax.swing.JTextField txtGoles;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtLesiones;
    public javax.swing.JTextField txtMinutos;
    public javax.swing.JTextField txtNacionalidad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPartidos;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() {
         while(modelo.getRowCount()>0){
            modelo.removeRow(0);
            
        }
        ConexionDB conexion = new ConexionDB();
        
        try {
            ResultSet resultado = conexion.consultarRegistro("SELECT * FROM Jugadores");
            
            while (resultado.next()) {                
                Object[] jugador ={resultado.getString("id"),resultado.getString("Nombre"),resultado.getString("FechaNacimiento"),resultado.getString("Nacionalidad"),resultado.getString("Estatura"),resultado.getString("Peso"),resultado.getString("Posicion"),resultado.getString("FechaIngreso"),resultado.getString("Goles"),resultado.getString("PartidosJugados"),resultado.getString("Asistencias"),resultado.getString("MinutosJugados"),resultado.getString("Lesiones")};
                modelo.addRow(jugador);
            }
        } catch (Exception e) {
        }
    }
}
