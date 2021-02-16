package patentapp.common.services.common;

import patentapp.common.dao.crud.BaseModelCrudDAO;
import patentapp.common.dto.AppCrudRequest;
import patentapp.common.dto.AppCrudResponse;
import patentapp.common.model.common.BaseModel;

public interface BaseModelCrudSvc<T extends BaseModel> {

	BaseModelCrudDAO<T> getCrudDAO();

	default AppCrudResponse<T> createModel(AppCrudRequest<T> crudReq) throws Exception {

		T modelObj = this.getCrudDAO().save(crudReq.getModel());

		AppCrudResponse<T> resp = new AppCrudResponse<T>();
		resp.setModel(modelObj);

		return resp;
	}

	default AppCrudResponse<T> updateModel(AppCrudRequest<T> crudReq) throws Exception {

		T modelObj = this.getCrudDAO().save(crudReq.getModel());

		AppCrudResponse<T> resp = new AppCrudResponse<T>();
		resp.setModel(modelObj);

		return resp;
	}

	default AppCrudResponse<T> deleteModel(AppCrudRequest<T> crudReq) throws Exception {

		this.getCrudDAO().deleteById(crudReq.getPk());

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	default AppCrudResponse<T> getModelByPk(AppCrudRequest<T> crudReq) throws Exception {

		T modelObj = this.getCrudDAO().findById(crudReq.getPk()).orElse(null);

		AppCrudResponse<T> resp = new AppCrudResponse<T>();
		resp.setModel(modelObj);

		return resp;
	}

	default AppCrudResponse<T> getAllModels(AppCrudRequest<T> crudReq) throws Exception {

		Iterable<T> modelObjs = this.getCrudDAO().findAll();

		AppCrudResponse<T> resp = new AppCrudResponse<T>();
		resp.setModelsItr(modelObjs);

		return resp;
	}

	default AppCrudResponse<T> populateInitialData(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

}
