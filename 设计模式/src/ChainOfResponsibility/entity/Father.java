package ChainOfResponsibility.entity;



import ChainOfResponsibility.Impl.Handler;
import ChainOfResponsibility.Impl.IWomen;

public class Father extends Handler {

	public Father() {
		super(Handler.LEVEL_FATHER);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("-----Ů��������ʾ-----");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ��ǣ�ͬ��\n");

	}

}
