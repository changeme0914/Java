interface Broadcast{
public void Skycast();
}

class Sunny implements Broadcast{
public void Skycast(){
System.out.println("���������״��Ϊ����������");
}
}
class Rainy implements Broadcast{
public void Skycast(){
System.out.println("������������Ϊ�������ܲ�");
}
}
class Snowy implements Broadcast{
public void Skycast(){
System.out.println("ѩ����������Ϊ��ѩ��ƮƮ");
}
}

class Sbc{
public void lookBroad(Broadcast S){
S.Skycast();
}
}
public class Main{
public static void main(String args[]){
Sbc s=new Sbc();
s.lookBroad(new Sunny());
s.lookBroad(new Rainy());
s.lookBroad(new Snowy());
}
}