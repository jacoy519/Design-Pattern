
public abstract class Creator {
	/*
	 * 创建一个产品对象，输入参数可以根据需要进行改变
	 */
	public abstract <T extends Product> T createProduct(Class<T> clazz);
}
 