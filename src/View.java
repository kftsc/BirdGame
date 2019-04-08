import java.awt.Button;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
// author Sicheng Tian
public class View extends JPanel{
	BufferedImage[] imgs;
	int frameHeight;
	int frameWidth;
	JFrame frame;
	ArrayList<Button> list;
	
	// initialize the frameHeight, frameWidth
	// initialize imgs by calling createImage method
	// initialize the frame and button
	// add button to the JPanel
	public View() {
		
	}
	
	// consume a Model and update the image according to the Model
	// and call the repaint method
	public void update(Model model) {
		
	}
	
	public void paintComponent(Graphics g) {
		
	}
	
	// read the image and return it
	public BufferedImage createImage() {
		return null;
	}
}
