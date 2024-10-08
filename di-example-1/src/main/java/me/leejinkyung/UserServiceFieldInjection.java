package me.leejinkyung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceFieldInjection {

    @Autowired
    private UserRepository userRepository; // field 주입

    public String provideService() {
        return userRepository.getUserInfo();
    }
}
