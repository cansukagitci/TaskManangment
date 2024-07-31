package TaskProject19.TaskProjectDemo.service;

import TaskProject19.TaskProjectDemo.dao.TaskRepository;
import TaskProject19.TaskProjectDemo.entity.TaskEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository theTaskRepository){
        taskRepository=theTaskRepository;
    }



    @Override
    public List<TaskEntity> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public TaskEntity findById(int theId) {
        Optional<TaskEntity> result = taskRepository.findById(theId);

        TaskEntity thetask = null;

        if (result.isPresent()) {
            thetask = result.get();
        }
        else {
            // we didn't find the task
            throw new RuntimeException("Did not find task id - " + theId);
        }

        return thetask;
    }

    @Override
    public TaskEntity save(TaskEntity theTask) {
        return taskRepository.save(theTask);
    }

    @Override
    public void deleteById(int theId) {
        taskRepository.deleteById(theId);

    }
}
