package com.homemade.hm.repository;

import com.homemade.hm.model.Message;
import com.homemade.hm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByUser(User user);
}
