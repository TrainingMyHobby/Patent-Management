package patentapp.api.casemgmt.insights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.constants.EventConstants;
import patentapp.common.dto.AppEventReq;
import patentapp.common.dto.AppResponse;
import patentapp.common.events.casemgmt.CaseEventsHandler;

@RestController
@RequestMapping(path = "/api/services/casemgmt/insights", produces = "application/json")
public class CaseInsightsController {

	@Autowired
	private CaseEventsHandler caseEvtHandler;

	@RequestMapping("insights-event-request")
	public ResponseEntity<AppResponse> insightEventRequest(AppEventReq eventReq) throws Exception {

		eventReq.addPayLoadData(EventConstants.KEY_PK, eventReq.getPk());
		this.caseEvtHandler.publishCaseEvent(eventReq);

		return ResponseEntity.ok(new AppResponse());
	}

}
