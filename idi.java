package lear_java_EE;

import java.util.Scanner;

// import java.util.Scanner;
class idi{
    /**
        je suis entrain de faire une test
    
     */

     /**
      *ds
      d
      d

      //*/
      
    static Scanner enter= new Scanner(System.in);
    public static void main(String[] args){
        int a,b=0;
        String text= new String();
        System.out.println("entrer le nombre A : ");
        a=enter.nextInt();
        enter.nextLine();
        System.out.println("enter le text suivant :");
        text=enter.nextLine();
        System.out.println("enter le nombre B :");
        b=enter.nextInt();
        System.out.println("la somme de A+B est  :"+(a+b));
        System.out.println("le text entrer est :"+text);
     }


    }