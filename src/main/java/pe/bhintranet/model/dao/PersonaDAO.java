package pe.bhintranet.model.dao;

import pe.bhintranet.model.bean.Persona;

public interface PersonaDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int deleteByPrimaryKey(Long codpersona);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    void insert(Persona record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    void insertSelective(Persona record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    Persona selectByPrimaryKey(Long codpersona);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int updateByPrimaryKeySelective(Persona record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table persona
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int updateByPrimaryKey(Persona record);
}