package org.koushik.javabrains.Qlick_messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.koushik.javabrains.Qlick_messenger.model.Message_model;
import org.koushik.javabrains.Qlick_messenger.service.Messenger_service;

import java.util.ArrayList;

@Path("/messages")

public class Messenger_resource {
	
	Messenger_service message_service = new Messenger_service();
	
	@POST
	public Message_model addMessage(Message_model new_message)
	{
		return new_message;
	}
	
	@GET
	public Message_model getMessage(long id)
	{
		return new Message_model();
	}
	
	@GET 
	public ArrayList<Message_model> getAllMessages()
	{
		return new ArrayList<Message_model>();
	}
	
	
	@PUT
	public Message_model updateMessage(Message_model new_message)
	{
		return new_message;
	}
	
	@DELETE
	public void deleteMessage(long id)
	{
		
	}
}