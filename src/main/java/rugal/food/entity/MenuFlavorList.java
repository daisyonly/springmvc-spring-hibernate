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
@Table(name = "menu_flavor_list", catalog = "food", schema = "")
@NamedQueries({
    @NamedQuery(name = "MenuFlavorList.findAll", query = "SELECT m FROM MenuFlavorList m")})
public class MenuFlavorList implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer flid;

    private Integer isMenu;

    @JoinColumn(name = "mid", referencedColumnName = "mid")
    @ManyToOne
    private Menu mid;

    @JoinColumn(name = "fid", referencedColumnName = "fid")
    @ManyToOne
    private Flavor fid;

    public MenuFlavorList()
    {
    }

    public MenuFlavorList(Integer flid)
    {
        this.flid = flid;
    }

    public Integer getFlid()
    {
        return flid;
    }

    public void setFlid(Integer flid)
    {
        this.flid = flid;
    }

    public Integer getIsMenu()
    {
        return isMenu;
    }

    public void setIsMenu(Integer isMenu)
    {
        this.isMenu = isMenu;
    }

    public Menu getMid()
    {
        return mid;
    }

    public void setMid(Menu mid)
    {
        this.mid = mid;
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
        hash += (flid != null ? flid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuFlavorList)) {
            return false;
        }
        MenuFlavorList other = (MenuFlavorList) object;
        if ((this.flid == null && other.flid != null) || (this.flid != null && !this.flid.equals(other.flid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "rugal.food.entity.MenuFlavorList[ flid=" + flid + " ]";
    }

}
