package ChainOfResponsibility.entity;

import ChainOfResponsibility.Impl.Handler;
import ChainOfResponsibility.Impl.IWomen;

public class Son extends Handler {

	public Son() {
		super(Handler.LEVEL_SON);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("-----ĸ���������ʾ-----");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");

	}

}
