package com.enzulode.controller;

import com.enzulode.ChatServer;
import com.enzulode.model.Message;
import com.enzulode.request.MessageRequest;
import com.enzulode.service.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The main chat REST controller
 */
@RestController
@RequestMapping("/api/chat")
@AllArgsConstructor
public class ChatController
{
	/**
	 * Chat service instance
	 */
	private final ChatService chatService;

	/**
	 * This method returns a list of existing messages in JSON format
	 *
	 * @return JSON array of existing messages objects
	 */
	@GetMapping
	public List<Message> getAllMessages()
	{
		ChatServer.LOGGER.info("All messages retrieved");
		return chatService.getAllMessages();
	}

	/**
	 * This method proceeds a new message from the JSON request body
	 *
	 * @param messageRequest JSON request body with new message
	 */
	@PostMapping
	public void sendNewMessage(@RequestBody MessageRequest messageRequest)
	{
		ChatServer.LOGGER.info("Saving new message");
		chatService.addNewMessage(messageRequest);
	}
}
