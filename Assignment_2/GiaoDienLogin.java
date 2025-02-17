/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;



/**
 *
 * @author ToanNM_PC09504
 */
public class GiaoDienLogin extends javax.swing.JFrame {
    ImageIcon icon;
    Timer thoiGian;

    /**
     * Creates new form GiaoDienLogin
     */
    public GiaoDienLogin() {
        initComponents();
        dongHo();
        TuChay();
        doiIcon();
        setTitle("Phần Mềm Quản Lý Giày");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prbDownLoad = new javax.swing.JProgressBar();
        lblDongHo = new javax.swing.JLabel();
        lblNenDownLoad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHẦN MỀM QUẢN LÝ GIÀY THỂ THAO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prbDownLoad.setBackground(new java.awt.Color(217, 255, 0));
        prbDownLoad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prbDownLoad.setForeground(new java.awt.Color(255, 0, 0));
        prbDownLoad.setStringPainted(true);
        getContentPane().add(prbDownLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 960, 30));

        lblDongHo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblDongHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 180, 40));

        lblNenDownLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/phần mềm quản lý giày thể thao.png"))); // NOI18N
        getContentPane().add(lblNenDownLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void doiIcon(){
        icon = new ImageIcon("src/Image/icon_shoe.png");
        setIconImage(icon.getImage());
    }
    
    public void dongHo() {
        thoiGian = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date hienTai = new Date();
                SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
                lblDongHo.setText(dinhDang.format(hienTai));
            }
        });
        thoiGian.start();
    }
    
    public void TuChay() {        
        thoiGian = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int giaTriHienTai = prbDownLoad.getValue();
                giaTriHienTai = giaTriHienTai + 1;
                prbDownLoad.setValue(giaTriHienTai);
                
                if (giaTriHienTai > 100) {
                    thoiGian.stop();
                    new LoginFrom().setVisible(true);
                    dispose();
                }
            }
        });
        thoiGian.start();
    }

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
            java.util.logging.Logger.getLogger(GiaoDienLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblNenDownLoad;
    private javax.swing.JProgressBar prbDownLoad;
    // End of variables declaration//GEN-END:variables
}
