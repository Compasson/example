package bounceThread;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.util.List;

/**
 * The component that draws the balls.
 * @version 1.34 2012-01-26
 * @author Cay Horstmann
 */
public class BallComponent extends JComponent
{
   private static final int DEFAULT_WIDTH = 450;
   private static final int DEFAULT_HEIGHT = 350;
   public double xx;
   public double yy;

   private static List<Ball> balls = new ArrayList<>();

public static List<Ball> getBalls() {
	return balls;
}

/**
    * Add a ball to the panel.
    * @param b the ball to add
    * ƒобавление м€ча происходит только если м€ч не перекрывает предыдущие м€чи
    */
   public void add(Ball b)
   {
	  Random r = new Random();
	  xx = r.nextInt(400);
	  yy = r.nextInt(300);
	  int kolBall = balls.size();
	  int kolBall2 = 0;
	  
	  // ≈сли коллекци€ не пуста€
      if(!balls.isEmpty())
      {     	  
    	  while(kolBall != kolBall2)
    	  {
    		  for(Ball b0 : balls)
    		  {
    			  if(Math.sqrt(xx - b0.getX())*(xx - b0.getX()) + (yy - b0.getY())*(yy - b0.getY()) < 50)
    					  {
    				          xx = r.nextInt(400);
 	                          yy = r.nextInt(300);
 	                          kolBall2 = 0;
 	                          System.out.println("NOT");
    					  } else
    					  {
    						  kolBall2++;
    					  }
    		  }
    	  }

      } else
      {
    	  balls.add(b);
      }
      b.setX(xx);
      b.setY(yy);
      balls.add(b);
   }
	
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      for (Ball b : balls)
      {
         g2.fill(b.getShape());
      }
   }
   
   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
}
