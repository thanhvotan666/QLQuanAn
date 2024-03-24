package Controller;

import Model.HoaDon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tanda
 */
public class HoaDonDAO {

    private static String user = "sa";
    private static String pass = "kuro";
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName = QLQA;integratedSecurity=true;trustServerCertificate=true";

    private static boolean updateData(String sql, String thanhCong, String thatBai) {
        boolean b = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            if (st.executeUpdate(sql) != 0) {
                System.out.println(thanhCong);
                b = true;
            } else {
                System.out.println(thatBai);
                b = false;
            }
            con.close();
        } catch (Exception e) {
            b = false;
        }
        return b;
    }

    public static boolean insert(HoaDon hd) {
        String sql = "insert into HOADON values('" + hd.getMAHD()+ "','" + hd.getNgayLap() + "'," + hd.getThanhTien() + ",'" + hd.getMAB() + "','" + hd.getMANV() + "')";
        return updateData(sql, "Thêm hóa đơn thành công!", "Thêm hóa đơn thất bại!");
    }

    public static boolean updateThanhTien(String ma, double tongTien) {
        String sql = "update HOADON set thanhtien = thanhtien - " + tongTien + " where MAHD = '" + ma + "'";
        return updateData(sql, "Cập nhập hóa đơn thành công!", "Cập nhập hóa đơn thất bại!");
    }

    public static boolean updateNhanVien000(String maNV) {
        String sql = "update HOADON set MANV = 'NV000'  where MANV = '" + maNV + "'";
        return updateData(sql, "", "");
    }

    public static boolean updateBan000(String maB) {
        String sql = "update HOADON set MAB = 'B000'  where MAB = '" + maB + "'";
        return updateData(sql, "", "");
    }

    public static boolean deleteHoaDon(String ma) {
        String sql = "delete from HOADON where MAHD = '" + ma + "'";
        return updateData(sql, "Xóa hóa đơn thành công!", "Xóa  hóa đơn thất bại!");
    }

    public static boolean delete(String ma) {
        boolean deleteCTHD = ChiTietHoaDonDAO.delete(ma);
        String sql = "delete from HOADON where MAHD = '" + ma + "'";
        boolean deleteHoaDon = updateData(sql, "Xóa hóa đơn thành công!", "Xóa  hóa đơn thất bại!");
        return deleteHoaDon;
    }

    public static void selectAll(ArrayList<HoaDon> list) {
        String sql = "select * from HOADON";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), Double.valueOf(rs.getString(3)), rs.getString(4), rs.getString(5));
                list.add(hd);
            }
            con.close();
        } catch (Exception e) {
        }
    }

    public static void selectThang(ArrayList<HoaDon> list, String thang, int soNgay) {
        String sql = "select * from HOADON where ngaylap between '" + thang + "-01' and '" + thang + "-" + soNgay + "'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), Double.valueOf(rs.getString(3)), rs.getString(4), rs.getString(5));
                list.add(hd);
            }
            con.close();
        } catch (Exception e) {
        }
    }

    public static void selectNgay(ArrayList<HoaDon> list, String ngay) {
        String sql = "select * from HOADON where ngaylap = '" + ngay + "'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), Double.valueOf(rs.getString(3)), rs.getString(4), rs.getString(5));
                list.add(hd);
            }
            con.close();
        } catch (Exception e) {
        }
    }

    public static void selectNgay(ArrayList<HoaDon> list, String ngayBD,String ngayKT) {
        String sql = "select * from HOADON where ngaylap between '" + ngayBD + "' and '"+ngayKT+"'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), Double.valueOf(rs.getString(3)), rs.getString(4), rs.getString(5));
                list.add(hd);
            }
            con.close();
        } catch (Exception e) {
        }
    }

    public static boolean selectIsEmpty(String ma) {
        boolean b = true;
        String sql = "select * from CHITIETHOADON where MAHD = '" + ma + "'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                b = false;
                break;
            }
            con.close();
        } catch (Exception e) {
        }
        return b;
    }

    public static String selectNgayLauNhat() {
        String ngay = "";
        String sql = "select top 1 * from HOADON ORDER BY MAHD";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ngay = rs.getString(2);
            }
            con.close();
        } catch (Exception e) {
        }
        return ngay;
    }
    public static String selectMaMoiNhat() {
        String ma = "";
        String sql = "select top 1 * from HOADON ORDER BY MAHD desc";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ma = rs.getString(1);
            }
            con.close();
        } catch (Exception e) {
        }
        return ma;
    }

}
