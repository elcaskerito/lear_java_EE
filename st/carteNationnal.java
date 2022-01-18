package lear_java_EE.st;

public class carteNationnal extends document{
    protected String nationnalite;
    protected String type ;

    // constructeure par defaut

    public carteNationnal(){
        super();
        this.nationnalite="inconnu";
        this.type="inconnu";
    }

    // const d'initialisation 

    public carteNationnal(String intitu,String etat ,String date,String clr,String ag,String pr,String type,String cat){
        
        super(intitu,etat,date,clr,ag,pr);
        this.type=type;
        this.nationnalite=cat ;
   
    }
    @Override
    public String information(){
       
        return "\n le document que vous tester est un : "+this.intitule+" \n"+" de nationnaliter"+this.nationnalite+" \n et de type  "+this.type;
    }
    @Override
    public String infoAgent(){
        return "Agent qui a procedé a l'enregistrement dans le programme s'appel : "+this.nomAgent;
    }

    @Override
    public String prix(){
       return " le prix d'acquisition sera de : "+prix;
    }
    
}
