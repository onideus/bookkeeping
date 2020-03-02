package com.oni.bookkeeping;

import com.oni.bookkeeping.entity.User;
import com.oni.bookkeeping.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
class BookkeepingApplicationTests {

    @Autowired
    CustomMediaTrackerRepository customMediaTrackerRepository;

    @Autowired
    MediaCompletedRepository mediaCompletedRepository;

    @Autowired
    MediaRepository mediaRepository;

    @Autowired
    MediaTypeRepository mediaTypeRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserTrackedMediaRepository userTrackedMediaRepository;

    @Test
    void contextLoads() {
    }

    @Test
    @Transactional
    public void test() {
//        long val = 1;
//        Optional<MediaType> mediaType = mediaTypeRepository.findById(val);
//
//        User user = new User();
//        user.setDefaultMediaType(mediaType.get());
//        user.setFirstName("Tempy");
//        user.setLastName("McTemperSon");
//
//        user = userRepository.save(user);
//
//        CustomMediaTracker customMediaTracker = new CustomMediaTracker();
//        customMediaTracker.setUser(user);
//        customMediaTracker.setGoal(0);
//        customMediaTracker.setTrackerName("Temp Tracker");
//
//        customMediaTrackerRepository.save(customMediaTracker);

        long id = 4;
        Optional<User> user = userRepository.findById(id);
        System.out.println(user.get().getCustomMediaTrackers());
    }
}
