import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JPanel;

public class RightPanel extends JPanel {
	private static final long serialVersionUID = -1073170544184446100L;
	private BufferedImage img;

	public RightPanel(BufferedImage img){
		this.img = img;
	}

	public void paintComponent (Graphics g){
		super.paintComponent(g);
		g.drawImage(this.img, 0, 0 , null);		
	}

	public void clearImage(Graphics g) {
		int width = img.getWidth();
		int height = img.getHeight();
		for (int i=0; i<width; i++){
			for (int j=0; j<height; j++){
				img.setRGB(i,j,0xffffffff);
			}
		}
	}
	
	//
	// Transition by columns top to bottom left to right
	public void transitionTBLR(Graphics g, BufferedImage leftImage) {
			int width = leftImage.getWidth();
			int height = leftImage.getHeight();
			for (int i=0; i<width; i++){
				for (int j=0; j<height; j++){
					int pixelColor= leftImage.getRGB(i,j);
					img.setRGB(i, j, pixelColor);
				}
				repaint();
				try { Thread.sleep(10); } catch (InterruptedException e) { };
			}
		}

	//
	// Transition by rows left to right top to bottom
	public void transitionLRTB(Graphics g, BufferedImage leftImage) {
		int width = leftImage.getWidth();
		int height = leftImage.getHeight();
		for (int j=0; j<height; j++){
			for (int i=0; i<width; i++){
				int pixelColor= leftImage.getRGB(i,j);
				img.setRGB(i, j, pixelColor);
			}
			repaint();
			try { Thread.sleep(10); } catch (InterruptedException e) { };
		}
	}
	
	//
	// Transition by diagonals bottom to top left to right
	public void transitionDiagonal45LR(Graphics g, BufferedImage leftImage) {
		int width = leftImage.getWidth();
		int height = leftImage.getHeight();

		if (width > height) {
			// Image with larger width than height		
			for (int row=0; row<height; row++){
				int diagonalRow = row;
				for (int col=0; col<=row; col++) {
					int pixelColor= leftImage.getRGB(col,diagonalRow);
					img.setRGB(col, diagonalRow, pixelColor);
					diagonalRow--;
				}
				repaint();
				try { Thread.sleep(10); } catch (InterruptedException e) { };
			}
			for (int i=0; i<(width-height); i++) {
				int row = height-1;
				int col = i+1;
				for (int j=0; j<height; j++) {
					int pixelColor= leftImage.getRGB(col,row);
					img.setRGB(col, row, pixelColor);
					col++; row--;
				}
				repaint();
				try { Thread.sleep(10); } catch (InterruptedException e) { };
			}
			for (int i=0; i<=(width); i++) {
				int diagonalRow = height-1;
				for (int col=(width-height+i); col<width; col++) {
					int pixelColor= leftImage.getRGB(col,diagonalRow);
					img.setRGB(col, diagonalRow, pixelColor);
					diagonalRow--;
				}
				repaint();
				try { Thread.sleep(10); } catch (InterruptedException e) { };
			}
		}
		else {
			for (int row=0; row<width; row++){
				int diagonalRow = row;
				for (int col=0; col<=row; col++) {
					int pixelColor= leftImage.getRGB(col,diagonalRow);
					img.setRGB(col, diagonalRow, pixelColor);
					diagonalRow--;
				}
				repaint();
				try { Thread.sleep(10); } catch (InterruptedException e) { };
			}
			for (int j=0; j<(height - width); j++) {
				int row = width-1;
				int col = j+1;
				for (int i=0; i<width; i++) {
					int pixelColor= leftImage.getRGB(row, col);
					img.setRGB(row, col, pixelColor);
					col++; row--;
				}
				repaint();
				try { Thread.sleep(10); } catch (InterruptedException e) { };
			}
			for (int j=0; j<=(height); j++) {
				int diagonalRow = width-1;
				for (int col=(height - width +j); col<height; col++) {
					int pixelColor= leftImage.getRGB(diagonalRow, col);
					img.setRGB(diagonalRow, col, pixelColor);
					diagonalRow--;
				}
				repaint();
				try { Thread.sleep(10); } catch (InterruptedException e) { };
				}
			}
	}
			
	
		
	public void transitionRandom(Graphics g, BufferedImage leftImage) {
		
		int width = leftImage.getWidth();
		int height = leftImage.getHeight();
		
		Random transitionGenerator = new Random();
		for (int j=0; j<height; j++){
			for (int i=0; i<width; i++){
				int pixelColor= leftImage.getRGB(i, j);
				img.setRGB(transitionGenerator.nextInt(width),transitionGenerator.nextInt(height), pixelColor);
			}
			repaint();
			try { Thread.sleep(10); } catch (InterruptedException e) { };
		}
	}
}

