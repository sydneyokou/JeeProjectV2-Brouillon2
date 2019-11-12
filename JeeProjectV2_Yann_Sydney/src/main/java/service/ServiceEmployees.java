/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import jee.dao.IEmployeesDAO;
import model.Employee;


public class ServiceEmployees implements IServiceEmployees {
    
private IEmployeesDAO dao;

public 	void creerEmployees (final Integer eId,final String eName,final String eFirstName,final String eTelhome ,final String eTelMob,final String eTelpro,final String eAdress,final String ePostalCode, final String eCity,final String eEmail)
{
        final Employee lEmployees = new Employee();
        lEmployees.setId(eId);
        lEmployees.setName(eName);
        lEmployees.setFirstname(eFirstName);
        lEmployees.setTelhome(eTelhome);
        lEmployees.setTelpro(eTelpro);
        lEmployees.setAdress(eAdress);
        lEmployees.setPostalcode(ePostalCode);
        lEmployees.setCity(eCity);
        lEmployees.setEmail(eEmail);
        
        dao.creerEmployees(lEmployees);
    }


    public void supprimerEmployees(final Integer pIdEmployees) {
        final Employee lEmployees = new Employee();
        lEmployees.setId(pIdEmployees);

        dao.supprimerEmployees(lEmployees);
    }

   
    public void modifierEmployees(final Integer eId,final String eName,final String eFirstName,final String eTelhome ,final String eTelMob,final String eTelpro,final String eAdress,final String ePostalCode, final String eCity,final String eEmail) {
        
        final Employee lEmployees = new Employee();
        lEmployees.setId(eId);
        lEmployees.setName(eName);
        lEmployees.setFirstname(eFirstName);
        lEmployees.setTelhome(eTelhome);
        lEmployees.setTelpro(eTelpro);
        lEmployees.setAdress(eAdress);
        lEmployees.setPostalcode(ePostalCode);
        lEmployees.setCity(eCity);
        lEmployees.setEmail(eEmail);
	        
        dao.modifierEmployees(lEmployees);
        
    }
}
