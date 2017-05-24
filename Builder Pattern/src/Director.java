
public class Director {
	
	private Builder builder = new ConcreteProduct();
	
	//构建产品
	public Product getAProduct() {
		builder.setPart();
		return builder.buildProduct();
	}
}
