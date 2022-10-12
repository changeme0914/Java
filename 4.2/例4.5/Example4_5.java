public class Example4_5 {
public static void main(String args[]){
for(char c='A';c<='Z';c++){
switch(c){
case'B':
case'F':
case'M':
case'Q':
case'T':
case'W':continue;
}
System.out.print(c+" ");
}
System.out.println(" ");
long sum=0,i=1,max=1931,N=0;
while(true){
sum=sum+i;
if(sum>max){
N=i-1;
break;
}
i++;
}
System.out.println("满足1+2+...+n<="+ max +"的最大整数n为"+N);
}
}