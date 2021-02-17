package org.patent.app.events.audvid.gcp.aud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import patentapp.common.dto.AppEventReq;
import patentapp.common.dto.AppEventResp;
import patentapp.common.events.casemgmt.AudExtractEventHandler;

@Component
public class AudExtractEventHandlerGCPImpl implements AudExtractEventHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(AudExtractEventHandlerGCPImpl.class);

	@Override
	public AppEventResp handleEvent(AppEventReq eventReq) throws Exception {
		LOGGER.info("Enter");

		AppEventResp resp = new AppEventResp();

		LOGGER.info("Exit");
		return resp;
	}

	@Override
	public String getHandlerName() {
		return "AudExtractEventHandlerGCPImpl";
	}

}
