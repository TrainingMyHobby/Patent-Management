package patentapp.common.services.common;

import org.springframework.beans.factory.annotation.Autowired;

import patentapp.common.dao.crud.BaseModelCrudDAO;
import patentapp.common.model.common.BaseModel;
import patentapp.common.utils.AppConfigUtil;

public abstract class BaseModelCrudSvcImpl<T extends BaseModel> implements BaseModelCrudSvc<T> {

	@Autowired
	protected AppConfigUtil appConfigUtil;

	private BaseModelCrudDAO<T> crudDAO;

	public void setBaseModelCrudDAO(BaseModelCrudDAO<T> crudDAO) {
		this.crudDAO = crudDAO;
	}

	@Override
	public BaseModelCrudDAO<T> getCrudDAO() {
		return this.crudDAO;
	}

}
