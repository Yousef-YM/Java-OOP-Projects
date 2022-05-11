 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit;

/**
 *
 * @author CC-Student
 */
public interface Travel {
    
     public static final int DAY_COST = 50;
    
    public abstract double calcTicketCost();
    public abstract double calcAccomodationCost(int noDays);
    public abstract double calcPocketMoney();
}
