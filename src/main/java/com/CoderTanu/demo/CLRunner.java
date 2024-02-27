//package com.CoderTanu.demo;
//
//import java.util.List;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.CoderTanu.demo.Repo.GuestRepository;
//import com.CoderTanu.demo.Repo.ReservationRepository;
//import com.CoderTanu.demo.Repo.RoomRepo;
//import com.CoderTanu.demo.service.RoomReservation;
//import com.CoderTanu.demo.service.RoomReservationService;
//
//@Component
//public class CLRunner implements CommandLineRunner{
//	
//	
//	private final ReservationRepository reservationRepository;
//	private final GuestRepository guestRepository;
//	private final RoomRepo roomRepo;
//	private final RoomReservationService service;
//	
//	
//	public CLRunner(ReservationRepository reservationRepository, GuestRepository guestRepository,
//			RoomRepo roomRepo,RoomReservationService service) {
//		this.reservationRepository = reservationRepository;
//		this.guestRepository = guestRepository;
//		this.roomRepo = roomRepo;
//		this.service=service;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		List<RoomReservation> reservation =this.service.getRoomReservationFromDate("23-08-28");
//		reservation.forEach(System.out::println);
//	}
//
//}
