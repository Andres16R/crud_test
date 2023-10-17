package com.example.demo.crud.application.services;

import com.example.demo.crud.adapter.out.persistence.UserEntity;
import com.example.demo.crud.application.port.in.IGetUserUseCase;
import com.example.demo.crud.application.port.out.LoadUserPort;
import com.example.demo.crud.common.UseCase;
import com.example.demo.crud.domain.model.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

//TODO duda por que usar este alias de Componet en vez de @Service
@UseCase
public class UserService implements IGetUserUseCase {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LoadUserPort loadUserPort;

    @Override
    public User getUser() {
        return modelMapper.map(loadUserPort.load(), User.class);
    }


    public List<User> getUsers() {
        List<UserEntity> userEntities = loadUserPort.loads();
        Type userListType = new TypeToken<List<User>>() {}.getType();
        return modelMapper.map(userEntities, userListType);
    }
}
