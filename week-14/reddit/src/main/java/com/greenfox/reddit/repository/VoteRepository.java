package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.model.Vote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VoteRepository extends CrudRepository<Vote,Long> {

}
