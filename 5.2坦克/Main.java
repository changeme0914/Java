public class Main
{
	public static void main(String args[])
	{
		Tank tank1,tank2;
		tank1= new Tank(0,10);
		tank2= new Tank(1,10);
		System.out.println("坦克1的炮弹的数量为 ："+tank1.number());
		System.out.println("坦克2的炮弹的数量为 ："+tank2.number());
		tank1.hasten(80);
		tank2.hasten(90);
		System.out.println("第一个坦克加速80  第二个坦克加速90");
		System.out.println("坦克1的速度为 ："+tank1.velocity());
		System.out.println("坦克2的速度为 ："+tank2.velocity());
		tank1.decelerate(15);
		tank2.decelerate(30);
		System.out.println("第一个坦克减速15  第二个坦克减速30");
		System.out.println("坦克1的速度 ："+tank1.velocity());
		System.out.println("坦克2的速度 ："+tank2.velocity());
		System.out.println("坦克1开火一次：");
		tank1.fire();
		System.out.println("坦克1的当前炮弹数量为 ："+tank1.number());
		System.out.println("坦克2开火两次：");
		tank2.fire();
		tank2.fire();
		System.out.println("坦克2的当前炮弹数量为 ："+tank2.number());
		System.out.println("当前坦克数量为 ："+Tank.tankNumber());
	}
}

class Tank
{
	int v,n;
	static int tankNumber;
	Tank(int t_v,int t_n){
		v=t_v;
		n=t_n;
		tankNumber=tankNumber+1;
	}
	void hasten(int a){
		v=v+a;
	}
	void decelerate(int b){
		v=v-b;
	}
	int velocity(){
		return v;
	}
	int number(){
		return n;
	}
	void fire(){
		if(n>=1){
			n=n-1;
			System.out.println("已打出一发炮弹！");
		}
		else{
			System.out.println("已无炮弹！");
		}
	}
	static int tankNumber()
	{
	    return tankNumber;       
	}
}