
import java.io.*;

import java.util.*;


public class Write {
	public static void main (String args[]) {
		 //�ļ�Ŀ¼
		String str = "��λ���ʣ���ҵ��λ\n��λ���ƣ���̨��ѧ\n��ϵ�绰��0534-6902433\n��λ��ַ���й�ɽ��ʡ��̨����ɽ����Ȫ·30��";
	    File writefile;
	    BufferedWriter bw;
	    boolean append = true;  //  �Ƿ�׷��
	    String path = "C:\\fox\\ʵ��ʮһ\\ch10\\��̨��ѧ��λ��Ϣ.txt";
	    writefile = new File(path);
	    if (writefile.exists() == false)   // �ж��ļ��Ƿ���ڣ�������������
	    {
	        try {
	            writefile.createNewFile();
	            writefile = new File(path);
	        } catch (IOException e) {
	            // TODO �Զ����ɵ� catch ��
	            e.printStackTrace();
	        }
	    } 
	    else {        // ������ɾ�����ٴ���
	        writefile.delete();
	        try {
	            writefile.createNewFile();
	            writefile = new File(path);
	        } catch (IOException e) {
	            // TODO �Զ����ɵ� catch ��
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
	        // TODO �Զ����ɵ� catch ��
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

/* ��ȡ����


public static void ReadDate() {

String url = ��e:/2.txt��;

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


/* д������



public static void WriteDate() {

try{

File file = new File("E:\\Java\\eclipse\\workspace\\Check\\src\\xt\\ch11\\��̨��ѧ��λ��Ϣ.txt");

if (file.exists()) {

file.delete();

}

file.createNewFile();

BufferedWriter output = new BufferedWriter(new FileWriter(file));

ArrayList ResolveList = new ArrayList();

for (int i = 0; iResolveList.add(Math.random()* 100);

}

for (int i=0 ;ioutput.write(String.valueOf(ResolveList.get(i)) + ��\n��);

}

output.close();

} catch (Exception ex) {

System.out.println(ex);

}

}

}*/
