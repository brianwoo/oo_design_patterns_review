/**
 * 
 */
package com.bwoo.designpatterns.data_access_object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bwoo
 *
 */
public class StudentDaoImpl implements StudentDao
{
	private List<Student> students;
	/**
	 * 
	 */
	public StudentDaoImpl()
	{
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);
		
		students.add(student1);
		students.add(student2);
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.data_access_object.StudentDao#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents()
	{
		return students;
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.data_access_object.StudentDao#getStudent(int)
	 */
	@Override
	public Student getStudent(int rollNo)
	{
		return students.get(rollNo);
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.data_access_object.StudentDao#updateStudent(com.bwoo.designpatterns.data_access_object.Student)
	 */
	@Override
	public void updateStudent(Student student)
	{
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + 
				", updated in the database");
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.data_access_object.StudentDao#deleteStudent(com.bwoo.designpatterns.data_access_object.Student)
	 */
	@Override
	public void deleteStudent(Student student)
	{
		students.remove(student.getRollNo());
	    System.out.println("Student: Roll No " + student.getRollNo() + 
	    		", deleted from database");
	}

}
