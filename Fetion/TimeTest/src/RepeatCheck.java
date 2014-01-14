

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultElement;

public class RepeatCheck{   
   public static void main(String[] args) throws Exception {
	
        //�����ļ�����   
        java.io.File file=new java.io.File("d:/_27608-data(test).xml");   
        //����һ����ȡXML�ļ��Ķ���   
        SAXReader reader=new SAXReader();   
        //����һ���ĵ�����   
        FileInputStream input = new FileInputStream(file);
        Document document=reader.read(input);   
        //��ȡ�ļ��ĸ��ڵ�   
        List<String> list = new ArrayList<String>();
        Set<String> setcode = new HashSet<String>();
        Element element=document.getRootElement();
        for(Iterator i=element.elementIterator("MyTrapDef");i.hasNext();){
        	//��ȡ�ڵ�Ԫ��   
      
           Element subelement=(Element)i.next();
//   String code = subelement.attributeValue("name");
//   list.add(code);
            for(Iterator it = subelement.elementIterator("TrapCodeDef");it.hasNext();){
            	Element its = (Element)it.next();
            	Element name = its.element("name");
            	   String code =  name.getText();
            	   list.add(code);
            	 String capacity=its.elementText("alarmCategory");//ȡdisk��Ԫ��capacity������ 
            	 Element ise = its.element("alarmType");
            	 String s=new String();
            	 Element masterSlive = its.element("masterSlive");                     	 
           	 
            	 if(ise==null){
            		Element temp = its.addElement("alarmType");
            		 System.out.println("There is no alarmType");
            	 }
            	 Element isec = its.element("trapCodesForClear");
            	 String sc=new String();
            	 if(isec==null){
            		 its.addElement("trapCodesForClear");
            		 System.out.println("There is no trapCodesForClear");
            	 }
            	 if(ise!=null)
            	  s = ise.getText();
            	 
            	 
            	 
//	   Document document = DocumentHelper.createDocument();
//       Element _root = document.addElement("ѧ����Ϣ");
//       for(int i=1; i<=10; i++){    	   
//    	   _root.addComment("ѧ��"+i);
//    	   Element _student = _root.addElement("ѧ��");
//    	   _student.addAttribute("sid", "001");
//    	   Element _id = _student.addElement("���");
//    	   _id.setText("001");
//    	   Element _name = _student.addElement("����");
//    	   _name.setText("�һ�");
//    	   Element _age = _student.addElement("����");
//    	   _age.setText("18");
//    	   _root.addText(System.getProperty("line.separator"));
//       }
    
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
//               String directories=element.elementText("directories"); 
//               String files=element.elementText("files"); 
//               System.out.println("������Ϣ:"); 
//               System.out.println("�����̷�:"+name); 
              // System.out.println("��������:"+capacity); 
               //Ϊzhangsan�����Ӷ����ڵ�
//               zhangsan.addElement("email").addAttribute("type",
//                       "����").addText("work@some-domain.com");
//               zhangsan.addElement("email").addAttribute("type",
//                       "˽��").addCDATA("private@some-domain.com"); //����CDATA����
//               <email type="����">work@some-domain.com</email>
//               <email type="˽��"><![CDATA[private@some-domain.com]]></email>
               
//               System.out.println("Ŀ¼��:"+directories); 
//               System.out.println("�ļ���:"+files); 
             //  System.out.println("-----------------------------------"); 
               //its.addComment("�ڵ�");
            
  //      	String name=element.attributeValue("name");
        
           
           
       // input.close();        
//        OutputFormat xmlFormat = OutputFormat.createPrettyPrint();
//       // xmlFormat.setEncoding("utf-8");
//        xmlFormat.setEncoding("GBK");
//        xmlFormat.setExpandEmptyElements(true);
//        xmlFormat.setLineSeparator(System.getProperty("line.separator"));
//     
//        FileOutputStream output = new FileOutputStream("d:/c_25506-data.xml");
//        XMLWriter writer = new XMLWriter(System.out, xmlFormat);
//        writer.write(document);
//        writer.close();

    }   
}
   for(Iterator<String> it = list.iterator(); it.hasNext();){
	   String code = it.next();
	   if(Collections.frequency(list, code)>1){
		   System.out.println(code+"is reapeat!");
	   }
   }     
   
   
   }}
       