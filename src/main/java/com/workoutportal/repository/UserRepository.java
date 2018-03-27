package com.workoutportal.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.workoutportal.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("SELECT US.userId FROM User US WHERE US.userName= :userName")
	Long findByEmailId(@Param("userName") String userName);

}
