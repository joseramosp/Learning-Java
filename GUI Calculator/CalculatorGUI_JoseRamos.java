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
    JPanel buttonsPanel;
    JPanel bottomPanel;
    JPanel subBottomPanel;
	JTextField myJTextField;
	JButton jB1, jB2;
    ArrayList <JButton> buttons = new ArrayList<JButton>();

	public void setUpGui()
	{
		//INSTANTIATING SWING OBJECTS
		myJFrame = new JFrame("Calculator by Jose Ramos");
		myJPanel = new JPanel();
        buttonsPanel = new JPanel();
        bottomPanel = new JPanel();
        subBottomPanel = new JPanel();
        myJTextField = new JTextField("1234.5678");

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.TRAILING);

        // Creating a font type of the text field
        Font font1 = new Font("SansSerif", Font.BOLD, 20);

        // Blocking text field AND assigning properties
        myJTextField.setEditable(false);
        myJTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        myJTextField.setFont(font1);

		//creating new buttons
		jB1 = new JButton("Hello!");
		jB2 = new JButton("Good bye!");

		//changing the layout of the panel and then adding it to the frame
		myJPanel.setLayout(new GridLayout(4,4,-5,-5));
        bottomPanel.setLayout(new GridLayout(1,3,-5,-5));
        // bottomPanel.setAlignment(FlowLayout.TRAILING);
        subBottomPanel.setLayout(new GridLayout(1,2,-5,-5));
        // subBottomPanel.setAlignment(FlowLayout.TRAILING);

		// myJTextField.addActionListener(new ButtonHandler());
		// jB1.addActionListener(new ButtonHandler());
		// jB2.addActionListener(new ButtonHandler());

        String buttonsText = "%÷789X456-123+0.=";

        buttons.add(new JButton("AC"));
        buttons.add(new JButton("+/-"));

        for(int i = 0; i<buttonsText.length(); i++)
        {
            buttons.add(new JButton(String.valueOf(buttonsText.charAt(i))));
        }
        for(int i = 0; i<buttons.size(); i++)
        {
            if(((buttons.get(i)).getText()).equals("0"))
            {
                bottomPanel.add(buttons.get(i));
            }
            else if(((buttons.get(i)).getText()).equals(".") || ((buttons.get(i)).getText()).equals("="))
            {
                subBottomPanel.add(buttons.get(i));
            }
            else
            {
                myJPanel.add(buttons.get(i));
            }
        }
        // for(int i = buttons.size() - 3; i<buttons.size(); i++)
        // {
        //     bottomPanel.add(buttons.get(i));
        // }

        // Adding panels and elements to frame
        bottomPanel.add(subBottomPanel);
        // myJPanel.add(bottomPanel);
        myJFrame.add(bottomPanel, BorderLayout.SOUTH);
        myJFrame.add(myJTextField, BorderLayout.NORTH);
        myJFrame.add(myJPanel, BorderLayout.CENTER);
        // bottomPanel.add(subBottomPanel,BorderLayout.EAST);
        // myJFrame.add(bottomPanel, BorderLayout.SOUTH);

		myJFrame.addWindowListener(this);
        //myJFrame.setSize(500,500);
        // bottomPanel.pack();
        // subBottomPanel.pack();
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
