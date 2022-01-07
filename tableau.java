package lear_java_EE;
import java.util.Scanner;
public class tableau {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        // tableau a un dimmension
        // int tabSimple[]=new int[5];
        int tabSimple[]={1,2,3,4,5};
        int y=5;
        int i=0;
        // do{

        //     System.out.println("enter un entier");
        //     tabSimple[i]=sc.nextInt();
        //     i++;
        // }while(i<y);

        for(int a : tabSimple){
            System.out.println("les nombres contenu dans le tableau : \n "+a);
        
        }

        System.out.println(" Tableau multi dimensionnelle \n ");

        int tabmul[][]={{1,2,3,4,5},{9,8,7,6,5}};

        // premier syntaxe de for pour le parcourt du tableau

        for(int h=0;h<2;h++){

            for( int p=0;p<5;p++){

                System.out.println(tabmul[h][p]);
            }


        }

        // un autre syntaxe pour le parcourt avec syntaxe simplifier de for 
        int aa,j=0;
        System.out.println("debut");
    
        aa=0;
        for(int tab[]:tabmul){
            j=0;
            System.out.println("tableau :"+aa);
            for(int val :tab){
                System.out.println(tabmul[aa][j]);
               
                // System.out.println(val);
                
                j++;

            }

            aa++;
        }

    }
}
