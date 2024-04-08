package com.Semicolon.africa.Data.Model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Note {
    private String firstname;
    private String lastname;
    private  String id;
    private LocalDateTime timeComplete;
    private LocalDateTime timeCreated;
}
