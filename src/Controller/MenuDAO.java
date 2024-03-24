/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Menu;
import Model.MenuTongThu;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author tanda
 */
public class MenuDAO {
    private static String user = "sa";
    private static String pass = "kuro";
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName = QLQA;integratedSecurity=true;trustServerCertificate=true";
    
    private static boolean updateData(String sql,String thanhCong,String thatBai){
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
            System.out.println("Kết nối thất bại!");
            b = false;
        }
        return b;
    }
    
    public static boolean insert(Menu menu){
        //MANV,matkhau,tenNV,gioitinh,img,ngaysinh,chucvu
        String sql = "insert into MENU values('"+menu.getMAMN()+"',N'"+menu.getTenMon()+"',"+menu.getGia()+",N'"+menu.getLoai()+"','"+menu.getTinhtrang()+"')";
        return updateData(sql,"Thêm thành công!","Thêm thất bại!");
    }
    
    public static boolean update(Menu menu){
        String sql = "update MENU "
                + "set tenmon = N'"+menu.getTenMon()+"' "
                + ", gia = "+menu.getGia()+" "
                + ", loai = N'"+menu.getLoai()+"' "
                + ", tinhtrang = '"+menu.getTinhtrang()+"' "
                + "where MAMN = '"+menu.getMAMN()+"' ";
        return updateData(sql,"Cập nhập thành công!","Cập nhập thất bại!");
    }
    
    public static boolean updateTinhTrang(String MAMN,String tinhTrang){
        int tc = 0;
        if(tinhTrang.equals("Còn")){
            tc = 1;
        }
        String sql = "update MENU "
                + "set tinhtrang = '"+tc+"' "
                + "where MAMN = '"+MAMN+"' ";
        return updateData(sql,"Cập nhập thành công!","Cập nhập thất bại!");
    }
    
    public static boolean delete(String MAMN){
        String sql = "delete from LUU where MAB = '" + MAMN + "'";
        if (updateData(sql, "Xóa "+MAMN+" đã lưu thành công!", "Xóa "+MAMN+" đã lưu thất bại!")) {
        }
        sql = "update CHITIETHOADON set MAMN = 'MN000' where MAMN = '"+MAMN+"'";
        if (updateData(sql, "Cập nhập "+MAMN+" đã lưu thành công!", "Cập nhập "+MAMN+" đã lưu thất bại!")) {
        }
        sql = "delete from MENU where MAMN = '"+MAMN+"'";
        return updateData(sql,"Xóa thành công!","Xóa thất bại!");
    }
    
    public static void selectAll(ArrayList<Menu> list){
        String sql = "select * from MENU where not MAMN = 'MN000' ORDER BY loai, MAMN";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Menu menu = new Menu(rs.getString(1),rs.getString(2),Double.valueOf(rs.getString(3)),rs.getString(4),rs.getString(5));
                list.add(menu);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
        }
    }
    public static void selectFull(ArrayList<Menu> list){
        String sql = "select * from MENU ORDER BY MAMN";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Menu menu = new Menu(rs.getString(1),rs.getString(2),Double.valueOf(rs.getString(3)),rs.getString(4),rs.getString(5));
                list.add(menu);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
        }
    }
    public static void selectTongThang(ArrayList<MenuTongThu> list,String sThang,int soNgay) {
        String sql = "select MENU.MAMN as mamn, "
                + "sum(soluong) as soluong, "
                + "SUM(tongtien) as tongtien "
                + "from ((CHITIETHOADON FULL OUTER JOIN MENU on CHITIETHOADON.MAMN = MENU.MAMN) "
                + "join HOADON on CHITIETHOADON.MAHD = HOADON.MAHD) "
                + "where ngaylap between '" + sThang + "-01' and '" + sThang + "-" + soNgay + "' "
                + "group by MENU.MAMN "
                + "ORDER BY mamn";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                MenuTongThu mn = new MenuTongThu(rs.getString(1), Integer.valueOf(rs.getString(2)), rs.getLong(3));
                list.add(mn);
            }
            con.close();
        } catch (Exception e) {
        }
    }
    public static void selectTongNgay(ArrayList<MenuTongThu> list,String sNgay) {
        String sql = "select MENU.MAMN as mamn, "
                + "sum(soluong) as soluong, "
                + "SUM(tongtien) as tongtien "
                + "from ((CHITIETHOADON FULL OUTER JOIN MENU on CHITIETHOADON.MAMN = MENU.MAMN) "
                + "join HOADON on CHITIETHOADON.MAHD = HOADON.MAHD) "
                + "where ngaylap ='"+sNgay+"' "
                + "group by MENU.MAMN "
                + "ORDER BY mamn";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                MenuTongThu mn = new MenuTongThu(rs.getString(1), Integer.valueOf(rs.getString(2)), rs.getLong(3));
                list.add(mn);
            }
            con.close();
        } catch (Exception e) {
        }

    }
    
    public static void selectLoai(ArrayList<Menu> list,String loai){
        String sql = "select * from MENU where loai = N'"+loai+"' and tinhtrang = 1";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Menu menu = new Menu(rs.getString(1),rs.getString(2),Double.valueOf(rs.getString(3)),rs.getString(4),rs.getString(5));
                list.add(menu);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
        }
    }
    public static String selectMaMoiNhat(){
        String ma = "MN000";
        String sql = "select top 1 * from MENU where not MAMN = 'MN000' ORDER BY MAMN DESC";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                    ma = rs.getString(1);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
        }
        return ma;
    }
    public static String selectTen(String ma){
        String ten = "";
        String sql = "select * from MENU where MAMN = '"+ma+"'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                    ten = rs.getString(2);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
        }
        return ten;
    }
    public static double selectGia(String ma){
        double gia = 0;
        String sql = "select * from MENU where MAMN = '"+ma+"'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                    gia = Double.valueOf(rs.getString(3)) ;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
        }
        return gia;
    }
    
    /*public static void selectConBan(ArrayList<Menu> list){
        String sql = "select * from MENU";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(rs.getBoolean(5)){
                    Menu menu = new Menu(rs.getString(1),rs.getString(2),rs.getString(3),Double.valueOf(rs.getString(4)),rs.getString(5));
                    list.add(menu);
                }
            }
            con.close();
        } catch (Exception e) {
    System.out.println("Kết nối thất bại!");
        }
    }*/
    
}


