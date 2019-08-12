package com.qa.poke;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int memberNumber;
	private String memberName;

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public User(int memberNumber, String memberName) {
		super();
		this.memberNumber = memberNumber;
		this.memberName = memberName;
	}
	public User()
	{
		super();		
	}

}
