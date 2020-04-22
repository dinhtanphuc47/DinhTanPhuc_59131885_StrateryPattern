/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String hoTen;
    private LocalDate ngaySinh;
    private float DiemTrungBinh;

    public SinhVien() {
    }
       
    public SinhVien(String hoTen, LocalDate ngaySinh, float getDiemTrungBinh) {
        this.hoTen = hoTen;
        this.DiemTrungBinh = getDiemTrungBinh;
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    
    public String getTTSV() {
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyy");
        return "Họ tên: " + this.hoTen + ", ngày sinh: " + formaterDate.format(this.ngaySinh) + ", điểm trung bình: " + this.DiemTrungBinh;
    }

}
