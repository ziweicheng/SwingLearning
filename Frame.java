package my;

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
		contentPane.setLayout(new FlowLayout());
		
		JLabel a = new color("1",Color.red);
		JLabel b = new color("2",Color.black);
		color c = new color("3",Color.gray);
		color d = new color("4",Color.green);
		color e = new color("5",Color.pink);
		
		contentPane.add(a);
		contentPane.add(b);
		contentPane.add(c);
		contentPane.add(d);
		contentPane.add(e);
		
		
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
