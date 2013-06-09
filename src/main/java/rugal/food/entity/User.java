/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rugal Bernstein
 */
@Entity
@Table(catalog = "food", schema = "")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String uid;

    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, columnDefinition = "INT(1)")
    private Integer activated = 0;

    @Basic(optional = false)
    @NotNull
    @Column(name = "last_login", nullable = false)
    private long lastLogin;

    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, columnDefinition = "INT(1)")
    private Integer online = 0;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "uid")
    private List<Indent> indentList;

    public User()
    {
    }

    public User(String uid)
    {
        this.uid = uid;
    }

    public User(String uid, Integer activated, long lastLogin, Integer online)
    {
        this.uid = uid;
        this.activated = activated;
        this.lastLogin = lastLogin;
        this.online = online;
    }

    public String getUid()
    {
        return uid;
    }

    public void setUid(String uid)
    {
        this.uid = uid;
    }

    public Integer getActivated()
    {
        return activated;
    }

    public void setActivated(Integer activated)
    {
        this.activated = activated;
    }

    public long getLastLogin()
    {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin)
    {
        this.lastLogin = lastLogin;
    }

    public Integer getOnline()
    {
        return online;
    }

    public void setOnline(Integer online)
    {
        this.online = online;
    }

    public List<Indent> getIndentList()
    {
        return indentList;
    }

    public void setIndentList(List<Indent> indentList)
    {
        this.indentList = indentList;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "rugal.food.entity.User[ uid=" + uid + " ]";
    }
}
