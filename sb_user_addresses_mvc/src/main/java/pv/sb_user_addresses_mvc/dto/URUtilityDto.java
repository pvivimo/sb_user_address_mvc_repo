package pv.sb_user_addresses_mvc.dto;

public class URUtilityDto {
	
	private int id;
	private String name;
	
	
	public URUtilityDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "URUtilityDto [id=" + id + ", name=" + name + "]";
	}
	
	

}
