package patentapp.common.services.crud.masterdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import patentapp.common.dao.crud.masterdata.OrgCrudDAO;
import patentapp.common.model.masterdata.Organization;
import patentapp.common.services.common.BaseModelCrudSvcImpl;

@Service
public class OrgCrudSvcImpl extends BaseModelCrudSvcImpl<Organization> implements OrgCrudSvc {
	
	public OrgCrudSvcImpl(@Autowired OrgCrudDAO crudDAO) {
		super.setBaseModelCrudDAO(crudDAO);
	}

}
