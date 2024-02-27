package com.CoderTanu.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.CoderTanu.demo.Repo.RoomRepo;
import com.CoderTanu.demo.entity.Room;
import com.CoderTanu.demo.exception.BadRequestException;
import com.CoderTanu.demo.exception.NotFoundException;

@RestController
@RequestMapping("/api/rooms")
public class RoomAPIController {
	
	private final RoomRepo roomRepo;

	public RoomAPIController(RoomRepo roomRepo) {
		this.roomRepo = roomRepo;
	}
	
	@GetMapping	
	public List<Room> getAllRooms(){
		return this.roomRepo.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Room createRoom(@RequestBody Room room) {
		
		return this.roomRepo.save(room);
	}
	
	@GetMapping("/{id}")
	public Room getRoomById(@PathVariable("id") long id) {
		
	Optional<Room> room = this.roomRepo.findById(id);
	if(room.isEmpty()) {
		throw new NotFoundException();
	}
	return room.get();

}
	@PutMapping("/id")
	public Room updateRoom(@PathVariable("id")long id, @RequestBody Room room) {
		if(id != room.getId()) {
			throw new BadRequestException("id of path does not matched");	
		}
		return this.roomRepo.save(room);
	}
	
	@DeleteMapping("/id")
	@ResponseStatus(HttpStatus.RESET_CONTENT)
	public void deleteRoom(@PathVariable("id")long id) {
		
		 this.roomRepo.deleteById(id);
	}
	
}
