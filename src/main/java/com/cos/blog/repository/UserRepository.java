package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cos.blog.model.User;

// DAO
// 자동으로 bean 등록이 된다.
// @Repository 생략 가능.
// User 테이블을 관리하는 저장소, Primary key는 Integer이다.
public interface UserRepository extends JpaRepository<User, Integer>{
	
}

//JPA Naming 쿼리 전략
	// SELECT * FROM user WHERE username = ? AND password = ?;
	//User findByUsernameAndPassword(String username, String password);
	
	// 쿼리문 호출 User 객체 리턴
	//	@Query(value="SELECT * FROM user WHERE username = ? AND password = ?", nativeQuery = true)
	//	User login(String username, String password);