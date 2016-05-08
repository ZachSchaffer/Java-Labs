//********************************************************************
//  StyleGUI.java       Author: Lewis/Loftus
//
//  Represents the user interface for the StyleOptions program.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleGUI
{
    private final int WIDTH = 300, HEIGHT = 150;
    private int fontSize = 36;
    private int style = Font.PLAIN;
    private JLabel saying;
    private JCheckBox bold, italic;
    private JPanel primary;
    private JRadioButton small, medium, large;

    //-----------------------------------------------------------------
    //  Sets up a panel with a label and some check boxes that
    //  control the style of the label's font.
    //-----------------------------------------------------------------
    public StyleGUI()
    {
	saying = new JLabel ("Say it with style!");
	saying.setFont (new Font ("Helvetica", style, fontSize));


	bold = new JCheckBox ("Bold");
	bold.setBackground (Color.cyan);
	italic = new JCheckBox ("Italic");
	italic.setBackground (Color.cyan);

	small = new JRadioButton ("Small Font", false);
	small.setBackground(Color.cyan);
	medium = new JRadioButton ("Medium Font", false);
	medium.setBackground(Color.cyan);
	large = new JRadioButton ("Large Font", true);
	large.setBackground(Color.cyan);
	
	ButtonGroup group = new ButtonGroup();
	group.add(small);
	group.add(medium);
	group.add(large);
	
	StyleListener listener = new StyleListener();
	bold.addItemListener (listener);
	italic.addItemListener (listener);
	
	SizeListener listener2 = new SizeListener();
	small.addItemListener(listener2);
	medium.addItemListener(listener2);
	large.addItemListener(listener2);
	
	
	
	primary = new JPanel();
	primary.add (saying);
	primary.add (bold);
	primary.add (italic);
	primary.add(small);
	primary.add(medium);
	primary.add(large);
	primary.setBackground (Color.cyan);
	primary.setPreferredSize (new Dimension(WIDTH, HEIGHT));
    }

    //-----------------------------------------------------------------
    //  Returns the primary panel containing the GUI.
    //-----------------------------------------------------------------
    public JPanel getPanel()
    {
	return primary;
    }
    

   //*****************************************************************
   //  Represents the listener for both check boxes.
   //*****************************************************************
   private class StyleListener implements ItemListener
   {
      //--------------------------------------------------------------
      //  Updates the style of the label font style.
      //--------------------------------------------------------------
      public void itemStateChanged (ItemEvent event)
      {
	  style = Font.PLAIN;
	  
	  if (bold.isSelected())
	      style = Font.BOLD;
	  
	  if (italic.isSelected())
	      style += Font.ITALIC;
	  
	  saying.setFont (new Font ("Helvetica", style, fontSize));
      }
   }
   
   
   private class SizeListener implements ItemListener
   {
   	 public void itemStateChanged (ItemEvent event)
      {
	  
	  if (small.isSelected())
	     fontSize = 12;
	  
	  if (medium.isSelected())
	     fontSize = 24;
	  
	  if (large.isSelected())
	     fontSize = 36;
	  
	  saying.setFont (new Font ("Helvetica", style, fontSize));
      }
   }
   
   	
   }

