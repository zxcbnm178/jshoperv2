package com.jshop.entity;

// Generated 2012-9-8 14:04:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * InvoicePrintT generated by hbm2java
 */
public class InvoicePrintT implements java.io.Serializable {

	private String invoiceprintid;
	private Date invoiceprinttime;
	private String username;
	private String orderid;
	private String shippingaddressid;
	private String state;
	private String logisticsid;
	private String logisticsnumber;
	private String invoicenumber;
	private String operatorname;
	private String ordername;

	public InvoicePrintT() {
	}

	public InvoicePrintT(String invoiceprintid, Date invoiceprinttime,
			String username, String orderid, String shippingaddressid,
			String state, String logisticsid, String operatorname,
			String ordername) {
		this.invoiceprintid = invoiceprintid;
		this.invoiceprinttime = invoiceprinttime;
		this.username = username;
		this.orderid = orderid;
		this.shippingaddressid = shippingaddressid;
		this.state = state;
		this.logisticsid = logisticsid;
		this.operatorname = operatorname;
		this.ordername = ordername;
	}

	public InvoicePrintT(String invoiceprintid, Date invoiceprinttime,
			String username, String orderid, String shippingaddressid,
			String state, String logisticsid, String logisticsnumber,
			String invoicenumber, String operatorname, String ordername) {
		this.invoiceprintid = invoiceprintid;
		this.invoiceprinttime = invoiceprinttime;
		this.username = username;
		this.orderid = orderid;
		this.shippingaddressid = shippingaddressid;
		this.state = state;
		this.logisticsid = logisticsid;
		this.logisticsnumber = logisticsnumber;
		this.invoicenumber = invoicenumber;
		this.operatorname = operatorname;
		this.ordername = ordername;
	}

	public String getInvoiceprintid() {
		return this.invoiceprintid;
	}

	public void setInvoiceprintid(String invoiceprintid) {
		this.invoiceprintid = invoiceprintid;
	}

	public Date getInvoiceprinttime() {
		return this.invoiceprinttime;
	}

	public void setInvoiceprinttime(Date invoiceprinttime) {
		this.invoiceprinttime = invoiceprinttime;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getShippingaddressid() {
		return this.shippingaddressid;
	}

	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	public String getLogisticsnumber() {
		return this.logisticsnumber;
	}

	public void setLogisticsnumber(String logisticsnumber) {
		this.logisticsnumber = logisticsnumber;
	}

	public String getInvoicenumber() {
		return this.invoicenumber;
	}

	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}

	public String getOperatorname() {
		return this.operatorname;
	}

	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}

	public String getOrdername() {
		return this.ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

}
