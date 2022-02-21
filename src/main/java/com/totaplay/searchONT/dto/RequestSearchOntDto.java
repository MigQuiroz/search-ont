/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaplay.searchONT.dto;

import lombok.Data;

/**
 *
 * @author APerez
 */
@Data
public class RequestSearchOntDto {
      public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	private String serialNumber; 
}

