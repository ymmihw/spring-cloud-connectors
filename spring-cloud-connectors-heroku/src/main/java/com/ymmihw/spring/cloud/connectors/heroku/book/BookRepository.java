package com.ymmihw.spring.cloud.connectors.heroku.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
