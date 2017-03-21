package com.cfts.ids.openlegacy.services;

import com.cfts.ids.openlegacy.entities.Atm;
import com.cfts.ids.openlegacy.entities.Atm.Detailmessage;
import org.openlegacy.rpc.RpcSession;

import javax.ws.rs.core.MultivaluedMap;

import org.apache.commons.lang3.StringUtils;
import java.util.Collections;
import javax.inject.Inject;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import com.cfts.ids.openlegacy.services.AtmService;
import com.cfts.ids.openlegacy.services.AtmService.*;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 *  A test which invokes Atm service.
 *  To run the test, select Run As -> JUnit test.
 *  If the service has parameters, they should be set via the test.
 */
@ContextConfiguration("/META-INF/spring/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AtmServiceTest {

	@Inject
	AtmService atmService;


	@Test
	public void testAtmService() throws Exception {
		long before = System.currentTimeMillis();

		AtmIn atmIn = new AtmIn();
		atmIn.setRqType("");
		AtmOut atmOut = atmService.getAtm(atmIn);
		Assert.assertNotNull(atmOut);

		long after = System.currentTimeMillis();
		System.out.println("Execution time:" + (after-before));
	}
}
