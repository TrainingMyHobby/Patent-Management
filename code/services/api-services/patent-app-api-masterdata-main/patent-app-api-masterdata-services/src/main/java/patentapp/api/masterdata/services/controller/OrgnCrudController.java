package patentapp.api.masterdata.services.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.masterdata.Organization;

@RestController
@RequestMapping(path = "/api/services/masterdata/crud/orgn", produces = "application/json")
public class OrgnCrudController extends BaseNameDescCrudController<Organization> {

}
