/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author admin
 */
public class Context {
    ITinh TinhToan;

    public Context() {
    }
    public void setTinhToan(ITinh TinhToan)
    {
        this.TinhToan = TinhToan;
    }
    public float tinh(float a, float b)
    {
        return TinhToan.tinh(a, b);
    }
}
