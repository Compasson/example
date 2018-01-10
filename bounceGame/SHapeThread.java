package bounceGame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SHapeThread {
	
	   public static void main(String[] args)
	   {
	      EventQueue.invokeLater(new Runnable()
	         {
	            public void run()
	            {
	               JFrame frame = new ShapesFrame();
	               frame.setTitle("ShapesThread");
	               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	               frame.setVisible(true);
	            }
	         });
	   }

}

/**
 * A runnable that animates a bouncing ball.
 */
class ShapesRunnable implements Runnable
{
   private SHape shape;
   private Component component;
   public static final int STEPS = 1500;
   public static final int DELAY = 5;
   public static boolean startMove = false;

   /**
    * Constructs the runnable.
    * @param aBall the ball to bounce
    * @param aComponent the component in which the ball bounces
    */
   public ShapesRunnable(SHape aSHape, Component aComponent)
   {
      shape = aSHape;
      component = aComponent;
   }

   public void run()
   {
      try
      {
         for (int i = 1; i <= STEPS; i++)
         {
            shape.move(component.getBounds());
            component.repaint();
            Thread.sleep(DELAY);
         }
      }
      catch (InterruptedException e)
      {
      }
   }

}


/**
 * The frame with panel and buttons.
 */
class ShapesFrame extends JFrame
{
   private SHapeComponent comp;

   /**
    * Constructs the frame with the component for showing the bouncing ball and Start and Close
    * buttons
    */
   public ShapesFrame()
   {
      comp = new SHapeComponent();
      add(comp, BorderLayout.CENTER);
      JPanel buttonPanel = new JPanel();
      addButton(buttonPanel, "Start", new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               addShape();
            }
         });

      addButton(buttonPanel, "Close", new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0);
            }
         });
      add(buttonPanel, BorderLayout.SOUTH);
      pack();
   }

   /**
    * Adds a button to a container.
    * @param c the container
    * @param title the button title
    * @param listener the action listener for the button
    */
   public void addButton(Container c, String title, ActionListener listener)
   {
      JButton button = new JButton(title);
      c.add(button);
      button.addActionListener(listener);
   }

   /**
    * Adds a bouncing ball to the canvas and starts a thread to make it bounce
    */
   public void addShape()
   {
      SHape s = new SHape();
      comp.add(s);
      Runnable r = new ShapesRunnable(s, comp);
      Thread t = new Thread(r);
      t.start();
   }
   
   /**
    *  –асставл€ет перед началом игры 10 фигур
    */
   public void addShapeStart()
   {
	   for(int i = 0; i < 10; i++)
	   {
		   SHape s = new SHape();
		   comp.add(s);
		   Runnable r = new ShapesRunnable(s, comp);
		   Thread t = new Thread(r);
		   t.start();
	   }
   }

}

