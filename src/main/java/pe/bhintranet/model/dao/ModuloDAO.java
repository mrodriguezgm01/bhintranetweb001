package pe.bhintranet.model.dao;

import pe.bhintranet.model.bean.Modulo;

public interface ModuloDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table modulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int deleteByPrimaryKey(Integer codmodulo);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table modulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    void insert(Modulo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table modulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    void insertSelective(Modulo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table modulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    Modulo selectByPrimaryKey(Integer codmodulo);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table modulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int updateByPrimaryKeySelective(Modulo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table modulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int updateByPrimaryKey(Modulo record);
}