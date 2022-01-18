package lear_java_EE.st;

public class contrat extends document{
    protected String temoin;
    protected String type ;

    // constructeure par defaut

    public contrat(){
        super();
        this.temoin="inconnu";
        this.type="inconnu";
    }

    // const d'initialisation 

    public contrat(String intitu,String etat ,String date,String clr,String ag,String pr,String type,String cat){
        
        super(intitu,etat,date,clr,ag,pr);
        this.type=type;
        this.temoin=cat ;
   
    }
    @Override
    public String information(){
       
        return "\n le document que vous tester est un : "+this.intitule+" \n"+" qui est conclu avec "+this.temoin+" temoins \n et c'est un contrat de :  "+this.type;
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
