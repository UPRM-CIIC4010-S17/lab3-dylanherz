

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
	 
	public class PuertoricanFlag extends JPanel {
	            /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

				public void paintComponent(Graphics g) {
	                        super.paintComponent(g);
	 
	                        //Compute interior coordinates
	                        Insets myInsets = this.getInsets();
	                        int x1 = myInsets.left;
	                        int y1 = myInsets.top;
	                        int x2 = getWidth() - myInsets.right - 1;
	                        int y2 = getHeight() - myInsets.bottom - 1;
	                        int width = x2 - x1;
	                        int height = y2 - y1;
	 
	                        //Paint the background
	                        g.setColor(Color.BLACK);
	                        g.fillRect(x1, y1, width +1, height +1);
	                        
	                        /*Draw a border
	                        g.setColor(Color.YELLOW);
	                        g.drawRect(x1, y1, width, height);
	                        
	                     
	                        //Draw a second border
	                        g.setColor(Color.CYAN);
	                        g.drawRect(x1 +2, y1 +2, width, height);
	                        g.drawRect(x1 -2, y1 -2 ,width , height);
	                        
	                        g.setColor(Color.WHITE);
	                        g.drawLine(x1, y1, x2, y2);
	                        
	                        g.setColor(Color.RED);
	                        g.drawLine(x1, y2, x2, y1);*/
	                        
	                        /*g.setColor(Color.LIGHT_GRAY);
	                        g.fillOval((getWidth()-55)/2, (getHeight()-55)/2, 55, 55);*/
	                        
	                        Polygon p = new Polygon();
	                        p.addPoint(x1 + 10, y1 + 10);
	                        p.addPoint(x1 + 10, y1 + 150);
	                        p.addPoint(x1 + 115, y1 + 75);
	                        g.setColor(Color.BLUE);
	                        g.fillPolygon(p);
	                        
	                        Polygon p2 = new Polygon();
	                        p2.addPoint(x1 + 10, y1 + 10);
	                        p2.addPoint(x1 + 200, y1 + 10);
	                        p2.addPoint(x1 + 200, y1 + 38);
	                        p2.addPoint(x1 + 55, y1 + 38);
	                        g.setColor(Color.RED);
	                        g.fillPolygon(p2);
	                        
	                        Polygon p3 = new Polygon();
	                        p3.addPoint(x1 + 55, y1 + 38);
	                        p3.addPoint(x1 + 200, y1 + 38);
	                        p3.addPoint(x1 + 200, y1 + 66);
	                        p3.addPoint(x1 + 101, y1 + 66);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(p3);
	                        
	                        Polygon p4 = new Polygon();
	                        p4.addPoint(x1 + 115, y1 + 75);
	                        p4.addPoint(x1 + 101, y1 + 66);
	                        p4.addPoint(x1 + 200, y1 + 66);
	                        p4.addPoint(x1 + 200, y1 + 94);
	                        p4.addPoint(x1 + 89, y1 + 94);
	                        g.setColor(Color.RED);
	                        g.fillPolygon(p4);
	                        
	                        Polygon p5 = new Polygon();
	                        p5.addPoint(x1 + 89, y1 + 94);
	                        p5.addPoint(x1 + 200, y1 + 94);
	                        p5.addPoint(x1 + 200, y1 + 122);
	                        p5.addPoint(x1 + 49, y1 + 122);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(p5);
	                        
	                        Polygon p6 = new Polygon();
	                        p6.addPoint(x1 + 49, y1 + 122);
	                        p6.addPoint(x1 + 200, y1 + 122);
	                        p6.addPoint(x1 + 200, y1 + 150);
	                        p6.addPoint(x1 + 10, y1 + 150);
	                        g.setColor(Color.RED);
	                        g.fillPolygon(p6);
	                        
	                        Polygon p7 = new Polygon();
	                        p7.addPoint(x1 + 25, y1 + 73);
	                        p7.addPoint(x1 + 41, y1 + 73);
	                        p7.addPoint(x1 + 47, y1 + 58);
	                        p7.addPoint(x1 + 53, y1 + 73);
	                        p7.addPoint(x1 + 69, y1 + 73);
	                        p7.addPoint(x1 + 56, y1 + 83);
	                        p7.addPoint(x1 + 61, y1 + 98);
	                        p7.addPoint(x1 + 47, y1 + 88);
	                        p7.addPoint(x1 + 34, y1 + 98);
	                        p7.addPoint(x1 + 38, y1 + 83);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(p7);
	                        
	            }
	}



