package com.lk.lambda;

import com.lk.lambda.model.User;
import com.lk.lambda.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(MyspringbootmybatisApplication.class)
public class MyspringbootmybatisApplicationTests {
	@Autowired
	private UserService userService ;
	@Test
	public void contextLoads() {
	}
	@Test
	public void userServiceSelectListTest(){
		List<User> list  = userService.selectList();
		for (int i = 0; i < list.size(); i++) {
			User user =  list.get(i);
			System.out.println(user);
		}
	}
	@Test
	public void userGetByIdTest(){
		User user  = userService.getById(1);
			System.out.println(user);
	}

	@Test
	public void insnertUserTest(){
		User user = new User();
		user.setName("hehe");
		userService.save(user);
//		System.out.println(user);
	}

	@Test
	public void updateUserTest(){
		User user = new User();
		user.setId(1);
		user.setName("wwwwww");
		userService.save(user);
	}
}
