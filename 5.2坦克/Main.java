public class Main
{
	public static void main(String args[])
	{
		Tank tank1,tank2;
		tank1= new Tank(0,10);
		tank2= new Tank(1,10);
		System.out.println("̹��1���ڵ�������Ϊ ��"+tank1.number());
		System.out.println("̹��2���ڵ�������Ϊ ��"+tank2.number());
		tank1.hasten(80);
		tank2.hasten(90);
		System.out.println("��һ��̹�˼���80  �ڶ���̹�˼���90");
		System.out.println("̹��1���ٶ�Ϊ ��"+tank1.velocity());
		System.out.println("̹��2���ٶ�Ϊ ��"+tank2.velocity());
		tank1.decelerate(15);
		tank2.decelerate(30);
		System.out.println("��һ��̹�˼���15  �ڶ���̹�˼���30");
		System.out.println("̹��1���ٶ� ��"+tank1.velocity());
		System.out.println("̹��2���ٶ� ��"+tank2.velocity());
		System.out.println("̹��1����һ�Σ�");
		tank1.fire();
		System.out.println("̹��1�ĵ�ǰ�ڵ�����Ϊ ��"+tank1.number());
		System.out.println("̹��2�������Σ�");
		tank2.fire();
		tank2.fire();
		System.out.println("̹��2�ĵ�ǰ�ڵ�����Ϊ ��"+tank2.number());
		System.out.println("��ǰ̹������Ϊ ��"+Tank.tankNumber());
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
			System.out.println("�Ѵ��һ���ڵ���");
		}
		else{
			System.out.println("�����ڵ���");
		}
	}
	static int tankNumber()
	{
	    return tankNumber;       
	}
}