package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Post;

public class PostDAO {
    private Connection con;

      public PostDAO()throws Exception{
        Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://silly.db.elephantsql.com/lqgicmnw";
			String username="lqgicmnw";
			String password="jtDD6krF2KDZHVEL7tNvmzO19DX0Th7j";
			this.con = DriverManager.getConnection(url, username, password);
    }

    public Post create(Post post)throws Exception{
        String sql = "INSERT INTO POSTS (ID,TITULO,TEXTO) VALUES (?,?,?)";
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setInt(1, post.getId());
        psmt.setString(2, post.getTitulo());
        psmt.setString(3, post.getTexto());

        int res = psmt.executeUpdate();

        System.out.println("Foram atualizadas "+res);

        return post;
    }

    public List<Post> getAllPosts()throws Exception{
        List<Post> posts = new ArrayList<>();
        String sql = "SELECT * FROM POSTS";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            Post aux = new Post(rs.getInt("id"), 
                                rs.getString("titulo"), 
                                rs.getString("texto")
                                );
            posts.add(aux);
        }

        return posts;

    }
}
