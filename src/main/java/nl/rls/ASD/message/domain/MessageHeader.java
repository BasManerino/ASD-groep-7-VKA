package nl.rls.ASD.message.domain;

import nl.rls.ASD.common.domain.CompanyId;

public class MessageHeader {
    private String senderReference;
    private CompanyId sender;
    private CompanyId recipient;
    
	public MessageHeader(String senderReference, CompanyId sender, CompanyId recipient) {
		this.senderReference = senderReference;
		this.sender = sender;
		this.recipient = recipient;
	}

	public String getSenderReference() {
		return senderReference;
	}

	public CompanyId getSender() {
		return sender;
	}

	public CompanyId getRecipient() {
		return recipient;
	}
	
	

}
