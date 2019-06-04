package my;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame
{

	public Frame(String name)
	{
		super(name);
		
		//第一层Layout
		Container contentPane = getContentPane();
		Box box1 = Box.createVerticalBox();
		
		//添加配置下拉列表
		JComboBox<String> com= new JComboBox<>();
		com.addItem("Choose one color");
		com.addItem("Input your password");
		com.setMaximumSize(new Dimension(9999,30));
		
		// add Button 可以不要
//		JButton a1 = new JButton("Red");
//		JButton a2 = new JButton("Green");
//		JButton a3 = new JButton("Blue");
		
		//第三层Layout
		Box box2 = Box.createHorizontalBox();
			
		//第二层Layout CardLayout
		JPanel cards = new JPanel(new CardLayout());
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		CardLayout cl = (CardLayout) cards.getLayout();
		card1.add(box2);
		card2.add(new JTextField ("Please input your password",16 ));
		cards.add(card1, "button");
		cards.add(card2,"text");
				
		// box2 add button
		box2.add(new JButton("Red"));
		box2.add(new JButton("Green"));
		box2.add(new JButton("Blue"));
		
		//Add component to panel
		contentPane.add(box1);
		box1.add(com);
		box1.add(Box.createVerticalStrut(40));
		box1.add(cards);
		
		//添加监听器
		com.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e)
			{
				if (com.getSelectedIndex() == 0)
					cl.show(cards, "button");
				else if (com.getSelectedIndex() == 1)
					cl.show(cards, "text");
			
			}
		});
			
		setVisible(true);
		setSize(400,400);
		
	}
	
}
