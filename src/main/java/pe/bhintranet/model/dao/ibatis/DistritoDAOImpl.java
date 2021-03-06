package pe.bhintranet.model.dao.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import pe.bhintranet.model.bean.Distrito;
import pe.bhintranet.model.dao.DistritoDAO;

public class DistritoDAOImpl extends SqlMapClientDaoSupport implements DistritoDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public DistritoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public int deleteByPrimaryKey(Integer coddistrito) {
        Distrito key = new Distrito();
        key.setCoddistrito(coddistrito);
        int rows = getSqlMapClientTemplate().delete("distrito.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public void insert(Distrito record) {
        getSqlMapClientTemplate().insert("distrito.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public void insertSelective(Distrito record) {
        getSqlMapClientTemplate().insert("distrito.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public Distrito selectByPrimaryKey(Integer coddistrito) {
        Distrito key = new Distrito();
        key.setCoddistrito(coddistrito);
        Distrito record = (Distrito) getSqlMapClientTemplate().queryForObject("distrito.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public int updateByPrimaryKeySelective(Distrito record) {
        int rows = getSqlMapClientTemplate().update("distrito.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public int updateByPrimaryKey(Distrito record) {
        int rows = getSqlMapClientTemplate().update("distrito.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
}