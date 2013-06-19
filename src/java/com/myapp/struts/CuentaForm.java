package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CuentaForm extends org.apache.struts.validator.ValidatorForm {

    private Integer codEntidad;
    private Integer codSucursal;
    private Integer digito;
    private double saldo;
    private String tipoCuenta;

    public Integer getCodEntidad() {
        return codEntidad;
    }

    public void setCodEntidad(Integer codEntidad) {
        this.codEntidad = codEntidad;
    }

    public Integer getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(Integer codSucursal) {
        this.codSucursal = codSucursal;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
