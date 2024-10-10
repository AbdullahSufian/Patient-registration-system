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
public class PatientList {
 static Scanner input = new Scanner (System.in);
    
   private ArrayList<Patient> patients ;
   private int numberOfPatient;

    public PatientList() {
        this.patients=new ArrayList<>();
    }
   public void addNewPatients(){
       Patient p=new Patient();
       System.out.println("Clik enter to start");
       input.nextLine();
       System.out.println("Enter Patient Name :");
       p.setName(input.nextLine());
       System.out.println("Enter a gender :");
       p.setGender(input.next());
       System.out.println("Enter a age :");
       p.setAge(input.nextInt());
       System.out.println("Enter a phone number :");
       p.setPhoneNumber(input.next());
        p.addNewAppointment();   
       
        
       patients.add(p);
       numberOfPatient++;
   }
  public void addNewPatients(String name,String gender,int age,Appointment appointments,String phoneNumber){
   Patient p=new Patient(name, gender, age, appointments, phoneNumber);
   patients.add(p);
   numberOfPatient++;
  }
  public void addNewPatients(String name,String gender,int age,int day,int month,int year,String phoneNumber){
   Patient p=new Patient(name, gender, age,new Appointment(day, month, year), phoneNumber);
   patients.add(p);
   numberOfPatient++;
}
  
