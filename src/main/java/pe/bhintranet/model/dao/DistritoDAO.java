package pe.bhintranet.model.dao;

import pe.bhintranet.model.bean.Distrito;

public interface DistritoDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int deleteByPrimaryKey(Integer coddistrito);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    void insert(Distrito record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    void insertSelective(Distrito record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    Distrito selectByPrimaryKey(Integer coddistrito);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int updateByPrimaryKeySelective(Distrito record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table distrito
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int updateByPrimaryKey(Distrito record);
}