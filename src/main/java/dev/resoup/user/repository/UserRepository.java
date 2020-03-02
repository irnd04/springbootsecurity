package dev.resoup.user.repository;

import org.springframework.stereotype.Repository;

import dev.resoup.user.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	
}
