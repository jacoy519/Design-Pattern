
public class ConcreteProduct extends Builder {
	
	private Product product = new Product();
	
	@Override
	public void setPart() {
		/*
		 * ��Ʒ���ڵ��߼�����
		 */
	}

	@Override
	public Product buildProduct() {
		return product;
	}

}
