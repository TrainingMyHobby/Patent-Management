package patentapp.common.events.casemgmt;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import patentapp.common.constants.EventConstants;
import patentapp.common.dto.AppEventReq;
import patentapp.common.dto.AppEventResp;
import patentapp.common.events.common.AppEventReqHandler;
import patentapp.common.utils.AppApplnCtxAware;

@Component
public class CaseEventsHandlerImpl implements CaseEventsHandler {

	@Autowired
	private AppApplnCtxAware applnCtxAware;

	@SuppressWarnings("unchecked")
	public AppEventResp publishCaseEvent(AppEventReq eventReq) throws Exception {

		Map<String, ?> handlers = new HashMap<String, Object>();

		switch (eventReq.getEventType()) {
		case EventConstants.AUD_EXTRACT_TEXT:
			handlers = applnCtxAware.getBeansOfType(AudExtractEventHandler.class);
			break;
		case EventConstants.VID_EXTRACT_UD:
			break;
		case EventConstants.AUD_TEXT_EXTRACT_SUMMARY:
			break;
		}

		handlers.values().stream().forEach(aHandler -> {
			try {
				((AppEventReqHandler<AppEventReq, AppEventResp>) aHandler).handleEvent(eventReq);

			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		AppEventResp resp = new AppEventResp();
		return resp;
	}

	@Override
	public String getHandlerName() {
		return "CaseEventsHandlerImpl";
	}
}
