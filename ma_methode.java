package lear_java_EE;

import java.util.Scanner;

public class ma_methode {
    static Scanner enter= new Scanner(System.in);
    
    public static String nom (String a){
        System.out.println(" tu as saisi "+a);
        return a;
    }
    
    public static void main(String[] args){

       String b=nom("idris");
       System.out.println("le contenu de b :"+b);
        
    }

    
}
