package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findTopByOrderByPhyDesc();

	User findTopByOrderByTotalScoreDesc();

	List<User> findAllByOrderByTotalScoreAsc();

	List<User> findAllByOrderByTotalScoreDesc();

	

}
