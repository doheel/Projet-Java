public class Balle implements Bouger {
    public double[] position = new double[2] ;
    //private double[] terrain_limite = new double[2] ;

//On va supposer que les dimensions du terrain sont Larg=8,23 et long=23,77
    public Balle(double x,double y){
        position[0]=x;
        position[1]=y;
    }
    
    public double getX(){
        return position[0] ;
    }
    public double getY(){
        return position[1] ;
    }
    public String toString(){
        return "la position de la balle ("+position[0]+","+position[1]+").";
    }
    public void toPrint(){
        System.out.println("la position de la balle ("+position[0]+","+position[1]+").");
    }
    public void bouger(double x,double y){
      
    }
}
