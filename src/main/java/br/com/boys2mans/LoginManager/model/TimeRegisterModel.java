package br.com.boys2mans.LoginManager.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class TimeRegisterModel {

    boolean active;

    LocalDateTime registrationDate;

    LocalDateTime lastAccessDate;

    LocalDateTime inativationDate;

    LocalDateTime reativationDate;

}
