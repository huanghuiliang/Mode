package ChainOfResponsibility.entity;

import ChainOfResponsibility.Impl.Handler;
import ChainOfResponsibility.Impl.IWomen;

public class Husband extends Handler {

	public Husband() {
		super(Handler.LEVEL_HUSBAND);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("-----�������ɷ���ʾ-----");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ���ͬ��\n");

	}

}
