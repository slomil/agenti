package model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ACLMessage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("performative")
	private Performative performative;
	@JsonProperty("sender")
	private AID sender;
	@JsonProperty("recivers")
	private ArrayList<AID> recivers = new ArrayList<AID>();
	@JsonProperty("replyTo")
	private AID replyTo;
	@JsonProperty("content")
	private String content;	
	private Object contentObj;
	private HashMap<String, Object> userArgs = new HashMap<String, Object>();
	@JsonProperty("language")
	private String language;
	@JsonProperty("encoding")
	private String encoding;
	@JsonProperty("ontology")
	private String ontology;
	@JsonProperty("protocol")
	private String protocol;
	@JsonProperty("conversationId")
	private String conversationId;
	@JsonProperty("replyWith")
	private String replyWith;
	@JsonProperty("inReplyTo")
	private String inReplyTo;
	@JsonProperty("replyBy")
	private Long replyBy;
	
	public ACLMessage() {
		
	}
	
	public ACLMessage(Performative performative, AID sender, ArrayList<AID> recivers, AID replyTo, String content,
			Object contentObj, HashMap<String, Object> userArgs, String language, String encoding, String ontology,
			String protocol, String conversationId, String replyWith, String inReplyTo, Long replyBy) {
		super();
		this.performative = performative;
		this.sender = sender;
		this.recivers = recivers;
		this.replyTo = replyTo;
		this.content = content;
		this.contentObj = contentObj;
		this.userArgs = userArgs;
		this.language = language;
		this.encoding = encoding;
		this.ontology = ontology;
		this.protocol = protocol;
		this.conversationId = conversationId;
		this.replyWith = replyWith;
		this.inReplyTo = inReplyTo;
		this.replyBy = replyBy;
	}
	
	public Performative getPerformative() {
		return performative;
	}
	public void setPerformative(Performative performative) {
		this.performative = performative;
	}
	public AID getSender() {
		return sender;
	}
	public void setSender(AID sender) {
		this.sender = sender;
	}
	public ArrayList<AID> getRecivers() {
		return recivers;
	}
	public void setRecivers(ArrayList<AID> recivers) {
		this.recivers = recivers;
	}
	public AID getReplyTo() {
		return replyTo;
	}
	public void setReplyTo(AID replyTo) {
		this.replyTo = replyTo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Object getContentObj() {
		return contentObj;
	}
	public void setContentObj(Object contentObj) {
		this.contentObj = contentObj;
	}
	public HashMap<String, Object> getUserArgs() {
		return userArgs;
	}
	public void setUserArgs(HashMap<String, Object> userArgs) {
		this.userArgs = userArgs;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	public String getOntology() {
		return ontology;
	}
	public void setOntology(String ontology) {
		this.ontology = ontology;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public String getReplyWith() {
		return replyWith;
	}
	public void setReplyWith(String replyWith) {
		this.replyWith = replyWith;
	}
	public String getInReplyTo() {
		return inReplyTo;
	}
	public void setInReplyTo(String inReplyTo) {
		this.inReplyTo = inReplyTo;
	}
	public Long getReplyBy() {
		return replyBy;
	}
	public void setReplyBy(Long replyBy) {
		this.replyBy = replyBy;
	}
	
	public Object[] getAllPerformatives (){
		return Performative.values();
	}
	
	public enum Performative {
        ACCEPT_PROPOSAL,
        AGREE,
        CANCEL,
        CALL_FOR_PROPOSAL,
        CONFIRM,
        DISCONFIRM,
        FAILURE,
        INFORM,
        INFORM_IF,
        INFORM_REF,
        NOT_UNDERSTOOD,
        PROPOSE,
        QUERY_IF,
        QUERY_REF,
        REFUSE,
        REJECT_PROPOSAL,
        REQUEST,
        REQUEST_WHEN,
        REQUEST_WHENEVER,
        SUBSCRIBE,
        PROXY,
        PROPAGATE,
        UNKNOWN,
    }
}
