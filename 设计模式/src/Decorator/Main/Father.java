package Decorator.Main;

import Decorator.entity.DecorFouthGradeSchoolReport;
import Decorator.entity.FouthGradeSchoolReport;
import Decorator.impl.SchoolReport;

public class Father {
	
	public static void main(String[] args) {
		SchoolReport sr = new FouthGradeSchoolReport();
		DecorFouthGradeSchoolReport sReport = new DecorFouthGradeSchoolReport(sr);
		sReport.report();
		sReport.sign("ÀÏÈý");
	}

}
