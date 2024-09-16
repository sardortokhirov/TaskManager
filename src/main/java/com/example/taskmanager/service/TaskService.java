package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Date-9/16/2024
 * By Sardor Tokhirov
 * Time-2:06 AM (GMT+5)
 */
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task updateTask(Long id, Task updatedTaskDetails) {
        Optional<Task> existingTaskOpt = taskRepository.findById(id);

        if (existingTaskOpt.isPresent()) {
            Task existingTask = existingTaskOpt.get();
            existingTask.setTitle(updatedTaskDetails.getTitle());
            existingTask.setDescription(updatedTaskDetails.getDescription());
            existingTask.setStatus(updatedTaskDetails.getStatus());
            return taskRepository.save(existingTask);
        } else {
            throw new IllegalArgumentException("Task with ID " + id + " not found");
        }
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
