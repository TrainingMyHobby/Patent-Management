package patentapp.common.controller.crud;

import java.lang.reflect.ParameterizedType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import patentapp.common.dto.AppCrudRequest;
import patentapp.common.dto.AppCrudResponse;
import patentapp.common.model.common.BaseModel;
import patentapp.common.services.common.BaseModelCrudSvc;
import patentapp.common.utils.AppConfigUtil;

public class BaseCrudController<T extends BaseModel> {

	@Autowired
	protected AppConfigUtil appConfigUtil;

	private BaseModelCrudSvc<T> crudSvc;

	public void setBaseModelCrudSvc(BaseModelCrudSvc<T> crudSvc) {
		this.crudSvc = crudSvc;
	}

	@RequestMapping(path = "create")
	public ResponseEntity<AppCrudResponse<T>> createModel(@RequestBody AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = this.crudSvc.createModel(crudReq);
		return ResponseEntity.ok(resp);
	}

	@RequestMapping(path = "update")
	public ResponseEntity<AppCrudResponse<T>> updateModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = this.crudSvc.updateModel(crudReq);
		return ResponseEntity.ok(resp);
	}

	@RequestMapping(path = "delete")
	public ResponseEntity<AppCrudResponse<T>> deleteModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = this.crudSvc.deleteModel(crudReq);
		return ResponseEntity.ok(resp);
	}

	@RequestMapping(path = "get-by-pk")
	public ResponseEntity<AppCrudResponse<T>> getModelByPk(@RequestBody AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = this.crudSvc.getModelByPk(crudReq);
		return ResponseEntity.ok(resp);
	}

	@RequestMapping(path = "getall")
	public ResponseEntity<AppCrudResponse<T>> getAllModels(@RequestBody AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = this.crudSvc.getAllModels(crudReq);
		return ResponseEntity.ok(resp);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(path = "populate-initial-data")
	public ResponseEntity<AppCrudResponse<T>> populateInitialData(
			@RequestBody(required = false) AppCrudRequest<T> crudReq) throws Exception {

		if (crudReq == null) {
			crudReq = new AppCrudRequest<T>();
		}

		Class<T> modelClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
		String modelClassName = modelClass.getSimpleName();

		String filePath = this.appConfigUtil.getModelInitialDataJSsonFilePath(modelClassName);
		crudReq.setInitialDataJsonFilePath(modelClassName, filePath);

		AppCrudResponse<T> resp = this.crudSvc.populateInitialData(modelClassName, crudReq);
		return ResponseEntity.ok(resp);
	}

}
