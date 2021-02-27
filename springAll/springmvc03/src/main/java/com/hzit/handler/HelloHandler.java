package com.hzit.handler;

import com.hzit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloHandler {
	
	 @RequestMapping(value="hello")
	  public String hello(){
	      System.out.println("hello world");
	      return "index";
	  }
	
	/**
	 * post请求
	 * @return
	 */
	@RequestMapping(value="/postTest",method=RequestMethod.POST)
	public String postTest(){
		System.out.println("postTest");
		return "index";
	}
	
	/**
	 * get请求
	 * @return
	 */
	@RequestMapping(value="/getTest",method=RequestMethod.GET)
	public String getTest(){
		System.out.println("getTest");
		return "index";
	}
	
	/**
	 * 重定向
	 * @return
	 */
	@RequestMapping("redirectTest")
	public String redirectTest(){
		return "redirect:/addUser.jsp";
	}
	
	/**
	 * 转发
	 * @return
	 */
	@RequestMapping("forwardTest")
	public String forwardTest(){
		return "forward:/addUser.jsp";
	}
	
	/**
	 * 参数限制
	 * @return
	 */
	@RequestMapping(value="paramsTest",params={"name","id=10"})
	public String paramsTest(){
		System.out.println("paramsTest");
		//http://localhost:8038/springmvc03_war/paramsTest?name=112&id=10
		return "addUser";
	}
	
	
	/**
	 * 参数绑定
	 * @return
	 */
	@RequestMapping(value="paramsBind")
	public String paramsBind(@RequestParam("name") String name,@RequestParam("id") int id){
		//http://localhost:8038/springmvc03_war/paramsBind?name=%E5%BC%A0%E4%B8%89&id=18
		//http://localhost:8038/springmvc03_war/paramsBind?name=good&id=18
		System.out.println(name);
		int num = id+10;
		System.out.println(num);
		return "addUser";
	}
	
	/**
	 * restful风格
	 * @return
	 */
	@RequestMapping(value="restful/{name}")
	public String paramsBind(@PathVariable("name") String name){
		//http://localhost:8038/springmvc03_war/restful/goodbye
		System.out.println(name);
		return "addUser";
	}
	
	/**
	 * 获取Cookie的值
	 * @return
	 */
	@RequestMapping("/cookieTest")
	public String getCookie(@CookieValue(value="JSESSIONID") String sessionId){
		System.out.println(sessionId);
		return "addUser";
	}
	
	@RequestMapping("/addUser")
	public String getPOJO(User user){
		System.out.println(user);
		return "addUser";
	}
	
}