package com.maneesha.rentacar.demoapplication.repository;

import com.maneesha.rentacar.demoapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends JpaRepository<User,Integer> {

//User save(User user);

}
