package com.enzulode.service;

import com.enzulode.model.Message;
import com.enzulode.repository.MessageRepository;
import com.enzulode.request.MessageRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service contains all the business logic related to chat
 */
@Service
@AllArgsConstructor
public class ChatService
{
	private final MessageRepository repository;

	/**
	 * This method handles retrieving all messages request
	 *
	 * @return a list of existing messages
	 */
	public List<Message> getAllMessages()
	{
		return repository.findAll();
	}

	/**
	 * This method handles new message request and saves the new message in the database via JPA repository
	 *
	 * @param messageRequest new message request
	 */
	public void addNewMessage(MessageRequest messageRequest)
	{
		Message message = new Message();
		message.setUserFrom(messageRequest.userFrom());
		message.setUserTo(messageRequest.userTo());
		message.setMsg(messageRequest.msg());
		message.setSentAt(messageRequest.sentAt());

		repository.save(message);
	}
}
