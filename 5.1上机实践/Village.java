class Village{
	static int treeAmount;
	int peopleNumber;
	String name;
	Village(String s){
		name=s;
	}
	void treePlanting(int n){
		treeAmount=treeAmount+n;
		System.out.println(name+"ֲ��"+n+"��");
	}
	void fellTree(int n){
		if(treeAmount-n>=0){
			treeAmount=treeAmount-n;
			System.out.println(name+"����"+n+"��");
		}
		else {
			System.out.println("�����ɷ�");
		}
	}
	static int lookTreeAmount(){
		return treeAmount;
	}
	void addPeopleNumber(int n){
		peopleNumber=peopleNumber+n;
		System.out.println(name+"������"+n+"��");
	}
}