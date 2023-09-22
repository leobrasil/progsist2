package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.PostDAO;
import com.example.model.Post;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		try{
			PostDAO dao = new PostDAO();
			Post post1 = new Post(3, "goollll", "goolll do Corinthians");

			dao.create(post1);

			List<Post> posts = dao.getAllPosts();

			for (Post post : posts) {
				System.out.println(post);
			}



		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
