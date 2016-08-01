/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.rest_messenger;

import com.mc.rest_messenger.model.Message;
import com.mc.rest_messenger.model.Profile;
import com.mc.rest_messenger.service.MessageService;
import com.mc.rest_messenger.service.ProfileService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Administrator
 */
@Path("profiles")
public class ProfileRessource {
    
    ProfileService  profileService = new ProfileService();
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getWelcome(){
        return "Welcome to your profile!";        
    } 
    
    
    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Profile> getProfileXML(){
        return profileService.getAllProfiles();
    } 
    
//    
//    @GET
//    @Path("/xml/{profileId}")
//    @Produces(MediaType.APPLICATION_XML)
//    public Profile getProfileById(@PathParam("profileId") long id){
//        return profileService.getProfile(id);       
//    }
    
}
