package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class queue_list {
	ArrayList my_Queue = new ArrayList<>();
	
	
	public void EnQueue(Object input){
		boolean temp = my_Queue.add(input);
		if(temp){
			System.out.println("입력한 데이터 :"+temp);
		}
	}
	
	public Object DeQueue(Object input){
		if(my_Queue.isEmpty()){
			System.out.println("Queue is empty");
			return null;
		}else{
			return my_Queue.remove(0);
		}
	}
	public boolean isEmpty() {
		return my_Queue.isEmpty();
	}
	
	@Override
	public String toString() {
		
		String str ="queue_list [ ";
		
		for(Iterator iterator = my_Queue.iterator();iterator.hasNext();) {
			Object queue_data = iterator.next();
			str +=queue_data + ",";
			
		}
		str +="]";
		return str;
		
	}

}
