package pe.bhintranet.model.dao;

import pe.bhintranet.model.bean.PropiedadPropietario;

public interface PropiedadPropietarioDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedadpropietario
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int deleteByPrimaryKey(Long codpropiedadpropietario);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedadpropietario
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    void insert(PropiedadPropietario record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedadpropietario
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    void insertSelective(PropiedadPropietario record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedadpropietario
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    PropiedadPropietario selectByPrimaryKey(Long codpropiedadpropietario);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedadpropietario
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int updateByPrimaryKeySelective(PropiedadPropietario record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedadpropietario
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    int updateByPrimaryKey(PropiedadPropietario record);
}