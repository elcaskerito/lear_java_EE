package lear_java_EE.st;

public class test2 {

    public static void main(String[] args) {
        permis p1=new permis("permis", "en bonne etat", "10/10/2022", "couge", "nassir", "500", "PVC", "ABCD");
        carteNationnal c1 =new carteNationnal("carte nationnal", "en bonne etat", "0", "vert", "idris", "10000", "Numerique", "centrafricaine");
        contrat cont=new contrat("contrat", "usure", "2020/12/2", "blanche", "cendrillon", "20.000", "depliant", "15 témoins");
        System.out.println(p1.information());
        System.out.println(p1.infoAgent());
        System.out.println(p1.prix());
        System.out.println("\n *************************\n");
        System.out.println(c1.information());
        System.out.println(c1.infoAgent());
        System.out.println(c1.prix());
        System.out.println("\n *************************\n");
        System.out.println(cont.information());
        System.out.println(cont.infoAgent());
        System.out.println(cont.prix());

    }
    
}
