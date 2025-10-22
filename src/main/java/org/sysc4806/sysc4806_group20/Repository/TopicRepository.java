package org.sysc4806.sysc4806_group20.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sysc4806.sysc4806_group20.Model.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    
    default Optional<Topic> findByIdWithDetails(Long id) {
        return findById(id);
    }
}


