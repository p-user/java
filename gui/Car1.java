import javax.swing.*;
import java.awt.*;
public class Car1 extends JFrame {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Car's properties");
		
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 300);
		JCheckBox car1= new JCheckBox("Cd/DVD player");
		
		JCheckBox car2= new JCheckBox("Air conditioner");
		
		JCheckBox car3=new JCheckBox("ABS");
		frame.add(car2);
		frame.add(car1);
		frame.add(car3);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	
}
