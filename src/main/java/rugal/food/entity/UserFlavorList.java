/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Rugal Bernstein
 */
@Entity
@Table(name = "user_flavor_list", catalog = "food", schema = "")
@NamedQueries({
    @NamedQuery(name = "UserFlavorList.findAll", query = "SELECT u FROM UserFlavorList u")})
public class UserFlavorList implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer uflid;

    @JoinColumn(name = "uid", referencedColumnName = "uid")
    @ManyToOne
    private User uid;

    @JoinColumn(name = "fid", referencedColumnName = "fid")
    @ManyToOne
    private Flavor fid;

    public UserFlavorList()
    {
    }

    public UserFlavorList(Integer uflid)
    {
        this.uflid = uflid;
    }

    public Integer getUflid()
    {
        return uflid;
    }

    public void setUflid(Integer uflid)
    {
        this.uflid = uflid;
    }

    public User getUid()
    {
        return uid;
    }

    public void setUid(User uid)
    {
        this.uid = uid;
    }

    public Flavor getFid()
    {
        return fid;
    }

    public void setFid(Flavor fid)
    {
        this.fid = fid;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (uflid != null ? uflid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserFlavorList)) {
            return false;
        }
        UserFlavorList other = (UserFlavorList) object;
        if ((this.uflid == null && other.uflid != null) || (this.uflid != null && !this.uflid.equals(other.uflid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "rugal.food.entity.UserFlavorList[ uflid=" + uflid + " ]";
    }
}
