package nl.rls.ASD.message.domain;

import java.util.Date;

public class MessageType {
    private int messageType;
    private String messageTypeVersion;
    private String messageIdentifier;
    private Date messageDateTime;
    
	public MessageType(int messageType, String messageTypeVersion, String messageIdentifier, Date messageDateTime) {
		this.messageType = messageType;
		this.messageTypeVersion = messageTypeVersion;
		this.messageIdentifier = messageIdentifier;
		this.messageDateTime = messageDateTime;
	}

	public int getMessageType() {
		return messageType;
	}

	public String getMessageTypeVersion() {
		return messageTypeVersion;
	}

	public String getMessageIdentifier() {
		return messageIdentifier;
	}

	public Date getMessageDateTime() {
		return messageDateTime;
	}

}
