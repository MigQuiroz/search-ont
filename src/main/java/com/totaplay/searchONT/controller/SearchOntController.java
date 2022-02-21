/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaplay.searchONT.controller;
import com.totaplay.searchONT.dto.RequestSearchOntDto;
import com.totaplay.searchONT.dto.ResponseSearchOntDto;
import com.totaplay.searchONT.tprovisioningSoa.ArrayOfModelGetONT;
import com.totaplay.searchONT.tprovisioningSoa.ModelGetONT;
import com.totaplay.searchONT.tprovisioningSoa.TProvisioning;
import com.totaplay.searchONT.tprovisioningSoa.TProvisioningSoap;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author APerez
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ont")
public class SearchOntController {
    
    @RequestMapping(value="/GetSearchONT",method= RequestMethod.POST)
    public ResponseSearchOntDto GetSearchONT(@RequestBody RequestSearchOntDto searchOntDto){
        System.out.println("Recurso: ...:8083/ont/GetSearchONT");
        
        ResponseSearchOntDto responseSearchOntDto = new ResponseSearchOntDto();
                 
        try {
            responseSearchOntDto.setTransactionLog("1");
            TProvisioning TProv = new TProvisioning();
            
            responseSearchOntDto.setTransactionLog("2");
            TProvisioningSoap TProvSoap = TProv.getTProvisioningSoap();
            
            responseSearchOntDto.setTransactionLog("3");
            TProvSoap.getSearchONT(searchOntDto.getSerialNumber());
            
            responseSearchOntDto.setTransactionLog("4");
            ArrayOfModelGetONT result = TProvSoap.getSearchONT(searchOntDto.getSerialNumber()); 
            
            System.out.println("List<ModelGetONT>: "+result.getModelGetONT().size());
            
            responseSearchOntDto.setTransactionLog("5");
            List<ModelGetONT> List  = result.getModelGetONT();
            
            responseSearchOntDto.setTransactionLog("6");
            responseSearchOntDto.setList(List);
          
            responseSearchOntDto.setTransactionLog("7");
        } catch (Exception e) {
            responseSearchOntDto.setError(true);
            responseSearchOntDto.setMessage(e.getMessage());
            responseSearchOntDto.setTransactionLog("error");
            System.out.println("Error: "+e);
        }

        return responseSearchOntDto;
    }
}
