package pe.bhintranet.model.dao;

import pe.bhintranet.model.bean.Propiedad;

public interface PropiedadDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedad
     *
     * @ibatorgenerated Mon Dec 18 02:04:45 GMT 2017
     */
    int deleteByPrimaryKey(Long codpropiedad);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedad
     *
     * @ibatorgenerated Mon Dec 18 02:04:45 GMT 2017
     */
    void insert(Propiedad record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedad
     *
     * @ibatorgenerated Mon Dec 18 02:04:45 GMT 2017
     */
    void insertSelective(Propiedad record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedad
     *
     * @ibatorgenerated Mon Dec 18 02:04:45 GMT 2017
     */
    Propiedad selectByPrimaryKey(Long codpropiedad);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedad
     *
     * @ibatorgenerated Mon Dec 18 02:04:45 GMT 2017
     */
    int updateByPrimaryKeySelective(Propiedad record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table propiedad
     *
     * @ibatorgenerated Mon Dec 18 02:04:45 GMT 2017
     */
    int updateByPrimaryKey(Propiedad record);
}