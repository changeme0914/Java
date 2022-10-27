public class Circular extends Geometry {
    double b;
    public Circular(double b){
        this.b=b;
    }
    @Override
    public double getArea() {
        return 3.14*(b*b);
    }
}

