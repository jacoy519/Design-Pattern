
public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> clazz) {
		Product product = null;
		try {
			product = (Product) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T)product;
	}

}
