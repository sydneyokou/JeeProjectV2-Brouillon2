/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Employee;
/**
 *
 * @author Thomas
 */

public class EmployeesDAO implements IEmployeesDAO{
 
    @PersistenceContext
    private EntityManager entityManager;

    public void creerEmployees(final Employee pEmployees) {
        entityManager.persist(pEmployees);
    }
    
    public void supprimerEmployees(final Employee pEmployees){
    	
    	final Employee lEmployees = entityManager.getReference(Employee.class,pEmployees.getId());
    	entityManager.remove(lEmployees);
  
    }
    
    public void modifierEmployees ( final Employee pEmployees) {
       
    	 entityManager.merge(pEmployees);
    }
	
}