/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.libraries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author CC-Student
 */
public class NewClassString {

    public static void main(String[] args) {
        System.out.println("////////////////////////");
        System.out.println("++++ Sting Methods +++++");

        System.out.println("------ equals method ------");

        String s1 = "Ahmad";
        String s2 = "ahmad";

        if (s1.equals(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("-------- equals Ignore case--------");

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("-------- ends with -------");
                                                 // ( pdf )
        String filePath = "c:\\my_files\\my_data\\vip.pdf";
        System.out.println(filePath);
        if (filePath.endsWith("pdf")) {
            System.out.println("it is a book");
        } else {
            System.out.println("it is not a book");
        }
        
        
        System.out.println("------- toLowerCase | toUpperCase --------");
        // toUpperCase == for capital
        // toLowerCase == for small
        
                         // hier ist der Unterschied ( PDF )
        String filePath1 = "c:\\my_files\\my_data\\vip.PDF";
        System.out.println(filePath);
        if (filePath1.toLowerCase().endsWith("pdf")) { 
            System.out.println("it is a book");
        } else {
            System.out.println("it is not a book");
        }
        
        
        System.out.println("-------- start with -------");

        String mobile = "0049555555";
        if (mobile.startsWith("0049")) {
            System.out.println("Deutsch phone");
        } else {
            System.out.println("Other Country");
        }
        
        
        System.out.println("------ Length -------");
        System.out.println(s2.length());
        
        
        System.out.println("------ indexOf -------");
        String empName = "Marwa Ahmad";
        System.out.println(empName.indexOf(" "));
        
        
        System.out.println("------- Substring ------");
        // substring (ibeginIndex, endIndex)
        String empFirstName = empName.substring(0, 5);
        System.out.println(empFirstName);
        String empLastName = empName.substring(6);
        System.out.println("1 "+empLastName);
        
        // substring (ibeginIndex, endIndex) & indexOf
        empFirstName = empName.substring(0, empName.indexOf(" "));
        System.out.println(empFirstName);
        String lastName2emp = empName.substring(empName.indexOf(" "), 11);
        System.out.println("2 "+empName.substring(empName.indexOf(" ")));
        System.out.println("2 "+lastName2emp);
        
        
        System.out.println("------ toCharArray -------");
        
        String passeord = "FootBall2022";
        char [] passwordArr = passeord.toCharArray();
        
        int cntLetter = 0, cntDigits = 0, cntLow = 0, cntUpp = 0;
        
        for ( char item : passwordArr){
            // Character.is...  >>>   check
            
            if ( Character.isLetter(item)){
           // Character.isLetter(item);
                cntLetter++;
            }
            if (Character.isDigit(item)){
                cntDigits++;
            }
            if ( Character.isLowerCase(item)){
                cntLow++;
            }     
            if ( Character.isUpperCase(item)){
                cntUpp++;
            }
        
            System.out.println(item);
        }
        System.out.println("Letter = "+cntLetter);
        System.out.println("Digits = "+cntDigits);
        System.out.println("Number of Low case = "+cntLow);
        System.out.println("Number of Upper case = "+cntUpp);
        
        
        System.out.println("--------- contains -------");
        
        String mycourses = "java, php, asp, oracle, mysql";
        boolean isFound = mycourses.contains("php");
        System.out.println(isFound);
        
        String mycourses1 = "java, php, asp, oracle, mysql";
        boolean isFound1 = mycourses1.contains("PHP");
        System.out.println(isFound1);
        
        String mycourses2 = "java, php, asp, oracle, mysql";
        boolean isFound2 = mycourses2.toUpperCase().contains("PHP");
        System.out.println(isFound2);
        
        
        System.out.println("------- replace -------");
                                  // replace "php"  to  "php Laravel"
        System.out.println( mycourses.replace("php", "php Laravel"));
        mycourses = mycourses.replace("php", "php Laravel") ;
        System.out.println(mycourses);
        
        
        System.out.println("------- split -------");
        String mycoursesSp = "java, php | asp - oracle, mysql";
        String[] coursesArr = mycoursesSp.split(",");
        for(String item : coursesArr){
            System.out.println(item);
        }
        
        String[] coursesArr1 = mycoursesSp.split("[,|-]");
        for(String item : coursesArr1){
            System.out.println(item);
        }
        
        
        System.out.println("------- find() ------");
        mycourses = "java, php, java | asp - oracle, java, mysql";
        Pattern p =Pattern.compile("java");
        Matcher m = p.matcher(mycourses);
        
        int counterJava = 0;
        while ( m.find() ){
            counterJava++;
        }
        System.out.println(counterJava);
        
        
        System.out.println("---- conversion between numeric and String -----");
        
        // Convert from numeric to String
        String salaryStr = "5600.00";
        double salaryD = Double.parseDouble(salaryStr);
        System.out.println(salaryD);
        
        String salaryStr1 = "5600";
        int salaryInt = Integer.parseInt(salaryStr1);
        System.out.println("int "+salaryInt);
        
        int ab = 53467234;
        String abStr = String.valueOf(ab);
        System.out.println("num of Digit "+abStr.length());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("++++++++++++++ StringBuilder ++++++++++++++");
        
        StringBuilder builder = new StringBuilder("I love Java");
        System.out.println(builder);
        
        
        
        System.out.println("----------- append ----------");
        
        System.out.println(builder.append(" and oracle"));
        
        
        
        System.out.println("----------- insert ------------");
        
        System.out.println(builder.insert(0, "Ahmad and "));
        
        
        
        
        System.out.println("---------- reverse -------------");
        
        StringBuilder num = new StringBuilder( "123456789" );
        System.out.println("reverse "+num.reverse());
        
        
        
        System.out.println("------ convert from builder to String -------");
        
            String stBuilder = builder.toString();
            System.out.println(stBuilder);
        
    }

}









































































































