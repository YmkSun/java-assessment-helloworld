package com.maybank.question5.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maybank.question5.helloworld.dto.HelloWorldDTO;
import com.maybank.question5.helloworld.repository.MessageRepository;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
	
	@Autowired
	private MessageRepository repository;

	@Override
	public HelloWorldDTO getMessage() {
		String message = repository.findById(1)
				.map(m -> m.getText())
				.orElse("Hello World (default)");
		return new HelloWorldDTO(message);
	}

}
