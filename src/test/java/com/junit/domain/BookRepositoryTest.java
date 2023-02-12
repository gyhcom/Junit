package com.junit.domain;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.domain.entity.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class BookRepositoryTest {

    @Autowired //DI4
    private BookRepository bookRepository;
    //1. 책 등록
    @Test
    @DisplayName("책 등록 테스트")
    void save_test(){
        //given (데이터 준비)
        
        String title="junit5";
        String author="Gyh";

        Book book = Book.builder()
            .title(title)
            .author(author)
            .build();
        
        //when  (테스트 실행)
        Book bookPs = bookRepository.save(book);

        assertEquals(title, bookPs.getTitle());
        assertEquals(author, bookPs.getAuthor());

        //then  (검증)
    }
    //2. 책 목록보기
    //3. 책 한건보기
    //4. 책 수정
    //5. 책 삭제
}