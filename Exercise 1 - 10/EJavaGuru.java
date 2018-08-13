package com.ejavaguru;
import com.ejavaguru.courses.Course;
class EJavaGuru {
	public static void main(String args[]){
		Course c = new Course();
		c.courseName="Java";
		System.out.println(c.courseName);
	}
}

//Won't compile because it gives out an error: course is not public in com.ejavaguru.courses. cannot be accessed from outside package