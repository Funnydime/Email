//Dimitri Rodriguez
//P8 15/16
//CS 234
import java.util.ArrayList;
public class Mailbox{
	private int number;
	private ArrayList<Message> box = new ArrayList<Message>();
	
	public void Mailbox(){
		box.clear();
	}
	
	public void addMessage(Message a){
		box.add(a);
	}
	
	public void removeMessage(int i){
		if ((i < 0) || (i > box.size() - 1){
			System.out.println("No message");
			
		}
		
		else{
			System.out.print(box.remove(i-1));
		}
		
		
		box.remove(i-1);
	}
	
	public void getMessage(int i){
		//print(box(i-1));
		if ((i < 1) || (i > box.size()){
			System.out.println("No message");
			
		}
		
		else{
			System.out.print(box.print(i-1));
		}
	}
	
	public void getSize(){
		box.size();
		
	}
}