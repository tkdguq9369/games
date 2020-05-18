package com.games.gamesC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

	@GetMapping("/baseball")
	public String baseball(){
		return "/game/baseball";
	}
	
	@GetMapping("/number")
	public String number(){
		return "/game/number";
	}
	
}
