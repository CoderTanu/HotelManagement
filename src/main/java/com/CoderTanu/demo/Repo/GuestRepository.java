package com.CoderTanu.demo.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CoderTanu.demo.entity.Guest;



@Repository
public interface GuestRepository extends JpaRepository<Guest, Long>{
	


}
