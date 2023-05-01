package com.enzulode.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * The main entity of the application
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity(name = "user_message")
public class Message
{
	/**
	 * Message id
	 */
	@Id
	@SequenceGenerator(
			name = "message_id_sequence",
			sequenceName = "message_id_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "message_id_sequence"
	)
	private Long id;

	/**
	 * Message is from
	 */
	private String userFrom;

	/**
	 * Message is to
	 */
	private String userTo;

	/**
	 * The message is
	 */
	private String msg;

	/**
	 * The message was sent at
	 */
	private LocalDateTime sentAt;
}
