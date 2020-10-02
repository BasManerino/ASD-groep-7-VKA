package nl.rls.ASD.message.domain;

public class GenericMessage {
	
	private GenericMessageId id;
	public MessageHeader header;
	public MessageType type;
	public MessageStatus status;
	
	public GenericMessage(MessageHeader header, MessageType type, MessageStatus status) {
		this.header = header;
		this.type = type;
		this.status = status;
	}

	public GenericMessageId getId() {
		return id;
	}

	public void setId(GenericMessageId id) {
		this.id = id;
	}

	public MessageHeader getHeader() {
		return header;
	}

	public void setHeader(MessageHeader header) {
		this.header = header;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public MessageStatus getStatus() {
		return status;
	}

	public void setStatus(MessageStatus status) {
		this.status = status;
	}

	
}
