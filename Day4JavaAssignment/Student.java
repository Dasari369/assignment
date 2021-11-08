package com.sonata;

import java.util.ArrayList;
import java.util.List;
 public class Student {
   String stdName; 
   int stdMarks; 
   int stdId; 
   
   Student(String n, int m, int i){ 
      this.stdName= n; 
      this.stdMarks = m; 
       this.stdId = i; 
   }

public String getStdName() {
	return stdName;
}

public void setStdName(String stdName) {
	this.stdName = stdName;
}

public int getStdMarks() {
	return stdMarks;
}

public void setStdMarks(int stdMarks) {
	this.stdMarks = stdMarks;
}

public int getStdId() {
	return stdId;
}

public void setStdId(int stdId) {
	this.stdId = stdId;
}

@Override
public String toString() {
	return "Student [stdName=" + stdName + ", stdMarks=" + stdMarks + ", stdId=" + stdId + "]";
} 


   
}