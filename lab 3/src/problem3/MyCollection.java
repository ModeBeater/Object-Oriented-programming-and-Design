package problem3;

public interface MyCollection<E>{
	public int size();
	public boolean isEmpty();
	public boolean add(E e);
	public boolean remove(Object o);
}
