package br.com.alissonbolsoni.continuouscommunication.core.entity;

import br.com.alissonbolsoni.continuouscommunication.core.contants.MessageStatus;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;

public class Message {
    private String messageId;
    private String message;
    private MessageType messageType;
    private Date sendTime;
    private MessageStatus status;
    private List<MessageDestiny> destinies;

    public Message() {
    }

    public Message(String messageId, String message, MessageType messageType, Date sendTime, MessageStatus status, List<MessageDestiny> destinies) {
        this.messageId = messageId;
        this.message = message;
        this.messageType = messageType;
        this.sendTime = sendTime;
        this.status = status;
        this.destinies = destinies;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public List<MessageDestiny> getDestinies() {
        return destinies;
    }

    public void setDestinies(List<MessageDestiny> destinies) {
        this.destinies = destinies;
    }
}