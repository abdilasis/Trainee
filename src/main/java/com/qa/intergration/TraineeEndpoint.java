package com.qa.intergration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.service.business.TraineeService;

@Path("/trainee")
public class TraineeEndpoint {

	@Inject
	private TraineeService service;

	@Path("/json")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllTrainees();
	}

	public void setService(TraineeService service) {
		this.service = service;
	}

}
