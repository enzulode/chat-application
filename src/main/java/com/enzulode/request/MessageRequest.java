package com.enzulode.request;

import java.time.LocalDateTime;

/**
 * This record represents new message related request
 *
 * @param userFrom user the message is from
 * @param userTo user the message is to
 * @param msg message body
 * @param sentAt sending time
 */
public record MessageRequest(String userFrom, String userTo, String msg, LocalDateTime sentAt)
{
}
