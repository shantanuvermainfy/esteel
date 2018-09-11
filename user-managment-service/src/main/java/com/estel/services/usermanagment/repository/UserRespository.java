package com.estel.services.usermanagment.repository;

import com.estel.services.usermanagment.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository<User,Long> {
}
