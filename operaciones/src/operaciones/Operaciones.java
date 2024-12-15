/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;
////la funcion devuelve valor el procedimiento no////

import java.util.Scanner;

public class Operaciones {
    
    public static void suma(){
       Scanner sc = new Scanner(System.in);
       int n1, n2;
       System.out.println("Favor ingresar numero 1 ");
       n1 = sc.nextInt();
       System.out.println("Favor ingresar numero 2 ");
       n2 =  sc.nextInt();
         
       System.out.println("La suma de los numero es: "+ (n1 +n2));
       
    }
    public static void resta(){
       Scanner sc = new Scanner(System.in);
       int n1, n2;
       System.out.println("Favor ingresar numero 1 ");
       n1 = sc.nextInt();
       System.out.println("Favor ingresar numero 2 ");
       n2 =  sc.nextInt();
         
       System.out.println("La resta de los numero es: "+ (n1 - n2));
       
    }
    public static int multiplicacion(){
       Scanner sc = new Scanner(System.in);
       int n1, n2;
       System.out.println("Favor ingresar numero 1 ");
       n1 = sc.nextInt();
       System.out.println("Favor ingresar numero 2 ");
       n2 =  sc.nextInt();
       return n1 * n2; 
         
       
       
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int op;
        
        do{
        System.out.println("---menu---");
        System.out.println("1. suma  ");
        System.out.println("2. resta ");
        System.out.println("3. multiplicacion ");
        System.out.println("0. salir ");
        op = sc.nextInt();
        
        
            switch(op){
                case 1:
                    suma();
                    System.out.println("Muchas Gracias");
                    break;
                case 2:
                    resta();
                    System.out.println("Muchas Gracias");
                    break;
                case 3:
                     System.out.println("la multiplicacion es: " + multiplicacion());
                     System.out.println("Muchas Gracias");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opcion invalida");
            }
       
        }while(op!=0);
        
                
    }
    
}
