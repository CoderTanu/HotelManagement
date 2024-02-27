package com.CoderTanu.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CoderTanu.demo.entity.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>{
	
	Optional<Room> findByRoomNumberIgnoreCase(String roomNumber);

}
