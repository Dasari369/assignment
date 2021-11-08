package com.sonata;


import java.util.ArrayList;
import java.util.List;

public class StudentCompare {

 public static void main(String[] args) {
      List<Student> stdlist = new ArrayList<Student>();
      stdlist.add(new Student("Stefen", 200, 11)); 
      stdlist.add(new Student("Elena", 150, 13)); 
      stdlist.add(new Student("Damon", 120, 15)); 
      stdlist.add(new Student("klaus", 360, 16)); 
      stdlist.add(new Student("Hayley", 250, 17));
      stdlist.add(new Student("Rebecca",430,12));
      stdlist.add(new Student("Mark",300,14));
     
 
     stdlist.sort((Student s1, Student s2)->s2.getStdMarks()-s1.getStdMarks()); 

      for(Student s : stdlist)
      {
    	  System.out.println(s);
      }
     
 }

}

	
			
	
	


		

