package com.cafe.com.cafe.service;

import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {

    ResponseEntity<String> signUp(Map<String,String> requestMap);
}
