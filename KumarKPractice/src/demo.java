import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(8);
        List<Integer> x = new ArrayList<Integer>();
        x.addAll(list);
        Collections.sort(x);
        for(int i = 0;i<list.size();i++) {
        	if(list.get(i) == x.get(0)) {
        		list.remove(i);
        	}else if(list.get(i) < x.get(0)) {
        		list.set(i, list.get(i) - x.get(0));
        	}
        }
        System.out.println("Hello, World!" + list);
        
    }
}
