package com.crud.reuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.reuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
    
}
