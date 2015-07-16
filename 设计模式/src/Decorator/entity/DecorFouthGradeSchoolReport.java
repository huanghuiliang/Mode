package Decorator.entity;

import Decorator.impl.SchoolReport;
/**
 * 我的具体的四年级成绩单
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
	//汇报最高分
	private void reportHightScore() {
		System.out.println("这次语文最高是75， 数学最高是70， 自然最高是68");
	}
	
	//汇报排名
	private void reportSore() {
		System.out.println("这次排名第30名...");
	}

	@Override
	public void sign(String name) {
		System.out.println("家长签名为：" + name);
	}

}
