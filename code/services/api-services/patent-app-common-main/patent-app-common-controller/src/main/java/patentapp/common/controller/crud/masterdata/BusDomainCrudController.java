package patentapp.common.controller.crud.masterdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.masterdata.BusDomain;
import patentapp.common.services.crud.masterdata.BusDomainCrudSvc;

@RestController
@RequestMapping(path = "/api/services/masterdata/crud/busdomain", produces = "application/json")
public class BusDomainCrudController extends BaseNameDescCrudController<BusDomain> {

	public BusDomainCrudController(@Autowired BusDomainCrudSvc crudSvc) {
		super.setBaseModelCrudSvc(crudSvc);
	}

}
