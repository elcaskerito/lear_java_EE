package lear_java_EE;

public class test {

    public static void main(String[] args){
    // basic_construct idi=new basic_construct("idris", "mahamat");
    // System.out.println("iii");

   personne p = null;
   try{
            p = new personne("idris", "mahamat", -10);
   
   }
   catch(ageException e){

            // p=new personne();
            System.out.println(e.getMessage());
   }

     System.out.println(p.info());

    }
    
}
