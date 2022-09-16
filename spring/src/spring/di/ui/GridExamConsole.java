package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println(" -----------------------");
		System.out.println(" ㅣ       total   ㅣ     avg   ㅣ");
		System.out.println(" -----------------------");
		System.out.printf(" ㅣ          %3d     ㅣ     %3.2f  ㅣ\n",exam.total(),exam.avg());
		System.out.println(" -----------------------");
	}



	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
