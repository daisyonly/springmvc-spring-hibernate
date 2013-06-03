/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Rugal Bernstein
 */
@Entity
@Table(catalog = "food", schema = "")
@NamedQueries({
    @NamedQuery(name = "Flavor.findAll", query = "SELECT f FROM Flavor f")})
public class Flavor implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer fid;

    @Size(max = 30)
    @Column(length = 30)
    private String name;

    @Size(max = 100)
    @Column(length = 100)
    private String depict;

    @OneToMany(mappedBy = "fid")
    private List<MenuFlavorList> menuFlavorList;

    @OneToMany(mappedBy = "fid")
    private List<UserFlavorList> userFlavorList;

    public Flavor()
    {
    }

    public Flavor(Integer fid)
    {
        this.fid = fid;
    }

    public Integer getFid()
    {
        return fid;
    }

    public void setFid(Integer fid)
    {
        this.fid = fid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<UserFlavorList> getUserFlavorList()
    {
        return userFlavorList;
    }

    public void setUserFlavorList(List<UserFlavorList> userFlavorList)
    {
        this.userFlavorList = userFlavorList;
    }

    public String getDepict()
    {
        return depict;
    }

    public void setDepict(String depict)
    {
        this.depict = depict;
    }

    public List<MenuFlavorList> getMenuFlavorList()
    {
        return menuFlavorList;
    }

    public void setMenuFlavorList(List<MenuFlavorList> menuFlavorList)
    {
        this.menuFlavorList = menuFlavorList;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flavor)) {
            return false;
        }
        Flavor other = (Flavor) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "rugal.food.entity.Flavor[ fid=" + fid + " ]";
    }
}
