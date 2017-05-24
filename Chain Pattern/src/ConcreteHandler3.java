
public class ConcreteHandler3 extends Handler {
	
	@Override
	protected boolean isMatch(Request request) {
		return request.getLevel() == 3 ? true : false;
	}

	@Override
	protected Response execute(Request request) {
		System.out.println("handler 3 execute the request");
		return new Response();
	}
}
