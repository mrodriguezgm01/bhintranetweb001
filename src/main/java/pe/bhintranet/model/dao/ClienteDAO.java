package pe.bhintranet.model.dao;

import pe.bhintranet.model.bean.Cliente;

public interface ClienteDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    int deleteByPrimaryKey(Long codcliente);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    void insert(Cliente record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    void insertSelective(Cliente record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    Cliente selectByPrimaryKey(Long codcliente);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    int updateByPrimaryKeySelective(Cliente record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cliente
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    int updateByPrimaryKey(Cliente record);
}