package patentapp.common.services.common;

import java.util.List;

import patentapp.common.dao.crud.BaseModelCrudDAO;
import patentapp.common.dto.AppCrudRequest;
import patentapp.common.dto.AppCrudResponse;
import patentapp.common.model.common.BaseModel;
import patentapp.common.utils.AppJsonUtil;

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

	default AppCrudResponse<T> populateInitialData(String modelClassName, AppCrudRequest<T> crudReq, Class<T> classObj)
			throws Exception {

		List<T> modelObjs = AppJsonUtil
				.<T>convertModelJsonDataToModelObj(crudReq.getInitialDataJsonFilePath(modelClassName), classObj);

		

		if (modelObjs != null && modelObjs.size() > 0) {
			
			AppCrudRequest<T> crudReq2 = new AppCrudRequest<T>();
			
			modelObjs.forEach(modelObj -> {

				System.out.println("modelObj " + modelObj);
				
				crudReq2.setModel(modelObj);
				try {

					this.createModel(crudReq2);

				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return resp;
	}

}
