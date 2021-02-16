package patentapp.api.masterdata.services.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.masterdata.BusProcResource;

@RestController
@RequestMapping(path = "/api/services/masterdata/crud/busproc-resource", produces = "application/json")
public class BusProcResourceCrudController extends BaseNameDescCrudController<BusProcResource> {

}
