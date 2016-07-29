/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.rest_messenger;

import com.mc.rest_messenger.model.Message;
import com.mc.rest_messenger.service.MessageService;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Administrator
 */
@Path("messages")
public class MessageResource {
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getMessages(){
//        return "Hello World!";        
//    } 
    
    MessageService  messageService = new MessageService();
      
    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessagesXML(){
        return messageService.getAllMessages();       
    } 
    
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages_JSON(){
        return messageService.getAllMessages();       
    } 
    
    
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessagesById(@PathParam("messageId") long id){
        return messageService.getMessage(id);       
    }
    
    
    
}
