package org.example.design_stack_over_flow;

public interface Votable {
    void Vote(User voter, VoteType type);
    int getVoteCount();
}
