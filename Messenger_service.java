package org.koushik.javabrains.Qlick_messenger.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.koushik.javabrains.Qlick_messenger.database.dummyDatabase;
import org.koushik.javabrains.Qlick_messenger.model.Message_model;

public class Messenger_service {

	private HashMap<Long, Message_model> messages = dummyDatabase.getMessages();
	
	public Messenger_service() {}
	
	public Message_model addMessage(Message_model new_message)
	{
		return new_message;
	}
	
	public Message_model getMessage(long id)
	{
		if (id <= 0) {
			System.out.println("Invalid ID");
			return null;
		}
		
		return new Message_model();
	}
	
	public ArrayList<Message_model> getAllMessages()
	{
		return new ArrayList<Message_model>();
	}
	
	public Message_model updateMessage(Message_model new_message)
	{
		if (new_message.getId() <= 0) {
			System.out.println("Invalid ID");
			return null;
		}
		
		return new_message;
	}
	
	public Message_model deleteMessage(long id)
	{
		if (id <= 0) {
			System.out.println("Invalid ID");
			return null;
		}
		
		return new Message_model();
	}
}
