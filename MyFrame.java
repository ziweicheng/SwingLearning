package my;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
	static JTextField text = new JTextField(6);
	public MyFrame(String title) {
		super(title);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		
		setVisible(true);
		setSize(400,200);
		
		
		
		text.setFont(new Font("Times New Roman", 0,12));
		text.setForeground(Color.black);
		JLabel Label = new JLabel("Do you agree VJ is a pig? ");
		Label.setFont(new Font("Times New Roman", 3,12));
		Label.setToolTipText("Answer the question in the text field.");
		Label.setForeground(Color.ORANGE);
		JButton Button = new JButton("submit");
		
		
		
		
		contentPane.add(Label);
		contentPane.add(text);
		contentPane.add(Button);
		 
		Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				a();
				
			}
		});
	}
	
	private static void a() {
		String result;
		result = text.getText();
		if (result.equals("yes") )		
			JOptionPane.showMessageDialog(text, "Congratulation");
		else if (result.equals("Yes"))
			JOptionPane.showMessageDialog(text, "Congratulation");
		else
			JOptionPane.showMessageDialog(text, "She is not a pig but you are!");
	}
	
}
