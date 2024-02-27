//package com.CoderTanu.demo.service;
//
//import java.sql.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//import org.springframework.stereotype.Service;
//
//import com.CoderTanu.demo.Repo.GuestRepository;
//import com.CoderTanu.demo.Repo.ReservationRepository;
//import com.CoderTanu.demo.Repo.RoomRepo;
//import com.CoderTanu.demo.entity.Guest;
//import com.CoderTanu.demo.entity.Reservation;
//import com.CoderTanu.demo.entity.Room;
//
//import io.micrometer.common.util.StringUtils;
//
//
//@Service
//public class RoomReservationService {
//
//	
//	private final ReservationRepository reservationRepository;
//	private final GuestRepository guestRepository;
//	private final RoomRepo roomRepo;
//	
//	
//	public RoomReservationService(ReservationRepository reservationRepository, GuestRepository guestRepository,
//			RoomRepo roomRepo) {
//		this.reservationRepository = reservationRepository;
//		this.guestRepository = guestRepository;
//		this.roomRepo = roomRepo;
//	}
//	
//	public List<RoomReservation> getRoomReservationFromDate(String reservationDate){
//		
//		Date date=null;
//		
//		if(StringUtils.isNotEmpty(reservationDate)) {
//			date=Date.valueOf(reservationDate);
//		}else {
//			date=  new Date(new java.util.Date().getTime());
//		}
//		
//		Map<Long, RoomReservation>  roomReservations = new HashMap<>();
//		
//		List<Room> rooms =this.roomRepo.findAll();
//		
//		rooms.forEach(room ->{
//			
//			RoomReservation roomReservation = new RoomReservation();
//			roomReservation.setRoomId(room.getId());
//			roomReservation.setRoomName(room.getName());
//			roomReservation.setRoomNumber(room.getRoom_number());
//			roomReservations.put(roomReservation.getReservationId(), roomReservation);
//		});
//		
//		List<Reservation> reservations = this.reservationRepository.findAllByReservationDate(date);
//		
//		reservations.forEach(reservation ->{
//			RoomReservation roomReservation=	roomReservations.get(reservation.getRoomId());
//			roomReservation.setReservationId(reservation.getRoomId());
//			roomReservation.setReservationDate(reservation.getReservationDate());
//			Optional<Guest> guests =this.guestRepository.findById(reservation.getGuestId());
//			roomReservation.setGuestId(guests.get().getId());
//			roomReservation.setFirstName(guests.get().getFirstName());
//			roomReservation.setLastName(guests.get().getLastName());
//
//		
//		
//		});
//		
//		return roomReservations.values().stream().toList();
//		
//	}
//	
//	
//}
