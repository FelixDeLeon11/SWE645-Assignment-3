package com.felixdeleon.homework3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="surveys5")
public class Survey {
	
	Survey() {}
	Survey(String firstname, String lastname, String streetaddress, String city, String state, String zip, 
			String phonenumber, String email, String date, String campuslikes, String interest, String recommendation) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.streetaddress = streetaddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phonenumber = phonenumber;
		this.email = email;
		this.date = date;
		this.campuslikes = campuslikes;
		this.interest = interest;
		this.recommendation = recommendation;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="firstname", nullable=false)
	private String firstname;
	
	@Column(name="lastname", nullable=false)
	private String lastname;
	
	@Column(name="street_address", nullable=false)
	private String streetaddress;
	
	@Column(name="city", nullable=false)
	private String city;
	
	@Column(name="state", nullable=false)
	private String state;
	
	@Column(name="zip", nullable=false)
	private String zip;
	
	@Column(name="phone_number", nullable=false)
	private String phonenumber;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="date", nullable=false)
	private String date;
	
	@Column(name="campus_likes", nullable=false)
	private String campuslikes;
	
	@Column(name="interest", nullable=false)
	private String interest;
	
	@Column(name="recommendation", nullable=false)
	private String recommendation;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id=id;
	}
	
	public String getfirstname() {
		return firstname;
	}
	
	
	public void setfirstname(String firstname) {
		this.firstname=firstname;
	}
	
	public String getlastname() {
		return lastname;
	}
	
	public void setlastname(String lastname) {
		this.lastname=lastname;
	}
	
	public String getstreetaddress() {
		return streetaddress;
	}
	
	public void setstreetaddress(String streetaddress) {
		this.streetaddress=streetaddress;
	}
	
	public String getcity() {
		return city;
	}
	
	public void setcity(String city) {
		this.city=city;
	}
	
	public String getstate() {
		return state;
	}
	
	public void setstate(String state) {
		this.state=state;
	}
	
	public String getzip() {
		return zip;
	}
	
	public void setzip(String zip) {
		this.zip=zip;
	}
	
	public String getphonenumber() {
		return phonenumber;
	}
	
	public void setphonenumber(String phonenumber) {
		this.phonenumber=phonenumber;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email=email;
	}
	
	public String getdate() {
		return date;
	}
	
	public void setdate(String date) {
		this.date=date;
	}
	
	public String getcampuslikes() {
		return date;
	}
	
	public void setcampuslikes(String campuslikes) {
		this.campuslikes=campuslikes;
	}
	
	public String getinterest() {
		return interest;
	}
	
	public void setinterest(String interest) {
		this.interest=interest;
	}
	
	public String getrecommendation() {
		return recommendation;
	}
	
	public void setrecommendation(String recommendation) {
		this.recommendation=recommendation;
	}
}
