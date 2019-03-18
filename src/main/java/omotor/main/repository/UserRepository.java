package omotor.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import omotor.main.model.User;


@Repository
public interface  UserRepository extends JpaRepository<User, Long> {

}
