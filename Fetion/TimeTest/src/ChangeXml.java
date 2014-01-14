import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ChangeXml {
public static void main(String[] args) {
    try {
        FileReader fr = new FileReader("d:/change.xml");//����FileReader����������ȡ�ַ���
        BufferedReader br = new BufferedReader(fr);    //����ָ���ļ�������
        FileWriter fw = new FileWriter("d:/_25506.xml");//����FileWriter��������д���ַ���
        BufferedWriter bw = new BufferedWriter(fw);    //��������ļ������
        String myreadline;    //����һ��String���͵ı���,����ÿ�ζ�ȡһ��
        while (br.ready()) {
            myreadline = br.readLine();//��ȡһ��
            if(myreadline.contains("<TrapCodeDef code=")){
            	
            	bw.write(myreadline.replace("TrapCodeDef", "MyTrapDef"));
            	bw.newLine();
            	bw.write("<TrapCodeDef>");
            	bw.newLine();
            } else if(myreadline.contains("</TrapCodeDef>")){
            	bw.write("</TrapCodeDef>");
            	bw.newLine();
            	bw.write("</MyTrapDef>");
            	bw.newLine();
            } else{
            	bw.write(myreadline);
            	bw.newLine();
            }   
          
        }
        bw.flush();    //ˢ�¸����Ļ���
        bw.close();
        br.close();
        fw.close();
        br.close();
        fr.close();
    } catch (IOException e) {
        e.printStackTrace();
    }}
}
