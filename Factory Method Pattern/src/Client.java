
public class Client {
	
	public static void main(String[] args) {
		
		//��������
		Creator creator = new ConcreteCreator();
		
		//���ù���������Ʒ
		Product product = creator.createProduct(ConcreteProduct.class);
		
		//ҵ���߼�ִ��
		product.method2();
	}
}
