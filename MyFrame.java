package my;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
	JLabel a = new JLabel("1");
	JLabel b = new JLabel("2");
	JLabel c = new JLabel("3");
	JLabel d = new JLabel("4");
	JLabel e = new JLabel("5");

	public MyFrame(String title)
	{
		super(title);
		// 内容面板 (ContentPane)
				Container contentPane = getContentPane();
				contentPane.setLayout(new FlowLayout());
				
				// 向内容面板里添加控件 

				contentPane.add(a);
				contentPane.add(Box.createHorizontalStrut(40));
				contentPane.add(b);
				contentPane.add(c);
				contentPane.add(d);
				contentPane.add(e);
				
				
				a.setOpaque(true);
				a.setBackground(Color.yellow );
				a.setPreferredSize(new Dimension(40, 40));
				a.setHorizontalAlignment(0);
				
				
				b.setOpaque(true);
				b.setBackground(Color.black );
				b.setPreferredSize(new Dimension(40, 40));
				b.setHorizontalAlignment(0);
				
				c.setOpaque(true);
				c.setBackground(Color.blue);
				c.setPreferredSize(new Dimension(40, 40));
				c.setHorizontalAlignment(0);
				
				d.setOpaque(true);
				d.setBackground(Color.red );
				d.setPreferredSize(new Dimension(40, 40));
				d.setHorizontalAlignment(0);
				
				e.setOpaque(true);
				e.setBackground(Color.green );
				e.setPreferredSize(new Dimension(40, 40));
				e.setHorizontalAlignment(0);
				
				

				
				// 设置窗口的其他参数，如窗口大小
				setSize(400, 300);
				
				// 显示窗口
				setVisible(true);			
			

				
	}
}


	

