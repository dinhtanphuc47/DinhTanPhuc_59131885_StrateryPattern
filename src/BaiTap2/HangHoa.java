/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author admin
 */
    public class HangHoa {
        String tenHangHoa;
        int gia;
        String moTa;
        public HangHoa(String tenHangHoa, String moTa, int gia) {
        this.tenHangHoa = tenHangHoa;
        this.moTa = moTa;
        this.gia = gia;
    }

    public String getTenHH() {
        return tenHangHoa;
    }

    public String getMoTa() {
        return moTa;
    }
    
    public int getGia() {
        return gia;
    }
     
    public void inThongTinHangHoa() {
        System.out.println("Ten hang: " + tenHangHoa + "; Loai hang: " + moTa + "; Gia ban: " + gia);
    }

}
