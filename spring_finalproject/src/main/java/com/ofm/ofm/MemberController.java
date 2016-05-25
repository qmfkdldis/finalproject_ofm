package com.ofm.ofm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ofm.member.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private MemberService memberserivce;
	
	
	@RequestMapping("Join")
	public void join(){
		
		
		
	}	
	
}
