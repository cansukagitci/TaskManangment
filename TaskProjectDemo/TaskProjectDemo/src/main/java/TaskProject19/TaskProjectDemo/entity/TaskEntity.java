package TaskProject19.TaskProjectDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="task_id")
    private Integer taskid;
    @Column(name="task_name")
    private String taskName;
    @Column(name="task_category")
    private String taskCategory;
    @Column(name="task_check")
    private boolean taskCheck;

    //Constructors
    public TaskEntity(){}

    public TaskEntity(String taskName, String taskCategory, boolean taskCheck) {
        this.taskName = taskName;
        this.taskCategory = taskCategory;
        this.taskCheck = taskCheck;
    }

    //Getters and Setters


    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public boolean isTaskCheck() {
        return taskCheck;
    }

    public void setTaskCheck(boolean taskCheck) {
        this.taskCheck = taskCheck;
    }

    //toString

    @Override
    public String toString() {
        return "TaskEntity{" +
                "taskid=" + taskid +
                ", taskName='" + taskName + '\'' +
                ", taskCategory='" + taskCategory + '\'' +
                ", taskCheck=" + taskCheck +
                '}';
    }
}
