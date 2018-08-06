//package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/")
public class testController {

	@RequestMapping(value="/home")
	public  String returnTest(){
		return "running";
	}
}
