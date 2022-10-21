package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
