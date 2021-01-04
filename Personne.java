public  class Personne implements Bouger {
    protected double[] position = new double[2];
    
    public Personne(double x,double y){
        position[0]=x;
        position[1]=y;
    }

    public Personne(){
        this(0.,0.);
    }
    public void bouger(double x,double y){
        position[0]=x;
        position[1]=y;
    }
    public double getX(){
        return position[0];
    }
    public double getY(){
        return position[1];
    }
    public String toString(){
        return "le joueur est dans la position ("+position[0]+","+position[1]+")";
    }
    
}
