package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring framework");

        // Create a container
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // commentService object
        context.getBean(CommentService.class).publishComment(comment);
    }
}