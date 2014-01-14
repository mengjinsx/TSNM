package zht.title;



import java.io.FileInputStream;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class MyJdom {
	public static void main(String[] args) throws Exception {
		SAXBuilder sb = new SAXBuilder();//����������
		String path="abc.xml";
		Document doc = sb.build(new FileInputStream(path));//����ָ���ļ�
		Element root = doc.getRootElement();//��ø��ڵ�
		List list = root.getChildren();//�����ڵ��µ������ӽڵ����List��
		for (int i = 0; i < list.size(); i++) {
			System.out.println("---------------------------");
			Element item = (Element) list.get(i);//ȡ�ýڵ�ʵ��
			String id = item.getAttribute("id").getValue();//ȡ������ֵ
			System.out.println("id-->" + id);
			Element sub = item.getChild("title");//ȡ�õ�ǰ�ڵ���ӽڵ�
			String text = sub.getText();//ȡ�õ�ǰ�ڵ��ֵ
			System.out.println("Title-->" + text);
			if (item.getChild("content").getChildren().size() > 0) {
				Element sub2 = item.getChild("content").getChild("name");
				String text2 = sub2.getText();
				System.out.println("name-->" + text2);
			}
			Element sub3 = item.getChild("email");
			String text3 = sub3.getText();
			System.out.println("Email-->" + text3);
		
		}
                        System.out.println("---------------------------");
	}

}
