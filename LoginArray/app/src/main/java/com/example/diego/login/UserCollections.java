package com.example.diego.login;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cleiton Gonçalves on 12/11/2015.
 */

public class UserCollections {

    private static UserCollections instance;

    private List<User> usuarios;

    private UserCollections() {
        usuarios = new ArrayList<User>();
    }


    public static UserCollections getInstance(){
        if(instance == null){
            instance = new UserCollections();
        }
        return instance;
    }

    public static void setInstance(UserCollections instance) {
        UserCollections.instance = instance;
    }

    public List<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios = usuarios;
    }
}
