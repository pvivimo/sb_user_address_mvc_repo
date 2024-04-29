package pv.sb_user_addresses_mvc.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "userid")
	private Integer userId;
	
	private List<URUtility> utilities;

	public Address(int id, String city, String street, Integer userId) {
		super();
		this.id = id;
		this.city = city;
		this.street = street;
		this.userId = userId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", street=" + street + ", userId=" + userId + "]";
	}
	
	
	

}
