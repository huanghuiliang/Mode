package ChainOfResponsibility.Impl;


public abstract class Handler {
	public static final int LEVEL_FATHER = 1;
	public static final int LEVEL_HUSBAND = 2;
	public static final int LEVEL_SON = 3;
	
	//能处理的级别
	public int level = 0;
	
	//下一个处理者
	private Handler nextHandler;
	
	public Handler(int level) {
		this.level = level;
	}
	
	public final void handleMessage(IWomen women) {
		if(women.getType() == this.level) {
			response(women);
		} else {
			if(nextHandler != null) {
				nextHandler.handleMessage(women);
			} else {
				System.out.println("该请求无法处理");
			}
			
		}
	};
	
	
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	
	/**
	 * 每个处理者都必须实现的处理任务
	 * @param request
	 * @return
	 */
	public abstract void response(IWomen women);
	
	
	

}
