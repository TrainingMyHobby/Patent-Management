package patentapp.common.dao.crud;

import org.springframework.data.repository.NoRepositoryBean;

import patentapp.common.model.common.BaseModel;

@NoRepositoryBean
public interface BaseNameDescCrudDAO<T extends BaseModel> extends BaseModelCrudDAO<T> {

}
