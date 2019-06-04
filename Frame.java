package my;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame
{

	public Frame(String name)
	{
		super(name);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JLabel a = new color("1",Color.red);
		JLabel b = new color("2",Color.black);
		color c = new color("3",Color.gray);
		color d = new color("4",Color.green);
		color e = new color("5",Color.pink);
		
		//上下Border宽度固定100% 中间部分高度固定100%
		b.setPreferredSize(new Dimension(150,60));
		c.setPreferredSize(new Dimension(80,30));
		d.setPreferredSize(new Dimension(120,80));
		
		contentPane.add(a,BorderLayout.PAGE_START);
		contentPane.add(b,BorderLayout.LINE_START);
		contentPane.add(c,BorderLayout.CENTER );
		contentPane.add(d,BorderLayout.LINE_END);
		contentPane.add(e,BorderLayout.PAGE_END);
		
		
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
