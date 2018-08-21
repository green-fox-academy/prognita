package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.model.Vote;
import com.greenfox.reddit.repository.PostRepository;


import com.greenfox.reddit.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class PostServiceImpl implements GenericService<Post> {

    private final PostRepository postRepository;




    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;

    }

    @Override
    public void addItem(Post item) {
        postRepository.save(item);

    }

    @Override
    public List<Post> getAllItem() {
        return (List<Post>) postRepository.findAll();
    }

    @Override
    public void deleteItem(Post item) {
        postRepository.delete(item);
    }

    @Override
    public void updateItem(Post item) {
        postRepository.save(item);
    }

    @Override
    public Post findItemById(Long id) {
return postRepository.findById(id).get();
    }

    public void increaseScore(Post postToUpvote) {
        Post postToSave = postToUpvote;
        postToUpvote.incrementScore();
        postRepository.save(postToSave);


    }

    public void decreaseScore(Post postToDownvote) {
        Post postToSave = postToDownvote;
        postToSave.decrementScore();
        postRepository.save(postToSave);

    }

}
