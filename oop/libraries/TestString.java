/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.libraries;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author CC-Student
 */
public class TestString {

    public static void main(String[] args) {
        int x = 10;

        String s = "B1";
        String s1 = new String("B2");

        byte b1 = 127;
        short sh1 = 32767;

        float f1 = 12312312.123123f;

        Integer i = new Integer(x);
        Integer i2 = 77;

        System.out.println("------------- String class ----------------");
        String s2 = new String("BB3");
        String s3 = "BB4"; // preferred
        s2 = "B3";
        s3 = "B4";

        System.out.println("+++++ String methods +++++++");
        String s5 = "B5";
        String s6 = "B6";

        System.out.println("++++ equals method +++");
        if (s5.equals(s6)) {
            System.out.println("Yes, they are the same equality");
        }

        System.out.println("+++++ equals ignore case ++++");
        if (s5.equalsIgnoreCase(s6)) {
            System.out.println("Yes, they are the same equality ignore case");
        }

        System.out.println("+++ ends with ++++ toUpperCase() toLowerCase()++");
        String filePath = "C:\\my_files\\my_data\\vip.pdf";
        System.out.println(filePath);
        if (filePath.toUpperCase().endsWith("PDF")) {
            System.out.println("it is a book");
        } else {
            System.out.println("it is not a book");
        }
        System.out.println("++++ start with +++++");
        String mobile = "0020128798";
        if (mobile.startsWith("0049")) {
            System.out.println("Deutch phone");
        } else {
            System.out.println("other country");
        }

        System.out.println("+++++++ Length ++++++++++");
        System.out.println(s5.length());

        System.out.println("+++++++ indexOf++++++++++");
        String empName = "B00";
        System.out.println(empName.indexOf(" "));
        System.out.println("+++++++++++ substring +++++++");

        String empFirstName = empName.substring(0, empName.indexOf(" "));

        System.out.println("emp first name = " + empFirstName);

        System.out.println("++++++++ toCharArray +++++++++");
        int[] myArray = new int[5];
        char[] myCharArr = new char[5];
        ArrayList myList = new ArrayList();

        String password = "FootBall2022";
        char[] passwordArr = password.toCharArray();
        int cntLetters = 0, cntDigits = 0, cntLower = 0, cntUpper = 0;
        for (char item : passwordArr) {

            if (Character.isLetter(item)) {
                cntLetters++;
            }

            if (Character.isDigit(item)) {
                cntDigits++;
            }

            if (Character.isUpperCase(item)) {
                cntUpper++;
            }

            if (Character.isLowerCase(item)) {
                cntLower++;
            }

            //   System.out.println(item);
        }

        System.out.println("Letters = " + cntLetters + ", digist = " + cntDigits);
        System.out.println("Upper = " + cntUpper + " lower = " + cntLower);

        System.out.println("+++++++++++ contains , replace +++++++++++");
        String myCourses = "java,php,asp-oracle;mysql";
        boolean isFound = myCourses.contains("javaa");
        System.out.println(myCourses.contains("javaa"));

        myCourses = myCourses.replace("php", "php Laravel");
        System.out.println("After replace = " + myCourses);

        System.out.println("+++++++ split +++++++++++++");
        String[] coursesArr = myCourses.split("[,;-]");
        for (String item : coursesArr) {
            System.out.println(item);
        }

        System.out.println("++++++++++++ find() +++++++++++++++");
        myCourses = "java,php,java-oracle;mysql,java";
        Pattern p = Pattern.compile("java");
        Matcher m = p.matcher(myCourses);
        int cntOccurJava = 0;
        while (m.find()) {
            cntOccurJava++;
        }
        System.out.println("Java occur times = " + cntOccurJava);

        System.out.println("++++ Conversion between numeric andString ++++++++++++++");
        // Convert from String to int | double
        String salaryStr = "5600.00";
        System.out.println(salaryStr + 100);
        double salary = Double.parseDouble(salaryStr);
        // Integer.parseInt(s)
        System.out.println(salary + 100);
        // Convert from numeric to String
        int ab = 454353423;
        String abStr = String.valueOf(ab);
        System.out.println("no of digits =" + abStr.length());

        System.out.println("+++++ StringBuilder, StringBuffer ++++");

        StringBuilder builder = new StringBuilder("I love Java");
        builder.append(", and Oracle");
        builder.insert(0, "My Family and ");
        System.out.println(builder);
        // System.out.println( builder.reverse());
        System.out.println("++++ convert from builder to String ++++");
        String stBuilder = builder.toString();
        System.out.println(stBuilder);

        int numInt = 454353423;
        System.out.println(numInt);
        String numStr = String.valueOf(numInt);
        StringBuilder numBu = new StringBuilder(numStr);
        numBu.reverse();

        String nuM = numBu.toString();
        Integer.parseInt(nuM);
        System.out.println(nuM);

    }
}
