package com.comp.boot.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.comp.boot.user.UserVO;
import com.comp.boot.user.mapper.UserMapper;
import com.comp.boot.user.service.UserService;

@Service ("userService")
public class UserServiceImpl implements UserService, UserDetailsService{

	@Autowired private UserMapper mapper;
	
	@Override
	public UserVO getUser(UserVO vo) {
		
		return mapper.getUser(vo);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//단건조회
		UserVO userVO = new UserVO();
		userVO.setLoginId(username);
		UserVO vo = mapper.getUser(userVO);
		//ID 없으면 error
		if(vo == null) {
			throw new UsernameNotFoundException("no id");
		}
		//있으면 vo 리턴
		return vo; //princpal
	}

	
	
	
}
