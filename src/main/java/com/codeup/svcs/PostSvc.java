package com.codeup.svcs;

import com.codeup.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsr on 6/20/17.
 */


@Service ("postSvc")
public class PostSvc {
    private List<Post> posts;

    public PostSvc(){
        createPosts();
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post save(Post post) {
        post.setId((long) posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post findOne(long id) {
        return posts.get((int) (id - 1));
    }
    private void createPosts(){
        posts = new ArrayList<>();

        save(new Post("Football for sale", "Gently used, $15"));
        save(new Post("PS4 for sale", "great shape, must have"));

    }



}
