package org.example.useremployee.repositories;

import org.example.useremployee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository <User, Integer>{

}
