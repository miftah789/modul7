
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Frame3 extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sekolah = new javax.swing.JTextField();
        Kelas = new javax.swing.JComboBox();
        Nama = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTable();
        Exit = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Sekolah");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 170, 60, 30);

        jLabel2.setText("TABEL BIODATA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 10, 100, 30);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 50, 60, 30);

        jLabel4.setText("Kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 90, 60, 30);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 130, 60, 30);
        getContentPane().add(Sekolah);
        Sekolah.setBounds(140, 170, 150, 30);

        Kelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XI RPL1", "XI RPL2", "XI RPL3", "XI RPL4", "XI RPL5", "XI RPL6" }));
        getContentPane().add(Kelas);
        Kelas.setBounds(140, 90, 90, 30);
        getContentPane().add(Nama);
        Nama.setBounds(140, 50, 150, 30);
        getContentPane().add(Alamat);
        Alamat.setBounds(140, 130, 150, 30);

        Hasil.setBackground(new java.awt.Color(255, 153, 51));
        Hasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Kelas", "Alamat", "Sekolah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Hasil);
        if (Hasil.getColumnModel().getColumnCount() > 0) {
            Hasil.getColumnModel().getColumn(0).setHeaderValue("Nama");
            Hasil.getColumnModel().getColumn(1).setHeaderValue("Kelas");
            Hasil.getColumnModel().getColumn(2).setHeaderValue("Alamat");
            Hasil.getColumnModel().getColumn(3).setHeaderValue("Sekolah");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 470, 180);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(190, 210, 70, 30);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(80, 210, 70, 30);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 450);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 250, 450, 180);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(170, 290, 100, 100);

        setBounds(0, 0, 521, 486);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       String nama = Nama.getText();
       String kelas = Kelas.getSelectedItem().toString();
       String alamat = Alamat.getText();
       String sklh = Sekolah.getText();
       
       if (Kelas.getSelectedItem() == "XI RPL1"){
       }if (Kelas.getSelectedItem() == "XI RPL2"){
       }if (Kelas.getSelectedItem() == "XI RPL3")
       if (Kelas.getSelectedItem() == "XI RPL4"){
       }if (Kelas.getSelectedItem() == "XI RPL5"){
       }if (Kelas.getSelectedItem() == "XI RPL6");
       
       DefaultTableModel model = (DefaultTableModel) Hasil.getModel();
       model.addRow(new Object[]{Nama.getText(),Kelas.getSelectedItem(), Alamat.getText(),Sekolah.getText()});
// TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

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
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Exit;
    private javax.swing.JTable Hasil;
    private javax.swing.JComboBox Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Sekolah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
