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
public class Main1 {
    public static void main(String[] args) {
        ITinh cong = new Cong();
        ITinh tru = new Tru();
    
        Context context = new Context();
        System.out.println("\nAnswer: ");

        context.setTinhToan(cong);
        System.out.println("75 + 12 = " + context.tinh(75, 12));
    
        context.setTinhToan(tru);
        System.out.println("54 - 78 = " + context.tinh(54, 78));
    }
}
