import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        TotalArea tx[]=new TotalArea[2];
        Geometry g[]=new Rectangle[16]; //建15个矩形
        Geometry g1[]=new Circular[16];//建15个圆形

        System.out.println("请输入15个矩形的长宽高");
        for (int i=0;i<15;i++)
            g[i]=new Rectangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble() );
        tx[0]=new TotalArea(g);

        System.out.println("请输入15个圆形的半径");
        for (int i=0;i<15;i++)
            g1[i]=new Circular(sc.nextDouble());
        tx[1]=new TotalArea(g1);

        System.out.print("所得到矩形的总面积：");
        tx[0].getArea();//15个矩形的面积和
        System.out.print("所得到圆形的总面积：");
        tx[1].getArea();//15个圆的面积和
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