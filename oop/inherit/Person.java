/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit;

/**
 *
 * @author alman
 */
public abstract class Person {

    private int personId;
    private String personName;
    private double personGrossSalary;
    private String personJob;

    public Person() {

    }

    public Person(int personId, String personName, double personGrossSalary, String personJob) {
        this.personId = personId;
        this.personName = personName;
        this.personGrossSalary = personGrossSalary;
        this.personJob = personJob;
    }

    public String getPersonJob() {
        return personJob;
    }

    public void setPersonJob(String personJob) {
        this.personJob = personJob;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getPersonGrossSalary() {
        return personGrossSalary;
    }

    public void setPersonGrossSalary(double personGrossSalary) {
        this.personGrossSalary = personGrossSalary;
    }

    public void printPersonDetails() {
        System.out.println("Person id = " + personId);
        System.out.println("Person name = " + personName);
    }

    public abstract int calcLeaveDays();

}
