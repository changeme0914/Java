public class Example
{
    public static void main(String args[ ])
    {
        Area ra=new Area();
        ra.width=3;
        ra.height=4;
        double rarea=ra.getRectArea();
        System.out.println("���ε����:"+rarea);

        Area la=new Area();
        la.above=2;
        la.bottom=4;
        la.height=3;
        double larea=la.getLaderArea();
        System.out.println("���ε����:"+larea);
        
    }
}