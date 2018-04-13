package Beans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String profession;
	private int wakeUpCount;
	private WakeupEventListener actionWakeupListener;
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName==null || firstName.isEmpty())
			throw new NullPointerException("FirstName is not allowed to be null or empty");
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public void setActionListener(WakeupEventListener listener) {
		this.actionWakeupListener = listener;
	}
	
	public Person() {
		wakeUpCount = 0;
		id = -1;
		firstName = "Undefined";
		lastName = "Undefined";
		age = -1;
		profession = "Undefined";
	}
	
	@Override
	public String toString() {
		return String.format(
				"Person Information: \nId: %s\nFirstName: %s\nLastName: %s\nAge: %s\nProfession: %s", 
				id==-1 ? "Not Saved" : id,
				firstName == "Undefined" ? "Not Assigned" : this.firstName,
				lastName == "Undefined" ? "Not Assigned" : this.lastName,
				age == -1 ? "Not yet born!" : age,
				profession == "Undefined"? "Not working" : profession);
	}
	
	public Boolean wakeUp() {
		if(wakeUpCount++<3)
			return false;
		else {
			if(this.actionWakeupListener!=null)
				this.actionWakeupListener.PersonWokeUp(this, new ActionEvent(this, id, "Wake up"));
			return true;
		}
	}
}
