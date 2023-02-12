package com.junit.presentation.request;

import com.junit.domain.entity.Book;
import lombok.Setter;

@Setter //Controller에서 Setter가 호출되면서 값이 채워짐
public class BookSaveRequest {
    private String title;
    private String author;

    public Book toEntity(){
        return Book.builder()
            .title(title)
            .author(author)
            .build();
    }
}
//컨트롤러 title, author -> BookSaveReqDto -> Service에게 넘김 -> Book 엔티티 변환 -> BookRepository.save(Book)