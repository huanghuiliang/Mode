package ChainOfResponsibility.entity;

import ChainOfResponsibility.Impl.Handler;
import ChainOfResponsibility.Impl.IWomen;

public class Husband extends Handler {

	public Husband() {
		super(Handler.LEVEL_HUSBAND);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("-----妻子向丈夫请示-----");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复是：不同意\n");

	}

}
