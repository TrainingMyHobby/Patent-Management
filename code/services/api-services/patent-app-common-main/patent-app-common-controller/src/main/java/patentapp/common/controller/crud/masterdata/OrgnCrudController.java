package patentapp.common.controller.crud.masterdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.masterdata.Organization;
import patentapp.common.services.crud.masterdata.OrgCrudSvc;

@RestController
@RequestMapping(path = "/api/services/masterdata/crud/orgn", produces = "application/json")
public class OrgnCrudController extends BaseNameDescCrudController<Organization> {

	public OrgnCrudController(@Autowired OrgCrudSvc crudSvc) {
		super.setBaseModelCrudSvc(crudSvc);
	}

}
