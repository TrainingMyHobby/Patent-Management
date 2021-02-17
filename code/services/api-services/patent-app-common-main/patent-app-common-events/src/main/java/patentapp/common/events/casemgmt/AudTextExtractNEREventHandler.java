package patentapp.common.events.casemgmt;

import patentapp.common.dto.AppEventReq;
import patentapp.common.dto.AppEventResp;
import patentapp.common.events.common.AppEventReqHandler;

public interface AudTextExtractNEREventHandler extends AppEventReqHandler<AppEventReq, AppEventResp> {

	default String getHandlerName() {
		return "AudTextExtractNEREventHandler";
	}
}
