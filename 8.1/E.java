interface DogState{
public void showState();
}

class SoftlyState implements DogState{
public void showState(){
System.out.println("在主人面前，听主人的命令");
}
}

class MeetEnemyState implements DogState{
public void showState(){
System.out.println("遇到敌人狂叫，并冲向去很咬敌人");
}
}

class MeetFriendState implements DogState{
public void showState(){
System.out.println("遇到朋友晃动尾巴，表示欢迎");
}
}

class MeetAnotherDog implements DogState{
public void showState(){
System.out.println("嬉戏");
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

