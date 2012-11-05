/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BankENSIMAG.ejb;

import BankENSIMAG.entity.Client;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sony
 */
@Stateless
public class ClientFacade extends AbstractFacade<Client> {
    @PersistenceContext(unitName = "BankENSIMAGPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }
    
}