    public void updateMenu() 
    {
        System.out.println("What would you like to do :");
        System.out.println("1- Update all Patient Info");
        System.out.println("2- Update the patient's phone number");
        System.out.println("3- Update of the patient's age");
        System.out.println("4- Udpate patient appointments");
        System.out.println("0- To exit");
        System.out.println("Enter a choice:");
    }
  public void update ()
    {
        int choice;
        do
        {
            updateMenu();
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("==========================================");
                    System.out.println("|------- Update all Patient Info --------|");
                    System.out.println("==========================================");
                    updateAllpatientinfo();
                    break;
                case 2:
                    System.out.println("================================================");
                    System.out.println("|----- Update the patient's phone number ------|");
                    System.out.println("================================================");
                    updateThePatientsPhoneNumber();
                    break;
                case 3:
                    System.out.println("============================================");
                    System.out.println("|------ Update of the patient's age -------|");
                    System.out.println("============================================");
                    updateOfThePatientAge();
                    break;
                case 4:
                    System.out.println("============================================");
                    System.out.println("|------ Udpate patient appointments -------|");
                    System.out.println("============================================");
                    udpatePatientAppointments();
                    break;
                
                case 0:
                    System.out.println("===================================");
                    System.out.println("|--- You Returned To Main Menu ---|");
                    System.out.println("===================================");
                    break;
                default:
                    System.out.println("==============================");
                    System.out.println("|----- No Such Choice -------|");
                    System.out.println("|-------- Try Again :)-------|");
                    System.out.println("==============================");
                    break;
            }
        }
        while (choice!=0);
    }
    public void updateAllpatientinfo()
    {
         Patient p=new Patient();
        System.out.println("Enter patient name ");
        input.nextLine();
        String name=input.nextLine();
        boolean found=false;
        for (int i = 0; i <patients.size(); i++) {
            if(patients.get(i).getName().equalsIgnoreCase(name))
            {
                found=true;
                patients.remove(i);
                Patient v=new Patient();
                System.out.println("Enter Patient Name :");
       input.nextInt();
       p.setName(input.nextLine());
       System.out.println("Enter a gender :");
       p.setGender(input.next());
       System.out.println("Enter a age :");
       p.setAge(input.nextInt());
       System.out.println("Enter a phone number :");
       p.setPhoneNumber(input.next());
      
       System.out.println("Enter a day :");
       int d=input.nextInt();
       System.out.println("Enter a month :");
       int m=input.nextInt();
       System.out.println("Enter a year :");
       int y=input.nextInt();
       p.addNewAppointment(d,m,y);
       patients.add(p);
            }
        }
        if(found)
            System.out.println("=-=-=-=  All Patient Info are Updated \u2713 =-=-=-=");
        else
            System.out.println("=-=-=-= The patient is not Found \u2718 =-=-=-=");
    }
    public void updateThePatientsPhoneNumber()
    {
        System.out.println("Enter the name of patient");
        input.nextLine();
        String n=input.nextLine();
        boolean found=false;
        for (int i = 0; i <patients.size(); i++) 
        {
            if(patients.get(i).getName().equals(n))
            {
                found=true;
                System.out.println("Enter The Number After Update : ");
                patients.get(i).setPhoneNumber(input.nextLine());
            }
        }
        if(found)
            System.out.println("=-=-=-= The Phone Number is Updated \u2713 =-=-=-=");
        else
            System.out.println("=-=-=-= The patient is not Found \u2718 =-=-=-=");
    }
    public void updateOfThePatientAge()
    {
        System.out.println("Enter the name of patient ");
        input.nextLine();
        String n=input.nextLine();
        boolean found=false;
        for (int i = 0; i <patients.size(); i++) 
        {
            if(patients.get(i).getName().equals(n))
            {
                found=true;
                System.out.println("Enter The Age After Update : ");
                patients.get(i).setAge(input.nextInt());
            }
        }
        if(found)
            System.out.println("=-=-=-= The age is Updated \u2713 =-=-=-=");
        else
            System.out.println("=-=-=-= The patient is not Found \u2718 =-=-=-=");
    }
    public void udpatePatientAppointments()
    {
         Patient p=new Patient();
        System.out.println("Enter the name of patient ");
        input.nextLine();
        String n=input.nextLine();
        boolean found=false;
        for (int i = 0; i <patients.size(); i++) 
        {
            if(patients.get(i).getName().equals(n))
            {
                found=true;
               patients.get(i).addNewAppointment();
       
            }
        }
        if(found)
            System.out.println("=-=-=-= The Appointment is Updated \u2713 =-=-=-=");
        else
            System.out.println("=-=-=-= The patient is not Found \u2718 =-=-=-=");
    }
   

   public void deleteAnPatient()
    {
        System.out.println("Name Of Patient ");
        String n=input.nextLine();
        boolean found=false;
        for (int i = 0; i <patients.size(); i++) 
        {
            if(patients.get(i).getName().equalsIgnoreCase(n))
            {
                patients.remove(i);
                found=true;
                numberOfPatient--;
            }
        }
            if(found)
            {
                System.out.println("=============================");
                System.out.println("|    Patient is deleted \u2713   |");
                System.out.println("=============================");
            }
                else
            {
                System.out.println("==============================");
                System.out.println("|   NO Patient is deleted \u2718  |");
                System.out.println("==============================");
            }
    }
    public void deleteAnPatient(String n)
    {
        
        boolean found=false;
        for (int i = 0; i <patients.size(); i++) 
        {
            if(patients.get(i).getName().equalsIgnoreCase(n))
            {
                patients.remove(i);
                found=true;
                numberOfPatient--;
            }
        }
            if(found)
            {
                System.out.println("=============================");
                System.out.println("|    Patient is deleted \u2713   |");
                System.out.println("=============================");
            }
                else
            {
                System.out.println("==============================");
                System.out.println("|   NO Patient is deleted \u2718  |");
                System.out.println("==============================");
            }
    }
    
    

   
    public void printInfo()
    {
       
         printLine();
        System.out.println("The Session price => 25 JD ");
        printLine();
          
          
          
          Patient.printTableHeader();
          
          printLine();
          
          
          
          for (int i=0;i<patients.size();i++)

          patients.get(i).printPatientAsFormatedRow();
          
          printLine();
          
          System.out.println("Number of Patient :" + numberOfPatient);
          
          printLine();
    }
