package lear_java_EE.exception;

public class test {

    public static void main(String[] args) {
        
        int i=0;
        int j=10;
        int c;
     
        try{
            System.out.println(   c=j/i);
        }
        catch(ArithmeticException e){
            System.out.println("attention division par zero"+e.getMessage());
        }
        System.out.println("continuons notre traitement ");

    }
    
}
