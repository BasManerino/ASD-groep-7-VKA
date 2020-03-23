package nl.rls.ci.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * MessageReference: This element contains four child elements MessageType,
 * MessageTypeVersion, MessageIdentifier, MessageDateTime. These elements
 * contain values from the corresponding fields in the Header part of the
 * received TAF/TAPTSI message.
 */
@NoArgsConstructor
@Getter
@Setter
public class MessageReferenceDto {
    /**
     * To indicate the message type transmitted or referred to.
     * 3003        TrainCompositionMessage
     * 9000        ErrorMessage
     */
    private int messageType;
    private String messageTypeVersion;
    /**
     * Identification of the Message
     */
    private String messageIdentifier;
    /**
     * Generated by the common Interface
     */
    private Date messageDateTime;
}