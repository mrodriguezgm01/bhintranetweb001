package pe.bhintranet.model.dao.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import pe.bhintranet.model.bean.Persona;
import pe.bhintranet.model.dao.PersonaDAO;

public class PersonaDAOImpl extends SqlMapClientDaoSupport implements PersonaDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public PersonaDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public int deleteByPrimaryKey(Long codpersona) {
        Persona key = new Persona();
        key.setCodpersona(codpersona);
        int rows = getSqlMapClientTemplate().delete("persona.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public void insert(Persona record) {
        getSqlMapClientTemplate().insert("persona.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public void insertSelective(Persona record) {
        getSqlMapClientTemplate().insert("persona.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public Persona selectByPrimaryKey(Long codpersona) {
        Persona key = new Persona();
        key.setCodpersona(codpersona);
        Persona record = (Persona) getSqlMapClientTemplate().queryForObject("persona.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public int updateByPrimaryKeySelective(Persona record) {
        int rows = getSqlMapClientTemplate().update("persona.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public int updateByPrimaryKey(Persona record) {
        int rows = getSqlMapClientTemplate().update("persona.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
}