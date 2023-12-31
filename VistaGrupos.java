
package Vista;
import PanelPrincipal.PanelDeComerciantes;
import Controlador.ControladorVendedores;
import Controlador.ControladorVentas;
import Controlador.ControladorProductos;
import javax.swing.JOptionPane;
import Modelo.CRUDVendedores;
import Modelo.CRUDVentas;
import Modelo.CRUDProductos;
import Modelo.Vendedores;
import Modelo.Ventas;
import Modelo.Productos;

public class VistaGrupos extends javax.swing.JFrame {

  
    public VistaGrupos() {
        initComponents();
        setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnVendedores = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnPanelP = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtIDGrupo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreGrupo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base de datos Comerciante", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 36))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        btnSalir.setBackground(new java.awt.Color(255, 0, 51));
        btnSalir.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        btnVendedores.setBackground(new java.awt.Color(0, 0, 0));
        btnVendedores.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnVendedores.setForeground(new java.awt.Color(255, 255, 255));
        btnVendedores.setText("Vendedores");
        btnVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedoresActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(0, 0, 0));
        btnVentas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(0, 0, 0));
        btnProductos.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnPanelP.setBackground(new java.awt.Color(255, 51, 0));
        btnPanelP.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnPanelP.setText("Panel P.");
        btnPanelP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanelPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPanelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPanelP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVendedores)
                .addGap(18, 18, 18)
                .addComponent(btnVentas)
                .addGap(18, 18, 18)
                .addComponent(btnProductos)
                .addGap(16, 16, 16))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grupos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 102, 102));
        btnBuscar.setText("Buscar");

        btnAgregar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 102, 102));
        btnAgregar.setText("Agregar");

        btnLimpiar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 102, 102));
        btnLimpiar.setText("Limpiar");

        txtIDGrupo.setForeground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("NombreGrupo");

        txtNombreGrupo.setForeground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("IDGrupo");

        btnEliminar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 102, 102));
        btnEliminar.setText("Eliminar");

        btnEditar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 102, 102));
        btnEditar.setText("Editar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDGrupo)
                    .addComponent(txtNombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSalir)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int option = JOptionPane.showConfirmDialog(this,
            "¿Está seguro de que desea salir?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedoresActionPerformed
        Vendedores modelVEND = new Vendedores ();
        CRUDVendedores modelcrudVEND = new CRUDVendedores();
        VistaVendedores viewVEND = new VistaVendedores();
        ControladorVendedores controlVEND = new ControladorVendedores (modelVEND,viewVEND,modelcrudVEND);
        controlVEND.iniciar();
        viewVEND.setVisible(true);
    }//GEN-LAST:event_btnVendedoresActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Ventas modelVENT  = new Ventas ();
        CRUDVentas modelcrudVENT  = new CRUDVentas();
        VistaVentas viewVENT  = new VistaVentas();
        ControladorVentas controlVENT = new ControladorVentas (modelVENT,viewVENT,modelcrudVENT);
        controlVENT.iniciar();
        viewVENT.setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Productos modelPRO = new Productos ();
        CRUDProductos modelcrudPRO = new CRUDProductos();
        VistaProductos viewPRO = new VistaProductos();
        ControladorProductos controlPRO = new ControladorProductos (modelPRO,viewPRO,modelcrudPRO);
        controlPRO.iniciar();
        viewPRO.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnPanelPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanelPActionPerformed
        PanelDeComerciantes PVend =new PanelDeComerciantes ();
        PVend.setVisible (true);
        dispose();
    }//GEN-LAST:event_btnPanelPActionPerformed

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
            java.util.logging.Logger.getLogger(VistaGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnPanelP;
    private javax.swing.JButton btnProductos;
    public javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVendedores;
    private javax.swing.JButton btnVentas;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtIDGrupo;
    public javax.swing.JTextField txtNombreGrupo;
    // End of variables declaration//GEN-END:variables
}
