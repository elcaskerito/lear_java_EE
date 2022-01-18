package lear_java_EE;

public class ageException extends Exception {

    public ageException(int ag){

        super();
        System.out.println(" vous instancier une persone avec un age négatif");
        System.out.println("\t => "+ag);
    }
    
}
