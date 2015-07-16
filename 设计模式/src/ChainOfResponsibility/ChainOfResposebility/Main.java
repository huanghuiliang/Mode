package ChainOfResponsibility.ChainOfResposebility;

import java.util.ArrayList;
import java.util.Random;

import ChainOfResponsibility.Impl.Handler;
import ChainOfResponsibility.Impl.IWomen;
import ChainOfResponsibility.entity.Father;
import ChainOfResponsibility.entity.Husband;
import ChainOfResponsibility.entity.Son;
import ChainOfResponsibility.entity.Women;

public class Main {

	
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for(int i = 0; i < 5; i ++) {
			arrayList.add(new Women(rand.nextInt(4), "可以去优衣库吗"));
		}
		//定义三个请示对象
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		//设置请示顺序
		father.setNext(husband);
		husband.setNext(son);
		for(IWomen women: arrayList) {
			father.handleMessage(women);
		}
		
	}
}
