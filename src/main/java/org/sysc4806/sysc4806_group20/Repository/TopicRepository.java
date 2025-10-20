package org.sysc4806.sysc4806_group20.Repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.sysc4806.sysc4806_group20.Model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
	Page<Topic> findAll(Pageable pageable);

    @EntityGraph(attributePaths = { "submissions", "professor" })
    @Query("select t from Topic t where t.id = :id")
    Optional<Topic> findByIdWithDetails(@Param("id") Long id);
}

