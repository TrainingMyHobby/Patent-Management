package patentapp.common.controller.crud.masterdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.masterdata.BusProcResource;
import patentapp.common.services.crud.masterdata.BusProcResourceCrudSvc;

@RestController
@RequestMapping(path = "/api/services/masterdata/crud/busproc-resource", produces = "application/json")
public class BusProcResourceCrudController extends BaseNameDescCrudController<BusProcResource> {

	public BusProcResourceCrudController(@Autowired BusProcResourceCrudSvc crudSvc) {
		super.setBaseModelCrudSvc(crudSvc);
	}

}
