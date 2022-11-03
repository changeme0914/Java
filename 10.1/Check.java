public class Check {
    String name;
    String date;
    String publish;
    int number;
    final String s="智能";
    public void ck(){
        if(name.contains(s)){
            System.out.println("包含");
        }
        else{
            System.out.println("不含");
        }
    }
    public void Dateshow(){
        System.out.println(date);
    }
    public void book(){
        if(number>50)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
