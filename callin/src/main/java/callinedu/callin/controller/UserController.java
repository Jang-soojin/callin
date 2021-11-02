package callinedu.callin.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import callinedu.callin.domain.RegularClass;
import callinedu.callin.domain.User;
import callinedu.callin.service.ClassService;
import callinedu.callin.service.UserService;

@Controller
public class UserController {
	private final UserService userService;
	private final ClassService classService;
	
	public UserController(UserService userService, ClassService classSercive) {
		this.userService = userService;
		this.classService = classSercive;
	}
	
	
	@PostMapping("/register")
	public String addUser(	@RequestParam(name="user_id") String id,
							@RequestParam(name="user_pw") String pw,
							@RequestParam(name="user_name") String name,
							@RequestParam(name="user_nickname", required = false) String nickname,
							@RequestParam(name="skype_id", required = false) String skypeId,
							@RequestParam(name="birth_year") String birthYear,
							@RequestParam(name="birth_month") String birthMonth,
							@RequestParam(name="birth_day") String birthDay,
							@RequestParam(name="gender") String gender,
							@RequestParam(name="user_email") String email,
							@RequestParam(name="user_phone", required = false) String phoneNumber){
		String birth = birthYear +'-'+birthMonth +'-'+birthDay;
		System.out.println("생년월일 결합 : "+birth);
		userService.addUser(id, pw, name, nickname, skypeId, birth, gender, email, phoneNumber);
		
		return "redirect:/login"; 
	}
	
	@GetMapping("/register")
	public String registerPage(	){
		return "register/register"; 
	}
	
	@PostMapping("/register/idDuplicateCheck")
	@ResponseBody
	public User idDuplicateCheck(String userId) {
		System.out.println(userId);
		User duplicateCheck = userService.idDuplicateCheck(userId);
		System.out.println(duplicateCheck);
		
		return duplicateCheck;
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
	
	@GetMapping("/callback")
	public String callback(){
		return "login/callback"; 
	}
	
	@PostMapping("/login")
	public String loginProcess(@RequestParam(name="userId", required = false) String userId
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
	
	/* ↓↓↓↓↓↓↓↓↓↓유저 페이지↓↓↓↓↓↓ */
	
	@GetMapping("/user/ClassRegister")
	public String classRegister(	){
		return "userPage/classRegister"; 
		
	}
	/* 2021.10.31 김경수 추가 */
	@RequestMapping(value="/user/getRegularClass", method= RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public List<RegularClass> regularClass(@RequestParam(name="className", required = false) String className ,Model model) {
		System.out.println("정규수업 등록 컨트롤러 실행");
		model.addAttribute("title", "정규수업");
		model.addAttribute("midTitle", "정규수업등록");
		List<RegularClass> regularClass = classService.searchRegularClass(className);
		
		return regularClass;
	}
	
	@PostMapping("/user/applyClass")
	public String applyClass(
							@RequestParam(name="regular-class-code", required = false) String regularClassCode
							,@RequestParam(name="class-start-date", required = false) String classStartDate
							,@RequestParam(name="class_start_time", required = false) String classStartTime
							,@RequestParam(name="introduction", required = false) String introduction
							) {
		System.out.println(regularClassCode);
		System.out.println(classStartDate);
		System.out.println(classStartTime);
		System.out.println(introduction);
		classService.applyClass(regularClassCode,classStartDate,classStartTime,introduction);
		return "redirect:/user";
	}
	
	/* 2021.10.31 김경수 추가 */
}
