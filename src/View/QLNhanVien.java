/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.NhanVienDAO;
import Model.NhanVien;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tanda
 */
public class QLNhanVien extends javax.swing.JPanel {

    DefaultTableModel mTable;
    String imagePath = null;
    boolean them = false;
    ArrayList<NhanVien> list = new ArrayList<>();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    String maNhanVien;
    

    public QLNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
        initComponents();
        String[] heard = {"Mã nhân viên", "Tên nhân viên", "Giới tính", "Hình ảnh", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Chức vụ"};
        mTable = new DefaultTableModel(null, heard) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        tab_nhanVien.setModel(mTable);
        loadTable();
    }

    void loadTable() {
        while (mTable.getRowCount() > 0) {
            mTable.removeRow(0);
        }
        list.clear();
        NhanVienDAO.selectAll(list);
        for (NhanVien nhanVien : list) {
            Vector vt = new Vector();
            vt.add(nhanVien.getMANV());
            vt.add(nhanVien.getTenNV());
            vt.add(nhanVien.getGioiTinh().equals("1") ? "Nam" : "Nữ");
            vt.add(nhanVien.getImg());
            vt.add(nhanVien.getNgaysinh());
            vt.add(nhanVien.getSdt());
            vt.add(nhanVien.getDiachi());
            vt.add(nhanVien.getChucvu().equals("1") ? "Quản lý" : "Nhân viên");
            mTable.addRow(vt);
        }
    }

    void cleanPanel() {
        txt_ma.setText("");
        txt_diaChi.setText("");
        txt_sdt.setText("");
        txt_ten.setText("");
        dtc_ngaySinh.setDate(null);
        lab_img.setIcon(null);
        rad_nam.setSelected(true);
        rad_nhanVien.setVisible(true);
        rad_nhanVien.setSelected(true);
        
    }

    String chuyenMa(int i) {
        if (i < 10) {
            return "NV00" + i;
        }
        if (i < 100) {
            return "NV0" + i;
        } else {
            return "NV" + i;
        }
    }

    void offThem(boolean b) {
        but_xoa.setEnabled(b);
        but_sua.setEnabled(b);
        tab_nhanVien.setEnabled(b);
        but_reset.setEnabled(b);
        but_huy.setEnabled(!b);
    }

    int chuyenSo(String MANV) {
        int n = Integer.valueOf(MANV.substring(2));
        return n;
    }

    NhanVien createNhanVien() {
        String MANV = txt_ma.getText();
        String matKhau = "123456";
        String ten = txt_ten.getText();
        String gioiTinh = rad_nam.isSelected() ? "1" : "0";
        String img = "\\img\\img" + chuyenSo(MANV) + ".png";
        String ngaySinh = formatter.format(dtc_ngaySinh.getDate());
        String sdt = txt_sdt.getText();
        String diaChi = txt_diaChi.getText();
        String chucVu = rad_quanLy.isSelected() ? "1" : "0";
        NhanVien nv = new NhanVien(MANV, matKhau, ten, gioiTinh, img, ngaySinh, sdt, diaChi, chucVu);
        return nv;
    }

