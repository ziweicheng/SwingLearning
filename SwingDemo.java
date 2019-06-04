package my;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo
{
	private static void createGUI()
	{
		// JFrame指一个窗口，构造方法的参数为窗口标题

		Frame frame = new Frame("Swing Demo");

		// 当关闭窗口时，退出整个程序 (不懂的话没事，照抄即可，这一行不是重点)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args)
	{
		// 此段代码间接地调用了 createGUI()，具体原理在 Swing高级篇 里讲解
		// 初学者先照抄此代码框架即可
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				createGUI();
			}
		});

	}
}
