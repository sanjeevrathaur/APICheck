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

privileged @SuppressWarnings("unused") aspect AtmAtmgetRqrs_Aspect {
	private List<RpcActionDefinition> AtmgetRqrs.actions = new ArrayList<RpcActionDefinition>();

	public List<RpcActionDefinition> AtmgetRqrs.getActions(){
		return actions;
	}

	
	@JsonSerialize
	@JsonProperty("atmgetrq")
	public Atmgetrq Atm.AtmgetRqrs.getAtmgetrq() {
		return this.atmgetrq;
	}
	@JsonDeserialize
	@JsonProperty("atmgetrq")
	public void Atm.AtmgetRqrs.setAtmgetrq(Atmgetrq atmgetrq) {
		this.atmgetrq = atmgetrq;
	}
	
	@JsonSerialize
	@JsonProperty("atmgetrs")
	public Atmgetrs Atm.AtmgetRqrs.getAtmgetrs() {
		return this.atmgetrs;
	}
	@JsonDeserialize
	@JsonProperty("atmgetrs")
	public void Atm.AtmgetRqrs.setAtmgetrs(Atmgetrs atmgetrs) {
		this.atmgetrs = atmgetrs;
	}

}