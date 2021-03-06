package pe.bhintranet.model.dao.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import pe.bhintranet.model.bean.Cliente;
import pe.bhintranet.model.dao.ClienteDAO;

public class ClienteDAOImpl extends SqlMapClientDaoSupport implements ClienteDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    public ClienteDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    public int deleteByPrimaryKey(Long codcliente) {
        Cliente key = new Cliente();
        key.setCodcliente(codcliente);
        int rows = getSqlMapClientTemplate().delete("cliente.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    public void insert(Cliente record) {
        getSqlMapClientTemplate().insert("cliente.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    public void insertSelective(Cliente record) {
        getSqlMapClientTemplate().insert("cliente.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    public Cliente selectByPrimaryKey(Long codcliente) {
        Cliente key = new Cliente();
        key.setCodcliente(codcliente);
        Cliente record = (Cliente) getSqlMapClientTemplate().queryForObject("cliente.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    public int updateByPrimaryKeySelective(Cliente record) {
        int rows = getSqlMapClientTemplate().update("cliente.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    public int updateByPrimaryKey(Cliente record) {
        int rows = getSqlMapClientTemplate().update("cliente.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
}