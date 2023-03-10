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
		l1.setBounds(200, 310, 300, 100);
		f1.add(l1);
		
		
		Button b = new Button("Enter");
		b.setBounds(350,450,80,50);
		f1.add(b);
		
		
		final Font tf = new Font("Arial",Font.PLAIN,25);
		
		
		
		f1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
			public void mousePressed(MouseEvent arg0) {
				l1.setFont(tf);
				
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
