package patentapp.common.dao.crud.masterdata;

import org.springframework.stereotype.Repository;

import patentapp.common.dao.crud.BaseNameDescCrudDAO;
import patentapp.common.model.masterdata.Organization;

@Repository
public interface OrgCrudDAO extends BaseNameDescCrudDAO<Organization> {

}
