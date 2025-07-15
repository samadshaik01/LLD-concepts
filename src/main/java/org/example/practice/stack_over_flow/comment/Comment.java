package org.example.practice.stack_over_flow.comment;

import lombok.Data;
import org.example.practice.stack_over_flow.User;

@Data
public class Comment {
    final User author;
    final String comment;
}
