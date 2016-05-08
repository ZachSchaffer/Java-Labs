//**********************************************************************
//  ColorGUI.java
// 
//  Represents the user interface for the ColorOptions program that lets
//  the user change background color by selecting a radio button.
// *************************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorGUI
{
    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private JPanel primary;
    private Color [] color = new Color[NUM_COLORS];
    private JLabel heading;
    private JRadioButton[] colorButton = new JRadioButton[5];

    // ------------------------------------------------------------------
    //  Sets up a GUI with a label at the top and a set of radio buttons
    //  that control the background color of the panel.
    // ------------------------------------------------------------------
    public ColorGUI ()
    {
	// Set up heading and colors
	heading = new JLabel ("Choose the background color!");
	heading.setFont (new Font ("Helvetica", Font.BOLD, FONT_SIZE));

	color[0] = Color.yellow;
	color[1] = Color.cyan;
	color[2] = Color.red;
	color[3] = Color.green;
	color[4] = Color.magenta;

	// Instantiate a ButtonGroup object and a ColorListener object
	JRadioButton yellow = new JRadioButton ("Yellow", true);
	JRadioButton cyan = new JRadioButton ("Cyan", false);
	JRadioButton red = new JRadioButton ("Red", false);
	JRadioButton green = new JRadioButton ("Green", false);
	JRadioButton magenta = new JRadioButton ("Magenta", false);
	colorButton[0] = yellow;
	colorButton[1] = cyan;
	colorButton[2] = red;
	colorButton[3] = green;
	colorButton[4] = magenta;



ButtonGroup group = new ButtonGroup();
ColorListener listener = new ColorListener();

	// Group the radio buttons, add a ColorListener to each,
for(int i = 0; i<5;i++)
{
group.add(colorButton[i]);
colorButton[i].setBackground(Color.yellow);
colorButton[i].addActionListener(listener);
}


	
	// set the background color of each and add each to the panel.



	// Set up the panel
	primary = new JPanel();
	primary.add (heading);
	primary.setBackground (Color.yellow);
	primary.setPreferredSize (new Dimension (WIDTH, HEIGHT));
for(int i = 0; i<5;i++)
{
	primary.add(colorButton[i]);
}
    }


    // --------------------------------------------------------------
    //  Returns the primary panel containing the GUI.
    // --------------------------------------------------------------
    public JPanel getPanel()
    {
	return primary;
    }
    

    // **************************************************************
    //   Represents the listener for the radio buttons.
    // **************************************************************
    private class ColorListener implements ActionListener
    {
	// --------------------------------------------------------
	//  Updates the background color of the panel based on
	//  which radio button is selected.
	// --------------------------------------------------------
	public void actionPerformed (ActionEvent event)
	{
	for(int i = 0; i<5;i++)
		{
			if (colorButton[i].isSelected())
			{
				primary.setBackground (color[i]);
				for(int x=0; x<5; x++)
				{
					colorButton[x].setBackground(color[i]);
				}
				
			}
		}
	}
    }

}

