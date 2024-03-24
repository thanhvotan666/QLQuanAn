/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Luu;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author tanda
 */
public class LuuDAO {
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
    
    public static boolean insert(Luu luu){
        //MANV,matkhau,tenNV,gioitinh,img,ngaysinh,chucvu
        String sql = "insert into LUU values('"+luu.getMAB()+"','"+ luu.getMAMN()+"',"+luu.getSoLuong()+")";
        return updateData(sql,"Thêm thành công!","Thêm thất bại!");
    }
    
    public static boolean update(Luu luu){
        String sql = "update LUU "
                + "set soluong = "+luu.getSoLuong()+" "
                + "where MAMN = '"+luu.getMAMN()+"' "
                + "and MAB = '"+luu.getMAB()+"'";
        return updateData(sql,"Cập nhập thành công!","Cập nhập thất bại!");
    }
    
    public static boolean delete(Luu luu){
        String sql = "delete from LUU "
                + "where MAMN = '"+luu.getMAMN()+"' "
                + "and MAB = '"+luu.getMAB()+"'";
        return updateData(sql,"Xóa "+luu.getMAB()+", "+luu.getMAMN()+" thành công!","Xóa thất bại!");
    }
    public static boolean delete(String maB,String maMN){
        String sql = "delete from LUU "
                + "where MAMN = '"+maMN+"' "
                + "and MAB = '"+maB+"'";
        return updateData(sql,"Xóa thành công!","Xóa thất bại!");
    }
        public static boolean delete(String maB){
        String sql = "delete from LUU "
                + "where MAB = '"+maB+"'";
        return updateData(sql,"Xóa thành công!","Xóa thất bại!");
    }
    
    public static void selectBan(ArrayList<Luu> list,String maB) {
        String sql = "select * from LUU where MAB = '"+maB+"'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Luu luu = new Luu(rs.getString(1), rs.getString(2), rs.getInt(3));
                list.add(luu);
            }
            con.close();
        } catch (Exception e) {
        }
    }
    
}
