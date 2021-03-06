package pe.bhintranet.model.dao;

import pe.bhintranet.model.bean.TasacionDistribucion;

public interface TasacionDistribucionDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tasaciondistribucion
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    int deleteByPrimaryKey(Long codtasacion, Integer nroitem);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tasaciondistribucion
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    void insert(TasacionDistribucion record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tasaciondistribucion
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    void insertSelective(TasacionDistribucion record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tasaciondistribucion
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    TasacionDistribucion selectByPrimaryKey(Long codtasacion, Integer nroitem);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tasaciondistribucion
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    int updateByPrimaryKeySelective(TasacionDistribucion record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tasaciondistribucion
     *
     * @ibatorgenerated Fri Dec 22 04:07:26 GMT 2017
     */
    int updateByPrimaryKey(TasacionDistribucion record);
}