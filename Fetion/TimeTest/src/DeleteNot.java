


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultElement;

public class DeleteNot{   
   public static void main(String[] args) throws Exception {
	
        //�����ļ�����   
        java.io.File file=new java.io.File("d:/YOTC-C8000-Trap.xml");   
        //����һ����ȡXML�ļ��Ķ���   
        SAXReader reader=new SAXReader();   
        //����һ���ĵ�����   
        FileInputStream input = new FileInputStream(file);
        Document document=reader.read(input);   
        //��ȡ�ļ��ĸ��ڵ�   
        Element element=document.getRootElement();
        for(Iterator i=element.elementIterator("MyTrapDef");i.hasNext();){
        	//��ȡ�ڵ�Ԫ��   
        	//element.addComment("H3C����");
           Element subelement=(Element)i.next();
         //  subelement.addComment("H3Cע��");
            for(Iterator it = subelement.elementIterator("TrapCodeDef");it.hasNext();){
            	Element its = (Element)it.next();
            	 String capacity=its.elementText("alarmCategory");//ȡdisk��Ԫ��capacity������ 
            	 Element ise = its.element("alarmType");
           
            	 
            	 Element masterSlive = its.element("masterSlive");
          
//           	 if(masterSlive==null)
//           	 {           		 
//           		 System.out.println(its.element("name").getText());
           		// masterSlive.setText("ū������");
//           		 masterSlive.remove(masterSlive);
//           		 if(its.element("masterSlive")==null){
//           			 its.add(masterSlive);
//           		 }
 //          	 }
            	 if(ise==null){            
            		 System.out.println("There is no alarmType");
            	 }
            	 its.remove(ise);
            	 Element isec = its.element("trapCodesForClear");
            	 String sc=new String();
            	 if(isec==null){            		
            		 System.out.println("There is no trapCodesForClear");
            	 } else {
            		 its.remove(isec);
            	 }
            	
            	 
            	 
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
        OutputFormat xmlFormat = OutputFormat.createPrettyPrint();
        xmlFormat.setEncoding("utf-8");
        //xmlFormat.setEncoding("GBK");
        xmlFormat.setExpandEmptyElements(true);
        //xmlFormat.setLineSeparator(System.getProperty("line.separator"));
     
        FileOutputStream output = new FileOutputStream("d:/cYOTC-C8000-Trap.xml");
        XMLWriter writer = new XMLWriter(output, xmlFormat);
        writer.write(document);
        writer.close();

    }   
}  }}
       