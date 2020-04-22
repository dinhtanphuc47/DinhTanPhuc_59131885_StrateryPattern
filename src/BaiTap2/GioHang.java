/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> DSHangHoa = new  ArrayList<>();
    public void setHinhThucTT(IThanhToan hinhThucTT){
        this.hinhThucTT = hinhThucTT;
    }
    public void themHangHoa(HangHoa hangHoa){
        DSHangHoa.add(hangHoa);
    }
    public int tongTienHang()
    {
        int tongTienHang = 0;
        for (HangHoa hangHoa : DSHangHoa)
        {
            tongTienHang += hangHoa.getGia();
        }
        return tongTienHang;
    }
    public double tongTienGiam()
    {
        return hinhThucTT.ThanhToan(tongTienHang());
    }
    public double thanhToan(){
        int tien = 0;
        for (HangHoa hangHoa : DSHangHoa) {
            tien += hangHoa.getGia();
        }
        return hinhThucTT.ThanhToan(tien);
    }
      public void hienThiGioHang()
    {
        for (int i=0; i<DSHangHoa.size(); i++){
            DSHangHoa.get(i).inThongTinHangHoa();
        }
    }
}
