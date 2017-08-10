
import java.util.HashMap;
import java.util.Map;
public class CollectionsHash {

	public static void main(String[] args){
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"hari");
		map.put(2,"hari");
		map.put(555,"hari2");
		System.err.println(map.get(1));
		for(Map.Entry m:map.entrySet()){
			System.err.println("key: "+m.getKey()+"  "+"value: "+m.getValue());
		}
		
	} 

}
