package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findByCompletedTrue();
    public List<Task> findByCompletedFalse();
    public List<Task> findAll();
    public Task findByTask(String task);
    public Task getById(Long id);
    //public void  deleteTaskById(Long id);

}
