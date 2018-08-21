package com.greenfox.reddit.controller;


import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.model.Vote;
import com.greenfox.reddit.service.PostServiceImpl;
import com.greenfox.reddit.service.VoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    private final PostServiceImpl postService;
    private final VoteServiceImpl voteService;

    @Autowired
    public ApiController(PostServiceImpl postService, VoteServiceImpl voteService) {
        this.postService = postService;
        this.voteService = voteService;
    }

    @GetMapping("/posts")
    public Object listingAllPosts() {
        return postService.getAllItem();
    }

    @PostMapping("/posts")
    public Object addingANewPost(@RequestBody Post newPost) {
        postService.addItem(newPost);
        return postService.findItemById(newPost.getId());
    }
    @PutMapping("/posts/{id}/upvote")
    public Object upVotePost(@PathVariable Long id) {
        Post upPost = postService.findItemById(id);
        postService.increaseScore(upPost);
        voteService.voting(upPost,true);
        return upPost;
    }

    @PutMapping("/posts/{id}/downvote")
    public Object downVotePost(@PathVariable Long id) {
        Post downPost = postService.findItemById(id);
        postService.decreaseScore(downPost);
        voteService.voting(downPost,false);

        return downPost;
    }
}
