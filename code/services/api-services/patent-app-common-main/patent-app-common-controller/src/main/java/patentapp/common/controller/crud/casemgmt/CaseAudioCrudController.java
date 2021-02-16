package patentapp.common.controller.crud.casemgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.casemgmt.CaseAudio;
import patentapp.common.services.crud.casemgmt.CaseAudioCrudSvc;

@RestController
@RequestMapping(path = "/api/services/casemgmt/crud/caseaudio", produces = "application/json")
public class CaseAudioCrudController extends BaseNameDescCrudController<CaseAudio> {

	public CaseAudioCrudController(@Autowired CaseAudioCrudSvc crudSvc) {
		super.setBaseModelCrudSvc(crudSvc);
	}

}
