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

privileged @SuppressWarnings("unused") aspect AtmAtmgetrq_Aspect {
	private List<RpcActionDefinition> Atmgetrq.actions = new ArrayList<RpcActionDefinition>();

	public List<RpcActionDefinition> Atmgetrq.getActions(){
		return actions;
	}

	
	@JsonSerialize
	@JsonProperty("rqType")
	public String Atm.Atmgetrq.getRqType() {
		return this.rqType;
	}
	@JsonDeserialize
	@JsonProperty("rqType")
	public void Atm.Atmgetrq.setRqType(String rqType) {
		this.rqType = rqType;
	}

}