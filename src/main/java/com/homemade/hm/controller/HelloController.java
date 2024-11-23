package com.homemade.hm.controller;

import com.homemade.hm.model.Message;
import com.homemade.hm.model.User;
import com.homemade.hm.repository.MessageRepository;
import com.homemade.hm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/hello")
    public Message saveMessage(@RequestParam(required = false) Long userId, @RequestBody String content) {
        Message message = new Message();
        message.setContent(content);
        if (userId != null) {
            User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
            message.setUser(user);
        }
        return messageRepository.save(message);
    }
//    @PostMapping("/hello")
//    public Message saveMessage(@RequestBody Message message) {
//        return messageRepository.save(message);
//    }

    @GetMapping("/hello")
    public List<Message> getMessages() {
        return messageRepository.findAll();
    }
}
