package TP8_Listas;

import java.util.List;

public interface SimpleList {

	int size();
	
	boolean isEmpty();
	
	boolean contains();
	
	void add(Object element);
	
	void add(int index, Object element);
	
	Object set(int index, Object element);
	
	boolean remove(Object element);
	
	boolean remove(int index);
	
	void addAll(List otherlist);
	
	void clear();
	
	Object get(int index);
	
	int indexOf(Object element);
	
}
