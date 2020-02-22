package com.oni.bookkeeping.controller;

import com.oni.bookkeeping.entity.*;
import com.oni.bookkeeping.repository.*;
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
    private final MediaCompletedRepository mediaCompletedRepository;

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

    @GetMapping("/completed")
    public List<MediaCompleted> getCompleted() {
        List<MediaCompleted> mediaCompletedList = (List<MediaCompleted>) mediaCompletedRepository.findAll();
        return mediaCompletedList;
    }
}
