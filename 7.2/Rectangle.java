public class Rectangle extends Geometry {
    double c,k,g;
    public Rectangle(double c,double k,double g){
        this.c=c;
        this.g=g;
        this.k=k;
    }
    public Rectangle(){

    }
    @Override
    public double getArea() {
        return c*k*g;
    }
}
