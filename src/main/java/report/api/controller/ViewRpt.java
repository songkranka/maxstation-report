package report.api.controller;
import java.awt.Dimension;

import javax.swing.JFrame;

import net.sf.jasperreports.swing.JRViewer;

public class ViewRpt {
	public static void main(String[] args) throws Exception {
		//================= Preview before print ====================
				
		
        JFrame frame = new JFrame("Jasper report");
        TestController xx = new TestController();
        JRViewer viewer = new JRViewer(xx.GenReport3("12345"));
        
        frame.add(viewer);
        frame.setSize(new Dimension(500, 400));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      
	}



	
}
