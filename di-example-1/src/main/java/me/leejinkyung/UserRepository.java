package me.leejinkyung;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String getUserInfo() {
        return "user repository의 user info";
    }
}