    boolean kiemTra() {
        if (txt_diaChi.getText() == "") {
            return false;
        }
        if (txt_ma.getText() == "") {
            return false;
        }
        if (txt_sdt.getText() == "" && txt_sdt.getText().length() != 10) {
            return false;
        }
        if (txt_ten.getText() == "") {
            return false;
        }
        if (dtc_ngaySinh.getDate() == null) {
            return false;
        }
        if (lab_img.getIcon() == null) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgr_gioiTinh = new javax.swing.ButtonGroup();
        bgr_chucVu = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        rad_nu = new javax.swing.JRadioButton();
        dtc_ngaySinh = new com.toedter.calendar.JDateChooser();
        rad_nam = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        but_them = new javax.swing.JButton();
        but_sua = new javax.swing.JButton();
        but_xoa = new javax.swing.JButton();
        but_huy = new javax.swing.JButton();
        txt_sdt = new javax.swing.JTextField();
        txt_diaChi = new javax.swing.JTextField();
        txt_ten = new javax.swing.JTextField();
        txt_ma = new javax.swing.JTextField();
        lab_img = new javax.swing.JLabel();
        but_img = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rad_quanLy = new javax.swing.JRadioButton();
        rad_nhanVien = new javax.swing.JRadioButton();
        but_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_nhanVien = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhân viên"));

        jLabel7.setText("số điện thoại:");

        rad_nu.setBackground(new java.awt.Color(204, 255, 255));
        bgr_gioiTinh.add(rad_nu);
        rad_nu.setText("Nữ");

        rad_nam.setBackground(new java.awt.Color(204, 255, 255));
        bgr_gioiTinh.add(rad_nam);
        rad_nam.setSelected(true);
        rad_nam.setText("Nam");

        jLabel5.setText("Ngày sinh:");

        jLabel6.setText("Địa chỉ:");

        jLabel4.setText("Giới tính:");

        jLabel3.setText("Tên Nhân Viên:");

        jLabel1.setText("Mã NV:");

        but_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Add.png"))); // NOI18N
        but_them.setText("Thêm");
        but_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_themActionPerformed(evt);
            }
        });

        but_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Refresh.png"))); // NOI18N
        but_sua.setText("Sửa");
        but_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_suaActionPerformed(evt);
            }
        });

        but_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Trash.png"))); // NOI18N
        but_xoa.setText("Xóa");
        but_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_xoaActionPerformed(evt);
            }
        });

        but_huy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Delete.png"))); // NOI18N
        but_huy.setText("Hủy");
        but_huy.setEnabled(false);
        but_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_huyActionPerformed(evt);
            }
        });

        txt_ma.setEditable(false);
        txt_ma.setToolTipText("");

        lab_img.setBackground(new java.awt.Color(255, 255, 255));

        but_img.setText("Chọn ảnh");
        but_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_imgActionPerformed(evt);
            }
        });

        jLabel8.setText("Chức vụ:");

        rad_quanLy.setBackground(new java.awt.Color(204, 255, 255));
        bgr_chucVu.add(rad_quanLy);
        rad_quanLy.setText("Quản lý");

        rad_nhanVien.setBackground(new java.awt.Color(204, 255, 255));
        bgr_chucVu.add(rad_nhanVien);
        rad_nhanVien.setSelected(true);
        rad_nhanVien.setText("Nhân Viên");

        but_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Refresh.png"))); // NOI18N
        but_reset.setText("Reset mật khẩu");
        but_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(dtc_ngaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txt_diaChi)
                    .addComponent(txt_ten)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rad_nam)
                                .addGap(18, 18, 18)
                                .addComponent(rad_nu))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad_nhanVien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad_quanLy)))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lab_img, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(but_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(but_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(but_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(but_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(but_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(but_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(rad_quanLy)
                                    .addComponent(rad_nhanVien))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(but_them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(but_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(but_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(rad_nam)
                                .addComponent(rad_nu))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lab_img, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(dtc_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_xoa)
                    .addComponent(but_img))
                .addGap(18, 18, 18))
        );

        tab_nhanVien.setBackground(new java.awt.Color(204, 255, 255));
        tab_nhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tab_nhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_nhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_nhanVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void but_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_imgActionPerformed
        JFileChooser fc = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("All pic", "png", "jpg", "jpeg", "gif");

        fc.addChoosableFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);

        int n = fc.showOpenDialog(null);

        if (n == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fc.getSelectedFile();
                //Files.copy(Paths.get(file.getPath()), Paths.get(System.getProperty("user.dir") + "\\img\\" + "img.png"), StandardCopyOption.REPLACE_EXISTING);
                imagePath = file.getPath();
                ImageIcon icon = new ImageIcon(imagePath);
                lab_img.setIcon(icon);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_but_imgActionPerformed

    private void tab_nhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_nhanVienMouseClicked
        int row = tab_nhanVien.getSelectedRow();
        if (row != -1) {
            txt_ma.setText(tab_nhanVien.getValueAt(row, 0).toString());
            txt_ten.setText(tab_nhanVien.getValueAt(row, 1).toString());

            if (tab_nhanVien.getValueAt(row, 2).toString().equals("Nam")) {
                rad_nam.setSelected(true);
            } else {
                rad_nu.setSelected(true);
            }
            imagePath = System.getProperty("user.dir") + tab_nhanVien.getValueAt(row, 3);
            ImageIcon icon = new ImageIcon(imagePath);
            lab_img.setIcon(icon);
            String dt = tab_nhanVien.getValueAt(row, 4).toString();
            Date date = Date.valueOf(LocalDate.parse(dt));
            dtc_ngaySinh.setDate(date);
            txt_sdt.setText(tab_nhanVien.getValueAt(row, 5).toString());
            txt_diaChi.setText(tab_nhanVien.getValueAt(row, 6).toString());
            if (tab_nhanVien.getValueAt(row, 7).toString().equals("Quản lý")) {
                rad_quanLy.setSelected(true);
            } else {
                rad_nhanVien.setSelected(true);
            }
            rad_nhanVien.setVisible(!maNhanVien.equals(txt_ma.getText()));
        }
    }//GEN-LAST:event_tab_nhanVienMouseClicked

    private void but_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_resetActionPerformed
        int canhBao = JOptionPane.showConfirmDialog(this, "Bạn có muốn reset lại mật khẩu không ?", "RESET", JOptionPane.OK_CANCEL_OPTION);
        if (canhBao != 0) {
            return;
        }
        int row = tab_nhanVien.getSelectedRow();
        if (!tab_nhanVien.getValueAt(row, 0).toString().equals(txt_ma.getText())) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên và mã đã chọn ở bảng không trùng nhau!!!");
            return;
        }

        if (row != -1) {
            if (NhanVienDAO.resetPassword(tab_nhanVien.getValueAt(row, 0).toString())) {
                JOptionPane.showMessageDialog(this, "Reset mật khẩu thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Reset mật khẩu thất bại!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên!");
        }
    }//GEN-LAST:event_but_resetActionPerformed

    private void but_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_themActionPerformed
        tab_nhanVien.clearSelection();
        if (them) {
            if (!kiemTra()) {
                JOptionPane.showMessageDialog(this, "Thông tin đã nhập không hợp lệ!!");
                return;
            }
            int canhBao = JOptionPane.showConfirmDialog(this, "Bạn có muốn Thêm mới không ?", "ADD", JOptionPane.OK_CANCEL_OPTION);
            if (canhBao != 0) {
                return;
            }
            NhanVien nv = createNhanVien();
            if (NhanVienDAO.insert(nv)) {
                try {
                    Files.copy(Paths.get(imagePath), Paths.get(System.getProperty("user.dir") + nv.getImg()), StandardCopyOption.REPLACE_EXISTING);
                    imagePath = null;
                } catch (IOException ex) {
                    Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
            }
            cleanPanel();
            offThem(true);
            them = false;
            loadTable();
        } else {
            String ma;

            cleanPanel();
            offThem(false);
            them = true;
            if (tab_nhanVien.getRowCount() != 0) {
                ma = tab_nhanVien.getValueAt(tab_nhanVien.getRowCount() - 1, 0).toString();
            } else {
                ma = "NV000";
            }
            int max = chuyenSo(ma) + 1;
            txt_ma.setText(chuyenMa(max));

        }
    }//GEN-LAST:event_but_themActionPerformed

    private void but_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_huyActionPerformed
        cleanPanel();
        offThem(true);
        them = false;
    }//GEN-LAST:event_but_huyActionPerformed

    private void but_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_xoaActionPerformed
        int row = tab_nhanVien.getSelectedRow();
        if (row == -1) {
            return;
        }
        if(maNhanVien.equals(txt_ma.getText())){
            JOptionPane.showMessageDialog(this, "Bạn không thể xóa bản thân!!");
                return;
        }
        int canhBao = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa " + tab_nhanVien.getValueAt(row, 1) + " không ?", "Delete", JOptionPane.OK_CANCEL_OPTION);
        if (canhBao != 0) {
            return;
        }
        if (!txt_ma.getText().equals(tab_nhanVien.getValueAt(row, 0))) {
            JOptionPane.showMessageDialog(this,"Mã nhân viên được chọn không khớp với mã nhân viên text!!!");
            return;
        }
        if (!kiemTra()) {
                JOptionPane.showMessageDialog(this, "Thông tin đã nhập không hợp lệ!!");
                return;
            }
        
        String maNV = txt_ma.getText();
        if (NhanVienDAO.delete(maNV)) {
            tab_nhanVien.clearSelection();
            loadTable();
            cleanPanel();
            JOptionPane.showMessageDialog(this, "Xóa " + maNV + " thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Xóa " + maNV + " thất bại!");
            tab_nhanVien.clearSelection();
            loadTable();
            cleanPanel();
        }
    }//GEN-LAST:event_but_xoaActionPerformed

    private void but_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_suaActionPerformed
        if (!kiemTra()) {
            JOptionPane.showMessageDialog(this, "Thông tin đã nhập không hợp lệ!!");
            return;
        }
        int row = tab_nhanVien.getSelectedRow();
        if (row == -1) {
            return;
        }
        if (txt_ma.getText().isEmpty()) {
            return;
        }
        if (!txt_ma.getText().equals(tab_nhanVien.getValueAt(row, 0))) {
            JOptionPane.showMessageDialog(this,"Mã nhân viên được chọn không khớp với mã nhân viên text!!!");
            return;
        }
        int canhBao = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhập không ?", "Update", JOptionPane.OK_CANCEL_OPTION);
        if (canhBao != 0) {
            return;
        }
        NhanVien nv = createNhanVien();

        if (NhanVienDAO.update(nv)) {
            try {
                Files.copy(Paths.get(imagePath), Paths.get(System.getProperty("user.dir") + nv.getImg()), StandardCopyOption.REPLACE_EXISTING);

                imagePath = null;
            } catch (IOException ex) {
                Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Cập nhập thành công!\nNếu hình ảnh chưa cập nhập vui lòng tắt và mở lại chương trình :3");
            loadTable();
            cleanPanel();
            ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + nv.getImg());
            lab_img.setIcon(icon);
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhập thất bại!");
        }
    }//GEN-LAST:event_but_suaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgr_chucVu;
    private javax.swing.ButtonGroup bgr_gioiTinh;
    private javax.swing.JButton but_huy;
    private javax.swing.JButton but_img;
    private javax.swing.JButton but_reset;
    private javax.swing.JButton but_sua;
    private javax.swing.JButton but_them;
    private javax.swing.JButton but_xoa;
    private com.toedter.calendar.JDateChooser dtc_ngaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_img;
    private javax.swing.JRadioButton rad_nam;
    private javax.swing.JRadioButton rad_nhanVien;
    private javax.swing.JRadioButton rad_nu;
    private javax.swing.JRadioButton rad_quanLy;
    private javax.swing.JTable tab_nhanVien;
    private javax.swing.JTextField txt_diaChi;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}
