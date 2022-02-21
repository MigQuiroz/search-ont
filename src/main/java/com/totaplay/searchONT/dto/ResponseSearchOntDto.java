/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaplay.searchONT.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.totaplay.searchONT.tprovisioningSoa.ModelGetONT;
import java.util.List;
import lombok.Data;

/**
 *
 * @author APerez
 */
@Data
public class ResponseSearchOntDto {
    List<ModelGetONT> List;
    private Boolean error=false;
    private String message="";
    private String transactionLog =null;
	public List<ModelGetONT> getList() {
		return List;
	}
	public void setList(List<ModelGetONT> list) {
		List = list;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTransactionLog() {
		return transactionLog;
	}
	public void setTransactionLog(String transactionLog) {
		this.transactionLog = transactionLog;
	}
    
}