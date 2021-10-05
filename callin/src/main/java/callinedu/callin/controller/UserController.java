package callinedu.callin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import callinedu.callin.domain.User;
import callinedu.callin.service.UserService;

@Controller
public class UserController {
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/register")
	public String register(){
		return "register/register"; 
	}
	
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("/login")
	public String login(){
		return "login/login"; 
	}
	
	@PostMapping("/login")
	public String login(@RequestParam(name="userId", required = false) String userId
			           ,@RequestParam(name="userPassword", required = false) String userPassword
			           ,HttpSession session
			           ,RedirectAttributes redirectAttr) {
		//로그인 -> DB 회원테이블 있는 ID만 회원로그인 가능해야한다.
		String errorMassage= null; 
			User user = userService.getUserInfoById(userId);
			//1. 입력한 ID로 조회된 회원이 있다면
			if(user != null) {
				//1-1. 입력한 패스워드와 조회된 회원 정보의 패스워드가 일치한다면
				if(userPassword.equals(user.getUserPw())) {		
					//세션에 ID, 권한, 이름 등록
					session.setAttribute("SID"		, userId);
					session.setAttribute("SLEVEL"	, user.getUserLevel());
					session.setAttribute("SNAME"	, user.getUserName());
					// 메인 화면으로 이동
					return "redirect:/";
				//1-2. 입력한 패스워드와 조회된 회원 정보의 패스워드가 일치하지 않는다면,	
				}else {
					errorMassage = "패스워드가 일치하지 않습니다. 패스워드를 확인해주세요.";
					redirectAttr.addAttribute("result", errorMassage);
					return "redirect:/login";
				}
			//2. 입력한 ID로 조회된 회원이 없다면 로그인 화면으로 redirect	
			}else {
				errorMassage = "등록되지 않은 아이디입니다.";
				redirectAttr.addAttribute("result", errorMassage);
				return "redirect:/login";
			}
	}
}
