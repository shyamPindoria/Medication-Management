import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.*;

import javax.swing.JPanel;

import javafx.geometry.Rectangle2D;

public class ProgressPage extends JPanel {
	int progress = 0; // the progress of the loading
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //make the quality better
		g2.translate(this.getWidth() / 2, this.getHeight() / 2); //set the location in the centre of the screen
		g2.rotate(Math.toRadians(270));
		Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
		Ellipse2D circle = new Ellipse2D.Float(0, 0, 110, 110);
		arc.setFrameFromCenter(new Point(0, 0), new Point(60, 60));
		circle.setFrameFromCenter(new Point(0, 0),new Point(50, 50));
		arc.setAngleStart(1); //set the start angle
		arc.setAngleExtent(-progress * 3.6); //determine the rotate direction
		g2.setColor(Color.BLUE);
		g2.draw(arc);
		g2.fill(arc);
		g2.setColor(Color.WHITE);
		g2.draw(circle);
		g2.fill(circle);
		g2.setColor(Color.BLUE);
		g2.rotate(Math.toRadians(90));
		g.setFont(new Font("Verdana", Font.PLAIN, 20));
		FontMetrics fm = g2.getFontMetrics();
		java.awt.geom.Rectangle2D rec = fm.getStringBounds(progress + "%", g); 
		int x = (0 - (int)rec.getWidth()) / 2;
		int y = (0 - (int)rec.getHeight()) / 2 + fm.getAscent();
		g2.drawString(progress + "%", x, y); //set the string in the middle of the circle
	}
	
	public void UpdateProgress(int num) {
		progress = num;
	}
}