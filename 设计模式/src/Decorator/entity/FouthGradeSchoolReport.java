package Decorator.entity;

import Decorator.impl.SchoolReport;
/**
 * �ҵľ�������꼶�ɼ���
 * @author Cobe
 *
 */
public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		System.out.println("�𾴵�XXX�ҳ���");
		System.out.println("......");
		System.out.println("���� 62 	��ѧ 65	���� 98	��Ȼ 63");
	}

	@Override
	public void sign(String name) {
		System.out.println("�ҳ�ǩ��Ϊ��" + name);
	}

}
