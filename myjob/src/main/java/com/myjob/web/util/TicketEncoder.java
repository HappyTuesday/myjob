package com.myjob.web.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.springframework.stereotype.Component;

import com.myjob.auth.Ticket;

@Component
public class TicketEncoder {
	public String encode(Ticket ticket) throws IOException{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try{
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			try{
				objectOutputStream.writeObject(ticket);
				String text = byteArrayOutputStream.toString();
				return text;
			} finally{
				objectOutputStream.close();
			}
		} finally{
			byteArrayOutputStream.close();
		}
	}
	
	public Ticket decode(String encodedText) throws IOException, ClassNotFoundException{
		ByteArrayInputStream stream = new ByteArrayInputStream(encodedText.getBytes());
		try{
			ObjectInputStream objectInputStream = new ObjectInputStream(stream);
			try{
				Ticket ticket = (Ticket) objectInputStream.readObject();
				return ticket;
			}finally{
				objectInputStream.close();
			}
		}finally{
			stream.close();
		}
	}
}
