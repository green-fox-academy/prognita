package com.greenfox.reddit.service;


import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.model.Vote;
import com.greenfox.reddit.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteServiceImpl implements GenericService<Vote> {

    private final VoteRepository voteRepository;

    @Autowired
    public VoteServiceImpl(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public void addItem(Vote item) {
        voteRepository.save(item);

    }

    @Override
    public List<Vote> getAllItem() {
        return null;
    }

    @Override
    public void deleteItem(Vote item) {

    }

    @Override
    public void updateItem(Vote item) {
        voteRepository.save(item);
    }

    @Override
    public Vote findItemById(Long id) {
        return null;
    }

    public void voting(Post post, boolean isItUpvote) {
        Vote vote = new Vote(post, isItUpvote);
        if (isItUpvote = true) {

          vote.upvotenum();
          voteRepository.save(vote);

        } else {
           vote.downvotenum();
           voteRepository.save(vote);
        }
    }
}
