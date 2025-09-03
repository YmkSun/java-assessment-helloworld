package com.question5.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question5.helloworld.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
