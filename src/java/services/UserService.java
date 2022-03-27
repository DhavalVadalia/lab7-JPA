package services;

import dataaccess.UserDB;
import java.util.List;
import models.User;


public class UserService 
{
    public List<User> getAll() throws Exception 
    {
        UserDB userDB = new UserDB();
        List<User> users = userDB.getAll();
        return users;
    }
    
    public User get(String email) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.get(email);
        return user;
    }
       public void delete(String email) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.get(email);
        userDB.delete(user);
    }
    
    public void insert(String email, boolean active, String fname, String lname, String password, int roleid) throws Exception {
        User user = new User(email, active, fname, lname, password, roleid);
        UserDB userDB = new UserDB();
        userDB.insert(user);
    }
    
    public void update(String email, boolean active, String fname, String lname, String password, int roleid) throws Exception {
        User user = new User(email, active, fname, lname, password, roleid);
        UserDB userDB = new UserDB();
        userDB.update(user);
    }
    
 
}
