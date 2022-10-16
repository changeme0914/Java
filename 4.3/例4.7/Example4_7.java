import java.util.Arrays;
public class Example4_7{
public static void main(String args[]){
char a[]={'a','b','c','d'};
for(int n=0;n<a.length;n++){       //传统遍历数组
System.out.print(a[n]+" ");
}
System.out.println();
for(char ch:a){                  //非传统遍历数组
System.out.print(ch +"");
}
System.out.println();
System.out.println(Arrays.toString(a));
}
}