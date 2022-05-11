/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.producta;

/**
 *
 * @author alman
 */
public class TestProducts {

    public static void main(String[] args) {

        Product testProduct1 = new Product();

        testProduct1.productId = 85;
        testProduct1.productName = "B1";
        testProduct1.productQty = 50;
        testProduct1.productUnitCost = 100;
        testProduct1.productDiscountPct = 10;

        System.out.println(testProduct1.calcTotalProductCost());
        System.out.println(testProduct1.calcTotalProductDiscountValue());

        System.out.println("--------------------");

        Product testProduct2 = new Product(94, "B2", 70, 103, 15);

        System.out.println(testProduct2.calcTotalProductCost());
        System.out.println(testProduct2.calcTotalProductDiscountValue());

    }

}
