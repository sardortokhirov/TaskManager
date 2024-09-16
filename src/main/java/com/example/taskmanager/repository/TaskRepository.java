package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Date-9/16/2024
 * By Sardor Tokhirov
 * Time-2:05 AM (GMT+5)
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}