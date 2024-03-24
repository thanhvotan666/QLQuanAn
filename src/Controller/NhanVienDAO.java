/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author tanda
 */
public class NhanVienDAO {
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
    public static boolean insert(NhanVien nv){
        //MANV,matkhau,tenNV,gioitinh,img,ngaysinh,chucvu
        String sql = "insert into NHANVIEN values("
                + "'"+nv.getMANV()+"','"+nv.getMatKhau()+"',"
                + "N'"+nv.getTenNV()+"','"+nv.getGioiTinh()+"',"
                + "N'"+nv.getImg()+"','"+nv.getNgaysinh()+"',"
                + "'"+nv.getSdt()+"',N'"+nv.getDiachi()+"',"
                + "'"+nv.getChucvu()+"')";
        return updateData(sql,"Thêm thành công!","Thêm thất bại!");
    }
    
    public static boolean resetPassword(String MANV){
        String sql = "update NHANVIEN "
                + "set matkhau = '123456' "
                + "where MANV = '"+MANV+"' ";
        return updateData(sql,"Cập nhập thành công!","Cập nhập thất bại!");
    }
    public static boolean doiPassword(String MANV,String mk){
        String sql = "update NHANVIEN "
                + "set matkhau = '"+mk+"' "
                + "where MANV = '"+MANV+"' ";
        return updateData(sql,"Cập nhập thành công!","Cập nhập thất bại!");
    }
    
    public static boolean update(NhanVien nv){
        String sql = "update NHANVIEN "
                + "set tenNV = N'"+nv.getTenNV()+"' "
                + ", gioitinh = '"+nv.getGioiTinh()+"' "
                + ", img = N'"+nv.getImg()+"' "
                + ", ngaysinh = '"+nv.getNgaysinh()+"' "
                + ", sdt = '"+nv.getSdt()+"' "
                + ", diachi = N'"+nv.getDiachi()+"' "
                + ", chucvu = '"+nv.getChucvu()+"' "
                + "where MANV = '"+nv.getMANV()+"' ";
        return updateData(sql,"Cập nhập thành công!","Cập nhập thất bại!");
    }
    
    public static boolean delete(String MANV){
        String sql = "delete from NHANVIEN where MANV = '"+MANV+"'";
        boolean updateHoaDon =  HoaDonDAO.updateNhanVien000(MANV);
        return updateData(sql,"Xóa "+MANV+" thành công!","Xóa "+MANV+" thất bại!");
    }
    public static void selectAll( ArrayList<NhanVien> list){
        String sql = "select * from NHANVIEN where not MANV = 'NV000'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),rs.getString(6),
                        rs.getString(7),rs.getString(8),rs.getString(9));
                list.add(nv);
            }
            con.close();
        } 
        catch (Exception e) {
        }
    }
    
    public static String selectTen( String ma){
        String ten = "";
        String sql = "select * from NHANVIEN where MANV = '"+ma+"'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ten = rs.getString(3);
            }
            con.close();
        } 
        catch (Exception e) {
        }
        return ten;
    }
    
    public static boolean selectFind(ArrayList<NhanVien> list,String MANV,String matKhau){
        boolean b = false;
        String sql = "select * from NHANVIEN where MANV = '"+MANV+"' and matkhau = '"+matKhau+"'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
                list.add(nv);
                b = true;
                break;
            }
            con.close();
        } catch (Exception e) {
        }
        return b;
    }
}
