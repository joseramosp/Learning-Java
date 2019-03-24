import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class StringScramble1 extends WindowAdapter
{
	String originalWord, scrambledWord;
	Scanner userInput = new Scanner(System.in);
	JFrame myFrame = new JFrame("Scramble it");
	JLabel myLable = new JLabel("Enter word to scramble:");
	JTextField textToGet = new JTextField("Enter text Here",20);
	JButton enterIt = new JButton("Enter to Scramble!");
	JTextField textToSet = new JTextField(20);
	Panel p = new Panel();

	public void setUpGui()
	{	enterIt.addActionListener(new WhatShouldTheButtonDo());
		textToGet.addActionListener(new WhatShouldTheButtonDo());
		textToSet.addActionListener(new WhatShouldTheButtonDo());
		myFrame.addWindowListener(this);
		myFrame.add(myLable, BorderLayout.NORTH);
		p.add(textToGet);
		p.add(textToSet);
		myFrame.add(enterIt,BorderLayout.SOUTH);
		myFrame.add(p, BorderLayout.CENTER);
		myFrame.setSize(300,300);
		myFrame.setVisible(true);
	}
	public String scrambleWord(String n)
	{
		System.out.println("Enter word to scramble");

		originalWord = n;
		char tempHold [] = new char[4];

		  tempHold[0]=originalWord.charAt(3);
		  tempHold[1]=originalWord.charAt(0);
		  tempHold[2]=originalWord.charAt(1);
		  tempHold[3]=originalWord.charAt(2);

		scrambledWord= new String(tempHold);


		System.out.println("Scrambled word: " + scrambledWord);

		return scrambledWord;

	}

	public void windowClosing(WindowEvent we)
	{
		System.out.println("shutting down");
		System.exit(0);
	}
	public class WhatShouldTheButtonDo implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("Enter to Scramble!"))
			{
				System.out.println("test");
				String word = scrambleWord(textToGet.getText());
				textToSet.setText(word);
			}
			else
			{
					System.out.println("do nothing");
			}
		}

	}


	public static void main(String args[])
	{
		StringScramble1 game = new StringScramble1();
//		game.scrambleWord();
		game.setUpGui();

	}



}