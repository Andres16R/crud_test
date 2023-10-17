package com.example.demo.crud.application.port.out;

import com.example.demo.crud.adapter.out.persistence.UserEntity;

import java.util.List;

public interface LoadUserPort {
    UserEntity load();
    List<UserEntity> loads();
}
