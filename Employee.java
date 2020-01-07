package beans;

import java.util.List;

public class Employee {
private int empno;
private String ename;
private List<String> skills;

public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}

public List<String> getSkills() {
	return skills;
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}
public void start(){
	System.out.println("start");
}
public void stop(){
	System.out.println("stop");
}
}
