package me.leejinkyung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final  UserRepository userRepository;

    // 생성자 주입
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String provideService() {
        return userRepository.getUserInfo();
    }
}
