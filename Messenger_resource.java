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
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class Messenger_resource {
	
	Messenger_service message_service = new Messenger_service();
	
	@POST
	public Message_model addMessage(Message_model new_message)
	{
		return message_service.addMessage(new_message);
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(@PathParam("messageId") long id)
	{
		if (id <= 0) return "Invalid ID request";
		
		Message_model rec_message = message_service.getMessage(id);
		
		String content  = rec_message.getContent();
		boolean isPalindrome = isPalindrome(content);
		
		if (isPalindrome) 
			return "Received message: ``" + content + "`` is a palindomre.";
			
		else
			return "Received message: ``" + content + "`` is not a palindomre.";
	}
	
	@GET 
	public ArrayList<Message_model> getAllMessages()
	{
		return message_service.getAllMessages();
	}
	
	
	@PUT
	@Path("/{messageId}")
	public Message_model updateMessage(@PathParam("messageId") long id, Message_model new_message)
	{
		new_message.setId(id);
		return message_service.updateMessage(new_message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id)
	{
		message_service.deleteMessage(id);
	}
	
	public boolean isPalindrome(String string)
	{
		String no_spaces = "";
		for (int i = 0; i < string.length(); i++)
		{
			if (string.charAt(i) != ' ') no_spaces += string.charAt(i);
		}
		
		String reversed = new StringBuffer(no_spaces).reverse().toString();
		
		return no_spaces.equals(reversed);
	}
}
