package patentapp.common.controller.crud.masterdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.masterdata.BusProc;
import patentapp.common.services.crud.masterdata.BusProcCrudSvc;

@RestController
@RequestMapping(path = "/api/services/masterdata/crud/busproc", produces = "application/json")
public class BusProcCrudController extends BaseNameDescCrudController<BusProc> {

	public BusProcCrudController(@Autowired BusProcCrudSvc crudSvc) {
		super.setBaseModelCrudSvc(crudSvc);
	}

}
