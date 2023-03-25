import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentsMarks implements ActionListener {
	
	Frame f;
	Label l1,l2;
	TextField tf;
	Button btn1;
	
	public StudentsMarks(){
		
		l1 = new Label("Enter your marks");
		tf = new TextField(30);
		btn1 = new Button("Submit");
		
		l2 = new Label();
		
		
		
		f = new Frame();
		f.setSize(250,250);
		f.setBounds(500,500,500,500);
		
		f.setVisible(true);
		f.setLayout(new GridLayout(5,1));
		
		f.add(l1);
		f.add(tf);
		f.add(btn1);
		f.add(l2);
		
		btn1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		StudentsMarks sc = new StudentsMarks();
	}

	public void actionPerformed(ActionEvent k) {
		// TODO Auto-generated method stub
		
		if(k.getSource() == btn1){
			l2.setText("Entered Successfully");
		}
		
	}

}
