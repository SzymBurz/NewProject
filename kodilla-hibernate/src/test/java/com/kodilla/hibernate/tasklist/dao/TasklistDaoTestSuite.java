package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TasklistDaoTestSuite {

    @Autowired
    private TasklistDao tasklistDao;

    public static final String LISTNAME = "Lista1";

    @Test
    void testTasklistDaoFindBy() {

        TaskList taskList = new TaskList(LISTNAME, "");

        tasklistDao.save(taskList);

        String name = taskList.getListName();
        Optional<TaskList> readTaskList = tasklistDao.findByListName(name);
        assertTrue(readTaskList.isPresent());

        tasklistDao.deleteById(readTaskList.get().getId());

    }
}
