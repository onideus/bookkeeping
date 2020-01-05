package com.oni.bookkeeping.controller;

import com.oni.bookkeeping.entity.Media;
import com.oni.bookkeeping.entity.MediaType;
import com.oni.bookkeeping.entity.User;
import com.oni.bookkeeping.entity.UserTrackedMedia;
import com.oni.bookkeeping.repository.MediaRepository;
import com.oni.bookkeeping.repository.MediaTypeRepository;
import com.oni.bookkeeping.repository.UserRepository;
import com.oni.bookkeeping.repository.UserTrackedMediaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200",
        "http://192.168.1.100:4200"})
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final MediaTypeRepository mediaTypeRepository;
    private final MediaRepository mediaRepository;
    private final UserTrackedMediaRepository userTrackedMediaRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/mediatypes")
    public List<MediaType> getMediaTypes() {
        List<MediaType> mediaTypes = (List<MediaType>) mediaTypeRepository.findAll();
        return (List<MediaType>) mediaTypeRepository.findAll();
    }

    @GetMapping("/media")
    public List<Media> getMedia() {
        List<Media> media = (List<Media>) mediaRepository.findAll();
        return media;
    }

    @GetMapping("/tracked")
    public List<UserTrackedMedia> getUserMedia() {
        List<UserTrackedMedia> userTrackedMedia = (List<UserTrackedMedia>) userTrackedMediaRepository.findAll();
        return userTrackedMedia;
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
