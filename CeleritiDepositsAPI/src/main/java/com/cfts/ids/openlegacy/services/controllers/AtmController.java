package com.cfts.ids.openlegacy.services.controllers;

import com.cfts.ids.openlegacy.services.AtmService;
import com.cfts.ids.openlegacy.services.AtmService.*;

import com.cfts.ids.openlegacy.entities.Atm;
import com.cfts.ids.openlegacy.entities.Atm.Detailmessage;
import org.openlegacy.rpc.RpcSession;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.ws.rs.QueryParam;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;
import org.openlegacy.annotations.OpenlegacyDesigntime;

@Component
@Path("/atm")
@Api(value="Atm")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class AtmController {

	@Inject
	private AtmService atmService;

	@GET
	@ApiOperation(value="Atm GET operation", response = AtmOut.class)
	public Response getAtm(@QueryParam(value="rqType") String rqType) throws Exception {
		AtmIn atmIn = new AtmIn();
		atmIn.setRqType(rqType);
		AtmOut atmOut = atmService.getAtm(atmIn);
		return Response.status(200).entity(atmOut).build();
	}
}
