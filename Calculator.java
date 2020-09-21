////////////////////////////////////////////////////
//	OOSD2 ASSIGNMENT 2							  //
//	Jenkin Yu									  //
//	C18712199									  //
//	Calculator									  //
////////////////////////////////////////////////////


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.Math;
import net.miginfocom.swing.MigLayout;

public class Calculator extends JFrame {
	private JPanel panel;
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bMinus, bPlus, bC, bCE, bMultiply, 
	bDivision, bEquals, backButton,
	bPlusMinus, bRoot, bPercent, bPower, bInverse, bDot;
	private JTextField txtField;
	private String display;
	private String str;
	private double TEMP;
	private double solveTEMP;
	private int calculation;

	public Calculator() {
		createCalculator();
	}

	public void createCalculator() {

		panel = new JPanel(); //Typical usage of panel
		panel.setLayout(new MigLayout()); //using MigLayout to access JAR's swing libraries.
		//setting textField that allows to display and string or numbers.
		txtField = new JTextField();
		txtField.setEditable(false);// Set to disable so that user cannot edit the contents in the textField.
		txtField.setText("");
		//aligning the text field to right position
		txtField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(txtField, "wrap ,spanx, growx");

		// Grouping my function buttons
		backButton = new JButton("←");
		bCE = new JButton("CE");
		bC = new JButton("C");
		bPlusMinus = new JButton("±");
		bRoot = new JButton("√");
		bEquals = new JButton("=");
		bMultiply = new JButton("x");
		bDivision = new JButton("/");
		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bPercent = new JButton("%");
		bPower = new JButton("^");
		bInverse = new JButton("½");
		bDot = new JButton(".");

		// Grouping all my 0-9 Buttons
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");

		// grouping button in the first row.
		//grow - takes up all the cell spaces declaring grow in all the buttons makes all the button group uniformed.
		//wrap - set the space and then passes the next cell to the next row.
		panel.add(backButton, "grow");
		panel.add(bCE, "grow");
		panel.add(bC, "grow");
		panel.add(bPlusMinus, "grow");
		panel.add(bRoot, "grow, wrap"); 

		// grouping buttons in second row.
		panel.add(b7, "grow");
		panel.add(b8, "grow");
		panel.add(b9, "grow");
		panel.add(bDivision, "grow");
		panel.add(bPercent, "grow, wrap");

		// grouping buttons in third row.
		panel.add(b4, "grow");
		panel.add(b5, "grow");
		panel.add(b6, "grow");
		panel.add(bMultiply, "grow");
		panel.add(bPower, "grow, wrap");

		// grouping buttons in fourth row.
		panel.add(b1, "grow");
		panel.add(b2, "grow");
		panel.add(b3, "grow");
		panel.add(bMinus, "grow");
		panel.add(bInverse, "grow, wrap");

		// grouping buttons in fifth row.
		panel.add(b0, "span 2, grow"); //declaring span 2 means the button will take up two cell spaces.
		panel.add(bDot, "grow");
		panel.add(bPlus, "grow");
		panel.add(bEquals, "grow");

		// Grouping the button action listeners and setting up each buttons functions
		// Action Listener to button 1
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b1.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 2
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b2.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 3
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b3.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 4
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b4.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 5
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b5.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 6
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b6.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 7
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b7.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 8
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b8.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 9
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b9.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button 0
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + b0.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button to create decimal space.
		bDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = txtField.getText() + bDot.getText();
				txtField.setText(display);
			}
		});
		// Action Listener to button Addition
		bPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMP = Double.parseDouble(txtField.getText());
				calculation = 1; // call switch statement
				txtField.setText("");
			}
		});
		// Action Listener to button Subtraction
		bMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMP = Double.parseDouble(txtField.getText());
				calculation = 2; // call switch statement
				txtField.setText("");
			}
		});
		// Action Listener to button Multiplication
		bMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMP = Double.parseDouble(txtField.getText());
				calculation = 3; // call switch statement
				txtField.setText("");
			}
		});
		// Action Listener to button Division
		bDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMP = Double.parseDouble(txtField.getText());
				calculation = 4; // call switch statement
				txtField.setText("");
			}
		});
		// Action Listener to button Square Root
		bRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMP = Double.parseDouble(txtField.getText());
				calculation = 5; // call switch statement
				txtField.setText("");
			}
		});
		// Action Listener to button Power of ("^")
		bPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMP = Double.parseDouble(txtField.getText());	
				calculation = 6; // call switch statement
				txtField.setText("");
			}
		});
		// Action Listener to +/- Button
		bPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMP = Double.parseDouble(txtField.getText());
				TEMP = -TEMP;
				str = String.valueOf(TEMP);
				txtField.setText(str);
			}
		});
		// Action Listener for Percent ("%")
		bPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// for this to be executed user must input number then use any sum function.
				// then execute the equals button to get the final sum.
				double num =Double.parseDouble(txtField.getText());//when this button is pressed user must input any number to be converted.
				num = (num*TEMP)/100; // converted into percentage
				str = String.valueOf(num); // passing the value num into string to be displayed.
				txtField.setText(str); // displayed the converted number.
			}
		});
		// Action Listener for Inverse (1/x)
		bInverse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//when button is executed it will pass the value of number to be inputed by
				//calling the equals button in the switch statement.
				calculation = 7; // call switch statement
				txtField.setText("");
			}
		});

		// Action Listener to button Equals (" = " where the calculations happens)
		bEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// switch statement
				switch (calculation) {
				case 1: // addition
					//Basic calculation by passing number(s) and summing any number that is inputed by TEMP
					solveTEMP = TEMP + Double.parseDouble(txtField.getText());
					txtField.setText(Double.toString(solveTEMP));
					break;

				case 2: // subtraction
					//Basic calculation by passing number(s) and summing any number that is inputed by TEMP
					solveTEMP = TEMP - Double.parseDouble(txtField.getText());
					txtField.setText(Double.toString(solveTEMP));
					break;

				case 3: // multiply
					//Basic calculation by passing number(s) and summing any number that is inputed by TEMP
					solveTEMP = TEMP * Double.parseDouble(txtField.getText());
					txtField.setText(Double.toString(solveTEMP));
					break;

				case 4: // division
					//Basic calculation by passing number(s) and summing any number that is inputed by TEMP
					solveTEMP = TEMP / Double.parseDouble(txtField.getText());
					txtField.setText(Double.toString(solveTEMP));
					break;

				case 5: // square root
					//Math.sqrt() imported from java.lang.Math;
					solveTEMP = Math.sqrt(TEMP);
					txtField.setText(Double.toString(solveTEMP));
					break;

				case 6: // power of
					//Math.pow() imported from java.lang.Math;
					solveTEMP = Math.pow(TEMP, Double.parseDouble(txtField.getText()));
					txtField.setText(Double.toString(solveTEMP));
					break;
				case 7:// Inverse calculation only happens when inverse button is executed
					//this will allow user to input any number and the divided by 1.
					TEMP = Double.parseDouble(txtField.getText());
					solveTEMP = 1 / TEMP; // when a number is inputed this calculation is executed.
					txtField.setText(Double.toString(solveTEMP));// sum will be shown by converting any string type into 
					break;										 //double value and shown in the texField.	
				}
			}
		});
		// Action Listener to button CE (Clear contents on display)
		bCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		// Action Listener to button C (Clear button)
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");

			}
		});
		// Action Listener to back button (<-)
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = txtField.getText().length();// returns the length of the string
				int num = txtField.getText().length() - 1;// length of the string subtracted 1 from length.

				String text;

				if (length > 0) {
					StringBuilder back = new StringBuilder(txtField.getText()); // implementing the string builder
					// function to store strings in the textField.
					back.deleteCharAt(num); // variable "num" is stored in the parameter then deleted the last element.
					text = back.toString(); // setting the text to be displayed in the textField.
					txtField.setText(text); // Displaying the text every time the back button is performed
				}

			}
		});

		// Make the frame and panel visible.
		add(panel);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(260, 250);
		setVisible(true);
		setResizable(false);// user will not be able to resize the frame;

	}

	public static void main(String[] args) {
		new Calculator();
	}

}
