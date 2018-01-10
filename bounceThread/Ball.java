package bounceThread;

import java.awt.geom.*;
import java.util.List;
import java.util.Random;

/**
   A ball that moves and bounces off the edges of a 
   rectangle
 * @version 1.33 2007-05-17
 * @author Cay Horstmann
*/
public class Ball
{
   private static final int XSIZE = 50;
   private static final int YSIZE = 50;
   private double x = 0;
   private double y = 0;
   private double dx = 1;
   private double dy = 1;

   public double getX() {
	return x;
}


public void setX(double x) {
	this.x = x;
}


public double getY() {
	return y;
}


public void setY(double y) {
	this.y = y;
}


/**
      Moves the ball to the next position, reversing direction
      if it hits one of the edges
   */
   /**
    *  онструктор дл€ создани€ м€ча с произвольными начальными координатами
    */
   public Ball()
   {
       Random r = new Random(); 
	   this.x = r.nextInt(400);
	   this.y = r.nextInt(300);
   }
   
   
   // —толкновение шаров
   /**
   public void crack()
   {
	   BallComponent bcomp = new BallComponent();
	   List<Ball> lball =  bcomp.getBalls();
	   
	   for(Ball b1 : lball)
	   {
		   for(Ball b2 : lball)
		   {
			   if(Math.sqrt((b1.x - b2.x)*(b1.x - b2.x) + (b1.y - b2.y)*(b1.y - b2.y)) > 50)
			   {
				   b1.dx = -dx;
				   b2.dx = -dx;
				   b1.dy = -dy;
				   b2.dy = -dy;
			   }					   
		   }
	   }
   }
   
   */
   public void move(Rectangle2D bounds)
   {
      x += dx;
      y += dy;
      
      //this.crack();
      
      if (x < bounds.getMinX())
      { 
         x = bounds.getMinX();
         dx = -dx;
      }
      if (x + XSIZE >= bounds.getMaxX())
      {
         x = bounds.getMaxX() - XSIZE; 
         dx = -dx; 
      }
      if (y < bounds.getMinY())
      {
         y = bounds.getMinY(); 
         dy = -dy;
      }
      if (y + YSIZE >= bounds.getMaxY())
      {
         y = bounds.getMaxY() - YSIZE;
         dy = -dy; 
      }
   }

   /**
      Gets the shape of the ball at its current position.

   */
   public Ellipse2D getShape()
   {
      return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
   }
}
