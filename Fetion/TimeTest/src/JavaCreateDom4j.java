
//文件格式：
//<?xml version="1.0" encoding="GBK"?>
//<!--以GBK的编码-->
//<PDS>
//  <HEAD>
//    <TRNCOD>交易代码</TRNCOD>
//    <LGNNAM>登陆名称</LGNNAM>
//  </HEAD>
//  <body>
//    <name>张学友</name>
//  </body>
//</PDS>
//
//=====================================
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


public class JavaCreateDom4j {
    public static void main(String[] args){
    	//读取xml文档
    	SAXReader saxReader=new SAXReader();
    	Document doc=null;
    	try {
			 doc =saxReader.read(new FileInputStream(new File("d:/test/xml/dom4jtest1.xml")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 List<Element> listEl=doc.getRootElement().elements();
    	 print(listEl);
}
 /**
     * 递归显示文档内容
     * @param els  elements数组
     */
    public static void print(List<Element> els){
    	for(Element el:els){
    		System.out.println("##"+el.getName()+"--value=="+el.getTextTrim());
    		if(el.hasContent()){
    			print(el.elements());
    		}
    	}
    }}
//结果见图”dom4j遍历xml文档“
