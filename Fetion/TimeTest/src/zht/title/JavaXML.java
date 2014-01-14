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
		// �������ڵ� list;    
		Element root = new Element("list");
		//���ڵ���ӵ��ĵ��У�    
		Document Doc = new Document(root);
		//	 �˴� for ѭ�����滻�� ���� ���ݿ��Ľ��������;    
		for (int i = 0; i < 5; i++) {
			// �����ӽڵ� company;
			Element elements = new Element("company");
			// �� company �ڵ�������� id;
			elements.setAttribute("id", "" + i);
			// �� company �ڵ�����ӽڵ㲢��ֵ
			
// new Element("company_name")�е� "company_name" 
//�滻�ɱ�����Ӧ�ֶΣ�setText("name")�� "name �滻�ɱ��м�¼ֵ; 
			elements.addContent(new Element("company_name").setText("name" + i));
			elements.addContent(new Element("company_email").setText("@" + i
					+ ".com"));

			// �����ڵ�list���company�ӽڵ�;   
			root.addContent(elements);
		}
		XMLOutputter XMLOut = new XMLOutputter();
		// ���company_list.xml�ļ���   
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
