package com.studentportal;


public class Student {

    private int id;

    private String fname;
    private String lname;
    private String email;
    private int age;
    private String city;
    private String state;

//   No-Argument Constructor
    public Student() {
    }

//   Parameterized Constructor
    public Student(int id, String fname, String lname, String email, int age, String city, String state) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.age = age;
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname
                + ", email=" + email + ", age=" + age + ", city=" + city
                + ", state=" + state + "]";
    }

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}