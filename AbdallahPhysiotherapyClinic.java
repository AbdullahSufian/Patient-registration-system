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
public class AbdallahPhysiotherapyClinic {

    static Scanner input=new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PatientList p=new PatientList();
   
        p.addNewPatients("Ahmad Faris Dweikat", "Male", 50, 2, 2, 2024, "0796983276");
        
        p.addNewPatients("Ali Ghanem Abu Rukba ", "Male", 27, 2, 2, 2024, "0796983277");
        
        p.addNewPatients("Ahmad Faris Dweikat ", "Male", 50, 7, 2, 2024, "0796983276");
        
        p.addNewPatients("Ali Ghanem Abu Rukba ", "Male", 27, 5, 2, 2024, "0796983277");
        
        p.addNewPatients("Ahmad Faris Dweikat", "Male", 50, 12, 2, 2024, "0796983276");

        p.addNewPatients("Ahmad Faris Dweikat ", "Male", 50, 10, 2, 2024, "0796983276");

        p.addNewPatients("Ali Ghanem Abu Rukba ", "Male", 27, 8, 2, 2024, "0796983277");

        p.addNewPatients("Muntaha Muhammad Hussein ", "Female", 65, 2, 2, 2024, "0778187220");
        
        p.addNewPatients("Nour Sami Abu Al-Hawa ", "Female", 22, 17, 1, 2024, "0795812037");
        
        p.addNewPatients("Muntaha Muhammad Hussein ", "Female", 65, 5, 3, 2024, "0778187220");
        
        p.addNewPatients("Muntaha Muhammad Hussein ", "Female", 65, 8, 3, 2024, "0778187220");
        
        p.addNewPatients("Muntaha Muhammad Hussein ", "Female", 65,11 , 3, 2024, "0778187220");


   char choice;
        do {            
            drowMenu();
            choice=Character.toUpperCase(input.next().charAt(0));
            switch(choice)
            {
                case 'A':
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("|------- Add New Patient --------|");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    p.addNewPatients();
                    break;
                case 'P':
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("|----- Print All Patient's ------|");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    p.printInfo();
                    break;
                case 'D':
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("|------ Delete an Patient -------|");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    p.deleteAnPatient();
                    break;
                case 'U':
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("|------ Update an Patient -------|");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    p.update();
                    break;
                case 'S':
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("|----- Sort all Patient's -------|");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    p.sort();
                    break;
                    case 'F':
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("|----- Find an Patient -------|");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    p.find();
                    break;
                case 'E':
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("|--- you ended The program ---|");
                    System.out.println("|-------- Thank You \u2764 --------|");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    break;
                default:
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("|----- No Such Choice -------|");
                    System.out.println("|-------- Try Again ---------|");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    break;
            }
        } 
        while (choice!='E');
    }

    public static void drowMenu() 
    {
        System.out.println("What would you like to do :");
        System.out.println("A- Add New Patient");
        System.out.println("P- Print all Patient");
        System.out.println("D- Delete an Patient");
        System.out.println("U- Udpate An Patient");
        System.out.println("S- Sort Patient's ");
        System.out.println("F- Find anf Patient");
        System.out.println("E- To Exit");
        System.out.println("Enter a choice:");
    }
}


