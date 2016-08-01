/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.rest_messenger.database;

import com.mc.rest_messenger.model.Message;
import com.mc.rest_messenger.model.Profile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */

public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Profile> profiles = new HashMap<>();
    
    public static Map<Long, Message> getMessages(){
        return messages;
    }
    
    public static Map<Long, Profile> getProfiles(){
        return profiles;
    }
    
    
    
}
