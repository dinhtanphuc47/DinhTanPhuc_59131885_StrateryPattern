/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author admin
 */
public class Main3 {
    public static void main(String[] args) throws ParseException {
        QLSV qlsv = new QLSV();
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("Dinh Tan Phuc", formaterDate.parse("1/2/1999") , 8);
        SinhVien sv2 = new SinhVien("Ngo Ba KHa", formaterDate.parse("1/3/1888"), 9);

        //them sinh vien
        qlsv.themSinhVien(sv1);
        qlsv.themSinhVien(sv2);
        System.out.println("Danh sach sinh vien\n");
        qlsv.inDS();
        //sap xep theo ten
        SoSanhTheoTen theoTen = new SoSanhTheoTen();
        qlsv.sapXep();
        System.out.println("\n" + "Sap xep theo ten");
        qlsv.inDS();
        //sap xep theo diem
        SoSanhTheoDiem theoDiem = new SoSanhTheoDiem();
        qlsv.sapXep();
        System.out.println("\n" + "Sap xep theo diem");
        qlsv.inDS();
        
        
    }
}
