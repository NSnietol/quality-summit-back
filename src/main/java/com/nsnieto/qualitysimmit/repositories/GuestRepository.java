package com.nsnieto.qualitysimmit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsnieto.qualitysimmit.models.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

}

