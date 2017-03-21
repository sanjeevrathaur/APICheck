package com.cfts.ids.openlegacy.entities;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;

import org.openlegacy.annotations.rpc.*;
import org.openlegacy.FieldType.*;
import org.openlegacy.rpc.actions.RpcActions.SHOW;

import org.openlegacy.rpc.actions.RpcActions.EXECUTE;

@RpcNavigation(category = "")
@RpcEntity(name="Atm", language=Languages.COBOL)
@RpcActions(actions = {
				@Action(action = SHOW.class, path = ""), 
				@Action(action = EXECUTE.class, path = "A40214", displayName = "Execute", alias = "execute"
						)			})
public class Atm {

	private AtmgetRqrs atmgetRqrs = new AtmgetRqrs();
	
	@RpcPart(name = "AtmgetRqrs", originalName = "ATMGET-RQRS")
	public static class AtmgetRqrs {

	private Atmgetrq atmgetrq = new Atmgetrq();
	private Atmgetrs atmgetrs = new Atmgetrs();
	}
	@RpcPart(name = "Atmgetrq", originalName = "ATMGETRQ")
	public static class Atmgetrq {

	
	@RpcField(length = 3, originalName = "RQ-TYPE", legacyType = "Char")
	private String rqType;
	
	}
	@RpcPart(name = "Atmgetrs", originalName = "ATMGETRS")
	public static class Atmgetrs {

	private Xstatus xstatus = new Xstatus();
	@RpcPartList(count = 285)
	private List<Transfer> transfer;

	}
	@RpcPart(name = "Xstatus", originalName = "XSTATUS")
	public static class Xstatus {

	
	@RpcField(length = 40, originalName = "STATUSMESSAGE", legacyType = "Char")
	private String statusmessage;
	
	
	@RpcField(length = 1, originalName = "SEVERITY", legacyType = "Char")
	private String severity;
	
	private Detailmessage detailmessage = new Detailmessage();
	}
	@RpcPart(name = "Detailmessage", originalName = "DETAILMESSAGE")
	public static class Detailmessage {

	
	@RpcField(length = 40, originalName = "PROPERTYNAME", legacyType = "Char")
	private String propertyname;
	
	
	@RpcField(length = 40, originalName = "MSG-DESCRIPTION", legacyType = "Char")
	private String msgDescription;
	
	}
	@RpcPart(name = "Transfer", originalName = "TRANSFER")
	public static class Transfer {

	
	@RpcField(length = 40, originalName = "RS-ATM-NAME", legacyType = "Char")
	private String rsAtmName;
	
	
	@RpcField(length = 40, originalName = "RS-ATM-ADDR-1", legacyType = "Char")
	private String rsAtmAddr1;
	
	
	@RpcField(length = 40, originalName = "RS-ATM-ADDR-2", legacyType = "Char")
	private String rsAtmAddr2;
	
	
	@RpcField(length = 25, originalName = "RS-ATM-CITY", legacyType = "Char")
	private String rsAtmCity;
	
	
	@RpcField(length = 15, originalName = "RS-ATM-STATE", legacyType = "Char")
	private String rsAtmState;
	
	
	@RpcField(length = 9, originalName = "RS-ATM-ZIP-CD", legacyType = "Char")
	private String rsAtmZipCd;
	
	
	@RpcField(length = 10, originalName = "RS-ATM-GEO-LATTITUDE", legacyType = "Char")
	private String rsAtmGeoLattitude;
	
	
	@RpcField(length = 11, originalName = "RS-ATM-GEO-LONGITUDE", legacyType = "Char")
	private String rsAtmGeoLongitude;
	
	
	@RpcField(length = 268, originalName = "RS-ATM-FTRD-SRVC-TBL", legacyType = "Char")
	private String rsAtmFtrdSrvcTbl;
	
	}
}

