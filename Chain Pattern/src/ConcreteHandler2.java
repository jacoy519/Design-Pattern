
public class ConcreteHandler2 extends Handler {

	@Override
	protected boolean isMatch(Request request) {
		return request.getLevel() == 2 ? true : false;
	}

	@Override
	protected Response execute(Request request) {
		System.out.println("handler 2 execute the request");
		return new Response();
	}

}
