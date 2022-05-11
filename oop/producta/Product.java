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
public class Product {

    int productId;
    String productName;
    int productQty;
    double productUnitCost;
    int productDiscountPct;

    public Product() {
    }

    public Product(int productId, String productName, int productQty,
            double productUnitCost, int productDiscountPct) {
        this.productId = productId;
        this.productName = productName;
        this.productQty = productQty;
        this.productUnitCost = productUnitCost;
        this.productDiscountPct = productDiscountPct;

    }

    public double calcTotalProductDiscountValue() {

        return productQty * productUnitCost * 10 / 100.0;
    }

    public double calcTotalProductCost() {
        return productQty * productUnitCost - calcTotalProductDiscountValue();
    }
}
