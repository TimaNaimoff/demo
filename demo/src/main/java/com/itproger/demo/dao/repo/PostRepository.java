package com.itproger.demo.dao.repo;

import com.itproger.demo.dao.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long>{
}
