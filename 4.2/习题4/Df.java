import java.util.Scanner;
public class Df{
public static void main(String args[]){
Scanner reader = new Scanner(System.in);
System.out.print("请输入您的用电量：");
int Electric = reader.nextInt();
float price=0f;
if(Electric<=90&&Electric>=1)
{
price=Electric*0.6f;
}
if(Electric>=91&&Electric<=150)
{
price=90*0.6f+(Electric-90)*1.1f;
}
if(Electric>=151)
{
price=90*0.6f+60*1.1f+(Electric-150)*1.7f;
}
System.out.println("您的电费为："+price);
}
}
