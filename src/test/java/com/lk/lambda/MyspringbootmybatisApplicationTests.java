package com.lk.lambda;

import com.lk.lambda.model.User;
import com.lk.lambda.model.Wife;
import com.lk.lambda.service.UserService;
import com.lk.lambda.service.WifeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.function.Predicate;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(MyspringbootmybatisApplication.class)
public class MyspringbootmybatisApplicationTests {
	@Autowired
	private UserService userService ;
    @Autowired
    private WifeService wifeService;
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
    public void wifeServiceSelectListTest(){
        List<Wife> list  = wifeService.selectList();
        for (int i = 0; i < list.size(); i++) {
            Wife wife =  list.get(i);
            System.out.println(wife);
        }
    }
	@Test
	public void userGetByIdTest(){
		User user  = userService.getById(1);
			System.out.println(user);
	}
    @Test
    public void insnertWifeTest(){
        Wife wife = Wife.builder().cupSize(1).sexType(2).build();
        wife.setCupSize(1);
        wife.setName("jianhuo");

        wifeService.save(wife);
//		System.out.println(user);
    }
	@Test
	public void insnertUserTest(){
		User user = new User();
		user.setName("hehe");
		user.setAddress("shizigang");
        user.setAge(20);
        user.setLastName("rilegou");
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
	@Test
	public void lambdaTest(){
		List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//		features.forEach(n -> System.out.println(n));
//		features.forEach(System.out::println);

		Map<String,User> userMap  = new HashMap<String,User>();
		User u  = User.builder().address("jjj").build();
		u.setId(1);
		u.setName("11");
		userMap.put(u.getName(),u);
		u  = User.builder().address("jjj").build();
		u.setId(2);
		u.setName("22");
		userMap.put(u.getName(),u);
//		Predicate<User> checkUserName = new Predicate<User>() {
//			@Override
//			public boolean test(User user) {
//				if(user.getName().equals("11"))
//					return false;
//				else
//					return true;
//			}
//		};
		Predicate<String> checkUserName =(name -> name.equals("11"));
		Iterator<String> it = userMap.keySet().iterator();
//		userMap.keySet().stream().filter(checkUserName).forEach((name)-> System.out.println(userMap.get(name)));
		userMap.entrySet().stream().forEach(System.out::println);
//		it.forEachRemaining(checkUserName(name));
//		Predicate<String> fourLetterLong = (x) -> x.length()==7;
//		features.stream().filter(fourLetterLong).forEach(System.out::println);
	}
@Test
	public void test(){
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);

		costBeforeTax.stream().forEach(System.out::println);
		double bill =costBeforeTax.stream().map((cost) -> cost + 0.12*cost).reduce((sum, cost) -> sum + cost).get();
		System.out.println("Total : " + bill);
	}

}
