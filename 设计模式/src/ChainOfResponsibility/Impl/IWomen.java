package ChainOfResponsibility.Impl;

public interface IWomen {
	
	//获得个人状况
	public int getType();
	
	//获得个人请示，你要干什么？出去约会？看电影？还是去优衣库？
	public String getRequest();
	
	

}
