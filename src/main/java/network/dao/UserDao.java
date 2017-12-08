package network.dao;

import network.data.DataBase;
import network.model.User;

public class UserDao {

public User[] getAll(){
    return DataBase.getAllUsers();
}

}
