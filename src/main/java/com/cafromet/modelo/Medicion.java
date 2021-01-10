package com.cafromet.modelo;
// Generated 27 dic. 2020 22:44:50 by Hibernate Tools 5.4.21.Final

/**
 * Medicion generated by hbm2java
 */
public class Medicion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3089354294668404298L;
	private MedicionId id;
	private CentroMeteorologico centroMeteorologico;
	private Float comgm3;
	private Float co8hmgm3;
	private Float nogm3;
	private Float no2;
	private String no2ica;
	private Float noxgm3;
	private Float pm10;
	private String pm10ica;
	private Float pm25;
	private String pm25ica;
	private Float so2;
	private String so2ica;
	private String icaEstacion;

	public Medicion() {
	}

	public Medicion(MedicionId id, CentroMeteorologico centroMeteorologico) {
		this.id = id;
		this.centroMeteorologico = centroMeteorologico;
	}

	public Medicion(MedicionId id, CentroMeteorologico centroMeteorologico, Float comgm3, Float co8hmgm3, Float nogm3,
			Float no2, String no2ica, Float noxgm3, Float pm10, String pm10ica, Float pm25, String pm25ica, Float so2,
			String so2ica, String icaEstacion) {
		this.id = id;
		this.centroMeteorologico = centroMeteorologico;
		this.comgm3 = comgm3;
		this.co8hmgm3 = co8hmgm3;
		this.nogm3 = nogm3;
		this.no2 = no2;
		this.no2ica = no2ica;
		this.noxgm3 = noxgm3;
		this.pm10 = pm10;
		this.pm10ica = pm10ica;
		this.pm25 = pm25;
		this.pm25ica = pm25ica;
		this.so2 = so2;
		this.so2ica = so2ica;
		this.icaEstacion = icaEstacion;
	}

	public MedicionId getId() {
		return this.id;
	}

	public void setId(MedicionId id) {
		this.id = id;
	}

	public CentroMeteorologico getCentroMeteorologico() {
		return this.centroMeteorologico;
	}

	public void setCentroMeteorologico(CentroMeteorologico centroMeteorologico) {
		this.centroMeteorologico = centroMeteorologico;
	}

	public Float getComgm3() {
		return this.comgm3;
	}

	public void setComgm3(Float comgm3) {
		this.comgm3 = comgm3;
	}

	public Float getCo8hmgm3() {
		return this.co8hmgm3;
	}

	public void setCo8hmgm3(Float co8hmgm3) {
		this.co8hmgm3 = co8hmgm3;
	}

	public Float getNogm3() {
		return this.nogm3;
	}

	public void setNogm3(Float nogm3) {
		this.nogm3 = nogm3;
	}

	public Float getNo2() {
		return this.no2;
	}

	public void setNo2(Float no2) {
		this.no2 = no2;
	}

	public String getNo2ica() {
		return this.no2ica;
	}

	public void setNo2ica(String no2ica) {
		this.no2ica = no2ica;
	}

	public Float getNoxgm3() {
		return this.noxgm3;
	}

	public void setNoxgm3(Float noxgm3) {
		this.noxgm3 = noxgm3;
	}

	public Float getPm10() {
		return this.pm10;
	}

	public void setPm10(Float pm10) {
		this.pm10 = pm10;
	}

	public String getPm10ica() {
		return this.pm10ica;
	}

	public void setPm10ica(String pm10ica) {
		this.pm10ica = pm10ica;
	}

	public Float getPm25() {
		return this.pm25;
	}

	public void setPm25(Float pm25) {
		this.pm25 = pm25;
	}

	public String getPm25ica() {
		return this.pm25ica;
	}

	public void setPm25ica(String pm25ica) {
		this.pm25ica = pm25ica;
	}

	public Float getSo2() {
		return this.so2;
	}

	public void setSo2(Float so2) {
		this.so2 = so2;
	}

	public String getSo2ica() {
		return this.so2ica;
	}

	public void setSo2ica(String so2ica) {
		this.so2ica = so2ica;
	}

	public String getIcaEstacion() {
		return this.icaEstacion;
	}

	public void setIcaEstacion(String icaEstacion) {
		this.icaEstacion = icaEstacion;
	}

}
