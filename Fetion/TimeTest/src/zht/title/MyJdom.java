package zht.title;



import java.io.FileInputStream;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class MyJdom {
	public static void main(String[] args) throws Exception {
		SAXBuilder sb = new SAXBuilder();//建立构造器
		String path="abc.xml";
		Document doc = sb.build(new FileInputStream(path));//读入指定文件
		Element root = doc.getRootElement();//获得根节点
		List list = root.getChildren();//将根节点下的所有子节点放入List中
		for (int i = 0; i < list.size(); i++) {
			System.out.println("---------------------------");
			Element item = (Element) list.get(i);//取得节点实例
			String id = item.getAttribute("id").getValue();//取得属性值
			System.out.println("id-->" + id);
			Element sub = item.getChild("title");//取得当前节点的子节点
			String text = sub.getText();//取得当前节点的值
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
