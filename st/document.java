package lear_java_EE.st;

abstract class document {
    protected String intitule;
    protected String etat;
    protected String dateEnregistrement;
    protected String couleur;
    protected String nomAgent;
    protected String prix;




    // constructeure par defaut

    public document(){
        this.intitule="inconnu";
        this.etat="inconnu";
        this.dateEnregistrement="0/00/0000";
        this.couleur="inconnu";
        this.nomAgent="inconnu";
        this.prix="inconnu";

    }

    // const d'initialisation 

    public document(String nom,String etat,String dateEnregistrement,String clr,String ag,String pr){
        this.intitule=nom;
        this.etat=etat;
        this.dateEnregistrement=dateEnregistrement;
        this.couleur=clr;
        this.nomAgent=ag;
        this.prix=pr;

    }

    abstract String information();
        // this.intitule=nom;
    
    abstract String infoAgent();
        // this.dateEnregistrement=dt;
    
    abstract String prix();
        // this.etat=ty;
    

    // accesseur 

    // public String getNom(){
    //     return this.intitule;
    // }

    // public String getetat(){
    //     return this.etat;
    // }

    // public String getDateEnregistrement(){
    //     return this.dateEnregistrement;
    // }


    // redifinir toString

    public String mere(){
        return " je suis votre classe mere";
    }

    
}
