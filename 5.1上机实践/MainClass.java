public class MainClass{
        public static void main(String args[]){
                Village zhaoZhuang,maJiaHeZhi;
                zhaoZhuang=new Village("��ׯ");
                maJiaHeZhi=new Village("��Һ���");
                zhaoZhuang.peopleNumber=100;
                maJiaHeZhi.peopleNumber=150;
                Village.treeAmount=200;
                int leftTree=Village.treeAmount;
                System.out.println("ɭ������"+leftTree+"����");
		zhaoZhuang.treePlanting(50);
		leftTree=maJiaHeZhi.lookTreeAmount();
		System.out.println("ɭ������"+leftTree+"����");
		maJiaHeZhi.fellTree(70);
		leftTree=Village.lookTreeAmount();
                System.out.println("ɭ������"+leftTree+"����");
                System.out.println("��ׯ���˿�"+zhaoZhuang.peopleNumber);
		zhaoZhuang.addPeopleNumber(12);
		System.out.println("��ׯ���˿�"+zhaoZhuang.peopleNumber);
		System.out.println("��Һ��ӵ��˿�"+maJiaHeZhi.peopleNumber);
		maJiaHeZhi.addPeopleNumber(10);
		System.out.println("��Һ��ӵ��˿�"+maJiaHeZhi.peopleNumber);
        }
}
