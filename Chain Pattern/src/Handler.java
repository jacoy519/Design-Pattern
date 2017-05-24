
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
	 
	//�ж��Ƿ��ɵ�ǰ�����߽��д���
	protected abstract boolean isMatch(Request request);
	
	//ִ�о��������
	protected abstract Response execute(Request request);
 	
}
