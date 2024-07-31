package TaskProject19.TaskProjectDemo.controller;

import TaskProject19.TaskProjectDemo.entity.TaskEntity;
import TaskProject19.TaskProjectDemo.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private TaskService taskService;

    //cons injection
    public TaskController(TaskService theTaskService){
        taskService=theTaskService;
    }

    //add mapping /task
    @GetMapping("/list")
    public String listTask(Model theModel){

        List<TaskEntity> theTasks=taskService.findAll();
        theModel.addAttribute("tasks",theTasks);
        return "tasks/list-tasks";

    }
  @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        TaskEntity theTask=new TaskEntity();
        theModel.addAttribute("tasks",theTask);
        return "tasks/task-form";

  }


  @PostMapping("/save")
    public String saveTasks(@ModelAttribute("tasks") TaskEntity theTask){
        taskService.save(theTask);

        return "redirect:/tasks/list";
  }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("taskid") int theId,
                                    Model theModel) {

        // get the task from the service
        TaskEntity theTask = taskService.findById(theId);

        // set task as a model attribute to pre-populate the form
        theModel.addAttribute("tasks", theTask);

        // send over to our form
        return "tasks/task-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("taskid") int theId) {

        // delete the employee
        taskService.deleteById(theId);

        // redirect to /employees/list
        return "redirect:/tasks/list";

    }



}
