import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> ls = new LinkedList<String>();
		ls.add("yo");
		ls.add("try");
		ls.add("more");
		
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		System.out.println(ls.poll());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(11);
		pq.add(15);
		pq.add(12);
		
	}

}
