package model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AgentType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("module")
	private String module;
	
	public AgentType(){
		
	}
	
	public AgentType(String name, String module) {
		super();
		this.name = name;
		this.module = module;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	
	
	
}
