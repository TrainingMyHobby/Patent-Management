package patentapp.common.dao.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import patentapp.common.model.common.BaseModel;

@NoRepositoryBean
public interface BaseModelCrudDAO<T extends BaseModel> extends CrudRepository<T, Long> {

}
