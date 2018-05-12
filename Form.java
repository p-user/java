import java.awt.*;
import javax.swing.*;
class Form extends JFrame{
	public static void main(String[] args) {
		JFrame frame= new JFrame("Form");
		frame.setLayout(new FlowLayout());
		frame.setSize(600, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JLabel obj1= new JLabel("Isim- soyisim");
		JTextField obj2= new JTextField(10);
		JLabel obj3= new JLabel("cinsiyet : ");
		JRadioButton obj4= new JRadioButton("Bayan");
		JRadioButton obj5= new JRadioButton("Bay");
		JLabel obj6= new JLabel(" kayit yaptirmak istediginiz kurslar: ");
		JCheckBox obj7= new JCheckBox(" Dans");
		JCheckBox obj8= new JCheckBox(" Gitar");
		JCheckBox obj9= new JCheckBox(" Resim");
		JButton obj10= new JButton("Tamam");
		frame.add(obj1);
		frame.add(obj2);
		frame.add(obj3);
		frame.add(obj4);
		frame.add(obj5);
		frame.add(obj6);
		frame.add(obj7);
		frame.add(obj8);
		frame.add(obj9);
		frame.add(obj10);
		frame.pack();
		frame.setBounds(50, 50,260, 300);



	}
	
}