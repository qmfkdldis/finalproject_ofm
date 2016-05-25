package com.ofm.ofm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	@RequestMapping("bed")
	public void bed(){}
}
