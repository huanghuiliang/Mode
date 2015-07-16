package Decorator.entity;

import Decorator.impl.SchoolReport;
/**
 * �ҵľ�������꼶�ɼ���
 * @author Cobe
 *
 */
public class DecorFouthGradeSchoolReport extends SchoolReport {
	
	private SchoolReport sReport;
	
	public DecorFouthGradeSchoolReport(SchoolReport sReport) {
		this.sReport = sReport;
	}

	@Override
	public void report() {
		reportHightScore();
		sReport.report();
		reportSore();
	}
	//�㱨��߷�
	private void reportHightScore() {
		System.out.println("������������75�� ��ѧ�����70�� ��Ȼ�����68");
	}
	
	//�㱨����
	private void reportSore() {
		System.out.println("���������30��...");
	}

	@Override
	public void sign(String name) {
		System.out.println("�ҳ�ǩ��Ϊ��" + name);
	}

}
