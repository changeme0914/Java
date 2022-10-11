public class E{
    public static void main(String args[]){
        int i = 10;
        int j = 20;
       System.out.println("位运算符：");
        //& “与”
        System.out.println((i & j) ); 
        System.out.println("--------");
        //| “或”
        System.out.println((i | j) ); 

        System.out.println("--------");
        //^ “异或”
        System.out.println((i ^ j)  ); 

        System.out.println("--------");
        //! “非”，取反
        System.out.println(~(i )); 

    }
}

