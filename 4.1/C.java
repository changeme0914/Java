public class C{
    public static void main(String args[]){
        int i = 10;
        int j = 20;
        int k = 30;
        System.out.println("�߼��������");
        //& ���롱
        System.out.println((i > j) & (i > k)); //false & false,���false
        System.out.println("--------");
        //| ����
        System.out.println((i > j) | (i > k)); //false | false,���false

        System.out.println("--------");
        //^ �����
        System.out.println((i > j) ^ (i > k)); //false ^ false,���false

        System.out.println("--------");
        //! ���ǡ���ȡ��
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false�����true

    }
}

