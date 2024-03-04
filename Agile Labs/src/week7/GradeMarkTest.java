package week7;

import org.junit.Test;

import junit.framework.TestCase;

public class GradeMarkTest extends TestCase {
	
	GradeMark gm = new GradeMark();
	
	// Test# 1
		// Objective: Test 
		// Inputs: ExamMark 70; CourseMark 0;
	@Test
	public void testGenerateGrade() {
		assertEquals('A', gm.generateGrade(70, 0));
	}
	
}
