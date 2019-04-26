import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;

public class CalculatorGUI_JoseRamos extends WindowAdapter
{
	//DECLARE SWING GUI COMPONENTS (NOT THAT DIFFERENT FROM AWT)
	JFrame myJFrame;
	JPanel myJPanel;
	JTextField myJTextField;
	JButton jB1, jB2;
    ArrayList <JButton> buttons = new ArrayList<JButton>();

	public void setUpGui()
	{
		//INSTANTIATING SWING OBJECTS
		myJFrame = new JFrame("Calculator by Jose Ramos");
		myJPanel = new JPanel();
        myJTextField = new JTextField("bbbkj");

        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        // Blocking text field
        myJTextField.setEditable(false);
        myJTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        myJTextField.setFont(font1);

		//creating new buttons
		jB1 = new JButton("Hello!");
		jB2 = new JButton("Good bye!");

		//changing the layout of the panel and then adding it to the frame
		myJPanel.setLayout(new GridLayout(5,4));

		myJTextField.addActionListener(new ButtonHandler());
		jB1.addActionListener(new ButtonHandler());
		jB2.addActionListener(new ButtonHandler());

        // myJFrame.add(myJPanel, BorderLayout.NORTH);
		// myJFrame.add(jB1, BorderLayout.CENTER);
		// myJFrame.add(jB2, BorderLayout.SOUTH);

        String buttonsText = "%÷789X456-123+0.=";

        buttons.add(new JButton("AC"));
        buttons.add(new JButton("+/-"));

        for(int i = 0; i<buttonsText.length(); i++)
        {
            buttons.add(new JButton(String.valueOf(buttonsText.charAt(i))));
        }
        for(int i = 0; i<buttons.size(); i++)
        {
            myJPanel.add(buttons.get(i));
        }

        // Adding panels and elements to frame
        myJFrame.add(myJTextField, BorderLayout.NORTH);
        myJFrame.add(myJPanel);

		myJFrame.addWindowListener(this);
        //myJFrame.setSize(500,500);
		myJFrame.pack();
		myJFrame.setVisible(true);
	}

	public void windowClosing(WindowEvent we)
	{
		System.out.println("Program is closing");
		System.exit(0);
	}


	public class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("Hello!"))
			{
				myJTextField.setText(jB1.getText());
				System.out.println("hi");
			}
			else if(e.getActionCommand().equals("Good bye!"))
			{
				myJTextField.setText(jB2.getText());
				System.out.println("bye");
			}
		}
	}



	public static void main(String args[])
	{
		CalculatorGUI_JoseRamos swg = new CalculatorGUI_JoseRamos();
		swg.setUpGui();
	}
}
