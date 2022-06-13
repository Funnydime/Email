//Dimitri Rodriguez
//P8.16
//9/27/2021
package Lab6_Rodriguez_Dimitri;
import java.util.ArrayList;
public class Message{
	private String sender;
	private String recpeint;
	private ArrayList<String> messageText = new ArrayList<String>();

	
	public Message(String recpeint, String sender){
		messageText.add("From:" + sender);
		messageText.add("recipeint:" + recpeint);
		
	}
	
	public void append(String line){
		messageText.add(line);
		
	}
	
	public static void print(Message a){
		for ( int e = 0; e == a.messageText.; e++){
		System.out.println(a[e]);
		}
	}






	public static void main(String[] args){
		
	// Create a new mailbox
	 Mailbox myMail = new Mailbox();
	// Create a new email (1)
	Message email1 = new Message("Emma", "Eduardo");
	// Add lines to the email
	email1.append("Hello");
	email1.append("This is confirmation email");
	email1.append("Please do not reply it");
	email1.append("");
	email1.append("Bye");
	// Add the email to the mailbox
	myMail.addMessage(email1);
	// Create a new email (2)
	Message email2 = new Message("Thomas", "Eduardo");
	// Add lines to the email
	email2.append("Hello Thomas");
	email2.append("Let's go to the park tomorrow");
	email2.append("");
	email2.append("Bye");
	// Add the email to the mailbox
	myMail.addMessage(email2);
	// Create a new email (3)
	Message email3 = new Message("Mary", "Eduardo");
	// Add lines to the email
	email3.append("Hi!");
	email3.append("I've learned something cool about Java");
	email3.append("You can use an object that uses another object");
	email3.append("Do you want to know how?");
	email3.append("I'll tell you tomorrow");
	// Add the email to the mailbox
	myMail.addMessage(email3);
	// Get the mailbox size
	myMail.getSize();
	// Remove an email from the mailbox
	myMail.removeMessage(2);
	// Get the mailbox size
	myMail.getSize();
	// Print the email
	myMail.getMessage(0);
	// Print the email
	myMail.getMessage(1);
	// Print the email
	myMail.getMessage(2);
	// Print the email
	myMail.getMessage(5);
	}
}