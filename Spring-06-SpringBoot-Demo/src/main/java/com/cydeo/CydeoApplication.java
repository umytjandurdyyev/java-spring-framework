package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {
		Comment comment = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring framework");

		// Create a container
		ApplicationContext context = SpringApplication.run(CydeoApplication.class,args);
		// commentService object
		context.getBean(CommentService.class).publishComment(comment);
	}
}
