package com.cfts.ids.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.cfts.ids.openlegacy.entities.Atm;
import com.cfts.ids.openlegacy.entities.Atm.Detailmessage;
import org.openlegacy.rpc.RpcSession;
import org.openlegacy.rpc.actions.RpcActions;

import org.openlegacy.log.ServiceUsageLogger;
import org.openlegacy.annotations.services.Service;
import org.openlegacy.annotations.OpenlegacyDesigntime;
import org.openlegacy.services.ws.ServiceBinder;
import org.springframework.context.ApplicationContext;
import javax.inject.Inject;

/**
 *  A service implementation which invokes OpenLegacy API, and returns a service output.
 *  The code below should be customize to perform a working scenario which goes through the relevant screens.
 *  Can be tested by invoking the test AtmServiceTest.
 *  The interface AtmService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relavant screens.
 */
@Service(name = "Atm")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class AtmServiceImpl implements AtmService {

	private static final String SERVICE_NAME = "Atm";

	@Inject
	private ApplicationContext applicationContext;

	@Inject
	private ServiceUsageLogger serviceLogger;

	@Inject
	private ServiceBinder serviceBinder;

	@Override
	public AtmOut getAtm(AtmIn atmIn) throws Exception {
		long time = System.currentTimeMillis();
		AtmOut atmOut = new AtmOut();
		/* autogenerated - sessions block start*/
		;
		RpcSession celeritiDepositsRpcSession = applicationContext.getBean("celeritiDepositsRpcSession", RpcSession.class);
		/* autogenerated - sessions block end */
		;

		try {
			/* autogenerated - execution block start */;
			Atm atm = serviceBinder.bindInputs("atm", new Atm(), atmIn);
			atm = celeritiDepositsRpcSession.doAction(RpcActions.EXECUTE(), atm);
			/* autogenerated - execution block end */;

			/* autogenerated - output block start */;
			atmOut = serviceBinder.bindOutput(atmOut, new String[]{"atmIn", "atm"}, atmIn, atm);
			/* autogenerated - output block end */;

			return atmOut;
		} catch (Exception e) {
			serviceLogger.error(e, SERVICE_NAME, null);
			throw e;
		} finally {
			time = System.currentTimeMillis() - time;
			/* autogenerated - disconnect block start */
			;
			celeritiDepositsRpcSession.disconnect();
			serviceLogger.log(SERVICE_NAME, time, celeritiDepositsRpcSession.getProperties().getId(), atmIn, atmOut, "host");
			/* autogenerated - disconnect block end */
			;
		}
	}

}
