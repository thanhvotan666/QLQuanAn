/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BanDAO;
import Controller.HoaDonDAO;
import Controller.MenuDAO;
import Controller.NhanVienDAO;
import Model.HoaDon;
import Model.Menu;
import Model.MenuTongThu;
import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanda
 */
public class ThongKe extends javax.swing.JPanel {

    ArrayList<HoaDon> listHoaDon = new ArrayList<>();
    DefaultTableModel mTableHoaDon;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    ArrayList<Menu> listMenu = new ArrayList<>();
    ArrayList<MenuTongThu> listTong = new ArrayList<>();
    DefaultTableModel mTableMenu;

    /**
     * Creates new form ThongKe
     */
    public ThongKe(boolean b) {
        initComponents();
        loadComboBox();
        createTable();
        loadListMenu();
        if (b) {
            //Thang truoc
            cbb_thang.setSelectedIndex(cbb_thang.getItemCount() - 2);
        } else {
            rad_ngay.setSelected(true);
            LocalDate toDay = LocalDate.now();
            int day = toDay.getDayOfMonth();
            if (day == 1) {
                cbb_thang.setSelectedIndex(cbb_thang.getItemCount() - 2);
                cbb_ngay.setSelectedIndex(soNgayTrongThang(cbb_thang.getSelectedItem().toString()));
            } else {
                cbb_thang.setSelectedIndex(cbb_thang.getItemCount() - 1);
                cbb_ngay.setSelectedIndex(day-2);
            }
        }
        LoadTXA();
    }

    void loadListMenu() {
        MenuDAO.selectFull(listMenu);
    }

    void loadComboBox() {
        String ngayLauNhat = HoaDonDAO.selectNgayLauNhat();
        String thang = ngayLauNhat.substring(0, 7);
        LocalDate toDay = LocalDate.now();
        LocalDate date = LocalDate.parse(thang + "-01");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        while (date.isBefore(toDay)) {
            cbb_thang.addItem(thang);
            date = date.plusMonths(1);
            thang = formatter.format(date);
        }
    }

    void createTable() {
        String[] heard1 = {"Mã hóa đơn", "ngày lập", "Thành tiền", "Bàn", "Nhân viên"};
        mTableHoaDon = new DefaultTableModel(null, heard1) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        table.setModel(mTableHoaDon);
        String[] heard2 = {"Mã menu", "Tên món", "Giá", "Số lượng", "Tổng tiền"};
        mTableMenu = new DefaultTableModel(null, heard2) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
    }

    String add5space(String s) {
        int len = s.length();
        String a = s;
        for (int i = 0; i < 5 - len; i++) {
            a += " ";
        }
        return a;
    }

    String add10space(String s) {
        int len = s.length();
        String a = s;
        for (int i = 0; i < 10 - len; i++) {
            a += " ";
        }
        return a;
    }

    String add15space(String s) {
        int len = s.length();
        String a = s;
        for (int i = 0; i < 15 - len; i++) {
            a += " ";
        }
        return a;
    }

    String add20space(String s) {
        int len = s.length();
        String a = s;
        for (int i = 0; i < 20 - len; i++) {
            a += " ";
        }
        return a;
    }

    String add30space(String s) {
        int len = s.length();
        String a = s;
        for (int i = 0; i < 30 - len; i++) {
            a += " ";
        }
        return a;
    }

    String add40space(String s) {
        int len = s.length();
        String a = s;
        for (int i = 0; i < 40 - len; i++) {
            a += " ";
        }
        return a;
    }

    String add60space(String s) {
        int len = s.length();
        String a = s;
        for (int i = 0; i < 60 - len; i++) {
            a += " ";
        }
        return a;
    }

