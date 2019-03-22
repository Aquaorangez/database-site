package com.aqua.testwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aqua.testwebapp.dao.GameObjectDAO;
import com.aqua.testwebapp.entity.GameObject;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@Autowired
	private GameObjectDAO gameObjectDAO;
	
	@RequestMapping("/objects") 
	public String listObjects(Model theModel) {
		
		
		List<GameObject> gameObject = gameObjectDAO.getGameObjects();
		
	
		
		theModel.addAttribute("gO", gameObject);
		
		
		return "object-list";
	}

}