private void printLine()
    {
        for (int i=1;i<=141;i++)
          System.out.print("=-=");
            System.out.println("");
    }

    public void sortMenu()
    {
        System.out.println("How do Want to Sort The Patients ? ");
        System.out.println("1- Sort By Name ");
        System.out.println("2- Sort By Gender ");
        System.out.println("3- Sort By Date ");
        System.out.println("0- Back to Main Menu ");
    }
    public void sort()
    {
        int choice;
        do
        {
            sortMenu();
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("===============================");
                    System.out.println("|------- Sort By Name --------|");
                    System.out.println("===============================");
                    sortByName();
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println("|----- Sort By Gender -------|");
                    System.out.println("=====================================");
                    sortByGender();
                    break;
                     case 3:
                    System.out.println("=====================================");
                    System.out.println("|----- Sort By Date -------|");
                    System.out.println("=====================================");
                    sortByDate();
                    break;
               
                case 0:
                    System.out.println("===================================");
                    System.out.println("|--- You Returned To Main Menu ---|");
                    System.out.println("===================================");
                    break;

                default:
                    System.out.println("==============================");
                    System.out.println("|----- No Such Choice -------|");
                    System.out.println("|-------- Try Again :)-------|");
                    System.out.println("==============================");
                    break;
            }
        }
        while (choice!=0);
    }
    public void sortByName()
    {
       
        for (int i = 0; i <patients.size()-1; i++) {
            for (int j = i+1; j <patients.size(); j++) {
                if(patients.get(i).getName().compareToIgnoreCase(patients.get(j).getName())<0)
                {
                   //+ A-Z
                   //- Z-A
                   Patient temp = patients.get(i);
                   patients.set(i,patients.get(j));
                   patients.set(j, temp);
                }
            }
        }
                System.out.println("============================");
                System.out.println("| The Patient's are Sorted |");
                System.out.println("============================");
    
    }
   
    public void sortByGender()
    {
       
        for (int i = 0; i < patients.size()-1; i++) {
            for (int j = i+1; j <patients.size(); j++) {
                if(patients.get(i).getGender().compareToIgnoreCase(patients.get(j).getGender())>0)
                {
                   Patient temp = patients.get(i);
                   patients.set(i,patients.get(j));
                   patients.set(j, temp);
                }
            }
        }
                System.out.println("============================");
                System.out.println("| The Patient's are Sorted |");
                System.out.println("============================");
    
    }
    public void sortByDate()
    {
       
    for (int i = 0; i < patients.size()-1; i++) {
        for (int j = i+1; j <patients.size(); j++) {
            if(patients.get(i).getAppointments().compareToIgnoreCase(patients.get(j).getAppointments())>0)
            {
                   Patient temp = patients.get(i);
                   patients.set(i,patients.get(j));
                   patients.set(j, temp);
            }
        }
    }
                System.out.println("============================");
                System.out.println("| The Patient's are Sorted |");
                System.out.println("============================");
    
    }
    
    public void find()
    {
        int choice;
        do
        {
            findMenu();
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("================================");
                    System.out.println("|------- Find By Name --------|");
                    System.out.println("================================");
                    findByName();
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.println("|----- Find By Phone Number  ------|");
                    System.out.println("======================================");
                    findByPhoneNumber();
                    break;
                
                   
                case 0:
                    System.out.println("===================================");
                    System.out.println("|--- You Returned To Main Menu ---|");
                    System.out.println("===================================");
                    break;
                default:
                    System.out.println("==============================");
                    System.out.println("|----- No Find Choice -------|");
                    System.out.println("|-------- Try Again :)-------|");
                    System.out.println("==============================");
                    break;
            }
        }
        while (choice!=0);
    }
    public void findMenu()
    {
        System.out.println("How do Want to Find The Patient's ? ");
        System.out.println("1- Find By Name ");
        System.out.println("2- Find By Patient Number ");
        System.out.println("0- Back to Main Menu ");
    }

    public void findByName()
    {
        System.out.println("Enter the Name of Patient ");
        input.nextLine();
        String n=input.nextLine();
        boolean found=false;
        for (int i = 0; i <patients.size(); i++) 
        {
            if(patients.get(i).getName().equalsIgnoreCase(n))
            {
                Patient.printTableHeader();
                found=true;
                patients.get(i).printPatientAsFormatedRow();
            }
        }
        if(found)
            System.out.println("=-=-=-= The Patient is Found \u2713 =-=-=-=");
        else
            System.out.println("=-=-=-= The Patient is not Found \u2718 =-=-=-=");
    }
    public void findByPhoneNumber()
    {
        System.out.println("Enter the Phone Number ");
        input.nextLine();
        String n=input.nextLine();
        boolean found=false;
        for (int i = 0; i <patients.size(); i++) 
        {
            if(patients.get(i).getPhoneNumber().equals(n))
            {
                Patient.printTableHeader();
                found=true;
                patients.get(i).printPatientAsFormatedRow();
            }
        }
        if(found)
            System.out.println("=-=-=-= The Patient is Found \u2713 =-=-=-=");
        else
            System.out.println("=-=-=-= The Patient is not Found \u2718 =-=-=-=");
    }

}
