package com.example.user.service;

import com.example.user.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    public static final ArrayList<User> user = new ArrayList<>();
    static int userid = 0;

    static {
        User u1 = new User(++userid, "rahul", "rahul@12", "haryana", 12345);
        user.add(u1);
        User u2 = new User(++userid, "lavinsh", "lavinsh@12", "MP", 12372);
        user.add(u2);
        User u3 = new User(++userid, "sumit", "sumit@12", "Delhi", 56231);
        user.add(u3);
    }

    public  List<User>  alluser() {
        return user;
    }

    public  User userid(String id){

        for(User us: user){
            if(us.getName().equals(id)){
                return us;
            }
        }
return null;
    }

    public void addUser(User ur){
        user.add(ur);


    }

    public String del(String name){

        for(User us :user){
            if(us.getName().equals(name)){
                user.remove(us);
            }
        }
        return "user deleted";
}
}

