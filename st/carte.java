package lear_java_EE.st;

public class carte implements present {
    protected String nom_carte;
    protected String type;
    protected String date;


    // constructeure par defaut

    public carte(){
        this.nom_carte="inconu";
        this.type="etudiant";
        this.date="10/12/2001";
    }

    // const d'initialisation 

    public carte(String nom,String type,String date){
        this.nom_carte=nom;
        this.type=type;
        this.date=date;
    }

    public void setNom_carte(String nom){
        this.nom_carte=nom;
    }
    public void setDate(String dt){
        this.date=dt;
    }
    public void setType(String ty){
        this.type=ty;
    }

    // accesseur 

    public String getNom(){
        return this.nom_carte;
    }

    public String getType(){
        return this.type;
    }

    public String getDate(){
        return this.date;
    }

    @Override
    public String bonjour() {
        return "bonjoûr l'implementation";
    }
    // redifinir toString

    public String top(){
        return " Information concernant la carte : \n Nom : "+this.nom_carte+"\n Type de la carte : "+this.type+"\n date d'enregistrement : "+this.date+" \n **********************************\n";
    }


    
}
