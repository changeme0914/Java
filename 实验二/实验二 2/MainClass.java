public class MainClass{
    public static void main(String args[ ]){
    Teacher ta=new Teacher();
    ta.a=12;
    ta.b=236;
    double tadd=ta.add();
    System.out.println("��Ϊ:"+tadd);
    Teacher ts=new Teacher();
    ts.a=234;
    ts.b=120;
    double tsub=ts.sub();
    System.out.println("��Ϊ:"+tsub);
    Student s=new Student();
    s.speak();
    }
}