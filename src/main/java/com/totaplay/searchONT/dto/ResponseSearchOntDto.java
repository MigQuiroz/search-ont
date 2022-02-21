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
    
}