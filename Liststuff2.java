package exam116;
import java.util.ArrayList;
import java.util.List;

/**
 * Midterm exam for CS116.
 *
 * @author lord_pretzel
 *
 */
public class Liststuff2 {
	private static final List<Integer> l1 = List.of(1,2,3,4,4,4,5,6,7);
	private static final List<Integer> l2 = List.of(1,4,-1,1,3,4);

	/**
	 * returns the sum of all of the elements in the list, e.g., sum([1,3,4]) = 8
	 */
	public static int sum(List<Integer> l) {
		int sum = 0;
		for (Integer i: l) {
			sum += i;
		}
		
		return sum; 
		
	}

	public static int min(List<Integer> l) {
		int min = l.size();
		for(int i = 0; i < l.size(); i++) {
			if (l.get(i) < min) {
				min = l.get(i);
			}
		}
		return min; 
	}

	public static List<Integer> getEven(List<Integer> l) {
		List<Integer> result  = new ArrayList<Integer>();
		for (Integer i: l) {
			if(i % 2 == 0) {
				result.add(i);
			}	
		} 
		return result;
	}

	public static void main (String[] args) {
		System.out.println("sum l1 should be: 36 and was " + sum(l1));
		System.out.println("sum l2 should be: 12 and was " + sum(l2));
		System.out.println("min l1 should be: 1 and was " + min(l1));
		System.out.println("min l2 should be: -1 and was " + min(l2));
		System.out.println("get even l1 should be [2,4,4,4,6] and was " + getEven(l1));
	}


}
