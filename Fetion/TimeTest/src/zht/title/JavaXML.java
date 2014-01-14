package zht.title;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

public class JavaXML {
	public void buildXML() throws Exception {
		String path = "company_list.xml";
		// 创建根节点 list;    
		Element root = new Element("list");
		//根节点添加到文档中；    
		Document Doc = new Document(root);
		//	 此处 for 循环可替换成 遍历 数据库表的结果集操作;    
		for (int i = 0; i < 5; i++) {
			// 创建子节点 company;
			Element elements = new Element("company");
			// 给 company 节点添加属性 id;
			elements.setAttribute("id", "" + i);
			// 给 company 节点添加子节点并赋值
			
// new Element("company_name")中的 "company_name" 
//替换成表中相应字段，setText("name")中 "name 替换成表中记录值; 
			elements.addContent(new Element("company_name").setText("name" + i));
			elements.addContent(new Element("company_email").setText("@" + i
					+ ".com"));

			// 给父节点list添加company子节点;   
			root.addContent(elements);
		}
		XMLOutputter XMLOut = new XMLOutputter();
		// 输出company_list.xml文件；   
		XMLOut.output(Doc, new FileOutputStream(path));
	}

	public static void main(String[] args) {
		JavaXML javaXML = new JavaXML();
		try {
			javaXML.buildXML();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
