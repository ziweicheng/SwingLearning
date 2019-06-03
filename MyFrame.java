package my;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
	JLabel Label = new JLabel("Hello,World");
	JButton Button = new JButton("测试");
	JLabel email = new JLabel("Receive news from us");
	JCheckBox cb1 = new JCheckBox();
	static JCheckBox cb2 = new JCheckBox();
	static JTextField text = new JTextField(16);
	public MyFrame(String title)
	{
		super(title);
		// 内容面板 (ContentPane)
				Container contentPane = getContentPane();
				contentPane.setLayout(new FlowLayout());
				
				// 向内容面板里添加控件 , 如 JLabel, JButton
				contentPane.add(Label);
				contentPane.add(cb1);
				contentPane.add(email);
				contentPane.add(cb2);
				contentPane.add(text);
				
				
				//设置Label控件中的字体颜色及提示
				Label.setText("Subscribe my channel");
				Label.setFont(new Font("Times New Roman", 0,22));
				Label.setForeground(Color.BLACK);
				Label.setToolTipText("clikc to follow");
				
				//
				email.setFont(new Font("Times New Roman", 0,22));
				
				//
				cb1.setText("");
				
				
				//设置Button控件中字体颜色及提示
				Button.setText("魏靖是猪");
				Button.setFont(new Font("宋体", 3,18));
				Button.setBackground(new Color(128,255,64));
				Button.setForeground(new Color(255,88,77));
				Button.setToolTipText("点击领取");
				
				// 设置窗口的其他参数，如窗口大小
				setSize(400, 300);
				
				// 显示窗口
				setVisible(true);			
				
				cb2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e)
					{
						textFieldEnable();
						
					}
				});
	}
	private static void textFieldEnable()
	{
		
		if (cb2.isSelected())
		{
			text.setEnabled(true);
		}
		else
			text.setEnabled(false);
	}

}


	

