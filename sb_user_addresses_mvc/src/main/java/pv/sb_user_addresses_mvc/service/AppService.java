package pv.sb_user_addresses_mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pv.sb_user_addresses_mvc.db.Database;
import pv.sb_user_addresses_mvc.dto.AddressDto;
import pv.sb_user_addresses_mvc.dto.UserDto;
import pv.sb_user_addresses_mvc.model.User;

@Service
public class AppService {
	
	private Database db;
	
	@Autowired
	public AppService(Database db) {
		super();
		this.db = db;
		
	}
	
	public UserDto getUserById(int userId) {
		
		UserDto userDto = null;
		
		User user = db.getUserById(userId);
		
		return userDto;
	}
	
	public List<AddressDto> getAddressByUserId(int userId){
		
		List<AddressDto> addressDto = null;
		
		
		return addressDto;
	}
	
//	public getUtilitiesByAddressId(int addressId) {
//		
//	}

}
