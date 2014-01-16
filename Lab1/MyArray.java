
public class MyArray {
	private String[] internalArray;
	private int capacity;
	private int size;
	private String seperator = " ";
	public MyArray(int initSize) {
		internalArray = new String[initSize];
		capacity = initSize;
	}
	private void ensureCapacity(int checkCap){
		if(capacity<=checkCap){
			int newCapacity = getNewCapacity(capacity);
			String[] tempArray  = new String[newCapacity];
			System.arraycopy(internalArray,0,tempArray,0,capacity);
			internalArray = tempArray;
			System.out.println("Increasing : "+capacity);
			capacity = newCapacity;
		}
	}
	private int getNewCapacity(int oldSize){
		return (oldSize*2);
	}
	public void add(String s){
		ensureCapacity(size+1);
		internalArray[size] = s;
		size++;
	}
	
	public boolean search(String s){
		for (String test : internalArray) {
			if(test!=null && test.equals(s))
				return true;
		}
		return false;
	}
	
	public int size(){
		return size;
	}
	public int getCapacity() {
		return capacity;
	}
	
	public void display(){
		for (String temp : internalArray){
			System.out.print(temp);
			System.out.print(seperator);
		}
	}
	
	public void removeDups(){
		int counter = 0;
		String[] tempArray = new String[size];
		for (String mainStr : internalArray) {
			boolean isFound = false;
			for(int i=0;i<=counter;i++){
				System.out.println("Main String : " + mainStr+" String to checks : "+tempArray[counter]);
				if(mainStr == null || mainStr.equals(tempArray[counter])){
					isFound = true;break;
				}
			}
			if(!isFound){
				counter++;tempArray[counter] = mainStr;
			}	
		}
		internalArray = new String[counter];
		System.arraycopy(tempArray, 0, internalArray, 0, counter+1);
		capacity = counter;
		size = counter;
	}
}
