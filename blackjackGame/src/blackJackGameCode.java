import javax.swing.*;
import javax.swing.ImageIcon;
public class blackJackGameCode 
{
	static int name=0; 
	static int chipAmount=0;//this is a comment yoyoyo

	public static void main (String[]args)
	{
		introduction();
	}
	public static void introduction()
	{
		JOptionPane.showMessageDialog(null,"To play the game please enter your name and email adress");
		String name = JOptionPane.showInputDialog(null, "Name:"); //this uses the show.InputDialog method from the JOptionPane class to prompts the user to type in a text box the name of the user. this then gets saved in a String variable called "name"
		String email = JOptionPane.showInputDialog(null, "Email:"); //this does the same thing as the code above but it is saved in a string variable called "email"
		JOptionPane.showMessageDialog(null,"Due to covid restrictions we are obliged to decline cash. We are only allowed to sell our bargain chips through contactless payment methods.");
		String chipAmountType = JOptionPane.showInputDialog(null, "Each chip costs 50 euros.Please enter the amount of chips you would like to avail for:"); 
		chipAmount = Integer.parseInt(chipAmountType);//JOptionPane saves string values but integer can only be used in calculations. therefore the string values are "parsed" into integers to be used later

		
		String cardNumber = JOptionPane.showInputDialog(null, "The total is "+((chipAmount) * 50) + ". Please enter your credit/debit card number");//this calculates the amount by multiplying the amount of chips to be purchased with 50 euros
		String cardPin = JOptionPane.showInputDialog(null, "please enter you pin");//this saves information typed in the showInputDIalog text box in a string variable called "cardPin"
		JOptionPane.showMessageDialog(null, "Payment approved. Please wait for the dealer, the game master, to start the game");
		
		ImageIcon jackBlack1 = new ImageIcon("jackBlack1.png");//this creates a NEW instance of the ImageIcon class and naming it jackblack1. this can then be used in the showMessageDialog later. the name of the image in the source file of the project that is to be shown in the dialog is set as the parameter. This code was based from this youtube video: https://www.youtube.com/watch?v=Gy3odNyYzhg&ab_channel=MaxO%27Didily
		ImageIcon shuffle = new ImageIcon("shuffle.png");//this does the same thing as the code above but it saves it as "shuffle"
		ImageIcon shuffleDance = new ImageIcon("shuffleDance.png");//this does the same thing as the code above but it saves it as "shuffleDance". 
		JOptionPane.showMessageDialog(null,"Hello everyone my name is Jack Black, you are playing BLACKJACK!", "",JOptionPane.INFORMATION_MESSAGE, jackBlack1);//this shows an image on the left and a message on the right of the dialog box. the first parameter is null because axes are not specified, the second parameter if the message to be printed, the third parameter states which method of the JOptionPane class is going to be used, the 4th parameter is the name the image that was set as an instance of the ImageIcon method.
		JOptionPane.showMessageDialog(null,"Welcome to the game " +name +", and Matir YalGorl!", "",JOptionPane.INFORMATION_MESSAGE, jackBlack1);
		JOptionPane.showMessageDialog(null,"*Jack Black shuffles the BlackJack cards*", "",JOptionPane.INFORMATION_MESSAGE, shuffle);
		JOptionPane.showMessageDialog(null,"*jack black proceeds to do the other type of shuffle*", "",JOptionPane.INFORMATION_MESSAGE, shuffleDance);
	}
	
}
