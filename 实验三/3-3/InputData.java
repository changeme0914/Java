import java.util.Scanner;
public class InputData{
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        int amout=0;
        float price=0,sum=0;
        System.out.println("�����Ʒ�������س�ȷ�ϣ���");
        amout=reader.nextInt();
        System.out.println("�����Ʒ���ۣ��س�ȷ�ϣ���");
        price=reader.nextFloat();
        sum=price*amout;
        System.out.printf("������%d,���ۣ�%5.2f,�ܼ۸�%5.2f",amout,price,sum);
        
    }
}