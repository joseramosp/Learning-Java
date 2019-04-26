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
        myJTextField = new JTextField("1234.5678");

        // Creating a font type of the text field
        Font font1 = new Font("SansSerif", Font.BOLD, 20);

        // Blocking text field AND assigning properties
        myJTextField.setEditable(false);
        myJTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        myJTextField.setFont(font1);

		//changing the layout of the panel and then adding it to the frame
		myJPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = c.BOTH;
        c.weightx = c.weighty = 0.5;

        String buttonsText = "%÷789X456-123+0.=";
        int buttonsIndex = 0;

        buttons.add(new JButton("AC"));
        buttons.add(new JButton("+/-"));


        for(int i = 0; i<buttonsText.length(); i++)
        {
            buttons.add(new JButton(String.valueOf(buttonsText.charAt(i))));
        }
        for(int rowIndex = 0; rowIndex < 5; rowIndex++)
        {
            if(rowIndex < 4)
            {
                for(int columnIndex = 0; columnIndex < 4; columnIndex++)
                {
                    c.gridx = columnIndex;
                    c.gridy = rowIndex;
                    myJPanel.add(buttons.get(buttonsIndex++), c);
                }
            }
            else
            {
                c.gridx = 0;
                c.gridy = rowIndex;
                c.gridwidth = 2;
                myJPanel.add(buttons.get(buttonsIndex++), c);

                c.gridx = 2;
                c.gridy = rowIndex;
                c.gridwidth = 1;
                myJPanel.add(buttons.get(buttonsIndex++), c);

                c.gridx = 3;
                c.gridy = rowIndex;
                c.gridwidth = 1;
                myJPanel.add(buttons.get(buttonsIndex), c);
            }
        }

        myJFrame.add(myJTextField, BorderLayout.NORTH);
        myJFrame.add(myJPanel);

		myJFrame.addWindowListener(this);
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
