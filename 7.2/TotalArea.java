public class TotalArea {
    Geometry []tuxing=new Geometry[16];
    public TotalArea(Geometry...g) {//����Geometry...g��Geometry []gһ��
            tuxing=g;
    }

    public void getArea() {
        Geometry g=new Rectangle();
        System.out.println(g.computerTotalArea(tuxing));
    }
}
