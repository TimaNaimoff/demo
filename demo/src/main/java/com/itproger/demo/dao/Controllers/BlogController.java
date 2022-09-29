package com.itproger.demo.dao.Controllers;

import com.itproger.demo.dao.models.Post;
import com.itproger.demo.dao.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post>posts=postRepository.findAll();
        model.addAttribute("posts",posts);
        return "blog-main";
    }
    @GetMapping("/blog/add")
    public String bingMain(Model model){
        return "blog-add";
    }
    @PostMapping("/blog/add")
    public String bloggAddMain(@RequestParam String title,@RequestParam String anons,@RequestParam String full_text,Model model){
        Post post=new Post(title,anons,full_text);
        postRepository.save(post);
        return "redirect:/blog";
    }

}
