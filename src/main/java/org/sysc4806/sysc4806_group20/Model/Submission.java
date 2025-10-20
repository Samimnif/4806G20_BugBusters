package org.sysc4806.sysc4806_group20.Model;

import jakarta.persistence.*; // or javax.persistence.* — match your project
import org.sysc4806.sysc4806_group20.Model.Topic;

@Entity
@Table(name = "submission",
       indexes = @Index(name = "idx_submission_topic_id", columnList = "topic_id"))
public class Submission {

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    // the rest of your fields...
}

