/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tanda
 */
public class QLQuanAn extends javax.swing.JFrame {
    JPanel panel;
    String maNhanVien;
    String chucVu;
    /**
     * Creates new form QLQuanAn
     */
    public QLQuanAn(String maNhanVien,String chucVu) {
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
        initComponents();
        showPanel(new QLBanHang(maNhanVien));
        String cv = "";
        if(chucVu.equals("0")){
            lab_QLHang.setVisible(false);
            lab_QLHoaDon.setVisible(false);
            lab_QLNhanVien.setVisible(false);
            mnu_thongKe.setVisible(false);
            cv = "Nhân viên";
        }else{
            cv = "Quản lý";
        }
        this.setTitle(maNhanVien + " - "+cv);
    }
    void showPanel(JPanel panelAdd){
        panel = panelAdd;
        panel.setSize(1200, 600);
        panel.setLocation(0, 0);
        pan_Main.removeAll();
        pan_Main.add(panel, BorderLayout.CENTER);
        pan_Main.revalidate();
        pan_Main.repaint();
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
        pan_Main = new javax.swing.JPanel();
        lab_QLNhanVien = new javax.swing.JLabel();
        lab_dangXuat = new javax.swing.JLabel();
        lab_QLBanHang = new javax.swing.JLabel();
        lab_QLHoaDon = new javax.swing.JLabel();
        lab_QLHang = new javax.swing.JLabel();
        lab_doiPass = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_QLBanHang = new javax.swing.JMenu();
        mnu_thongKe = new javax.swing.JMenu();
        mni_thangTruoc = new javax.swing.JMenuItem();
        mni_ngayTruoc = new javax.swing.JMenuItem();
        mnu_huongDan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 650));

        pan_Main.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan_MainLayout = new javax.swing.GroupLayout(pan_Main);
        pan_Main.setLayout(pan_MainLayout);
        pan_MainLayout.setHorizontalGroup(
            pan_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        pan_MainLayout.setVerticalGroup(
            pan_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        lab_QLNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lab_QLNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_QLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Clien list.png"))); // NOI18N
        lab_QLNhanVien.setText("Nhân Viên");
        lab_QLNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_QLNhanVienMouseClicked(evt);
            }
        });

        lab_dangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Exit.png"))); // NOI18N
        lab_dangXuat.setText("Đăng Xuất");
        lab_dangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_dangXuatMouseClicked(evt);
            }
        });

        lab_QLBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Full basket.png"))); // NOI18N
        lab_QLBanHang.setText("Bán Hàng");
        lab_QLBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_QLBanHangMouseClicked(evt);
            }
        });

        lab_QLHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Lists.png"))); // NOI18N
        lab_QLHoaDon.setText("Danh sách hóa đơn");
        lab_QLHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_QLHoaDonMouseClicked(evt);
            }
        });

        lab_QLHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Red star.png"))); // NOI18N
        lab_QLHang.setText("Quản lý hàng");
        lab_QLHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_QLHangMouseClicked(evt);
            }
        });

        lab_doiPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Refresh.png"))); // NOI18N
        lab_doiPass.setText("Đổi Mật Khẩu");
        lab_doiPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_doiPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lab_QLBanHang)
                .addGap(78, 78, 78)
                .addComponent(lab_QLHang)
                .addGap(50, 50, 50)
                .addComponent(lab_QLHoaDon)
                .addGap(42, 42, 42)
                .addComponent(lab_QLNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lab_doiPass)
                .addGap(51, 51, 51)
                .addComponent(lab_dangXuat)
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(pan_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_QLNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lab_dangXuat)
                    .addComponent(lab_QLBanHang)
                    .addComponent(lab_QLHoaDon)
                    .addComponent(lab_QLHang)
                    .addComponent(lab_doiPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        mnu_QLBanHang.setText("Quản Lý Bán Hàng");
        jMenuBar1.add(mnu_QLBanHang);

        mnu_thongKe.setText("Thống kê");

        mni_thangTruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Bar chart.png"))); // NOI18N
        mni_thangTruoc.setText("Tổng thu tháng trước");
        mni_thangTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_thangTruocActionPerformed(evt);
            }
        });
        mnu_thongKe.add(mni_thangTruoc);

        mni_ngayTruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Bar chart.png"))); // NOI18N
        mni_ngayTruoc.setText("Tổng thu ngày trước");
        mni_ngayTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_ngayTruocActionPerformed(evt);
            }
        });
        mnu_thongKe.add(mni_ngayTruoc);

        jMenuBar1.add(mnu_thongKe);

        mnu_huongDan.setText("Hướng dẫn");
        mnu_huongDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_huongDanMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_huongDan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lab_QLHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_QLHangMouseClicked
        showPanel(new QLHang());
    }//GEN-LAST:event_lab_QLHangMouseClicked

    private void lab_QLBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_QLBanHangMouseClicked
        showPanel(new QLBanHang(maNhanVien));
    }//GEN-LAST:event_lab_QLBanHangMouseClicked

    private void lab_QLHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_QLHoaDonMouseClicked
        showPanel(new QLHoaDon());
    }//GEN-LAST:event_lab_QLHoaDonMouseClicked

    private void lab_QLNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_QLNhanVienMouseClicked
        showPanel(new QLNhanVien(maNhanVien));
    }//GEN-LAST:event_lab_QLNhanVienMouseClicked

    private void mni_thangTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_thangTruocActionPerformed
        showPanel(new ThongKe(true));
    }//GEN-LAST:event_mni_thangTruocActionPerformed

    private void mni_ngayTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_ngayTruocActionPerformed
        showPanel(new ThongKe(false));
    }//GEN-LAST:event_mni_ngayTruocActionPerformed

    private void lab_dangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_dangXuatMouseClicked
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lab_dangXuatMouseClicked

    private void lab_doiPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_doiPassMouseClicked
        showPanel(new DoiMatKhau(maNhanVien));
    }//GEN-LAST:event_lab_doiPassMouseClicked

    private void mnu_huongDanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_huongDanMouseClicked
        showPanel(new HuongDan());
    }//GEN-LAST:event_mnu_huongDanMouseClicked

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
            java.util.logging.Logger.getLogger(QLQuanAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLQuanAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLQuanAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLQuanAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLQuanAn("NV002","0").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lab_QLBanHang;
    private javax.swing.JLabel lab_QLHang;
    private javax.swing.JLabel lab_QLHoaDon;
    private javax.swing.JLabel lab_QLNhanVien;
    private javax.swing.JLabel lab_dangXuat;
    private javax.swing.JLabel lab_doiPass;
    private javax.swing.JMenuItem mni_ngayTruoc;
    private javax.swing.JMenuItem mni_thangTruoc;
    private javax.swing.JMenu mnu_QLBanHang;
    private javax.swing.JMenu mnu_huongDan;
    private javax.swing.JMenu mnu_thongKe;
    private javax.swing.JPanel pan_Main;
    // End of variables declaration//GEN-END:variables
}