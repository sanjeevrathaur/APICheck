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

privileged @SuppressWarnings("unused") aspect AtmAtmgetrs_Aspect {
	private List<RpcActionDefinition> Atmgetrs.actions = new ArrayList<RpcActionDefinition>();

	public List<RpcActionDefinition> Atmgetrs.getActions(){
		return actions;
	}

	
	@JsonSerialize
	@JsonProperty("xstatus")
	public Xstatus Atm.Atmgetrs.getXstatus() {
		return this.xstatus;
	}
	@JsonDeserialize
	@JsonProperty("xstatus")
	public void Atm.Atmgetrs.setXstatus(Xstatus xstatus) {
		this.xstatus = xstatus;
	}
	
	@JsonSerialize
	@JsonProperty("transfer")
	public List<Transfer> Atm.Atmgetrs.getTransfer() {
		return this.transfer;
	}
	@JsonDeserialize
	@JsonProperty("transfer")
	public void Atm.Atmgetrs.setTransfer(List<Transfer> transfer) {
		this.transfer = transfer;
	}

	private List<RpcActionDefinition> Atmgetrs.TransfersActions = new ArrayList<RpcActionDefinition>();

	@JsonSerialize
	@JsonProperty("transfersActions")
	public List<RpcActionDefinition> Atmgetrs.getTransfersActions() {
		return this.TransfersActions;
	}

}