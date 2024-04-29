package pv.sb_user_addresses_mvc.dto;

import java.util.List;

import pv.sb_user_addresses_mvc.model.Address;

public class UserDto {
	
	private String name;
	private List<Address> address;
	
	
	public UserDto(String name, List<Address> address) {
		super();
		this.name = name;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "UserDto [name=" + name + ", address=" + address + "]";
	}
	
	
	

	
}
