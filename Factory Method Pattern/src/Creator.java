
public abstract class Creator {
	/*
	 * ����һ����Ʒ��������������Ը�����Ҫ���иı�
	 */
	public abstract <T extends Product> T createProduct(Class<T> clazz);
}
 