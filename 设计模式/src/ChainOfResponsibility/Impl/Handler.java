package ChainOfResponsibility.Impl;


public abstract class Handler {
	public static final int LEVEL_FATHER = 1;
	public static final int LEVEL_HUSBAND = 2;
	public static final int LEVEL_SON = 3;
	
	//�ܴ���ļ���
	public int level = 0;
	
	//��һ��������
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
				System.out.println("�������޷�����");
			}
			
		}
	};
	
	
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	
	/**
	 * ÿ�������߶�����ʵ�ֵĴ�������
	 * @param request
	 * @return
	 */
	public abstract void response(IWomen women);
	
	
	

}
