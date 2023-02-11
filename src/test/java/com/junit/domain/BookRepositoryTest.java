package com.junit.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class BookRepositoryTest {

    @Autowired //DI
    private BookRepository bookRepository;
    //1. 책 등록
    @Test
    @DisplayName("책 등록 테스트")
    void save_test(){
        System.out.println("책 등록");
    }
    //2. 책 목록보기
    //3. 책 한건보기
    //4. 책 수정
    //5. 책 삭제
}