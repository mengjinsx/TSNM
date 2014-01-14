
import javax.swing.plaf.metal.*;
import javax.swing.*;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.*;

class NoIconTheme extends DefaultMetalTheme {

    public String getName() { return "WithoutIcon"; }
    
    public void addCustomEntriesToTable(UIDefaults table) {
         super.addCustomEntriesToTable(table);
         final int size = 0;
         table.put("InternalFrame.closeIcon", MetalIconFactory.getInternalFrameCloseIcon(size));
         table.put("InternalFrame.maximizeIcon", MetalIconFactory.getInternalFrameMaximizeIcon(size));       
         table.put("InternalFrame.minimizeIcon", MetalIconFactory.getInternalFrameAltMaximizeIcon(size));  
    }

}
public class NoIconFrame extends JFrame {

    public NoIconFrame(Frame owner) {
this.setResizable(false);
		// TODO Auto-generated constructor stub
	}

	public static void main( String[] args ) {       
       // JFrame.setDefaultLookAndFeelDecorated(false);

        try {
        	
            javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme( new NoIconTheme());
        
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }  
        catch ( Exception e ) {}
            
        NoIconFrame frame = new NoIconFrame(null);
frame.setTitle("Alt+F4 to close"); 
frame.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}
});
frame.setSize(300,400);
        frame.setVisible(true);
    }
}