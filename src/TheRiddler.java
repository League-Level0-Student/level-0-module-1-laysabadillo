import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog(null, "A man is pushing his car along the road when he comes to a hotel. He shouts, I'm bankrupt! Why?" );
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(input.equals("He was playing monopoly")){
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
			else{ JOptionPane.showMessageDialog(null, "That's Wrong");
		// 6. Add some more riddles
			String input1 = JOptionPane.showInputDialog(null, "A man is pushing his car along the road when he comes to a hotel. He shouts, I'm bankrupt! Why?" );
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if(input1.equals("He was playing monopoly")){
				JOptionPane.showMessageDialog(null, "Correct");
				score++;
			}
			// 5. Otherwise, say "wrong" and tell them the answer
				else{ JOptionPane.showMessageDialog(null, "That's Wrong");
			
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score + " Points");
	}
}
}	
}