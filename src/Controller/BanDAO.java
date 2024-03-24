/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ban;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author tanda
 */
public class BanDAO {

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

    public static boolean insert(Ban ban) {
        String sql = "insert into BAN(MAB,tenban) values('" + ban.getMAB() + "',N'" + ban.getTenBan() + "')";
        return updateData(sql, "Thêm thành công!", "Thêm thất bại!");
    }

    public static boolean updateTen(Ban ban) {
        String sql = "update BAN set tenban = N'" + ban.getMAB() + "' where MAB = '" + ban.getMAB() + "'";
        return updateData(sql, "Cập nhập thành công!", "Cập nhập thất bại!");
    }

    public static boolean updateTinhTrang(Ban ban) {
        String sql = "update BAN set tinhtrang = '" + ban.getTinhTrang() + "' where MAB = '" + ban.getMAB() + "'";
        return updateData(sql, "Cập nhập thành công!", "Cập nhập thất bại!");
    }

    public static boolean updateTinhTrangCon(Ban ban) {
        String sql = "update BAN set tinhtrang = '1' where MAB = '" + ban.getMAB() + "'";
        return updateData(sql, "Cập nhập thành công!", "Cập nhập thất bại!");
    }

    public static boolean updateTinhTrangCon(String ma) {
        String sql = "update BAN set tinhtrang = '1' where MAB = '" + ma + "'";
        return updateData(sql, "Cập nhập tình trạng thành công!", "Cập nhập tình trạng thất bại!");
    }

    public static boolean updateTinhTrangHet(String ma) {
        String sql = "update BAN set tinhtrang = '0' where MAB = '" + ma + "'";
        return updateData(sql, "Cập nhập thành công!", "Cập nhập thất bại!");
    }

    public static boolean updateTinhTrangHet(Ban ban) {
        String sql = "update BAN set tinhtrang = '0' where MAB = '" + ban.getMAB() + "'";
        return updateData(sql, "Cập nhập thành công!", "Cập nhập thất bại!");
    }

    public static boolean delete(String ma) {
        if (HoaDonDAO.updateBan000(ma)) {
        }
        String sql = "delete from LUU where MAB = '" + ma + "'";
        if (updateData(sql, "", "")) {
        }
        sql = "delete from BAN where MAB = '" + ma + "'";
        return updateData(sql, "Xóa bàn " + ma + " thành công!", "Xóa " + ma + " thất bại!");
    }

    public static String selectTen(String ma) {
        String s = "";
        String sql = "select * from BAN where MAB = '" + ma + "'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                s = rs.getString(2);
            }
            con.close();
        } catch (Exception e) {
        }
        return s;
    }

    public static void selectAll(ArrayList<Ban> list) {
        String sql = "select * from BAN where MAB != 'B000'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Ban ban = new Ban(rs.getString(1), rs.getString(2), rs.getString(3));
                list.add(ban);
            }
            con.close();
        } catch (Exception e) {
        }
    }

}
