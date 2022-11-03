public class Main{
    public static void main(String args[])
    {
        String s="酱油：6.7圆，精盐：0.8圆，榨菜：9.8圆";
        String regex ="[0123456789.]+圆";
        String temp=s.replaceAll(regex," ");
        temp=temp.replaceAll("："," ");
        temp=temp.replaceAll("，"," ");
        System.out.println("货物名称："+temp);
    }
}