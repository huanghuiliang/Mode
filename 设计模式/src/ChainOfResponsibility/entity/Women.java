package ChainOfResponsibility.entity;

import ChainOfResponsibility.Impl.IWomen;

public class Women implements IWomen {
	/*
	 * ͨ��һ��int���͵Ĳ�����������Ů�ĸ���״��
	 * 1--δ����
	 * 2--����
	 * 3--ɥ��
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
