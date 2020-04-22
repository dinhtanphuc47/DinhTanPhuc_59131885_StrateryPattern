/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author admin
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
            return 1;
        }
        if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
            return -1;
        }
        return 0;
    }
}
