public abstract class Geometry {
    public abstract double getArea();
    public double computerTotalArea(Geometry []a){//�÷�������tuxing��Ԫ�ص���getArea()���� ���ص����֮�͡�
        double area=0;
        for(int i=0;i<15;i++){
            area=area+a[i].getArea();
        }
        return area;
    }
}
