package org.sysc4806.sysc4806_group20.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import org.sysc4806.sysc4806_group20.Model.Topic;
import org.sysc4806.sysc4806_group20.Repository.TopicRepository;

@Controller
public class TopicController {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicController(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    // LIST page — now paginated
    @GetMapping("/topics")
    public String listTopics(
            Model model,
            @PageableDefault(size = 20, sort = "id", direction = Sort.Direction.DESC)
            Pageable pageable) {

        Page<Topic> page = topicRepository.findAll(pageable);
        model.addAttribute("page", page);
        model.addAttribute("topics", page.getContent()); // if your template expects 'topics'
        return "topics/list"; // keep your existing view name if different
    }

    // DETAILS page — prefetch relations to avoid N+1
    @GetMapping("/topics/{id}")
    public String viewTopic(Model model, @PathVariable("id") Long id) {
        Topic topic = topicRepository
                .findByIdWithDetails(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        model.addAttribute("topic", topic);
        return "topics/detail"; // keep your existing view name if different
    }
}

