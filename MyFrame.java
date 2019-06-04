package my;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame
{

	public MyFrame(String name)
	{
		super(name);
		
		Container contentPane = getContentPane();
//		LayoutManager M = new BoxLayout(contentPane, BoxLayout.X_AXIS);
//		contentPane.setLayout(M);
		
		// Box 是一个JComponent， 内部使用了BoxLayout
		Box box = Box.createHorizontalBox();
		
		
		JLabel a = new color("1",Color.red);
		JLabel b = new color("2",Color.black);
		color c = new color("3",Color.gray);
		color d = new color("4",Color.green);
		color e = new color("5",Color.pink);
		
		//设置LabelSize
		a.setPreferredSize(new Dimension(80,0));
		a.setMaximumSize(new Dimension(60,60));
		b.setMaximumSize(new Dimension(120,60));
		c.setMaximumSize(new Dimension(120,120));
		d.setMaximumSize(new Dimension(60,60));
		e.setMaximumSize(new Dimension(80,60));
		
		contentPane.add(box);
		box.add(a);
		box.add(Box.createVerticalStrut(10));
		box.add(b);
		box.add(Box.createVerticalStrut(10));
		box.add(c);
		box.add(Box.createVerticalStrut(10));
		box.add(d);
		box.add(Box.createVerticalStrut(10));
		box.add(e);
		
		
		setVisible(true);
		setSize(400,400);
		
	}
	
	private static class color extends JLabel
	{
		public color(String title, Color b)
		{
			super(title);
			setOpaque(true);
			setBackground(b);
			setPreferredSize(new Dimension(40, 40));
			setHorizontalAlignment(0);
		}
	}
	
}