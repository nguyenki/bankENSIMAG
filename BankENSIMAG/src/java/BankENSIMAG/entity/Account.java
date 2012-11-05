/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BankENSIMAG.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Sony
 */
@Entity
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String typeCard;
    private String cardHolder;
    private String expire;
    
    public Integer getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getExpire() {
        return expire;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BankENSIMAG.entity.Account[ id=" + id + " ]";
    }
    
}
