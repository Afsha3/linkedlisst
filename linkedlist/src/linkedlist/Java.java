package linkedlist;
import java.util.*; 
	   class LinkedlistExample{ 
	    public static void main(String args[]){
	        LinkedList<String> al=new LinkedList<String>();// creating linked list 
	        al.add("Rachit"); 
	        al.add("Rahul"); 
	        al.add("Rajat"); 
	        al.add("Rose");
	        al.add("nancy");
	        
	        Iterator<String> itr = al.iterator();
	        while(itr.hasNext()){ 
	            System.out.println(itr.next());
	        }
	    }
	}


