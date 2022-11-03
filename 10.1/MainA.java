import java.util.*;
public class MainA {
    public static void main(String args[]){
        Check c=new Check();
        Scanner s=new Scanner(System.in);
        System.out.println("请输入：");
        c.name=s.nextLine();
        c.date=s.nextLine();
        c.publish=s.nextLine();
        c.number=s.nextInt();
        c.ck();
        c.Dateshow();
        c.book();
    }
}
