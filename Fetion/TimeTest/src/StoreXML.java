
import java.util.*;
import java.io.*;
public class StoreXML {
    public static void main(String args[]) throws Exception {
      Properties prop = new Properties();
      prop.setProperty("one-two", "中国人vpn好的");
      prop.setProperty("three-four", "");
      prop.setProperty("five-six", "pick up sticks");
      prop.setProperty("seven-eight", "lay them straight");
      prop.setProperty("nine-ten", "a big, fat hen");
      FileOutputStream fos =
        new FileOutputStream("d:\\rhyme.properties");
      prop.store(fos, "Rhyme");
      
     BufferedWriter zhWriter =new BufferedWriter(new OutputStreamWriter(  
             new FileOutputStream(new File("d:\\zhrhyme.properties"), false)));   
    	
		BufferedWriter enWriter = new BufferedWriter(new FileWriter(new File("d:\\enrhyme.properties"), false));
		prop.store(enWriter, null);
		prop.store(zhWriter, null);
      
      zhWriter.flush();
      enWriter.flush();
      
      
      fos.flush();
      fos.close();      
      //System.exit(0);
    }
}