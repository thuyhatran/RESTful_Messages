/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.rest_messenger.service;

import com.mc.rest_messenger.database.DatabaseClass;
import com.mc.rest_messenger.model.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class MessageService {
//    public List<Message>getAllMessages(){
//        Message m1 = new Message((int) 1L,"Hello World","Thuya");
//        Message m2 = new Message((int) 2L,"Chao World","Tran");
//        Message m3 = new Message((int) 3L,"Beautifull day","An");
//        
//        List<Message> list = new ArrayList<>();
//        list.add(m1);
//        list.add(m2);
//        list.add(m3);
//        
//        return list;
//        
//    }
    
    private Map<Long,Message> messagesDatabase = DatabaseClass.getMessages();
    
    public MessageService(){
        messagesDatabase.put(1L, new Message( 1L,"Beautiful day","montreal"));
        messagesDatabase.put(2L, new Message( 2L,"Belle journee","paris"));
        messagesDatabase.put(3L, new Message( 3L,"Ngay dep","hue"));        
    }
    
    //Retrieving all messages
    public List<Message> getAllMessages(){
        return new ArrayList<Message>(messagesDatabase.values());        
    }
    
    //Retrieving specific message by its id
    public Message getMessage(Message message){
        message.setId(messagesDatabase.size() + 1);
        messagesDatabase.put(message.getId(),message);
        return message;        
    }
    
    public Message updateMessage(Message message){
        if (message.getId()<=0)
            return null;
        
        messagesDatabase.put(message.getId(), message);
        
        return message;
    }
    
    
    public Message removeMessage(long id){
        return messagesDatabase.remove(id);
    }
}
