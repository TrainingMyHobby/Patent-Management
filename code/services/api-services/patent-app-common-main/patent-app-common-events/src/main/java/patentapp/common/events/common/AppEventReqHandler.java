package patentapp.common.events.common;

import patentapp.common.dto.AppEventReq;
import patentapp.common.dto.AppEventResp;

public interface AppEventReqHandler<T extends AppEventReq, R extends AppEventResp> {

	R handleEvent(T eventReq) throws Exception;

	String getHandlerName();

}
