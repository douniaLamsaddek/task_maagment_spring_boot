package com.example.demo.services.Imp;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;
import com.example.demo.sherd.Utils;
import com.example.demo.sherd.dto.UserDto;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
	UserRepository userRepository;
    
    @Autowired
    Utils util;
    
	@Override
	public void createUser(UserDto userDto) {
		
        UserEntity checkuser =  userRepository.findByEmail(userDto.getEmail());
	    if(checkuser != null) throw new RuntimeException("cet utilisqteur existe deja dans la base de donnes");
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		userEntity.setUserId(util.generateStringId(32));
		
		UserEntity newuserEntity = userRepository.save(userEntity);
		
		
	}

}
