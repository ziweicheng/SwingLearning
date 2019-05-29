package my;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame
{
	//变量定义
	JButton test = new JButton("show time");
	JLabel timeLabel = new JLabel("00:00:00");
	public MyFrame(String title)
	{
		super(title);
				// 内容面板 (ContentPane)
				Container contentPane = getContentPane();
				contentPane.setLayout(new FlowLayout());
				
				// 向内容面板里添加控件 , 如 JLabel显示时间, JButton显示按钮

				contentPane.add(test);
				contentPane.add(timeLabel);
				
				// 设置窗口的其他参数，如窗口大小
				setSize(400, 300);
				
				// 显示窗口
				setVisible(true);	
				
				//匿名内部类写法,引用Interface  ActionListener
//				test.addActionListener(new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e)
//					{
//						showtime();
//						
//					}					
//				});
				
				//Lambda 写法
				test.addActionListener( (e) ->{
					showtime();
				});
				
	}
	private void showtime() 
	{
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(new Date());
		timeLabel.setText(time);
		
	}

}


	

