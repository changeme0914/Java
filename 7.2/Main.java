import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        TotalArea tx[]=new TotalArea[2];
        Geometry g[]=new Rectangle[16]; //��15������
        Geometry g1[]=new Circular[16];//��15��Բ��

        System.out.println("������15�����εĳ����");
        for (int i=0;i<15;i++)
            g[i]=new Rectangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble() );
        tx[0]=new TotalArea(g);

        System.out.println("������15��Բ�εİ뾶");
        for (int i=0;i<15;i++)
            g1[i]=new Circular(sc.nextDouble());
        tx[1]=new TotalArea(g1);

        System.out.print("���õ����ε��������");
        tx[0].getArea();//15�����ε������
        System.out.print("���õ�Բ�ε��������");
        tx[1].getArea();//15��Բ�������
    }
}
/*
3 4 5 7 8 9 5 6 7 3 6 8 9 8 6
3 4 5 7 8 9 5 6 7 3 6 8 9 8 6
3 4 5 7 8 9 5 6 7 3 6 8 9 8 6
* */
/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
 */