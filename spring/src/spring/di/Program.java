package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewlecExam();
//		ExamConsole console = new ExamConsole(exam);
		console.print(); 
		
	}

}
