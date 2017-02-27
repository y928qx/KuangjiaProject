package springmvctest.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvctest.co.Bo;

@Controller
@RequestMapping(value="/databind")
public class te {
	@RequestMapping(value = "/tec", method = { RequestMethod.GET })
	public String tt() {
		

		System.out.println("打印如下 VVw");
		return  "index";
	}

	@RequestMapping(value="/tec", method = { RequestMethod.POST })
	public @ResponseBody Bo requestBodyBind(@RequestBody Bo Bo) {
		System.out.println("打印如下");
	
		
		System.out.println(Bo.toString());
		return Bo;
	}

}
