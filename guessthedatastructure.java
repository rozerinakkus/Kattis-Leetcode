//Rozerin Akkus 260775633

//importing all the data structures used
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Collections;

public class guessthedatastructure {
	public static void main (String [] args) throws  IOException {
		//buffered reader to read input stream
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while((str=reader.readLine())!= null){
			//get number of operations
			int numOp = Integer.parseInt(str);
			
			//initialize all 3 possible data structures: stack, queue and priority queue 
			Stack<Integer> s = new Stack<>();
			Queue<Integer> q = new LinkedList<>();
			
			//max priority queue==>reverse order 
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
			
			//initialize 3 boolean variables for each data sruture, inially all are true.
			boolean isS = true;
			boolean isQ = true;
			boolean isPq = true;
			
			//for loop, loops number of operation numOp times 
			// gets the operation type and the input using StringTokenizer to separate two
			//if op type (first token) is 1, add the next token to all three structures
			//if op type is 2, check if data structure is empty or not
			//then compare to to the removed element from the three data structures and check if the two are the same
			// change the boolean variables accordingly
			
			for (int i = 0; i<numOp; i++) {
				//read the next line
				StringTokenizer line = new StringTokenizer(reader.readLine());
				
				//get the operation type
				String op = line.nextToken();
				
				//get the element
				int element = Integer.parseInt(line.nextToken());
				if (op.equals("1")) {
					if (isS) //if it is still true to be a stack, add element
						s.push(element);
					if (isQ) //if it is still true to be a queue, add element
						q.offer(element);
					if (isPq) //if it is still true to be a priority queue, add element
						pq.offer(element);
				}
				else if (op.equals("2")) {
					//check if structures still hold && (if don't, no need t o compare, hence the &&)
					//are empty or the element that must be removed is equal to element that is given in input for each data structure
					//change the boolean variables accordingly
					if (isS && (s.size() == 0 || !s.pop().equals(element)))
						isS = false;
					if(isQ && (q.size()==0 || !q.poll().equals(element)))
						isQ = false;
					if (isPq && (pq.size()==0 || !pq.poll().equals(element)))
						isPq = false;
				}
			}
			
			if (!isS && !isQ && !isPq) System.out.println("impossible"); //if all boolean are false, "impossible"
			else if ((isS && isQ) || (isS && isPq) || (isQ && isPq)) System.out.println("not sure"); // if combination of more than one structure is possible, "not sure"
			else if (isS) System.out.println("stack"); //if it's (only) a stack
			else if (isQ) System.out.println("queue"); //if it's (only) a queue
			else if (isPq) System.out.println("priority queue"); //if it's (only) a priority queue
					
		
	}
	
}
}
