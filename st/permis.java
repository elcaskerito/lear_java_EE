package lear_java_EE.st;

public class permis extends document implements present {

    protected String categorie;
    protected String type ;

    // constructeure par defaut

    public permis(){
        super();
        this.categorie="inconnu";
        this.type="inconnu";
    }

    // const d'initialisation 

    public permis(String intitu,String etat ,String date,String clr,String ag,String pr,String type,String cat){
        
        super(intitu,etat,date,clr,ag,pr);
        this.type=type;
        this.categorie=cat ;
   
    }
    @Override
    public String information(){
       
        return "\n le document que vous tester est un : "+this.intitule+" \n"+" de catégorie "+this.categorie+" \n et de type  "+this.type;
    }
    @Override
    public String infoAgent(){
        return "Agent qui a procedé a l'enregistrement dans le programme s'appel : "+this.nomAgent;
    }

    @Override
    public String prix(){
       return " le prix d'acquisition sera de : "+prix;
    }



    @Override
    public String bonjour() {
        return "bonjoûr l'implementation";
    }

    

    
}
