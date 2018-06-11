package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;
     private String address;

	public Student() {
		super();
	}

	public Student(Long id, String name, String passportNumber,String address) {
		super();
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
           this.address=address
	}
ashish kumar sinhaa
	public Student(String name, String passportNumber) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
     
      public String setAddress(String address)
{
 this.address=address;
}
     public void getAddress()
{
   return address;
}

	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, passportNumber=%s, address=%s]", id, name, passportNumber, address);
	}

}
