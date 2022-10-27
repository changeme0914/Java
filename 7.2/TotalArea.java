public class TotalArea {
    Geometry []tuxing=new Geometry[16];
    public TotalArea(Geometry...g) {//这里Geometry...g和Geometry []g一样
            tuxing=g;
    }

    public void getArea() {
        Geometry g=new Rectangle();
        System.out.println(g.computerTotalArea(tuxing));
    }
}
