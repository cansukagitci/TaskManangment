package TaskProject19.TaskProjectDemo.dao;

import TaskProject19.TaskProjectDemo.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


public interface TaskRepository extends JpaRepository<TaskEntity,Integer> {
}
