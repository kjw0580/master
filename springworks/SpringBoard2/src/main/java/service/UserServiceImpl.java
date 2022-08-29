package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.UserVO;
import mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;

	@Override
	public boolean login(UserVO vo) {
		return mapper.login(vo);
	}
}
