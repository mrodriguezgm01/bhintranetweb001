package pe.bhintranet.model.bean;

public class Modulo {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column modulo.codModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    private Integer codmodulo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column modulo.nombreCortoModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    private String nombrecortomodulo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column modulo.nombreLargoModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    private String nombrelargomodulo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column modulo.estado
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    private String estado;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column modulo.codModulo
     *
     * @return the value of modulo.codModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public Integer getCodmodulo() {
        return codmodulo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column modulo.codModulo
     *
     * @param codmodulo the value for modulo.codModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public void setCodmodulo(Integer codmodulo) {
        this.codmodulo = codmodulo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column modulo.nombreCortoModulo
     *
     * @return the value of modulo.nombreCortoModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public String getNombrecortomodulo() {
        return nombrecortomodulo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column modulo.nombreCortoModulo
     *
     * @param nombrecortomodulo the value for modulo.nombreCortoModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public void setNombrecortomodulo(String nombrecortomodulo) {
        this.nombrecortomodulo = nombrecortomodulo == null ? null : nombrecortomodulo.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column modulo.nombreLargoModulo
     *
     * @return the value of modulo.nombreLargoModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public String getNombrelargomodulo() {
        return nombrelargomodulo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column modulo.nombreLargoModulo
     *
     * @param nombrelargomodulo the value for modulo.nombreLargoModulo
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public void setNombrelargomodulo(String nombrelargomodulo) {
        this.nombrelargomodulo = nombrelargomodulo == null ? null : nombrelargomodulo.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column modulo.estado
     *
     * @return the value of modulo.estado
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public String getEstado() {
        return estado;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column modulo.estado
     *
     * @param estado the value for modulo.estado
     *
     * @ibatorgenerated Mon Dec 18 01:51:37 GMT 2017
     */
    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }
}