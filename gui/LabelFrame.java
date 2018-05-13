//14.6 labelframe example
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	public LabelFrame(){
		super("testing JLabel");//title of the window 
		setLayout(new FlowLayout());// frame layout

		label1= new JLabel("JLabel with only text");
		label1.setToolTipText("this is label1");
		add(label1);


		Icon albania= new ImageIcon( getClass().getResource("albania.png"));
		Icon me= new ImageIcon( getClass().getResource("index.jpeg"));
		//me.setSize(70,80);
		label2= new JLabel("JLabel with icon and text", albania, SwingConstants.LEFT);
		label2.setToolTipText("this is label2");
		add(label2);

		label3= new JLabel();
		label3.setText("JLabel with setText");
		label3.setIcon(me);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("this is label3");
		add(label3);




	}
	
}