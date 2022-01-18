package lear_java_EE.st;

import java.util.Scanner;

public class test {


    public static Scanner re = new Scanner(System.in);
    public static void main(String[] args){

        String nom="";
        String ty="";
        String dt="";

        carte[] tabcarte= new carte[2];

        for(int i=0;i<2;i++){

            System.out.println(" Bienvenue dans le mini programme d'enregistrement \n\n");

            System.out.println("Entrer le nom de la carte : ");
            nom=re.nextLine();

        
            System.out.println("Entrer le Type de la carte : ");
            ty=re.nextLine();


            System.out.println("Entrer la date de la carte : ");
            dt=re.nextLine();

            carte ct=new carte(nom,ty,dt);
            tabcarte[i]=ct;

        }


        for(Object a : tabcarte){
            
            System.out.println(((carte)a).top());
            System.out.println(((carte)a).bonjour());

        }

    }
    
}
