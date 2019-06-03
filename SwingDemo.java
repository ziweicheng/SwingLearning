package my;

import javax.swing.JFrame;

public class SwingDemo
{
	private static void createGUI()
	{
		MyFrame myFrame = new MyFrame("Text Field");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
