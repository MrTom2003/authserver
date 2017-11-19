package com.example.oauth;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
//	@GetMapping(value = "/authenticate")
//	public ResponseEntity authenticate(@RequestBody LoginData loginData) {
//		return new ResponseEntity(loginData, HttpStatus.OK);
//	}
	@PostMapping(value = "/login")
	public String login(@RequestParam(value="username") String username, @RequestParam(value="password") String password) {
		System.out.println("found " + username + " " + password);
		return "LKDLFK";
	}
//	

}