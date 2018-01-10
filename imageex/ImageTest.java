

import java.awt.*;
import javax.swing.*;

public class ImageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new ImageFrame();
				frame.setTitle("ImageTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

			}
		});
	}

}

/*
 *  Фрейм с компонентом изображения
*/

class ImageFrame extends JFrame
{	
	private static final long serialVersionUID = 1L; // Без этой переменной ошибка класса ImageFrame
    
	public ImageFrame()
	{       
		add(new ImageComponent());
		pack();
	}
}

/*
*
*/

class ImageComponent extends JComponent
{
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGTH = 200;
	
	private Image image;
	
	public ImageComponent()
	{
		image = new ImageIcon("blue-ball.gif").getImage();
	}
	
	public void paintComponent(Graphics g)
	{
		if(image == null) return;
		
		int imageWidth = image.getWidth(this);
		int imageHeight = image.getHeight(this);
		
		// воспроизвести изображение в левом верхнем углу
	
		g.drawImage(image, 0, 0, null);
		
		// воспроизвести изображение рядами по всему компоненту

		for (int i = 0; i*imageWidth <= getWidth(); i++) 
			for (int j = 0; j*imageHeight <= getHeight(); j++)
				if (i + j > 0)
					g.copyArea(0, 0, imageWidth, imageHeight,
							i*imageWidth, j*imageHeight);
	
	}
	
	public Dimension getPreferredSize()
	       { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGTH);}

}