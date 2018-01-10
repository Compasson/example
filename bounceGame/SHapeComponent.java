package bounceGame;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class SHapeComponent {
	
	   private static final int DEFAULT_WIDTH = 450;
	   private static final int DEFAULT_HEIGHT = 350;

	   private java.util.List<SHape> shapes = new ArrayList<>();
	   

	   /**
	    * Add a shape to the panel.
	    * @param sh the shape to add
	    */
	   public void add(SHape sh)
	   {
	      shapes.add(sh);
	   }

	   public void paintComponent(Graphics g)
	   {
	      Graphics2D g2 = (Graphics2D) g;
	      for (SHape sh : shapes)
	      {
	         g2.fill(sh.getShape());
	      }
	   }
	   
	   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }

}


