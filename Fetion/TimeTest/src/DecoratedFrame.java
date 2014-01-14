import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;


public class DecoratedFrame extends JFrame {

public DecoratedFrame() {

   this.getContentPane().add(new JLabel("Just a test."));

   this.setUndecorated(true); // ȥ�����ڵ�װ��

   this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);

   this.setSize(300,150);

}

public static void main(String[] args) {

   JFrame frame = new DecoratedFrame();

   frame.setVisible(true);

}

}