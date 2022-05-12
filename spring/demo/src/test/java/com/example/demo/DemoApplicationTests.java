package com.example.demo;

import com.example.demo.entity.order32.Board;
import com.example.demo.repository.order32.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	BoardRepository repository;

	@Test
	void 얘는한글로적어도돌아가요() {
		Board board = new Board("test", "test", "test");


	}

}
