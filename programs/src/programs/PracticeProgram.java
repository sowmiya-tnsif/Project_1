

package programs;

import java.util.PriorityQueue;
import java.util.Queue;

public class PracticeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> obj = new PriorityQueue<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);

		System.out.println(obj);
		
		obj.remove();
		
		System.out.println(obj);
	}

}