    void addRowTableHoaDon(ArrayList<HoaDon> list) {
        while (mTableHoaDon.getRowCount() != 0) {
            mTableHoaDon.removeRow(0);
        }
        for (HoaDon hoaDon : list) {
            Vector v = new Vector();
            v.add(hoaDon.getMAHD());
            v.add(hoaDon.getNgayLap().substring(0, 10));
            v.add(hoaDon.getThanhTien());
            v.add(BanDAO.selectTen(hoaDon.getMAB()));
            v.add(NhanVienDAO.selectTen(hoaDon.getMANV()));
            mTableHoaDon.addRow(v);
        }
    }

    void addRowTableMenu(ArrayList<MenuTongThu> lTong) {
        while (mTableMenu.getRowCount() != 0) {
            mTableMenu.removeRow(0);
        }
        for (Menu menu : listMenu) {
            Vector v = new Vector();
            v.add(menu.getMAMN());
            v.add(menu.getTenMon());
            v.add(menu.getGia());
            boolean khongCo = true;
            for (int i = 0; i < lTong.size(); i++) {
                if (menu.getMAMN().equals(lTong.get(i).getMAMN())) {
                    v.add(lTong.get(i).getSoLuongBan());
                    v.add(lTong.get(i).getTongThu());
                    khongCo = false;
                    break;
                }
            }
            if (khongCo) {
                v.add(0);
                v.add(0);
            }
            mTableMenu.addRow(v);
        }
    }

    int soNgayTrongThang(int nam, int thang) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (nam % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return 0;
    }

    int soNgayTrongThang(String sThang) {
        int nam = Integer.valueOf(sThang.substring(0, 4));
        int thang = Integer.valueOf(sThang.substring(5));
        return soNgayTrongThang(nam, thang);
    }

