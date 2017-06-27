import javax.swing.JOptionPane;

public class MadLibs {
     public static void main (String[] args){
    	 String verb = JOptionPane.showInputDialog("Enter verb ");
    	 String animal = JOptionPane.showInputDialog("Enter animal ");
    			 String noun = JOptionPane.showInputDialog("Enter noun ");	
    					 String place = JOptionPane.showInputDialog("Enter place ");
    					 String finalstory = "A boy " + verb + " to the " + animal + " and asked it,if it wanted to see a " + noun + " and after, the boy want to go to " + place;
    					 JOptionPane.showMessageDialog(null, finalstory);
     }
}
