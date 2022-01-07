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

        int a,val,b,c=0;
        int choix=0;
        double va,vb=0;
        char text=' ';
        int choixCal=0;

        System.out.println(" Bienvenu dans le pg faite un choix:\n ");
        System.out.println(" ---1) Pg de test de valeur : \n");
        System.out.println(" ---2) Pg de d'incrémentation : \n");
        System.out.println(" ---3) Pg d'un mini calculatrice : \n");



        choix=enter.nextInt();

        while (choix<4 && choix>0)
        {
            switch(choix){
                case 1:
                    System.out.println(" Bienvenu dans le pg de test de val : ");
                   
                    // String text= new String();
                    
                    System.out.println("Un pg qui permet de testez si la somme des deux nombres est supérieur ou inférieur a 100\n");
                    while (text!='Q')
                        {
                
                            System.out.println("entrer le nombre A : ");
                            a=enter.nextInt();
                            // enter.nextLine();
                        
                            System.out.println("enter le nombre B :");
                            b=enter.nextInt();
                            // enter.nextLine();
                            
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
                            enter.nextLine();

                            System.out.println("Taper Q pour quitter et O pour continuer   :");
                            text=enter.nextLine().charAt(0);
                         }
                    break;
                case 2:
                while (text!='Q')
                {
                    System.out.println(" Bienvenu dans le pg d'incrementation de valeur\n Entrer une valeur entier : ");
                        val=enter.nextInt();
                        enter.nextLine();

                        int t=0;
                        int i=10;
                        // enter.nextLine();
                    for(int x=0; x<=i;x++){
                        System.out.println("j'increment la valeurs que vous avez donner "+(val)++);
                        t=val;
                   
                        }
                        System.out.println("Taper Q pour quitter et O pour continuer   :");
                        text=enter.nextLine().charAt(0);
                        choix=0;
                    }
                break;
    
                case 3:
                    
                        System.out.println(" Bienvenu dans le pg de la calculatrice : ");
                        System.out.println(" faite un choix\n: ");
                        System.out.println(" 1- Addition ");
                        System.out.println(" 2- Soustraction ");
                        System.out.println(" 3- Multiplication ");
                        System.out.println(" 4- Division ");
                        System.out.println(" 5- Modulo ");





                                    choixCal=enter.nextInt();
                            
                            switch(choixCal){
                                case 1:
                                    System.out.println(" Addition ");
                                    System.out.println(" entrer nombre 1 ");
                                    va=enter.nextDouble();
                                    System.out.println(" entrer nombre 2 ");
                                    vb=enter.nextDouble();
                                    va+=vb;
                                    System.out.println(" le resultat de votre calcul est : "+va);
                                
                                    break;
                                case 2:
                                    System.out.println(" Soustraction ");
                                    System.out.println(" entrer nombre 1 ");
                                    va=enter.nextDouble();
                                    System.out.println(" entrer nombre 2 ");
                                    vb=enter.nextDouble();
                                    va-=vb;
                                    System.out.println(" le resultat de votre calcul est : "+va);
                                    break;
                                case 3:
                                    System.out.println(" Multiplication ");
                                    System.out.println(" entrer nombre 1 ");
                                    va=enter.nextDouble();
                                    System.out.println(" entrer nombre 2 ");
                                    vb=enter.nextDouble();
                                    va*=vb;
                                    System.out.println(" le resultat de votre calcul est : "+va);
                                    break;
                                case 4:
                                    System.out.println(" Division ");
                                    System.out.println(" entrer nombre 1 ");
                                    va=enter.nextDouble();
                                    System.out.println(" entrer nombre 2 ");
                                    vb=enter.nextDouble();
                                    va/=vb;
                                    System.out.println(" le resultat de votre calcul est : "+va);
                                    break;
                                case 5:
                                    System.out.println(" Modulo ");
                                    System.out.println(" entrer nombre 1 ");
                                    va=enter.nextDouble();
                                    System.out.println(" entrer nombre 2 ");
                                    vb=enter.nextDouble();
                                    va%=vb;
                                    System.out.println(" le resultat de votre calcul est : "+va);
                                    break;
                                default:System.out.println("choisissez une opération");
                                
                            }
                            // System.out.println("Taper Q pour quitter et O pour continuer   :");
                            // text=enter.nextLine().charAt(0);
                break;
    
                default:System.out.println("vous n'avez rien choisi");
                        }
                        


        }
        choix=0;
        // enter.nextLine();
        System.out.println(" Bienvenu dans le pg faite nouveau un choix:\n ");
        System.out.println(" ---1) Pg de test de valeur : \n");
        System.out.println(" ---2) Pg de d'incrémentation : \n");
        System.out.println(" ---3) Pg d'un mini calculatrice : \n");
        // System.out.println("Taper Q pour quitter et O pour continuer   :");
        choix=enter.nextInt();
        // text=enter.nextLine().charAt(0);
        }
        
        
    }
     
