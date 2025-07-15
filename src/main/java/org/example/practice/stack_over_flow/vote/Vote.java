package org.example.practice.stack_over_flow.vote;

import lombok.Data;
import org.example.practice.stack_over_flow.User;

@Data
public class Vote {
    final User voter;
    final VoteType type;
}