    void mess(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    String addZeroDay(String d) {
        if (d.length() == 1) {
            return "0" + d;
        }
        return d;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cbb_ngay = new javax.swing.JComboBox<>();
        cbb_thang = new javax.swing.JComboBox<>();
        rad_thang = new javax.swing.JRadioButton();
        rad_ngay = new javax.swing.JRadioButton();
        but_showHoaDon = new javax.swing.JButton();
        but_showThucDon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        but_Xuat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_thongTin = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cbb_thang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_thangActionPerformed(evt);
            }
        });

        buttonGroup1.add(rad_thang);
        rad_thang.setSelected(true);
        rad_thang.setText("Thống kê tháng:");

        buttonGroup1.add(rad_ngay);
        rad_ngay.setText("Thống kê ngày:");

        but_showHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Clipboard.png"))); // NOI18N
        but_showHoaDon.setText("Show hóa đơn");
        but_showHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_showHoaDonActionPerformed(evt);
            }
        });

        but_showThucDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Clipboard.png"))); // NOI18N
        but_showThucDon.setText("Show thực đơn");
        but_showThucDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_showThucDonActionPerformed(evt);
            }
        });

        jLabel1.setText("Thông tin:");

        but_Xuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Document.png"))); // NOI18N
        but_Xuat.setText("Xuất File");
        but_Xuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_XuatActionPerformed(evt);
            }
        });

        txa_thongTin.setColumns(20);
        txa_thongTin.setRows(5);
        jScrollPane2.setViewportView(txa_thongTin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_ngay)
                            .addComponent(rad_thang))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbb_thang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(409, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(but_showHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(but_showThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(but_Xuat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad_thang))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad_ngay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_showHoaDon)
                    .addComponent(but_showThucDon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_Xuat)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbb_thangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_thangActionPerformed
        cbb_ngay.removeAllItems();
        int nam = Integer.valueOf(cbb_thang.getSelectedItem().toString().substring(0, 4));
        int thang = Integer.valueOf(cbb_thang.getSelectedItem().toString().substring(5));
        int soNgay = soNgayTrongThang(nam, thang);
        for (int i = 1; i <= soNgay; i++) {
            cbb_ngay.addItem(i + "");
        }
    }//GEN-LAST:event_cbb_thangActionPerformed

    void loadListHDvaTong() {
        listTong.clear();
        listHoaDon.clear();
        String sThang = cbb_thang.getSelectedItem().toString();
        String day = sThang + "-" + addZeroDay(cbb_ngay.getSelectedItem().toString());
        if (rad_thang.isSelected()) {
            HoaDonDAO.selectThang(listHoaDon, sThang, soNgayTrongThang(sThang));
            MenuDAO.selectTongThang(listTong, sThang, soNgayTrongThang(sThang));
        } else {
            HoaDonDAO.selectNgay(listHoaDon, day);
            MenuDAO.selectTongNgay(listTong, day);
        }
    }

    void LoadTXA() {
        loadListHDvaTong();
        addRowTableMenu(listTong);
        addRowTableHoaDon(listHoaDon);
        showTXA();
    }

    private void but_showHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_showHoaDonActionPerformed
        table.setModel(mTableHoaDon);
        table.getColumnModel().getColumn(4).setPreferredWidth(180);
        LoadTXA();
    }//GEN-LAST:event_but_showHoaDonActionPerformed

    private void but_showThucDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_showThucDonActionPerformed
        table.setModel(mTableMenu);
        LoadTXA();
    }//GEN-LAST:event_but_showThucDonActionPerformed

    long tongTienThu() {
        long tong = 0;
        for (MenuTongThu m : listTong) {
            tong += m.getTongThu();
        }
        return tong;
    }

    int tongSoLuong() {
        int tong = 0;
        for (MenuTongThu m : listTong) {
            tong += m.getSoLuongBan();
        }
        return tong;
    }

    void showTXA() {
        String s = "\tTHỐNG KÊ HÓA ĐƠN ";
        String sThang = cbb_thang.getSelectedItem().toString();
        if (rad_thang.isSelected()) {
            s += sThang + "\n";
        } else {
            String day = sThang + "-" + addZeroDay(cbb_ngay.getSelectedItem().toString());
            s += day + "\n";
        }
        s += add40space("Tổng số hóa đơn:") + listHoaDon.size() + "\n\n";
        s += add30space("Tên món") + add10space("Số lượng") + "Tiền\n";
        for (int i = 1; i < mTableMenu.getRowCount(); i++) {
            if (Integer.valueOf(mTableMenu.getValueAt(i, 3).toString()) != 0) {
                s += add30space(mTableMenu.getValueAt(i, 1).toString())
                        + add10space(mTableMenu.getValueAt(i, 3).toString())
                        + mTableMenu.getValueAt(i, 4).toString() + "\n";
            }
        }
        s += add40space("Nguồn khác") + mTableMenu.getValueAt(0, 4).toString() + "\n";
        s +="-----------------------------------------------------\n";
        s += add30space("Tổng:") + add10space(tongSoLuong() + "") + tongTienThu();
        txa_thongTin.setText(s);
    }

    private void but_XuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_XuatActionPerformed
        if (txa_thongTin.getText().isEmpty()) {
            mess("Không có gì để xuất!!!");
            return;
        }
        LocalDateTime toDay = LocalDateTime.now();
        String time = toDay.format(formatter);
        String time2 = toDay.format(formatter2);
        String s = txa_thongTin.getText();
        try {
            File fname = new File("ThongKe\\" + time2 + ".txt");
            if (fname.createNewFile()) {
                mess("Xuất thành công: " + time2 + ".txt\n"
                        + "Full path: " + System.getProperty("user.dir") + "\\ThongKe\\" + time2 + ".txt");
            } else {
                System.out.println("File already exists.");
            }
            PrintWriter pw = new PrintWriter(fname);
            pw.write(s);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_but_XuatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_Xuat;
    private javax.swing.JButton but_showHoaDon;
    private javax.swing.JButton but_showThucDon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbb_ngay;
    private javax.swing.JComboBox<String> cbb_thang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rad_ngay;
    private javax.swing.JRadioButton rad_thang;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txa_thongTin;
    // End of variables declaration//GEN-END:variables

}
