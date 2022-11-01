interface Broadcast{
public void Skycast();
}

class Sunny implements Broadcast{
public void Skycast(){
System.out.println("晴天的天气状况为：天气晴朗");
}
}
class Rainy implements Broadcast{
public void Skycast(){
System.out.println("下雨的天气情况为：乌云密布");
}
}
class Snowy implements Broadcast{
public void Skycast(){
System.out.println("雪天的天气情况为：雪花飘飘");
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