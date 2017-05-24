
public class ConcreteHandler1 extends Handler{

	@Override
	protected boolean isMatch(Request request) {
		return request.getLevel() == 1 ? true : false;
	}

	@Override
	protected Response execute(Request request) {
		System.out.println("handler 1 execute the request");
		return new Response();
	}

}
