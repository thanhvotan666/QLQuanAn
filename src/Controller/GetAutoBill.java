/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChiTietHoaDon;
import Model.HoaDon;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tanda
 */
public class GetAutoBill {

    static ArrayList<String> listHoaDon = new ArrayList<>();
    static ArrayList<ChiTietHoaDon> listCTHD = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    static String addZero(int a) {
        if (a < 10) {
            return "00" + a;
        } else if (a < 100) {
            return "0" + a;
        } else {
            return "" + a;
        }
    }

    static String add6Zero(int a) {
        if (a < 10) {
            return "00000" + a;
        } else if (a < 100) {
            return "0000" + a;
        } else if (a < 1000) {
            return "000" + a;
        } else if (a < 10000) {
            return "00" + a;
        } else if (a < 100000) {
            return "0" + a;
        } else {
            return "" + a;
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        LocalDate toDay = LocalDate.now();
        int maHDmax = 0;
        int maCTHDmax = 0;
        for (int i = 1; i <= 70; i++) {
            int soHDOfDay = 1 + rd.nextInt(5);

            for (int d = 0; d < soHDOfDay; d++) {
                maHDmax++;
                String maHD = "HD" + addZero(maHDmax);
                String ngayLap = formatter.format(toDay.minusDays(70 - i));
                double thanhTien = 0;
                String maB = "B" + addZero(1 + rd.nextInt(10));
                String maNV = "NV" + addZero(1 + rd.nextInt(6));
//
                int soCTHD = 1 + rd.nextInt(3);
                listCTHD.clear();
                for (int j = 1; j <= soCTHD; j++) {
                    maCTHDmax++;
                    String maCTHD = "CTHD" + add6Zero(maCTHDmax);
                    String maMN;
                    if (j == 1) {
                        maMN = "MN" + addZero(1 + rd.nextInt(7));
                    } else if (j == 2) {
                        maMN = "MN" + addZero(8 + rd.nextInt(9));
                    } else {
                        maMN = "MN" + addZero(17 + rd.nextInt(7));
                    }
                    int sl = 1 + rd.nextInt(3);
                    double gia = MenuDAO.selectGia(maMN);
                    double tongTien = gia * sl;
                    ChiTietHoaDon cthd = new ChiTietHoaDon(maCTHD, maHD, maMN, sl, tongTien);
                    listCTHD.add(cthd);
                    thanhTien += tongTien;
                }

                HoaDon hd = new HoaDon(maHD, ngayLap, thanhTien, maB, maNV);
                System.out.println("insert into HOADON values('" + hd.getMAHD() + "','" + hd.getNgayLap() + "'," + hd.getThanhTien() + ",'" + hd.getMAB() + "','" + hd.getMANV() + "');");

                for (int j = 0; j < listCTHD.size(); j++) {
                    System.out.println("insert into CHITIETHOADON values('" + listCTHD.get(j).getMACTHD()+ "','" + listCTHD.get(j).getMAHD() + "','" + listCTHD.get(j).getMAMN() + "'," + listCTHD.get(j).getSoLuong() + "," + listCTHD.get(j).getTongTien() + ");");
                }
                System.out.println("-------------------------------------");
            }

        }

    }
}
