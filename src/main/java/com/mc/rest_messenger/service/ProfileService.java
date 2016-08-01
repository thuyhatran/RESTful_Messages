/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.rest_messenger.service;

import com.mc.rest_messenger.database.DatabaseClass;
import com.mc.rest_messenger.model.Profile;
import com.mc.rest_messenger.model.Profile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class ProfileService {
    
     private Map<Long,Profile> profilesDatabase = DatabaseClass.getProfiles();
     
      public ProfileService(){
        Profile pr1 =  new Profile( 1L,"prof1","Tommy","Funny");
        profilesDatabase.put(1L,pr1);
        profilesDatabase.put(2L, new Profile( 2L,"prof2","Hana","Lala"));
        profilesDatabase.put(3L, new Profile( 3L,"prof3","Kita","Linda"));        
    }
      
     //Retrieving all profiles
    public List<Profile> getAllProfiles(){
        return new ArrayList<Profile>(profilesDatabase.values());        
    }
    
    //Retrieving specific profile by its id
    public Profile getProfile(long id){
        return profilesDatabase.get(id);
    }
    
    public Profile addProfile(Profile profile){
        profile.setId(profilesDatabase.size() + 1);
        profilesDatabase.put(profile.getId(),profile);
        return profile;        
    }
    
    public Profile updateProfile(Profile profile){
        if (profile.getId()<=0)
            return null;
        
        profilesDatabase.put(profile.getId(), profile);
        
        return profile;
    }
    
    
    public Profile removeProfile(long id){
        return profilesDatabase.remove(id);
    }  
    
      
      
}
