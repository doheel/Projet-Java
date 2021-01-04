public class Match{
    private JoueurA a ;
    private JoueurB b ;

    public Match(JoueurA a, JoueurB b){
        this.a=a;
        this.b=b;
    }

    public void matchEstGagne(){
        if(b.getPoints() > a.getPoints()){
            System.out.println("le joueur "+b.getNom() +" a gagné le match !");
            b.ajoutMatchGagne() ;
        }  
        else if(b.getPoints() < a.getPoints() ){
            System.out.println("le joueur "+a.getNom()+" a gagné le match !");
            a.ajoutMatchGagne() ;
        }
        else{
            System.out.println("Egalité !!");
        }
    }
    /*Dans un match le joueur peut gagner un point:
    1- si son adversaire lance la balle en dehors du terrain
    2- si l'adversaire ne reussit pas à attraper la balle quand elle est tu les limite droite et gauche du terrain
    */
    public void Jouer(){
        //1h45=105min : la durée moyenne d'un match
        Balle balle= new Balle(0.,0.);
        a.lancerBalleA(balle);
        while( (a.getPoints() <=40)&&(b.getPoints() <=40) ){
            if(b.attraperBalle()){
            //Quand le joueur reussit à attraper la balle il va la lancer  
            //sinon l'adversaire gagne un point puis le joueurB joue un sevice
                boolean i = b.lancerBalleB(balle);
                //si le joueur ne reussit pas à lancer la balle : son adversaire gagne un point puis le joueurB rejoue un service
                //s'il reussit a lancer la balle le match continue normal
                if (i==false)
                    a.ajoutPoint();
                    b.serviceB(balle,a);
            }
            else{
                //Quand le joueur ne reussit pas à attraper la balle, l'adversaire gagne un point et le joueur relance la balle
                a.ajoutPoint();
                b.serviceB(balle,a);
            }

            if(a.attraperBalle()){
                //Quand le joueur reussit à attraper la balle il va la lancer  
                //sinon l'adversaire gagne un point puis le joueurA joue un sevice
                    boolean i = a.lancerBalleA(balle);
                    //si le joueur ne reussit pas à lancer la balle : son adversaire gagne un point puis le joueurA rejoue un service
                    //s'il reussit a lancer la balle le match continue normal
                    if (i==false)
                        b.ajoutPoint();
                        a.serviceA(balle,b);
              }
            else{
                    //Quand le joueur ne reussit pas à attraper la balle, l'adversaire gagne un point et le joueur relance la balle
                    b.ajoutPoint();
                    a.serviceA(balle,b);
            }
        }
        matchEstGagne();
        a.resetPoints(); b.resetPoints() ;
  }
}
