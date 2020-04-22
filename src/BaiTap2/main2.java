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
public class main2 {
    
    public static void main(String[] args) {
        ThanhToanOnline thanhToanOnline = new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();
        HangHoa h1 = new HangHoa("card màng hình", "linh kiện điện tử", 1000000);
        HangHoa h2 = new HangHoa("ổ cứng SSD", "linh kiện điện tử", 2000000);
        HangHoa h3 = new HangHoa("búp bê", "Đồ chơi trẻ em", 3000000);
        HangHoa h4 = new HangHoa("Tủ lạnh", "Thiết bị điện tử", 4000000);
        
        GioHang gh1 = new GioHang();
        gh1.themHangHoa(h1);
        gh1.themHangHoa(h2);
        gh1.setHinhThucTT(thanhToanOnline);
        //thanh toan
        gh1.hienThiGioHang();
        System.out.println("Tổng tiền hàng: " + gh1.tongTienHang());
        System.out.println("Tổng tiền phải thanh toán: " + gh1.thanhToan());
        System.out.println("Số tiền khách phải trả: " + gh1.tongTienGiam());
        
        GioHang gh2 = new GioHang();
        gh2.themHangHoa(h3);
        gh2.themHangHoa(h4);
        gh2.setHinhThucTT((IThanhToan) thanhToanCOD);
        //thanh toan
        gh2.hienThiGioHang();
        System.out.println("Tổng tiền hàng: " + gh2.tongTienHang());
        System.out.println("Tổng tiền phải thanh toán: " + gh2.thanhToan());
        System.out.println("Số tiền khách phải trả: " + gh2.tongTienGiam());
    }
    
    
}
