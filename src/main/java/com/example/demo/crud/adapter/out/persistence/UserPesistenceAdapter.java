package com.example.demo.crud.adapter.out.persistence;

import com.example.demo.crud.application.port.out.LoadUserPort;
import com.example.demo.crud.common.PersistenceAdapter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@PersistenceAdapter
public class UserPesistenceAdapter implements LoadUserPort {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity load() {
        return userRepository.findAll().get(0);
    }

    @Override
    public List<UserEntity> loads() {
        return userRepository.findAll();
    }
}
