package cz.czechitas.java2webapps.ukol7.services;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Autowired
    public Page<Post> seznamPrispevku() {
        Pageable pageable = PageRequest.of(0, 10);
        return postRepository.findAll(pageable);
    }

    public Post singlePost(String slug) {
        return postRepository.findBySlug(slug);
    }
}
