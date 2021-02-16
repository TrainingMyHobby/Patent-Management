package patentapp.common.services.common;

import patentapp.common.dto.AppCrudRequest;
import patentapp.common.dto.AppCrudResponse;
import patentapp.common.model.common.BaseModel;

public class BaseModelCrudSvcImpl<T extends BaseModel> {

	public AppCrudResponse<T> createModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	public AppCrudResponse<T> updateModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	public AppCrudResponse<T> deleteModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	public AppCrudResponse<T> getModelByPk(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	public AppCrudResponse<T> getAllModels(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

}
