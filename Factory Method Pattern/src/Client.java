
public class Client {
	
	public static void main(String[] args) {
		
		//创建工厂
		Creator creator = new ConcreteCreator();
		
		//利用工厂创建产品
		Product product = creator.createProduct(ConcreteProduct.class);
		
		//业务逻辑执行
		product.method2();
	}
}
