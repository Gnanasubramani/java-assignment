package jpack1;

public class student {
 private int reg_no;
 private float s_cgpa;
 private String s_name,s_grade;
public int getReg_no() {
	return reg_no;
}
public void setReg_no(int reg_no) {
	this.reg_no = reg_no;
}
public float getS_cgpa() {
	return s_cgpa;
}
public void setS_cgpa(float f) {
	this.s_cgpa = f;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public String getS_grade() {
	return s_grade;
}
public void setS_grade(String s_grade) {
	this.s_grade = s_grade;
}
 public String toString() {
	 
	 return("student name:"+s_name +"\n regno:"+reg_no+"\n grade:"+s_grade+"\ncgpa:"+s_cgpa);
 }
 
}
