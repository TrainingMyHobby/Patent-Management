package patentapp.api.masterdata.services.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patentapp.common.controller.crud.BaseNameDescCrudController;
import patentapp.common.model.masterdata.BusProc;

@RestController
@RequestMapping(path = "/api/services/masterdata/crud/busproc", produces = "application/json")
public class BusProcCrudController extends BaseNameDescCrudController<BusProc> {

}
