package week7;

public class GradeMark {

	protected char generateGrade(int examMark, int cwMark) {
		
		int courseMark = examMark + cwMark;
		
		if(courseMark >= 70 ) {
			 return 'A';
		}
		else if (courseMark >= 50 && courseMark < 70) {
			return 'B';
		}
		
		else if (courseMark >= 30 && courseMark < 50) {
			return 'C';
		}
		else {
			return 'D';
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
