package org.example.design_stack_over_flow;

import java.util.List;

public interface Commentable {
    void addComment(User user ,Comment comment);
    List<Comment> getComments();
}
