import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * Anim Panel - The class to create an exteded JPanel 
 * Cretes  Animation at specified location
 * @author Rushi Patel 
 * @authorID PATRY019
 *
 */
public class AnimPanel extends JPanel implements ActionListener{

	private Timer tim = new Timer(40,this);
	private int x;	//X cordinate of the panel where to start the animation
	private int y;	//Y cordinate of the panel where to start the animation
	int degree=0; // degree to rotate  

	/**
	 *  Constructor to create AnimPanel Object
	 * @param x	- to start animation at X positon
	 * @param y	- to start animation at Y positon
	 */
	public AnimPanel(int x, int y){
		this.x=x;
		this.y=y;
		tim.start();	
	}
	

	private static final long serialVersionUID = 1315641608348824195L;


	/**
	 * Paints graphics on the panel using Grahics2D Library
	 */
	public void paintComponent (Graphics g){
		// Clear privious painted graphic from the screen
		super.paintComponent(g);
		// AffineTransform to translate object aat specified location
		AffineTransform at = AffineTransform.getTranslateInstance(x	, y);
		BufferedImage settingsImage = loadImage("resources/settings.png");

		// rotate an image 
		at.rotate(Math.toDegrees(degree),settingsImage.getWidth()/2,settingsImage.getHeight()/2);

		Graphics2D g2d = (Graphics2D) g;
		// draws image on the panel
		g2d.drawImage(settingsImage,at,null);
	}

	/**
	 * Method to load imgae as BufferdImage from file using ImageIO
	 * @param fileName	- Name of the image whith path if in differnt location
	 * @return	image - BufferedImage
	 */
	BufferedImage loadImage(String fileName){
		BufferedImage image = null;

		try{
			image = ImageIO.read(new File(fileName));
		}catch(Exception e){

		}
		return image;
	}

	/**
	 * increment the degree to rotate with 2 degrees
	 * Repaint the component on the screen
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		degree+=2;
		repaint();
	}

}
