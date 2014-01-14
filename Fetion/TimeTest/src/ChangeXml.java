import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ChangeXml {
public static void main(String[] args) {
    try {
        FileReader fr = new FileReader("d:/change.xml");//创建FileReader对象，用来读取字符流
        BufferedReader br = new BufferedReader(fr);    //缓冲指定文件的输入
        FileWriter fw = new FileWriter("d:/_25506.xml");//创建FileWriter对象，用来写入字符流
        BufferedWriter bw = new BufferedWriter(fw);    //将缓冲对文件的输出
        String myreadline;    //定义一个String类型的变量,用来每次读取一行
        while (br.ready()) {
            myreadline = br.readLine();//读取一行
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
        bw.flush();    //刷新该流的缓冲
        bw.close();
        br.close();
        fw.close();
        br.close();
        fr.close();
    } catch (IOException e) {
        e.printStackTrace();
    }}
}
