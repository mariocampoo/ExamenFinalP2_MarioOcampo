/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenfinalp2_marioocampo;

import static java.lang.Thread.sleep;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author mario
 */
public class inicio extends javax.swing.JFrame {

    DefaultTableModel tabla = new DefaultTableModel();

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        String[] titulos = new String[]{"Torneo", "Deporte", "Equipo", "Puntos"};
        tabla.setColumnIdentifiers(titulos);
        tbl.setModel(tabla);
    }

    class pg extends Thread {

        JProgressBar carga;
        JDialog menu;

        public pg(JProgressBar carga) {
            this.carga = carga;
            this.menu = menu;
        }

        @Override
        public void run() {
            int min = 0;
            int max = 10;

            carga.setMaximum(min);
            carga.setMaximum(max - 1);
            carga.setValue(0);

            for (int i = min; i < max; i++) {
                carga.setValue(i);

                try {
                    sleep(400);
                } catch (InterruptedException ex) {
                    JOptionPane.showInputDialog("Error");
                }
            }
            System.out.println(carga.getValue());
            if (carga.getValue() == max - 1) {
                mostrar.setVisible(true);
                mostrar.pack();
                mostrar.setLocationRelativeTo(equipo);

            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrar = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        equipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        deporte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        torneo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        periodo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        puntos = new javax.swing.JTextField();
        carga = new javax.swing.JProgressBar();

        mostrar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tree);

        mostrar.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 160, 270));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl);

        mostrar.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 380, 160));

        jButton1.setText("Mostrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        mostrar.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jLabel5.setText(".");
        mostrar.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 40, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("nombre del equipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));
        getContentPane().add(equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, -1));

        jLabel2.setText("Deporte");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        getContentPane().add(deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, -1));

        jLabel3.setText("Torneo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));
        getContentPane().add(torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, -1));

        jLabel4.setText("Periodo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, -1));

        jButton2.setText("Añadir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jButton3.setText("ver datos");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel6.setText("Puntos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        getContentPane().add(puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 250, -1));
        getContentPane().add(carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 330, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        DefaultTreeModel modelo = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

        DefaultMutableTreeNode team = new DefaultMutableTreeNode(equipo.getText());
        DefaultMutableTreeNode sport = new DefaultMutableTreeNode(deporte.getText());
        DefaultMutableTreeNode league = new DefaultMutableTreeNode(torneo.getText());
        DefaultMutableTreeNode period = new DefaultMutableTreeNode(periodo.getText());
        DefaultMutableTreeNode points = new DefaultMutableTreeNode(Integer.parseInt(puntos.getText()));

        team.add(points);
        period.add(sport);
        sport.add(league);
        league.add(team);
        raiz.add(period);
        modelo.reload();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        pg t1 = new pg(carga);
        if (carga.getValue() == 10 - 1) {
            System.out.println("haha");
        }
        t1.start();
    }//GEN-LAST:event_jButton3MouseClicked

    private void treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseClicked
        Object t = tree.getLastSelectedPathComponent();
        System.out.println(t);
    }//GEN-LAST:event_treeMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        tabla.addRow(new Object[]{
            torneo.getText(), deporte.getText(), equipo.getText(), puntos.getText()
        });
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar carga;
    private javax.swing.JTextField deporte;
    private javax.swing.JTextField equipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog mostrar;
    private javax.swing.JTextField periodo;
    private javax.swing.JTextField puntos;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField torneo;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}
