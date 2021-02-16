package patentapp.common.services.common;

import patentapp.common.dto.AppCrudRequest;
import patentapp.common.dto.AppCrudResponse;
import patentapp.common.model.common.BaseModel;

public interface BaseModelCrudSvc<T extends BaseModel> {

	default AppCrudResponse<T> createModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	default AppCrudResponse<T> updateModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	default AppCrudResponse<T> deleteModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	default AppCrudResponse<T> getModelByPk(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

	default AppCrudResponse<T> getAllModels(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

}
