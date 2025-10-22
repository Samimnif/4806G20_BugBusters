package org.sysc4806.sysc4806_group20.Model;

import jakarta.persistence.*; // or javax.persistence.* — match your project
import org.sysc4806.sysc4806_group20.Model.Topic;

@Entity
@Table(name = "submission",
       indexes = @Index(name = "idx_submission_topic_id", columnList = "topic_id"))
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or GenerationType.AUTO; either is fine for H2
    private Long id;
    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    // the rest of your fields...
    public Submission() {
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}

