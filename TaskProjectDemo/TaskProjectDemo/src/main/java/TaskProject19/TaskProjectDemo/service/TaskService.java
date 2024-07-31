package TaskProject19.TaskProjectDemo.service;

import TaskProject19.TaskProjectDemo.entity.TaskEntity;

import java.util.List;

public interface TaskService {
    List<TaskEntity> findAll();
    TaskEntity findById(int theId);
    TaskEntity save(TaskEntity theTask);
    void deleteById(int theId);
}
