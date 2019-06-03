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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
	JComboBox<String> Colorlist = new JComboBox<>();
	JLabel Label = new JLabel("TEST");

	public MyFrame(String title)
	{
		super(title);
		// 内容面板 (ContentPane)
				Container contentPane = getContentPane();
				contentPane.setLayout(new FlowLayout());
				
				// 向内容面板里添加控件 
				contentPane.add(Colorlist);
				contentPane.add(Label);
				
				
				
				
				// 向泛型类里面添加数据
				Colorlist.addItem("red");
				Colorlist.addItem("grey");
				

				
				// 设置窗口的其他参数，如窗口大小
				setSize(400, 300);
				
				// 显示窗口
				setVisible(true);			
			
				Colorlist.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e)
					{
						// TODO Auto-generated method stub
						if (Colorlist.getSelectedIndex() == 0)
							Label.setForeground(Color.red);
						if (Colorlist.getSelectedIndex() == 1)
							Label.setForeground(Color.GRAY);
						
					}
					
				});
				
	}
}


	

