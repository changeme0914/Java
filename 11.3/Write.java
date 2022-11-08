
import java.io.*;

import java.util.*;


public class Write {
	public static void main (String args[]) {
		 //文件目录
		String str = "单位性质：事业单位\n单位名称：烟台大学\n联系电话：0534-6902433\n单位地址：中国山东省烟台市莱山区清泉路30号";
	    File writefile;
	    BufferedWriter bw;
	    boolean append = true;  //  是否追加
	    String path = "C:\\fox\\实验十一\\ch10\\烟台大学单位信息.txt";
	    writefile = new File(path);
	    if (writefile.exists() == false)   // 判断文件是否存在，不存在则生成
	    {
	        try {
	            writefile.createNewFile();
	            writefile = new File(path);
	        } catch (IOException e) {
	            // TODO 自动生成的 catch 块
	            e.printStackTrace();
	        }
	    } 
	    else {        // 存在先删除，再创建
	        writefile.delete();
	        try {
	            writefile.createNewFile();
	            writefile = new File(path);
	        } catch (IOException e) {
	            // TODO 自动生成的 catch 块
	            e.printStackTrace();
	        }
	    }
	    try {
	        FileWriter fw = new FileWriter(writefile, append);
	        bw = new BufferedWriter(fw);
	        fw.write(str);
	        fw.flush();
	        fw.close();

	    } catch (IOException e) {
	        // TODO 自动生成的 catch 块
	        e.printStackTrace();
	    }
	}
}























/*
public class Write {

public static void main (String args[]) {

//ReadDate();

WriteDate();

}

*/

/* 读取数据


public static void ReadDate() {

String url = “e:/2.txt”;

try {

FileReader read = new FileReader(new File(url));

StringBuffer sb = new StringBuffer();

char ch[] = new char[1024];

int d = read.read(ch);

while(d!=-1){

String str = new String(ch,0,d);

sb.append(str);

d = read.read(ch);

}

System.out.print(sb.toString());

} catch (FileNotFoundException e) {

e.printStackTrace();

} catch (IOException e) {

e.printStackTrace();

}

}
*/


/* 写入数据



public static void WriteDate() {

try{

File file = new File("E:\\Java\\eclipse\\workspace\\Check\\src\\xt\\ch11\\烟台大学单位信息.txt");

if (file.exists()) {

file.delete();

}

file.createNewFile();

BufferedWriter output = new BufferedWriter(new FileWriter(file));

ArrayList ResolveList = new ArrayList();

for (int i = 0; iResolveList.add(Math.random()* 100);

}

for (int i=0 ;ioutput.write(String.valueOf(ResolveList.get(i)) + “\n”);

}

output.close();

} catch (Exception ex) {

System.out.println(ex);

}

}

}*/
