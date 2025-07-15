package org.example.practice.stack_over_flow.vote;

import org.example.practice.stack_over_flow.User;

public interface Votable {
    void addVote(User voter , VoteType type);

    int getVoteCount();
}
