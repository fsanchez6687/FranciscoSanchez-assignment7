

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10]; 
	int size = 0; 
	
	
	@Override
	public boolean add(T item) { 
		if (size == items.length) { 
			items = doubleSizeOfBackingArray(); 
		} 
		items[size++] = item; 

		return true; 
	}

	public Object[] doubleSizeOfBackingArray() { 
		Object[] newArray = new Object[size * 2]; 
		for (int i = 0; i < size; i++) { 
											
			newArray[i] = items[i];
		}
		return newArray; 
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException { 
																
		if (index > size) 
			throw new IndexOutOfBoundsException(
					"The index, " + index + ", is out of the bounds of the array with size " + size);

		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for an array of size " + size);
		}
		if (size == items.length) {
			items = doubleSizeOfBackingArray();
		}

		if (items[index] != null) {
			for (int i = size + 1; i >= index; i--)
				items[i + 1] = items[i];
		}

		items[index] = item;
		size++;

		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if (index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}	
		
		T removedItem = (T) items[index];
		
		for (int i = index; i < size; i++) {
			if (i >= size - 1) {
				items = doubleSizeOfBackingArray();
				items[i] = items[i + 1];
			} else {
			items[i] = items[i + 1];
			}
		}
		
		size--;

		
		return removedItem;
		
	}

}