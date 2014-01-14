
//�ļ���ʽ��
//<?xml version="1.0" encoding="GBK"?>
//<!--��GBK�ı���-->
//<PDS>
//  <HEAD>
//    <TRNCOD>���״���</TRNCOD>
//    <LGNNAM>��½����</LGNNAM>
//  </HEAD>
//  <body>
//    <name>��ѧ��</name>
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
    	//��ȡxml�ĵ�
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
     * �ݹ���ʾ�ĵ�����
     * @param els  elements����
     */
    public static void print(List<Element> els){
    	for(Element el:els){
    		System.out.println("##"+el.getName()+"--value=="+el.getTextTrim());
    		if(el.hasContent()){
    			print(el.elements());
    		}
    	}
    }}
//�����ͼ��dom4j����xml�ĵ���
