public class Joueur extends Personne {
    protected static int cpt=0 ;
    protected String nom;
    protected int id;
    protected int nbFautes =0;
    protected int points=0 ;
    protected int matchGagnes=0 ; //Nb de matchs gagnés dans la tournoi


    public Joueur(String nom,double x,double y){
        super(x,y);
        this.nom=nom;
        id=++cpt;
        
    }
    public Joueur(String nom){
        this(nom,0.,0.);
    }
    /*
    public Personne touverlieu(){
        return position ;
    }
    */
    public boolean attraperBalle(){
        return Math.random()<(60/100);
    }

    public void prendreBalle(Balle b){
        //Quand le joueur reussi a prendre le balle sa position est la meme que la position du balle
        bouger(b.position[0],b.position[1]);
    }
    public int getFautes(){
        return nbFautes;
    }
    public int getPoints(){
        return points;
    }
    public void ajoutMatchGagne(){
        matchGagnes++;
    }
    public void ajoutPoint(){
        points++;
    }
    public void resetPoints(){
        points=0;
    }
    public String getNom(){
        return nom;
    }
    public boolean joueurGagnant(){
        if(matchGagnes == 4) return true;
        return false ;
    }
    public double ale(double min,double max){
    return (double) (Math.random()*(max-min)+min) ;
    }
}    
