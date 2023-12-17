package com.missworld.missweb.Repositories;

import com.missworld.missweb.Models.Contestants;
import com.missworld.missweb.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContestantRepository  extends JpaRepository<Contestants, Long> {
    @Query("SELECT c FROM Contestants c WHERE c.country LIKE CONCAT ('%',:country,'%')")
    List<Contestants> searchCont(String  country);

    List<Contestants> findByUserId(Users user);
//    @Query("SELECT c FROM Contestants c WHERE c.userId = :Id")
//    Contestants findContestantByUserId(long Id);

}
