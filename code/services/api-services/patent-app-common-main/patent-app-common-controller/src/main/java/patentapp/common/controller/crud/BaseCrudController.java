package patentapp.common.controller.crud;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import patentapp.common.dto.AppCrudRequest;
import patentapp.common.dto.AppCrudResponse;
import patentapp.common.model.common.BaseModel;

public class BaseCrudController<T extends BaseModel> {

	@RequestMapping(path = "create")
	public ResponseEntity<AppCrudResponse<T>> createModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return ResponseEntity.ok(resp);
	}

	@RequestMapping(path = "update")
	public ResponseEntity<AppCrudResponse<T>> updateModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return ResponseEntity.ok(resp);
	}

	@RequestMapping(path = "delete")
	public ResponseEntity<AppCrudResponse<T>> deleteModel(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return ResponseEntity.ok(resp);
	}

	@RequestMapping(path = "get-by-pk")
	public ResponseEntity<AppCrudResponse<T>> getModelByPk(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return ResponseEntity.ok(resp);
	}

	@RequestMapping(path = "getall")
	public ResponseEntity<AppCrudResponse<T>> getAllModels(AppCrudRequest<T> crudReq) throws Exception {

		AppCrudResponse<T> resp = new AppCrudResponse<T>();

		return ResponseEntity.ok(resp);
	}

}
