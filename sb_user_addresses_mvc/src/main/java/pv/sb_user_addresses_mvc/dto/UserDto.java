package pv.sb_user_addresses_mvc.dto;

public class UserDto {
	
	private String name;
	

	public UserDto(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "UserDto [name=" + name + "]";
	}
	
	
	
	

}
