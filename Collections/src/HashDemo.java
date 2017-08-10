import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashDemo {

	public static void main(String[] args) {
		HashSet<String> ls = new HashSet<String>();
		ls.add("yo");
		ls.add("try");
		ls.add("more");
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		TreeSet<String> ls1 = new TreeSet<String>();
		ls1.add("yo");
		ls1.add("try");
		ls1.add("more");
		Iterator<String> itr1 = ls1.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
			
		}
		// TODO Auto-generated method stub

	}

}
