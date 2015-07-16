package ChainOfResponsibility.entity;

import ChainOfResponsibility.Impl.IWomen;

public class Women implements IWomen {
	/*
	 * 通过一个int类型的参数来描述妇女的个人状况
	 * 1--未出嫁
	 * 2--出嫁
	 * 3--丧夫
	 */
	private int type = 0;
	
	private String requeString = "";
	

	public Women(int type, String requeString) {
		super();
		this.type = type;
		this.requeString = requeString;
	}

	@Override
	public int getType() {
		
		return type;
	}

	@Override
	public String getRequest() {
		
		return requeString;
	}

}
