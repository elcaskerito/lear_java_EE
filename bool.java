package lear_java_EE;
import java.util.ArrayList;
import java.util.Scanner;
public class bool {

   static Scanner re= new Scanner(System.in);
   static public void main(String[] args){
   
    try{
       personne idi=new personne("idris", "mahamat",90);
      
       System.out.println("ma personne a pour nom : "+idi.getnom());
    System.out.println(idi.getprenom());
    System.out.println(idi.getage());
    System.out.println(idi.nationnalite);

    personne nassir=new personne("nassir","ahmat",100);
    System.out.println(nassir.nationnalite);

    idi.compare(nassir);
      }

       catch (ageException e){
          System.out.println("exception sur l'age sur votre instanciation");
       }

   

    


    // test de compréhension du mot clé this
    /**
     * test de commentaire javadoc
     */

    
   System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££");
   zombi has= new zombi();
   System.out.println(has.getnom());
   System.out.println(has.getprenom());
   System.out.println(has.getage());
   System.out.println(has.nationnalite);
   System.out.println(has.getmode());
   System.out.println("************************************************************");

 try {
   zombi a=new zombi("idris", "mahamat",10,"10 personne par jour");

   System.out.println("Zombi a pour nom : "+a.getnom());
   System.out.println(a.getprenom());
   System.out.println(a.getage());
   System.out.println(a.getmode());

   zombi b=new zombi("nassir", "ahmat",50,"50 personne par jour");

   System.out.println("Zombi a pour nom : "+b.getnom());
   System.out.println(b.getprenom());
   System.out.println(b.getage());
   System.out.println(b.getmode());
   
   int tt=a.te(b,10);

   System.out.println("l'age supérieur est ajouter de plus 10 ans ce qui donne :  "+tt);
 }
 catch (ageException e){
    System.out.println(" un autre exception capturé sur l'age du zombi ");
 }
   
   // int var[]=new int[10];
   // int t[]= new int[10];
   // for(int i=0;i<t.length;i++){
   //    System.out.println("enter une valeur svp");
   //    t[i]=re.nextInt(); 
   //    // System.out.println("les elements du tableau "+t[i]);
   // }
   // var=t;
   // for(int j=0;j<=var.length;j++){
   //    System.out.println("les elements du tableau "+var[j]);
   // }
   // re.nextLine();
   System.out.println("***********************-- partie tableau dynamique--*************************************");
   ArrayList<String> data = new ArrayList<String>();
   String stok="";
   for(int h=0;h<=5;h++){

      System.out.println("enter une element svp :");
      stok=re.nextLine();
      data.add(stok);
   }
   for(int k=0;k<data.size();k++){
      System.out.println("vos données inserer :"+data.get(k));
   }

   System.out.println("reponse test contains :"+data.contains("idris"));
   System.out.println("reponse test index :"+data.indexOf("idris"));
   int ds=12_33;
   System.out.println(ds);



   }

    
}
