package com.cfts.ids.openlegacy.services;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openlegacy.annotations.services.*;
import org.openlegacy.annotations.OpenlegacyDesigntime;

import com.cfts.ids.openlegacy.entities.Atm;
import com.cfts.ids.openlegacy.entities.Atm.Detailmessage;
import org.openlegacy.rpc.RpcSession;

/**
 *  A service interface and input/oputput definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface AtmService can be customized to enabling passing parameters to the service.     
 */

@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface AtmService {

	@ServiceMethod(name = "getAtm", cacheDuration = 0, entities = {
			@EntityMapping(alias="atm", entity=com.cfts.ids.openlegacy.entities.Atm.class)})
	public AtmOut getAtm(AtmIn atmIn) throws Exception;

	@BindInputs(endpoints = {
			@BindTo(endpoint = "atm.atmgetRqrs.atmgetrq.rqType", expression = "rqType")})
	public static class AtmIn{
		String rqType;
		
		public String getRqType(){
			return rqType;
		}
		
		public void setRqType(String rqType){
			this.rqType = rqType;
		}

	}
	@ApiModel(value="AtmOut", description="")
	public static class AtmOut{
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmName")
		String rsAtmName;
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmAddr1")
		String rsAtmAddr1;
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmAddr2")
		String rsAtmAddr2;
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmCity")
		String rsAtmCity;
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmState")
		String rsAtmState;
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmZipCd")
		String rsAtmZipCd;
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmGeoLattitude")
		String rsAtmGeoLattitude;
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmGeoLongitude")
		String rsAtmGeoLongitude;
		@BindFrom("atm.atmgetRqrs.atmgetrs.transfer.rsAtmFtrdSrvcTbl")
		String rsAtmFtrdSrvcTbl;
		@BindFrom("atm.atmgetRqrs.atmgetrs.xstatus.statusmessage")
		String statusmessage;
		@BindFrom("atm.atmgetRqrs.atmgetrs.xstatus.severity")
		String severity;
		@BindFrom("atm.atmgetRqrs.atmgetrs.xstatus.detailmessage")
		Detailmessage detailmessage;


		@ApiModelProperty(value="Rs Atm Name")
		public String getRsAtmName(){
			return rsAtmName;
		}
		
		public void setRsAtmName(String rsAtmName){
			this.rsAtmName = rsAtmName;
		}

		@ApiModelProperty(value="Rs Atm Addr1")
		public String getRsAtmAddr1(){
			return rsAtmAddr1;
		}
		
		public void setRsAtmAddr1(String rsAtmAddr1){
			this.rsAtmAddr1 = rsAtmAddr1;
		}

		@ApiModelProperty(value="Rs Atm Addr2")
		public String getRsAtmAddr2(){
			return rsAtmAddr2;
		}
		
		public void setRsAtmAddr2(String rsAtmAddr2){
			this.rsAtmAddr2 = rsAtmAddr2;
		}

		@ApiModelProperty(value="Rs Atm City")
		public String getRsAtmCity(){
			return rsAtmCity;
		}
		
		public void setRsAtmCity(String rsAtmCity){
			this.rsAtmCity = rsAtmCity;
		}

		@ApiModelProperty(value="Rs Atm State")
		public String getRsAtmState(){
			return rsAtmState;
		}
		
		public void setRsAtmState(String rsAtmState){
			this.rsAtmState = rsAtmState;
		}

		@ApiModelProperty(value="Rs Atm Zip Cd")
		public String getRsAtmZipCd(){
			return rsAtmZipCd;
		}
		
		public void setRsAtmZipCd(String rsAtmZipCd){
			this.rsAtmZipCd = rsAtmZipCd;
		}

		@ApiModelProperty(value="Rs Atm Geo Lattitude")
		public String getRsAtmGeoLattitude(){
			return rsAtmGeoLattitude;
		}
		
		public void setRsAtmGeoLattitude(String rsAtmGeoLattitude){
			this.rsAtmGeoLattitude = rsAtmGeoLattitude;
		}

		@ApiModelProperty(value="Rs Atm Geo Longitude")
		public String getRsAtmGeoLongitude(){
			return rsAtmGeoLongitude;
		}
		
		public void setRsAtmGeoLongitude(String rsAtmGeoLongitude){
			this.rsAtmGeoLongitude = rsAtmGeoLongitude;
		}

		@ApiModelProperty(value="Rs Atm Ftrd Srvc Tbl")
		public String getRsAtmFtrdSrvcTbl(){
			return rsAtmFtrdSrvcTbl;
		}
		
		public void setRsAtmFtrdSrvcTbl(String rsAtmFtrdSrvcTbl){
			this.rsAtmFtrdSrvcTbl = rsAtmFtrdSrvcTbl;
		}

		@ApiModelProperty(value="Statusmessage")
		public String getStatusmessage(){
			return statusmessage;
		}
		
		public void setStatusmessage(String statusmessage){
			this.statusmessage = statusmessage;
		}

		@ApiModelProperty(value="Severity")
		public String getSeverity(){
			return severity;
		}
		
		public void setSeverity(String severity){
			this.severity = severity;
		}

		@ApiModelProperty(value="Detailmessage")
		public Detailmessage getDetailmessage(){
			return detailmessage;
		}
		
		public void setDetailmessage(Detailmessage detailmessage){
			this.detailmessage = detailmessage;
		}
	}
}
