package patentapp.common.events.casemgmt;

import patentapp.common.dto.AppEventReq;
import patentapp.common.dto.AppEventResp;

public interface CaseEventsHandler {

	AppEventResp publishCaseEvent(AppEventReq eventReq) throws Exception;

	String getHandlerName();
}
