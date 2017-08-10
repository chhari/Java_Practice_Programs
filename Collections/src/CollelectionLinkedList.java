import java.util.LinkedList;
import java.util.Iterator;


public class CollelectionLinkedList {
	public static void main(String[] args){
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("yo");
		ls.add("try");
		ls.add("more");
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
	}
	
}
