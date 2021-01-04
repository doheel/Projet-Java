public class JoueurB extends Joueur  {
    public JoueurB(String nom,double x,double y){
        super(nom,x,y);
    }
    public JoueurB(String nom){
        super(nom,0.,0.);

    }
    public boolean lancerBalleB(Balle b){
        //la fonction change la position de la balle et retourne si son joueur là bien lancer ou pas
        //la longueur du terrain est 23,77m, donc si il lance la balle dans l'intervalle de 0->14 la balle est dans le champs du joueur qui a lancé la balle, le joueur adversaire doit gagné un point
        //la largeur du terrain est 8,23m , 
        //Sinon le match va continuer
        b.position[0] =ale(-2,17.);
        b.position[1] =ale(-0.5,9.0);
        b.toPrint();
        if( (b.position[0]>=0)&&(b.position[0]<=14.88) &&(b.position[1]>=0)&&(b.position[1]<=8.23) ) 
            return true;
        return false;
    }
    public void serviceB(Balle b,Joueur a){
        int cpt=0;
        boolean x;
        do{
            x = lancerBalleB(b);
            if(x==false) cpt++;
        }while(x==false); //!la joueur B doit reussir à lancer la balle dans la zone1
        //grace à cpt on peut savoir combien de fois le joueur à rater , quand il rate 2fois le joueur adversaire gagne un point
        for(int i=0;i<(cpt/2);i++){
            a.ajoutPoint();
        }
    }
} 
