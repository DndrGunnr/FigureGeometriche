public class Cerchio extends Forma {
    private double raggio;
    


    public Cerchio() {
    }


    //costruttore parametro
    public Cerchio(double raggio){
       this.raggio=raggio;
    }


    @Override
    public double area(){
        return raggio*raggio*Math.PI;
    }
    @Override
    public double perimetro(){
        return raggio*2*Math.PI;
    }


    public double getRaggio() {
        return raggio;
    }


    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }
        
    

    
}
