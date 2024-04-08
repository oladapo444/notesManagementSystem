package com.Semicolon.africa.Data.Model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class User {
    private Long id;
    private String Username;
    private final List<User>UserNote = new ArrayList<>();
    private String password;
}