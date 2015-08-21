package org.koushik.javabrains.Qlick_messenger.database;

import java.util.HashMap;

import org.koushik.javabrains.Qlick_messenger.model.Message_model;

public class dummyDatabase {
	
	private static HashMap<Long, Message_model> messages = new HashMap<>();
	
	public static HashMap<Long, Message_model> getMessages()
	{
		return messages;
	}
}
