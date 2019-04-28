import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class CalculatorGUI_JoseRamos extends WindowAdapter
{
	//DECLARE SWING GUI COMPONENTS (NOT THAT DIFFERENT FROM AWT)
	JFrame myJFrame;
	JPanel myJPanel;
	JFormattedTextField myJTextField;
    ArrayList <JButton> buttons = new ArrayList<JButton>();
    double result = 0, value1 = 0, value2 = 0;
    String operation = "None";
    NumberFormat numberFormat;

	public void setUpGui()
	{
		//SWING OBJECTS
		myJFrame = new JFrame("Calculator by Jose Ramos");
		myJPanel = new JPanel();
        numberFormat = NumberFormat.getNumberInstance();
        myJTextField = new JFormattedTextField(numberFormat);
		myJTextField.setValue(0);

        // Creating a font type of the text field
        Font font1 = new Font("SansSerif", Font.BOLD, 40);

        // Blocking text field AND assigning properties
        myJTextField.setEditable(false);
        myJTextField.setHorizontalAlignment(JTextField.RIGHT);
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

        for(int i = 0; i<buttons.size(); i++)
        {
            (buttons.get(i)).addActionListener(new ButtonHandler());
        }

        myJFrame.add(myJTextField, BorderLayout.NORTH);
        myJFrame.add(myJPanel);
        myJFrame.addWindowListener(this);
		myJFrame.addWindowListener(this);
        myJFrame.setSize(300,400);
		// myJFrame.pack();
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
			if(e.getActionCommand().equals("0") || e.getActionCommand().equals("1") || e.getActionCommand().equals("2") ||
            e.getActionCommand().equals("3") || e.getActionCommand().equals("4") || e.getActionCommand().equals("5") ||
            e.getActionCommand().equals("6") || e.getActionCommand().equals("7") || e.getActionCommand().equals("8") ||
            e.getActionCommand().equals("9") || e.getActionCommand().equals("."))
			{
                if(e.getActionCommand().equals("."))
                {
                    char[] digits = myJTextField.getText().toCharArray();
                    Arrays.sort(digits);

                    if(Arrays.binarySearch(digits,'.') == -1)
                    {
                        // myJTextField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                        myJTextField.setText(myJTextField.getText() + e.getActionCommand());
                        // myJTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    }
                }
                else
                {
                    if(myJTextField.getText().equals("0"))
                    {
                        myJTextField.setText(e.getActionCommand());
                    }
                    else
                    {
                        myJTextField.setText(myJTextField.getText() + e.getActionCommand());
                    }
                }
			}
			else if(e.getActionCommand().equals("AC"))
			{
				myJTextField.setText("0");
                result = 0;
                value1 = 0;
                value2 = 0;
                operation = "None";
			}
            else if(e.getActionCommand().equals("+"))
			{
				value1 = Double.valueOf(myJTextField.getText());
                myJTextField.setText("0");
                operation = "+";
			}
            else if(e.getActionCommand().equals("-"))
			{
                value1 = Double.valueOf(myJTextField.getText());
                myJTextField.setText("0");
                operation = "-";
			}
            else if(e.getActionCommand().equals("X"))
			{
                value1 = Double.valueOf(myJTextField.getText());
                myJTextField.setText("0");
                operation = "X";
			}
            else if(e.getActionCommand().equals("÷"))
			{
                value1 = Double.valueOf(myJTextField.getText());
                myJTextField.setText("0");
                operation = "÷";
			}
            else if(e.getActionCommand().equals("="))
			{
				value2 = Double.valueOf(myJTextField.getText());

                if(operation.equals("+"))
                {
                    result = value1 + value2;
					myJTextField.setValue(result);
                    // myJTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    value1 = result;
                }
                else if(operation.equals("-"))
                {
                    result = value1 - value2;
                    // myJTextField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                    myJTextField.setValue(result);
                    // myJTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    value1 = result;
                }
                else if(operation.equals("X"))
                {
                    result = value1 * value2;
					myJTextField.setValue(result);
                    value1 = result;
                }
                else if(operation.equals("÷"))
                {
                    result = value1 / value2;
					myJTextField.setValue(result);
                    value1 = result;
                }
				else if(operation.equals("None"))
                {

                }
			}
			else if(e.getActionCommand().equals("+/-"))
			{
				myJTextField.setValue(Double.valueOf(myJTextField.getText()) * -1);
			}
			else if(e.getActionCommand().equals("%"))
			{
				myJTextField.setValue(Double.valueOf(myJTextField.getText()) * 0.01);
			}
		}
	}

	public static void main(String args[])
	{
		CalculatorGUI_JoseRamos swg = new CalculatorGUI_JoseRamos();
		swg.setUpGui();
	}
}
