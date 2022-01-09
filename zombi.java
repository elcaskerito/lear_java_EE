package lear_java_EE;

public class zombi extends personne {
    private String mode;
    public zombi(){
        super();
        this.mode="mangeur de personne";
    }
    
    public zombi(String nom,String prenom,int ag, String mo){
        super(nom,prenom,ag);
        this.mode=mo;   
    }

    public String getmode(){
        return mode;
    } 

    public int te(personne a,int b){
        int res=super.compare(a);
        res+=b;
        return res;
    }
}
