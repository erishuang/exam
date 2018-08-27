

import java.lang.reflect.Array;
import java.util.ArrayList;

class RingBuffer extends Buffer{
	
	private int start;
	private int end;
	private int elementCount;
	
	public RingBuffer (int capacity){
		super(capacity);
		String buff = new String();
		start = 0;
		end = 0;
		elementCount = 0;
	}
	
 	public RingBuffer(){
		//int capacity = 10; // max elementCount
 		super(10);
		String buff = new String();
		start = 0;
		end = 0;
		elementCount = 0;
	}
	
	public boolean isFull(){
		if(elementCount == 10){
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(start == end && elementCount == 0){
			return true;
		}
		return false;
	}
	
	@Override
	public void clear(){
	//	buff.clear();
		super.clear();
		start = 0;
		end = 0;
		elementCount = 0;
	}

	
	public void addToBuffer(int input){

			if (isFull()){
				System.out.println("Buffer is full");
			}
			//for (int i = 0; i <=10; i++){
			//		buff.add(i);
			//}
			//end加数
			super.buffer[end]=input;
			end = end +1;
			elementCount = elementCount +1;

	}
	
	public int getFromBuffer(){
		
		if(isEmpty()){
			//return -1;
			System.out.println("Buffer is empty");
		}
		int output = super.buffer[start];
		start = start -1;
		elementCount = elementCount -1;
		return output;
	}
	
}