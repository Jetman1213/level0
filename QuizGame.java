import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		String q1 = JOptionPane.showInputDialog(null, "what is the capital of san diego?");
		if( q1.equals("it doesn't have one") ){
		 JOptionPane.showMessageDialog(null, "you guessed it!");
		}
		else{
			JOptionPane.showMessageDialog(null, "you suck at this game!");
		}
	}

}

