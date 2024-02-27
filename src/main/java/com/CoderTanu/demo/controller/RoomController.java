package com.CoderTanu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CoderTanu.demo.Repo.RoomRepo;

@Controller
@RequestMapping("/room")
public class RoomController {
	
	private final RoomRepo roomRepo;
	
	public RoomController(RoomRepo roomRepo) {
		this.roomRepo=roomRepo;
	}
	

	@GetMapping
	public String getRooms(Model model) {
		model.addAttribute("rooms", this.roomRepo.findAll());
		return "room-list";
	}
	
}
