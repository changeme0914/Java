import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;
public class DateMain {
    public static void main(String args[]){
        Date nowTime=new Date();
        System.out.println(nowTime);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String gmt = dateFormat.format(new Date()) + "Z";
        System.out.println("格林威治时间为：" + gmt);
        long totalSeconds=System.currentTimeMillis()/1000;
        long currentSeconds=totalSeconds%60;
        long currentMinutes=totalSeconds/60%60;
        long currentHours=totalSeconds/3600%24+8;
        System.out.printf("%d,%d,%d\n",currentHours,currentMinutes,currentSeconds);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        String year=String.valueOf(calendar.get(Calendar.YEAR));
        String month=String.valueOf(calendar.get(Calendar.MONTH)+1);
        String day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(year+"年"+month+"月"+day+"天");
    }
}
