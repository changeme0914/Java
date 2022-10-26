public class Main{
public static void main(String[] args)
{
ChinaPeople cp=new ChinaPeople();
AmericanPeople ap=new AmericanPeople();
BeijingPeople bp=new BeijingPeople();
cp.speakHello();
cp.averageHeight();
cp.averageWeight();
cp.chinaGongfu();

ap.speakHello();
ap.averageHeight();
ap.averageWeight();
ap.americanBoxing();

bp.speakHello();
bp.averageHeight();
bp.averageWeight();
bp.BeijingOpera();
}
}