/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.basics;

/**
 *
 * @author alman
 */
public class TestEmp4 {

    public static void main(String[] args) {

        Emp4 N_B = new Emp4();

        N_B.setEmpId(101);

        N_B.setEmpName("N_B");
        N_B.setEmpGrossSalary(7000);

        System.out.println("id is : " + N_B.getEmpId());
        System.out.println("Salary is : " + N_B.getEmpGrossSalary());
        System.out.println("Name is : " + N_B.getEmpName());

        double omarMonthly = N_B.getMonthlyNetSalary();
        double omarAnnual = N_B.getAnnualNetSalary();

        System.out.println("N_B Monthly = " + omarMonthly);
        System.out.println("N_B Annual = " + omarAnnual);

        System.out.println("---------------");
        
        Emp4 NN_BB = new Emp4();

        NN_BB.setEmpId(102);
        NN_BB.setEmpName("NN_BB Gamal");
        NN_BB.setEmpGrossSalary(12000);

        System.out.println 
                ("NN_BB Monthly net = " + NN_BB.getMonthlyNetSalary());
        System.out.println
        ("NN_BB Annual net = " + NN_BB.getAnnualNetSalary());
        
        
        

        System.out.println("-------- Constructor --------------");
        // parameters constroctur
        Emp4 N_B3 = new Emp4(103, "N_B3", 5000);

        System.out.println 
                ("N_B3 monthly = " + N_B3.getMonthlyNetSalary());
        System.out.println
                ("N_B3 Annual = " + N_B3.getAnnualNetSalary());

        Emp4 N_B4 = new Emp4(104, "N_B4", 6500);
    
        
        Emp4 N_B5 = N_B4;
    

        System.out.println(N_B5.getEmpName());
        System.out.println 
                ("N_B5 monthly = " + N_B4.getMonthlyNetSalary());
        System.out.println 
                ("N_B5 Annual = " + N_B4.getAnnualNetSalary());

        System.out.println("----------- Array of Objects ------------");

        
        Emp4[] empsArray = new Emp4[5];

        
        empsArray[0] = N_B;
        empsArray[1] = NN_BB;
        empsArray[2] = N_B3;
        empsArray[3] = N_B4;
        empsArray[4] = new Emp4(105, "N_B6", 7000);
        

        System.out.println(N_B.getEmpName());
        
        System.out.println(empsArray[0].getEmpName());
        
        System.out.println(empsArray[4].getEmpName());

        
        double sum = 0;
        for (int i = 0; i < empsArray.length; i++) {

           
            System.out.println("name = " + empsArray[i].getEmpName()
                    + ", Gross Salary = " + empsArray[i].getEmpGrossSalary());

            
            sum = sum + empsArray[i].getEmpGrossSalary();
        }
        System.out.println("Sum Gross Salary = " + sum);

        System.out.println(" \n ");

        sum = 0;
        double sum1 = 0;
        for (Emp4 item : empsArray) {
            System.out.println("name = " + item.getEmpName()
                    + ", Gross Salary = " + item.getEmpGrossSalary()
                    + ", empId : " + item.getEmpId()
                    + ", Annual Net Salary = " + item.getAnnualNetSalary());
            sum = sum + item.getEmpGrossSalary();
            sum1 = sum1 + item.getAnnualNetSalary();
        }
        System.out.println("Sum Gross Salary = " + sum);
        System.out.println("Sum Annual Net Salarry = " + sum1);

        
  
        System.out.println
        ("------------- static attribute example -----------------");
        
        System.out.println("Total Bonus now = " + Emp4.getTotalBonus());
        
        System.out.println("N_B wallet = " + N_B.getWallet());
        
        N_B.takeBonus(5000);
        
        System.out.println("Total Bonus now = " + Emp4.getTotalBonus());
        
        
        System.out.println("N_B wallet = " + N_B.getWallet());
        System.out.println("------- Marwa wallet -----");
        
         System.out.println("NN_BB wallet = "+NN_BB.getWallet());
         NN_BB.takeBonus(10000);
         NN_BB.takeBonus(5000);
         System.out.println("Total Bonus now = " + Emp4.getTotalBonus());
         System.out.println("NN_BB wallet = "+NN_BB.getWallet());
     
         
         System.out.println("--------------- Passing objects to methods --------------");
         printEmpData(N_B);
         printEmpData(NN_BB);
         
    }
 
    public static void printEmpData(Emp4 emp){
          System.out.println("emp id = "+emp.getEmpId());
          System.out.println("emp name = "+emp.getEmpName());
          System.out.println("emp salary = "+emp.getEmpGrossSalary());
          System.out.println("-----------------------");
    }
    
}
















































































































































































