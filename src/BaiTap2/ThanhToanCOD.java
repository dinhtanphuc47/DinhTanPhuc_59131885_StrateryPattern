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
public class ThanhToanCOD implements IThanhToan{
    @Override
    public double ThanhToan(int TienHang)
    {
        if (TienHang > 2000000){
        return TienHang*0.98;
    }
    return TienHang;
    }   
}