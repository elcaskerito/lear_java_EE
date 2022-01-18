package lear_java_EE;

public class personne {
    protected String nom;
    protected String prenom;
    protected int age;
    public static String nationnalite="Tchadienne";
//default constructeur
public personne(){
    this.nom="rito";
    this.prenom="popo";
    this.age=2022;
    this.nationnalite="inconnu";
}


// constructeur d'initialisation

    public personne(String no,String pre,int ag)throws ageException{
        if(ag<0)
        {
            throw new ageException(ag);
        }
        else{

            nom=no;
            prenom=pre;
            age=ag;
        }
      
    }

// les accesseur 

    public String getnom(){
        return nom;
    }
    public String getprenom(){
        return prenom;
    }
    public int getage(){
        return age;
    }

// les mutateurs 

    public void setnom(String nn){
        nom=nn;
    }
    public int compare(personne a){
        int b=this.age;
        if(b>a.getage()){
            System.out.print("l'objet appelant a l'age supérieur \n");
        return b;

        }
        else
            System.out.println("l'objet qui est entre parenthèse  est supérieur ");
            return a.getage();

    }
    public String info(){
        return "les infos : "+this.nom+" \nprenom : "+this.prenom+"\n age : "+this.age;
    }

    
}
