package oop;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Popup;

import uk.ac.leedsbeckett.oop.OOPGraphics;

public class TurtleGraphics extends OOPGraphics
{
        public static void main(String[] args)
        {
                new TurtleGraphics(); //create instance of class that extends OOPGraphics (could be separate class without main), gets out of static context
        }

        public TurtleGraphics()
        {
                JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
                MainFrame.setLayout(new FlowLayout());  //not strictly necessary
                MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
                MainFrame.pack();                                               //set the frame to a size we can see
                MainFrame.setVisible(true);                             //now display it
                  
                //call the OOPGraphics about method to display version information.
  
        }
        
        
        public void processCommand(String command)
		{
        	command.toLowerCase();
        	String[] elements = command.split(" ");
                
                if (elements.length > 0  )
                {
                        switch (elements[0].toLowerCase()) {
                                case "forward":
                                        if (elements.length >1 ){
                                                try{
                                        int parameter = Integer.parseInt(elements[1]);
                                        this.forward(parameter);
                                                }
                                                catch(NumberFormatException e)
                                                {
                                                        JOptionPane.showMessageDialog(null, "Invalid distance parameter");
                                                }
                                        }
                                        break;
                                case "backward":
                                        if (elements.length > 1){
                                                try{
                                        int parameter2 = Integer.parseInt(elements[1]);
                                        this.forward(-parameter2);
                                                }
                                                catch(NumberFormatException e)
                                                {
                                                        JOptionPane.showMessageDialog(null, "Invalid distance parameter");
                                                }
                                        }
                                        break; 
                                case "turnright":
                                if (elements.length > 1){
                                        try {
                                        int parameter3 = Integer.parseInt(elements[1]);
                                        turnRight(parameter3);
                                        }
                                        catch(NumberFormatException e)
                                        {
                                                JOptionPane.showMessageDialog(null, "Invalid distance parameter");
                                        }
                                }

                                        break;
                                case "turnleft":
                                if (elements.length >1){
                                        try{
                                        int parameter4 = Integer.parseInt(elements[1]);
                                        turnLeft(parameter4);
                                        }
                                        catch(NumberFormatException e)
                                        {
                                                JOptionPane.showMessageDialog(null, "Invalid distance parameter");
                                        }
                                }
                                        break;
                                case "clear":
                                        clear(); 
                                        break;
                                case "pendown":
                                        penDown();
                                        break;
                                case "penup":
                                        penUp();
                                        break;
                                case "red":
                                        setPenColour(PenColour.red);
                                        break; 
                                case "green":
                                        setPenColour(PenColour.green);
                                        break; 
                                case "black":
                                        setPenColour(PenColour.black);
                                        break;
                                case "white":
                                        setPenColour(PenColour.white);
                                        break;
                                case "reset":
                                        reset();
                                        break;
                                default:
                                        JOptionPane.showMessageDialog(null, "Command not recognised");

                                }
                        }
                        
		}
                //catch(NumberFormatException e){
                       // JOptionPane.showMessageDialog(null, "Command not recognised"); 
                
        }

				

        

	