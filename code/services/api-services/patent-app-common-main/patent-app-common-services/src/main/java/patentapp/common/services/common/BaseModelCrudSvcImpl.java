package patentapp.common.services.common;

import patentapp.common.dao.crud.BaseModelCrudDAO;
import patentapp.common.dto.AppCrudRequest;
import patentapp.common.dto.AppCrudResponse;
import patentapp.common.model.common.BaseModel;

public class BaseModelCrudSvcImpl<T extends BaseModel> {

	private BaseModelCrudDAO<T> crudDAO;

	public void setBaseModelCrudDAO(BaseModelCrudDAO<T> crudDAO) {
		this.crudDAO = crudDAO;
	}

	public AppCrudResponse<T> createModel(AppCrudRequest<T> crudReq) throws Exception {

		T modelObj = this.crudDAO.save(crudReq.getModel());

		AppCrudResponse<T> resp = new AppCrudResponse<T>();
		resp.setModel(modelObj);

		return resp;
	}

	public AppCrudResponse<T> updateModel(AppCrudRequest<T> crudReq) throws Exception {

		T modelObj = this.crudDAO.save(crudReq.getModel());

		AppCrudResponse<T> resp = new AppCrudResponse<T>();
		resp.setModel(modelObj);

		return resp;
	}

	public AppCrudResponse<T> deleteModel(AppCrudRequest<T> crudReq) throws Exception {

		this.crudDAO.deleteById(crudReq.getPk());

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	public AppCrudResponse<T> getModelByPk(AppCrudRequest<T> crudReq) throws Exception {

		T modelObj = this.crudDAO.findById(crudReq.getPk()).orElseGet(null);

		AppCrudResponse<T> resp = new AppCrudResponse<T>();
		resp.setModel(modelObj);

		return resp;
	}

	public AppCrudResponse<T> getAllModels(AppCrudRequest<T> crudReq) throws Exception {

		Iterable<T> modelObjs = this.crudDAO.findAll();

		AppCrudResponse<T> resp = new AppCrudResponse<T>();
		resp.setModelsItr(modelObjs);

		return resp;
	}

}
