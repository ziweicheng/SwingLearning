package my;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InternalClass extends JFrame
{
	JButton button = new JButton("Show time");
	JLabel timeLabel = new JLabel("00:00:00");
	public InternalClass(String title) 
	{
		super (title);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(button);
		contentPane.add(timeLabel);
		
		setSize(1280,720);
		setVisible(true);
		
		//创建一个内部类，以及内部类变量，调用变量及其方法
		clock clock = new clock();
		button.addActionListener(clock);
	}
	private class clock implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			showtime();
			
		}
		
	}
	private void showtime()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(new Date());
		timeLabel.setText(now);
	}

}
