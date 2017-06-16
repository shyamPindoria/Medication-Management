import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimPanel extends JPanel implements ActionListener{

	Timer tim = new Timer(40,this);
	int x;
	int y;

	public AnimPanel(int x, int y){
		this.x=x;
		this.y=y;
		tim.start();
	}
	private static final long serialVersionUID = 1315641608348824195L;


	public static void main(String[] args){
		JFrame f = new JFrame();
		f.add(new AnimPanel(100,200));
		f.setVisible(true);
		f.setSize(1000, 1000);	
	}
	int count=0;
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		AffineTransform at = AffineTransform.getTranslateInstance(x	, y);
		BufferedImage settingsImage = loadImage("resources/settings.png");

		at.rotate(Math.toDegrees(count++),settingsImage.getWidth()/2,settingsImage.getHeight()/2);

		Graphics2D g2d = (Graphics2D) g;
		//
		g2d.drawImage(settingsImage,at,null);
	}

	BufferedImage loadImage(String fileName){
		BufferedImage image = null;

		try{
			image = ImageIO.read(new File(fileName));
		}catch(Exception e){

		}
		return image;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		count+=1;

		repaint();


	}

}
