public abstract class Geometry {
    public abstract double getArea();
    public double computerTotalArea(Geometry []a){//该方法返回tuxing的元素调用getArea()方法 返回的面积之和。
        double area=0;
        for(int i=0;i<15;i++){
            area=area+a[i].getArea();
        }
        return area;
    }
}
