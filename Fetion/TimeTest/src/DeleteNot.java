


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
	
        //创建文件对象   
        java.io.File file=new java.io.File("d:/YOTC-C8000-Trap.xml");   
        //创建一个读取XML文件的对象   
        SAXReader reader=new SAXReader();   
        //创建一个文档对象   
        FileInputStream input = new FileInputStream(file);
        Document document=reader.read(input);   
        //获取文件的根节点   
        Element element=document.getRootElement();
        for(Iterator i=element.elementIterator("MyTrapDef");i.hasNext();){
        	//获取节点元素   
        	//element.addComment("H3C厂商");
           Element subelement=(Element)i.next();
         //  subelement.addComment("H3C注释");
            for(Iterator it = subelement.elementIterator("TrapCodeDef");it.hasNext();){
            	Element its = (Element)it.next();
            	 String capacity=its.elementText("alarmCategory");//取disk子元素capacity的内容 
            	 Element ise = its.element("alarmType");
           
            	 
            	 Element masterSlive = its.element("masterSlive");
          
//           	 if(masterSlive==null)
//           	 {           		 
//           		 System.out.println(its.element("name").getText());
           		// masterSlive.setText("奴属主机");
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
//       Element _root = document.addElement("学生信息");
//       for(int i=1; i<=10; i++){    	   
//    	   _root.addComment("学生"+i);
//    	   Element _student = _root.addElement("学生");
//    	   _student.addAttribute("sid", "001");
//    	   Element _id = _student.addElement("编号");
//    	   _id.setText("001");
//    	   Element _name = _student.addElement("姓名");
//    	   _name.setText("灰机");
//    	   Element _age = _student.addElement("年龄");
//    	   _age.setText("18");
//    	   _root.addText(System.getProperty("line.separator"));
//       }
    
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
//               String directories=element.elementText("directories"); 
//               String files=element.elementText("files"); 
//               System.out.println("磁盘信息:"); 
//               System.out.println("分区盘符:"+name); 
              // System.out.println("分区容量:"+capacity); 
               //为zhangsan下增加二个节点
//               zhangsan.addElement("email").addAttribute("type",
//                       "工作").addText("work@some-domain.com");
//               zhangsan.addElement("email").addAttribute("type",
//                       "私人").addCDATA("private@some-domain.com"); //设置CDATA内容
//               <email type="工作">work@some-domain.com</email>
//               <email type="私人"><![CDATA[private@some-domain.com]]></email>
               
//               System.out.println("目录数:"+directories); 
//               System.out.println("文件数:"+files); 
             //  System.out.println("-----------------------------------"); 
               //its.addComment("节点");
            
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
       