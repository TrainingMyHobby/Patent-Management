package patentapp.common.controller.crud.masterdata;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.masterdata.BusDomain;

@RestController
@RequestMapping(path = "/api/services/masterdata/crud/busdomain", produces = "application/json")
public class BusDomainCrudController extends BaseNameDescCrudController<BusDomain> {

}
