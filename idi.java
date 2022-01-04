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

        int a,b,c=0;
        // String text= new String();
        char text=' ';
        System.out.println("Un pg qui permet de testez si la somme des deux nombres est supérieur ou inférieur a 100\n");
        while (text!='Q')
        {
     
        System.out.println("entrer le nombre A : ");
        a=enter.nextInt();
        // enter.nextLine();
       
        System.out.println("enter le nombre B :");
        b=enter.nextInt();
        // enter.nextLine();
        int i=10;
        c=a+b;
        if (c>100){
            System.out.println(" Super, la somme de A+B est > a 100  :"+(a+b));

        }
        else if(c==100){
        System.out.println("la somme de A+B est égale a  :"+(a+b));

        }
        else{
            System.out.println("la somme est inférieur a 100, Somme= :"+(a+b));
          
            
        }
        // enter.nextLine();
        for(int x=0; x<i;x++){
            System.out.println("j'increment le resultat "+c++);
        }
        enter.nextLine();

        System.out.println("Taper Q pour quitter et O pour continuer   :");
        text=enter.nextLine().charAt(0);
        
    }
     }


    }