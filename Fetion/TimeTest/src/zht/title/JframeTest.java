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
		 frame.setLocation(300,300);           //����ʾ���ϱ�Ե300���أ�����ʾ�����Ե300����

         frame.setSize(300,200);            //���ô���Ĵ�СΪ300*200���ش�С

         frame.setResizable(false);       //���ô����Ƿ���Ե�����С������Ϊ����ֵ

         //���ô���ɼ���û�и���䣬���彫���ɼ������������У�����û�н����û�����������

frame.setVisible( true);   

//�û��������ڵĹرհ�ťʱ����ִ�еĲ���

  
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

