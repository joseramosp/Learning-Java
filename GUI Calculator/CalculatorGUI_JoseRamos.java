/* GUI Calculator Lab
-- OBJECTIVE --
5 PTS Make the calculator work correctly as a basic calculator.  Must use decimals and keep a running total.

5 Pts will be added to your Mid Term Project OR your Final Exam grade OR replace a Missing Lab.  What ever works best for your overall grade.

  Name: Jose Ramos
  Date: April 27, 2019

  NOTE:
  Learn how to use Object.getValue to improve how to assign a value to the JFormattedTextField by using "myJTextField.setValue(result)"
*/



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class CalculatorGUI_JoseRamos extends WindowAdapter
{
	//DECLARE SWING GUI COMPONENTS
	JFrame myJFrame;
	JPanel myJPanel;
	JFormattedTextField myJTextField;
    ArrayList <JButton> buttons = new ArrayList<JButton>();
	NumberFormat numberFormat; // To assign a format to myJTextField

	// Declaring objects used for the function of every button
	double result = 0, value1 = 0, value2 = 0;
    String operation = "None";

	// Function to setup the GUI of the calculator
	public void setUpGui()
	{
		//SWING OBJECTS
		myJFrame = new JFrame("Calculator by Jose Ramos");
		myJPanel = new JPanel();
        numberFormat = NumberFormat.getNumberInstance();
        myJTextField = new JFormattedTextField(numberFormat);
		myJTextField.setValue(0); // Giving the value of 0 to the text field

        // Creating a font type of the text field
        Font font1 = new Font("SansSerif", Font.BOLD, 40);

        // Blocking text field AND assigning properties
        myJTextField.setEditable(false);
        myJTextField.setHorizontalAlignment(JTextField.RIGHT);
        myJTextField.setFont(font1);

		//Changing the layout of the panel and creating a GridBagConstraints varaible set up the attributes of every component.
		myJPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = c.BOTH;
        c.weightx = c.weighty = 0.5;

		// Creating a string with most of the caracter will be used in the calculator buttons
        String buttonsText = "%÷789X456-123+0.=";
        int buttonsIndex = 0; // This variable is used when calling every element in the array of JButtons

		// This two buttons are declared apart because they have 2 caracter and dont work with the algorithm to create every button from a string.
        buttons.add(new JButton("AC"));
        buttons.add(new JButton("+/-"));

		// This loop will add a button with every charater of the String buttonsText.
        for(int i = 0; i<buttonsText.length(); i++)
        {
            buttons.add(new JButton(String.valueOf(buttonsText.charAt(i))));
        }
		// This for loop will setup the position of every button inside of myJPanel
        for(int rowIndex = 0; rowIndex < 5; rowIndex++)
        {
            if(rowIndex < 4)
            {
                for(int columnIndex = 0; columnIndex < 4; columnIndex++) // Will setup all the buttons in on the columnIndex 0 to 3 until rowIndex 3.
                {
                    c.gridx = columnIndex;
                    c.gridy = rowIndex;
                    myJPanel.add(buttons.get(buttonsIndex++), c);
                }
            }
            else // If rowIndex == 4 then it will be the bottom row. This is the configuration of wanted of every button on the last row.
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

		// This loop will add every button to the ButtonHandler addActionListener
        for(int i = 0; i<buttons.size(); i++)
        {
            (buttons.get(i)).addActionListener(new ButtonHandler());
        }

		// Adding myJTextField and myJPanel to myJFrame
        myJFrame.add(myJTextField, BorderLayout.NORTH);
        myJFrame.add(myJPanel);
		myJFrame.addWindowListener(this); // Addin this class to the WindowListener
        myJFrame.setSize(300,400);	// Setting the window size.
		// myJFrame.pack();
		myJFrame.setVisible(true);	// Making myJFrame visible
	}

	// This function will call be call when myJFrame closed.
	public void windowClosing(WindowEvent we)
	{
		System.out.println("Program is closing");
		System.exit(0);
	}

	// This is a class that performs the action of every button
	public class ButtonHandler implements ActionListener
	{
		// Method that is called when a button is pressed.
		public void actionPerformed(ActionEvent e)
		{
			// If a number button is pressed or point then it will be true
			if(e.getActionCommand().equals("0") || e.getActionCommand().equals("1") || e.getActionCommand().equals("2") ||
            e.getActionCommand().equals("3") || e.getActionCommand().equals("4") || e.getActionCommand().equals("5") ||
            e.getActionCommand().equals("6") || e.getActionCommand().equals("7") || e.getActionCommand().equals("8") ||
            e.getActionCommand().equals("9") || e.getActionCommand().equals("."))
			{
				// Runs if . button is pressed
                if(e.getActionCommand().equals("."))
                {
                    char[] digits = myJTextField.getText().toCharArray();
                    Arrays.sort(digits);

					// If myJTextField already has the caracter '.' then it won't run
                    if(Arrays.binarySearch(digits,'.') == -1)
                    {
                        myJTextField.setText(myJTextField.getText() + e.getActionCommand()); // Set the text of myJTextField as myJTextField + "."
                    }
                }
                else // If any number is pressed
                {
                    if(myJTextField.getText().equals("0")) // If the text of myJTextField is only a 0 then substitude the text by the button pressed
                    {
                        myJTextField.setText(e.getActionCommand());
                    }
                    else // Add the button pressed to the text in myJTextField
                    {
                        myJTextField.setText(myJTextField.getText() + e.getActionCommand());
                    }
                }
			}
			// Runs if AC button is pressed
			else if(e.getActionCommand().equals("AC"))
			{
				myJTextField.setText("0");
                result = 0;
                value1 = 0;
                value2 = 0;
                operation = "None";
			}
			// Runs if + button is pressed
            else if(e.getActionCommand().equals("+"))
			{
				value1 = Double.valueOf(myJTextField.getText()); // Assign the value in the myJTextField as a double to the variable value1
                myJTextField.setText("0");
                operation = "+";
			}
			// Runs if - button is pressed
            else if(e.getActionCommand().equals("-"))
			{
                value1 = Double.valueOf(myJTextField.getText()); // Assign the value in the myJTextField as a double to the variable value1
                myJTextField.setText("0");
                operation = "-";
			}
			// Runs if X button is pressed
            else if(e.getActionCommand().equals("X"))
			{
                value1 = Double.valueOf(myJTextField.getText()); // Assign the value in the myJTextField as a double to the variable value1
                myJTextField.setText("0");
                operation = "X";
			}
			// Runs if ÷ button is pressed
            else if(e.getActionCommand().equals("÷"))
			{
                value1 = Double.valueOf(myJTextField.getText()); // Assign the value in the myJTextField as a double to the variable value1
                myJTextField.setText("0");
                operation = "÷";
			}
			// Runs if = button is pressed
            else if(e.getActionCommand().equals("="))
			{
				value2 = Double.valueOf(myJTextField.getText()); // Assign the value in the myJTextField as a double to the variable value2

                if(operation.equals("+")) // If the operation in process is + then run
                {
                    result = value1 + value2;
					myJTextField.setText(String.valueOf(result)); // Set the value in myJTextField as the value of result
					// myJTextField.setValue(Result);
                    value1 = result;
                }
                else if(operation.equals("-")) // If the operation in process is - then run
                {
                    result = value1 - value2;
                    myJTextField.setText(String.valueOf(result));
                    value1 = result;
                }
                else if(operation.equals("X")) // If the operation in process is X then run
                {
                    result = value1 * value2;
					myJTextField.setText(String.valueOf(result));
                    value1 = result;
                }
                else if(operation.equals("÷")) // If the operation in process is ÷ then run
                {
                    result = value1 / value2;
					myJTextField.setText(String.valueOf(result));
                    value1 = result;
                }
				else if(operation.equals("None")) // If the operation in process is None then run
                {

                }
			}
			// Runs if +/- button is pressed
			else if(e.getActionCommand().equals("+/-"))
			{
				myJTextField.setText(String.valueOf(Double.valueOf(myJTextField.getText()) * -1)); // Multiply the value in myJTextField by -1 and assign it to itself
				// myJTextField.setValue(Double.valueOf(myJTextField.getText()) * -1); // Multiply the value in myJTextField by -1 and assign it to itself
			}
			// Runs if % button is pressed
			else if(e.getActionCommand().equals("%"))
			{
				myJTextField.setText(String.valueOf(Double.valueOf(myJTextField.getText()) * 0.01)); // Multiply the value in myJTextField by 0.01 and assign it to itself
			}
		}
	}

	// Main of the program
	public static void main(String args[])
	{
		CalculatorGUI_JoseRamos swg = new CalculatorGUI_JoseRamos(); // Creating an object of the class CalculatorGUI_JoseRamos
		swg.setUpGui(); // Calling the method that setup the calculator
	}
}
