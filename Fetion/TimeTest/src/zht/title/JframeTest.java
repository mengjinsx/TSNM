package zht.title;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

public class JframeTest extends JFrame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JframeTest();
		frame.setTitle("test");
		 frame.setLocation(300,300);           //离显示屏上边缘300像素，里显示屏左边缘300像素

         frame.setSize(300,200);            //设置窗体的大小为300*200像素大小

         frame.setResizable(false);       //设置窗体是否可以调整大小，参数为布尔值

         //设置窗体可见，没有该语句，窗体将不可见，此语句必须有，否则没有界面就没有如何意义了

frame.setVisible( true);   

//用户单击窗口的关闭按钮时程序执行的操作

  
         frame.addWindowListener(new WindowAdapter(){
        	 public void windowClosing(java.awt.event.WindowEvent e) {
					System.exit(0);
				}
         });
         System.out.println(frame.getTitle());
		
	}
	JframeTest(){
//		this.addWindowListener(new WindowAdapter(){{
//			JframeTest.this.dispose();
//			System.exit(0);
//		}});
	}
	
}

