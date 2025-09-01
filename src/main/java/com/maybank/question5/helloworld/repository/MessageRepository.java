package com.maybank.question5.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maybank.question5.helloworld.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
