package com.medical.medical_service.model.mapper;

import com.medical.medical_service.model.dtos.UsersDTO;
import com.medical.medical_service.model.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    public Users map(UsersDTO dto) {
        Users entity = new Users();
        entity.setName(dto.getName());
        return entity;
    }

    public UsersDTO map(Users entity) {
        UsersDTO dto = new UsersDTO();
        dto.setName(entity.getName());
        return dto;
    }
}
