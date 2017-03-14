/**
 * 
 */
package com.bwoo.designpatterns.data_access_object;

/**
 * @author bwoo
 *
 */
public class DaoDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		StudentDao dao = new StudentDaoImpl();
		
		//print all students
	    for (Student student : dao.getAllStudents()) 
	    {
	    	System.out.println("Student: [RollNo : " + student.getRollNo() + 
	    			", Name : " + student.getName() + " ]");
	    }


	    //update student
	    Student student = dao.getAllStudents().get(0);
	    student.setName("Michael");
	    dao.updateStudent(student);

	    //get the student
	    dao.getStudent(0);
	    System.out.println("Student: [RollNo : " + student.getRollNo() + 
	    		", Name : " + student.getName() + " ]");

	}

}
