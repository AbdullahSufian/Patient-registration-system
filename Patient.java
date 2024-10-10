/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdallahphysiotherapyclinic;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Abdula Sofian
 */
class Patient {

    static Scanner input = new Scanner(System.in);

    private String name;
    private String gender;
    private int age;
    private String phoneNumber;
    private int numberOfSessions = 0;
    private Appointment appointments;

    public Patient() {
        this.name = "Unknown";
        this.gender = "Undefined";
        this.age = 00;
        this.phoneNumber = "07#*******";
        this.numberOfSessions = 0;
        this.appointments = new Appointment();
       
    }

    public Patient(String name, String gender, int age, Appointment appointments, String phoneNumber) {
        setName(name);
        setGender(gender);
        setAge(age);
        setPhoneNumber(phoneNumber);
        this.appointments=appointments;
        

    }

    public Patient(String name, String gender, int age, int day, int month, int year, String phoneNumber) {
        setName(name);
        setGender(gender);
        setAge(age);
        setPhoneNumber(phoneNumber);
          this.appointments=appointments;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean correct = true;
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                correct = false;
            }
            break;
        }
        if (correct == true) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
            this.gender = gender;
        } else {
            this.gender = "Unknown";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            this.age = 00;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            if (phoneNumber.startsWith("079") || phoneNumber.startsWith("078") || phoneNumber.startsWith("077")) {
                this.phoneNumber = phoneNumber;
            } else {
                this.phoneNumber = "07#*******";
            }
        } else {
            this.phoneNumber = "07#*******";
        }
    }

    public void addNewAppointment() {
        Appointment a = new Appointment();
        System.out.println("Enter a year :");
        a.setYear(input.nextInt());
        System.out.println("Enter a nonth :");
        a.setMonth(input.nextInt());
        System.out.println("Enter a day :");
        a.setDay(input.nextInt());
        
        
        this.appointments=a;
        System.out.println("Appointment");
    }

    public void addNewAppointment(int day, int month, int year) {
        Appointment a = new Appointment();

        a.setYear(year);
        a.setMonth(month);
        a.setDay(day);
        this.appointments=a;
        
    }


    public String getAppointments() {
        
            return appointments.getDate();
    }
    

    public double getTotalSessions() {
        return (numberOfSessions * 25.0);
    }

    public String getSessionpriceAsString() {

        return (numberOfSessions * 25.0) + " JD";
    }

    public String toString() {
        return ("Name :" + name
                + "\nGender :" + gender
                + "\nAge :" + age
                + "\nPhone Number :" + phoneNumber
                + "\nSession price :" + getSessionpriceAsString()
//              
                );
    }

    public static void printTableHeader() {
        System.out.printf("%-30S%-12S%-9S%-25S%-25S%-15S%n",
                 "Name \u263A", "Gender \u2642+\u2640", "Age", "Date",  "Session price $", "Phone Number \u260E");
    }

    public void printPatientAsFormatedRow() {
        
        System.out.printf("%-30S%-12S%-9d%-25S%-25S%-15S%n",
                 name, gender, age, appointments.getDate(), 25+"JD", phoneNumber);
     
}
}
