package oop;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.OOPGraphics;

public class Main extends OOPGraphics
{
        public static void main(String[] args)
        {
                new Main(); //create instance of class that extends OOPGraphics (could be separate class without main), gets out of static context
        }

        public Main()
        {
                JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
                MainFrame.setLayout(new FlowLayout());  //not strictly necessary
                MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
                MainFrame.pack();                                               //set the frame to a size we can see
                MainFrame.setVisible(true);                             //now display it
                about();    
                //call the OOPGraphics about method to display version information.
  
        }
        
        
        public void processCommand(String command)
		{
        	command.toLowerCase();
        	String[] elements = command.split("//s");
        	
        	switch (elements[0]) {
        	case "forward":
        		int parameter = Integer.parseInt(elements[1]);
        		this.forward(parameter);
        		System.out.println("success");
        	}
		}
				
}

	