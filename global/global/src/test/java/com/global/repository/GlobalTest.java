package com.global.repository;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.global.entity.Nation;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")	//test code 작성할 때 쓸 DB로 만든 property에 연결. 여기서는 H2 DB에 연결됨.
class GlobalTest {
	
	@Autowired	
	@PersistenceContext
	EntityManager em;
	
	public void createNationTest() {
		for(int i = 1; i <= 2; i++) {
			Nation nation = new Nation();
			
		}
	}
	
	public void createNationTest2() {
		for(int i = 3; i <= 4; i++) {
			Nation nation = new Nation();
			
		}
	}
	
	public void createNationTest3() {
		for(int i = 5; i <= 6; i++) {
			Nation nation = new Nation();
		}
	}
	
	public void createNationTest4() {
		for(int i = 7; i <= 8; i++) {
			Nation nation = new Nation();
		}
	}
	
	public void createNationTest5() {
		for(int i = 9; i <= 10; i++) {
			Nation nation = new Nation();
		}
	}
}
