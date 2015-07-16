package Decorator.impl;

public abstract class SchoolReport {
	//展示成绩
	public abstract void report();
	//成绩单要家长签字，这是最要命的0
	public abstract void sign(String name);

}
