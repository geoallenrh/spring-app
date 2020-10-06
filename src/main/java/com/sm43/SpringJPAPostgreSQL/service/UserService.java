package com.sm43.SpringJPAPostgreSQL.service;

import com.sm43.SpringJPAPostgreSQL.model.User;
import com.sm43.SpringJPAPostgreSQL.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(String name, String city) {
        User usr = new User(name, city);
        userRepository.save(usr);
    }

    public void addUsers() {
        User usr1 = new User("UserName1", "Mumbai");
        userRepository.save(usr1);

        User usr2 = new User("UserName2", "Bangalore");
        userRepository.save(usr2);

        User usr3 = new User("UserName3", "Pune");
        userRepository.save(usr3);
    }

    public String getUsers() {
        String result = "<h2> User List - <h2><br>";
        for (User user : userRepository.findAll()) {
            result += "<h3>" + user.toString() +"</h3>" + "<br>";
        }
        return result;
    }

    public Long count() {
        return userRepository.count();
    }

    public void deleteById(Long userId) {
        userRepository.deleteById(userId);
    }

}
