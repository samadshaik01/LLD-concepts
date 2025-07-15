package org.example.practice.stack_over_flow;

import lombok.Data;
import org.example.practice.stack_over_flow.comment.Comment;
import org.example.practice.stack_over_flow.comment.Commentable;
import org.example.practice.stack_over_flow.vote.Votable;
import org.example.practice.stack_over_flow.vote.Vote;
import org.example.practice.stack_over_flow.vote.VoteType;

import java.util.List;

@Data
public class Question implements Votable, Commentable {
    final User user;
    final String title;
    final String content;
    final List<String> tags;
    private int qId;
    private List<Comment> comments;
    private List<Answer> answers;
    private List<Vote> votes;
    private Answer acceptedAnswer;


    void addAnswer(Answer answer) {
        if (!answers.contains(answer)) {
            answers.add(answer);
        }
    }

    void acceptAnswer(Answer answer) {
        this.acceptedAnswer = answer;
        answer.markAccepted();
    }

    @Override
    public void addVote(User voter, VoteType type) {
        votes.removeIf(vote -> vote.getVoter().equals(voter));
        votes.add(new Vote(voter, type));
        updateReputation(type);

    }

    @Override
    public void addComment(User author, String content) {
        comments.add(new Comment(author, content));
    }

    void updateReputation(VoteType type) {
        int rep = 5 * (type == VoteType.UPVOTE ? 1 : -1);
        user.setReputation(rep);
    }
}
