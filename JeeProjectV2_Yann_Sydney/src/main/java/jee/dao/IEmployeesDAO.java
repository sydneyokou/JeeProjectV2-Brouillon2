/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.dao;

import model.Employee;

/**
 *
 * @author Thomas
 */
public interface IEmployeesDAO {
    
    void creerEmployees(final Employee pEmployees);

    void supprimerEmployees(final Employee pEmployees);
	
    void modifierEmployees(final Employee pEmployees);
    
}
