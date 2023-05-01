package com.enzulode.repository;

import com.enzulode.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This repository is related to the message entity
 */
public interface MessageRepository extends JpaRepository<Message, Long>
{
}
