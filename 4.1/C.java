public class C{
    public static void main(String args[]){
        int i = 10;
        int j = 20;
        int k = 30;
        System.out.println("逻辑运算符：");
        //& “与”
        System.out.println((i > j) & (i > k)); //false & false,输出false
        System.out.println("--------");
        //| “或”
        System.out.println((i > j) | (i > k)); //false | false,输出false

        System.out.println("--------");
        //^ “异或”
        System.out.println((i > j) ^ (i > k)); //false ^ false,输出false

        System.out.println("--------");
        //! “非”，取反
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false，输出true

    }
}

