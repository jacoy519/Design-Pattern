
public class Director {
	
	private Builder builder = new ConcreteProduct();
	
	//������Ʒ
	public Product getAProduct() {
		builder.setPart();
		return builder.buildProduct();
	}
}
