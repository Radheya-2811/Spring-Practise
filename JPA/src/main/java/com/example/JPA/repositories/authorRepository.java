package com.example.JPA.repositories;

import com.example.JPA.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface authorRepository extends JpaRepository<Author,Integer> {


}
