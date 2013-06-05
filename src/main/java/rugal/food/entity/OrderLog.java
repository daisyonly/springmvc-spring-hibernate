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
import javax.validation.constraints.NotNull;

/**
 *
 * @author Rugal Bernstein
 */
@Entity
@Table(name = "order_log", catalog = "food", schema = "")
@NamedQueries({
    @NamedQuery(name = "OrderLog.findAll", query = "SELECT o FROM OrderLog o")})
public class OrderLog implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer olid;

    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, columnDefinition = "int(1)")
    private int speed = 0;

    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, columnDefinition = "int(1)")
    private int quality = 0;

    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, columnDefinition = "int(4)")
    private int quantity = 1;

    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, columnDefinition = "int(4)")
    private float subtotal;

    @JoinColumn(name = "iid", referencedColumnName = "iid", nullable = false)
    @ManyToOne(optional = false)
    private Indent iid;

    @JoinColumn(name = "mid", referencedColumnName = "mid", nullable = false)
    @ManyToOne(optional = false)
    private Menu mid;

    @JoinColumn(name = "rid", referencedColumnName = "rid", nullable = false)
    @ManyToOne(optional = false)
    private Restaurant rid;

    public OrderLog()
    {
    }

    public OrderLog(Integer olid)
    {
        this.olid = olid;
    }

    public OrderLog(Integer olid, int duration, int quality)
    {
        this.olid = olid;
        this.speed = duration;
        this.quality = quality;
    }

    public Integer getOlid()
    {
        return olid;
    }

    public void setOlid(Integer olid)
    {
        this.olid = olid;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getQuality()
    {
        return quality;
    }

    public void setQuality(int quality)
    {
        this.quality = quality;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public float getSubtotal()
    {
        return subtotal;
    }

    public void setSubtotal(float subtotal)
    {
        this.subtotal = subtotal;
    }

    public Indent getIid()
    {
        return iid;
    }

    public void setIid(Indent iid)
    {
        this.iid = iid;
    }

    public Menu getMid()
    {
        return mid;
    }

    public void setMid(Menu mid)
    {
        this.mid = mid;
    }

    public Restaurant getRid()
    {
        return rid;
    }

    public void setRid(Restaurant rid)
    {
        this.rid = rid;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (olid != null ? olid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderLog)) {
            return false;
        }
        OrderLog other = (OrderLog) object;
        if ((this.olid == null && other.olid != null) || (this.olid != null && !this.olid.equals(other.olid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "rugal.food.entity.OrderLog[ olid=" + olid + " ]";
    }
}
