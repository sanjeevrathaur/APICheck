// WARNING: DO NOT EDIT THIS FILE.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cfts.ids.openlegacy.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openlegacy.definitions.RpcActionDefinition;

import com.cfts.ids.openlegacy.entities.Atm.*;

privileged @SuppressWarnings("unused") aspect AtmDetailmessage_Aspect {
	private List<RpcActionDefinition> Detailmessage.actions = new ArrayList<RpcActionDefinition>();

	public List<RpcActionDefinition> Detailmessage.getActions(){
		return actions;
	}

	
	@JsonSerialize
	@JsonProperty("propertyname")
	public String Atm.Detailmessage.getPropertyname() {
		return this.propertyname;
	}
	@JsonDeserialize
	@JsonProperty("propertyname")
	public void Atm.Detailmessage.setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	
	@JsonSerialize
	@JsonProperty("msgDescription")
	public String Atm.Detailmessage.getMsgDescription() {
		return this.msgDescription;
	}
	@JsonDeserialize
	@JsonProperty("msgDescription")
	public void Atm.Detailmessage.setMsgDescription(String msgDescription) {
		this.msgDescription = msgDescription;
	}

}