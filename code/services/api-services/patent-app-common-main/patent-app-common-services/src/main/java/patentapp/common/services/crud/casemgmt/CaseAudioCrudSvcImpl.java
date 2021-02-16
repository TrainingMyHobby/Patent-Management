package patentapp.common.services.crud.casemgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import patentapp.common.dao.crud.casemgmt.CaseAudioCrudDAO;
import patentapp.common.model.casemgmt.CaseAudio;
import patentapp.common.services.common.BaseNameDescModelCrudSvcImpl;

@Service
public class CaseAudioCrudSvcImpl extends BaseNameDescModelCrudSvcImpl<CaseAudio> implements CaseAudioCrudSvc {

	public CaseAudioCrudSvcImpl(@Autowired CaseAudioCrudDAO crudDAO) {
		super.setBaseModelCrudDAO(crudDAO);
	}

}
