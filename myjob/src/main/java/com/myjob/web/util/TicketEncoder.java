package com.myjob.web.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import org.springframework.stereotype.Component;

import com.myjob.web.auth.Ticket;

@Component
public class TicketEncoder {
	public String encode(Ticket ticket) throws IOException{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try{
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			try{
				objectOutputStream.writeObject(ticket);
				byte[] encodedBytes = Base64.getEncoder().encode(byteArrayOutputStream.toByteArray());
				return new String(encodedBytes);
			} finally{
				objectOutputStream.close();
			}
		} finally{
			byteArrayOutputStream.close();
		}
	}
	
	public Ticket decode(String encodedText) throws IOException, ClassNotFoundException{
		byte[] decodedBytes = Base64.getDecoder().decode(encodedText.getBytes());
		
		ByteArrayInputStream stream = new ByteArrayInputStream(decodedBytes);
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
