package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
		T[] array;
	public ArrayList() {
		array = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
		T[] arr2 = (T[])new Object[array.length + 1];
		arr2 = array;
		arr2[arr2.length-1] = val;
		array = arr2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr3 = (T[])new Object[loc-1];

		for(int i = 0; i < loc; i++) {
			arr3[i] = array[i];
		}
		arr3[loc] = val;
		for(int x = loc + 1; x < array.length; x++) {
			arr3[x] = array[x];
		}
		array = arr3;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == val) {
				return true;
			}
		}
		return false;
	}
}