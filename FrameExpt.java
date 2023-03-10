package Expt2;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FrameExpt {
	
	
	public static void main(String args[]){
		
		//Creating the Frame
		final Frame f1 = new Frame();
		f1.setSize(1000,800);
		f1.setLayout(null); //This will help in fixing the size of the text
		f1.setVisible(true); //By Default it is False meaning invisible
		
		//Creating the text
		final Label l1 = new Label("Hello world");
		l1.setBounds(150, 120, 130, 230);
		f1.add(l1);
		
		
		
		f1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent arg0) {
				
				
			}
			
			public void mouseEntered(MouseEvent arg0) {
				f1.setBackground(Color.BLUE);
				
			}
			
			public void mouseClicked(MouseEvent arg0) {
				l1.setText("Mouse Clicked");
				
			}
		});
		
		
	}
	

}
