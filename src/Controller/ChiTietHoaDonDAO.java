package Controller;


import Model.ChiTietHoaDon;
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
public class ChiTietHoaDonDAO {
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
            b = false;
        }
        return b;
    }
    
    public static boolean insert(ChiTietHoaDon cthd){
        String sql = "insert into CHITIETHOADON values('"+cthd.getMACTHD()+"','"+cthd.getMAHD()+"','"+cthd.getMAMN()+"',"+cthd.getSoLuong()+","+cthd.getTongTien()+")";
        return updateData(sql,"Thêm chi tiết hóa đơn thành công!","Thêm chi tiết hóa đơn thất bại!");
    }
    
    public static boolean delete(ChiTietHoaDon cthd){
        String sql = "delete from CHITIETHOADON where MACTHD = '"+cthd.getMACTHD()+"'";
        boolean deleteCTHD = updateData(sql,"Xóa chi tiết hóa đơn thành công!","Xóa chi tiết hóa đơn thất bại!");
        boolean b = true;
        if(HoaDonDAO.selectIsEmpty(cthd.getMAHD())){
            HoaDonDAO.deleteHoaDon(cthd.getMAHD());
        }else{
            b = HoaDonDAO.updateThanhTien(cthd.getMAHD(), cthd.getTongTien());
        }
        return deleteCTHD && b;
    }
    
    public static boolean delete(String maHD){
        String sql = "delete from CHITIETHOADON where MAHD = '"+maHD+"'";
        return updateData(sql,"Xóa chi tiết hóa đơn thành công!","Xóa chi tiết hóa đơn thất bại!");
    }
    
    public static void selectAll(ArrayList<ChiTietHoaDon> list){
        String sql = "select * from CHITIETHOADON";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ChiTietHoaDon cthd = new ChiTietHoaDon(rs.getString(1),rs.getString(2),rs.getString(3),Integer.valueOf(rs.getString(4)) ,Double.valueOf(rs.getString(5)));
                list.add(cthd);
            }
            con.close();
        } catch (Exception e) {
        }
    }
    
    public static void selectMaHoaDon(ArrayList<ChiTietHoaDon> list,String ma){
        String sql = "select * from CHITIETHOADON where MAHD = '"+ma+"'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ChiTietHoaDon cthd = new ChiTietHoaDon(rs.getString(1),rs.getString(2),rs.getString(3),Integer.valueOf(rs.getString(4)) ,Double.valueOf(rs.getString(5)));
                list.add(cthd);
            }
            con.close();
        } catch (Exception e) {
        }
    }
    
    public static String selectCTHDnew(){
        String ma ="CTHD000000";
        String sql = "select top 1 * from CHITIETHOADON order by MACTHD desc";
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
        }
        return ma;
    }
    
    
}
