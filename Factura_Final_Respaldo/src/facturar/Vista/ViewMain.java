
package facturar.Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ViewMain extends javax.swing.JFrame {
  
    public ViewMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_sup = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Panel_central = new javax.swing.JPanel();
        Panel_izq = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TreeMenu = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_sup.setBackground(new java.awt.Color(255, 255, 204));
        Panel_sup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Facturación");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturar/Vista/LogoTechTrasparente.png"))); // NOI18N

        javax.swing.GroupLayout Panel_supLayout = new javax.swing.GroupLayout(Panel_sup);
        Panel_sup.setLayout(Panel_supLayout);
        Panel_supLayout.setHorizontalGroup(
            Panel_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_supLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );
        Panel_supLayout.setVerticalGroup(
            Panel_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_supLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_sup, java.awt.BorderLayout.PAGE_START);

        TreeMenu.setBackground(new java.awt.Color(240, 240, 240));
        TreeMenu.setForeground(java.awt.SystemColor.menu);
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Inicio");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Facturas");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Nueva Factura");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Listar Facturas");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Productos");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Nuevo Producto");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Listar Producto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Nuevo Cliente");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Listar Clientes");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Salir");
        treeNode1.add(treeNode2);
        TreeMenu.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        TreeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliente(evt);
            }
        });
        jScrollPane1.setViewportView(TreeMenu);

        javax.swing.GroupLayout Panel_izqLayout = new javax.swing.GroupLayout(Panel_izq);
        Panel_izq.setLayout(Panel_izqLayout);
        Panel_izqLayout.setHorizontalGroup(
            Panel_izqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_izqLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_izqLayout.setVerticalGroup(
            Panel_izqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_centralLayout = new javax.swing.GroupLayout(Panel_central);
        Panel_central.setLayout(Panel_centralLayout);
        Panel_centralLayout.setHorizontalGroup(
            Panel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_centralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(653, Short.MAX_VALUE))
        );
        Panel_centralLayout.setVerticalGroup(
            Panel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_centralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_izq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_central, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliente
        // TODO add your handling code here:
        String opcion= TreeMenu.getLastSelectedPathComponent().toString();                
        
        switch (opcion){
            case "Nuevo Cliente":
                ViewCliente vcli = new ViewCliente();
                vcli.setLocationRelativeTo(null);
                vcli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vcli.setVisible(true);
                break;
            case "Nuevo Producto":  
                ViewProducto vprod = new ViewProducto();
                vprod.setLocationRelativeTo(null);
                vprod.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vprod.setVisible(true);
                break;
            case "Listar Producto":    
                ViewLineaProducto vlineaProd = new ViewLineaProducto();
                vlineaProd.setLocationRelativeTo(null);
                vlineaProd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vlineaProd.setVisible(true);
                break;
            case "Salir":
                   int resp=JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "Escoger opcion", JOptionPane.YES_NO_OPTION);
                   if (resp==0)System.exit(0);
                   
        }
        opcion="";
    }//GEN-LAST:event_cliente

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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewMain vmain =  new ViewMain();
                vmain.setVisible(true);
                vmain.setExtendedState(vmain.getExtendedState() | vmain.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_central;
    private javax.swing.JPanel Panel_izq;
    private javax.swing.JPanel Panel_sup;
    public javax.swing.JTree TreeMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
