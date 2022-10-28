interface DogState{
public void showState();
}

class SoftlyState implements DogState{
public void showState(){
System.out.println("��������ǰ�������˵�����");
}
}

class MeetEnemyState implements DogState{
public void showState(){
System.out.println("�������˿�У�������ȥ��ҧ����");
}
}

class MeetFriendState implements DogState{
public void showState(){
System.out.println("�������ѻζ�β�ͣ���ʾ��ӭ");
}
}

class MeetAnotherDog implements DogState{
public void showState(){
System.out.println("��Ϸ");
}
}


class Dog{
DogState state;
public void cry(){
state.showState();
}
public void setState(DogState s){
state = s;
}
}


public class E{
public static void main(String arg[]){
Dog yellowDog = new Dog();
yellowDog.setState(new SoftlyState());
yellowDog.cry();
yellowDog.setState(new MeetEnemyState());
yellowDog.cry();
yellowDog.setState(new MeetFriendState());
yellowDog.cry();
yellowDog.setState(new MeetAnotherDog());
yellowDog.cry();

}
}

