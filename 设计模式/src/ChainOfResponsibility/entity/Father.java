package ChainOfResponsibility.entity;



import ChainOfResponsibility.Impl.Handler;
import ChainOfResponsibility.Impl.IWomen;

public class Father extends Handler {

	public Father() {
		super(Handler.LEVEL_FATHER);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("-----女儿向父亲请示-----");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同意\n");

	}

}
