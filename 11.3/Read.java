

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class Read{
	 public static void main(String args[]) {
	     try {
	          File myFile = new File("C:\\fox\\ʵ��ʮһ\\ch10\\ɽ������ѧԺ��λ��Ϣ.txt");//ͨ���ַ�������File���Ͷ���ָ����ַ���·���µ��ļ�

	            if (myFile.isFile() && myFile.exists()) { //�ж��ļ��Ƿ����

	                InputStreamReader Reader = new InputStreamReader(new FileInputStream(myFile), "UTF-8");
	                //���ǵ������ʽ��new FileInputStream(myFile)�ļ��ֽ������������ֽ�Ϊ��λ���ļ��е����ݽ��ж�ȡ
	                //new InputStreamReader(FileInputStream a, "��������")
	                //���ļ��ֽ�������ת��Ϊ�ļ��ַ������������������ʽ

	                BufferedReader bufferedReader = new BufferedReader(Reader);
	                //BufferedReader���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ��
	                //ͨ��BuffereReader��װʵ�ָ�Ч��ȡ

	                String lineTxt = null;

	                while ((lineTxt = bufferedReader.readLine()) != null) {
	                    //buffereReader.readLine()���ж�ȡд���ַ���
	                    System.out.println(lineTxt);
	                }

	                Reader.close();

	            } else {

	                System.out.println("�Ҳ���ָ�����ļ�");

	            }

	        } catch (Exception e) {

	            System.out.println("��ȡ�ļ����ݳ���");

	            e.printStackTrace();
	        }

	    }

}

