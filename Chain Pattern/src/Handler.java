
public abstract class Handler {
	
	private Handler nextHandler;
	
	public final Response handleRequest(Request request) {
		if(isMatch(request)) {
			return execute(request);
		}
		if(nextHandler != null ) {
			return nextHandler.handleRequest(request);
		}
		return null;
	}
	
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	 
	//判断是否由当前处理者进行处理
	protected abstract boolean isMatch(Request request);
	
	//执行具体的请求
	protected abstract Response execute(Request request);
 	
}
