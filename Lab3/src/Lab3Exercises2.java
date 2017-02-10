

	import javax.swing.JFrame;

	public class Lab3Exercises2 {
		public static void main(String[] args) {
			JFrame myFrame = new JFrame("Dylan Hernandez");
			myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			myFrame.setLocation(800, 400);
			myFrame.setSize(220, 220);
			myFrame.setVisible(true);
			
			 PuertoricanFlag myPanel = new PuertoricanFlag();
	         myFrame.getContentPane().add(myPanel);
		}
	}
