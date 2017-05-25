
public interface Iterator<T> {
	
	//是否还具有下一个元素
	T next();
	
	//是否已经遍历到尾部
	boolean hasNext();
	
	//删除当前指向元素
	boolean remove();
	
}
