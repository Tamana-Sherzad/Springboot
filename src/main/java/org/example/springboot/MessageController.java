package org.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController

public class MessageController {

    private List<Message> messageList = new ArrayList<>();

    @GetMapping("api/message")
    public List<Message> getAllMessages() {
        return messageList;
    }

    @PostMapping("api/message")
        public Message addMessage(@RequestBody Message newMessage){
            messageList.add(newMessage);
            return newMessage;
        }
    }



