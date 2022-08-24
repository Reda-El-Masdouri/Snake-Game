import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
		
		this.add(new GamePanel());
		
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); // fit the frame snugly around of all the components that we add to the frame
		this.setLocationRelativeTo(null); // open the window in the middle of the screen
		this.setVisible(true);
		
	}

}
