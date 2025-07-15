package org.example.practice.stack_over_flow;

import lombok.Data;
import org.example.practice.stack_over_flow.comment.Comment;
import org.example.practice.stack_over_flow.comment.Commentable;
import org.example.practice.stack_over_flow.vote.Votable;
import org.example.practice.stack_over_flow.vote.Vote;
import org.example.practice.stack_over_flow.vote.VoteType;

import java.util.List;

@Data
public class Answer implements Votable, Commentable {
    final User user;
    final Question question;
    final String answer;
    List<Comment> comments;
    List<Vote> votes;
    private boolean isAccepted = false;


    @Override
    public void addComment(User author, String content) {
        comments.add(new Comment(author, content));
    }

    @Override
    public void addVote(User voter, VoteType type) {
        votes.removeIf(vote -> vote.getVoter().equals(voter));
        votes.add(new Vote(voter, type));
        voter.setReputation(5 * (type == VoteType.UPVOTE ? 1 : -1));
    }

    @Override
    public int getVoteCount() {
        return (int) votes.stream().map(v->v.getType()).filter(i->i.equals(VoteType.UPVOTE)).count();
    }

    void markAccepted() {
        this.isAccepted = true;
    }
}
