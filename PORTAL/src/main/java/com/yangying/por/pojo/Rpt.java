package com.yangying.por.pojo;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "t_p_rpt")
public class Rpt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String icon;

    @Transient
    private boolean spread;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "name")
    @JsonProperty("title")
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "url")
    @JsonProperty("href")
    private String url;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    @Column(name = "flag")
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Column(name = "time_ins")
    private Date timeIns;

    @ManyToOne(targetEntity = Rpt.class)
    @JoinColumn(name = "parent_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Rpt parent;

    public Rpt getParent() {
        return parent;
    }

    @OneToMany(mappedBy = "parent")
    private Set<Rpt> children = new HashSet<>();

    public Set<Rpt> getChildren() {
        return children;
    }

    public void setChildren(Set<Rpt> children) {
        this.children = children;
    }

    public void setParent(Rpt parent) {
        this.parent = parent;
    }

    public Date getTimeIns() {
        return timeIns;
    }

    public void setTimeIns(Date timeIns) {
        this.timeIns = timeIns;
    }

    @Column(name = "time_upd")
    private Date timeUpd;

    public Date getTimeUpd() {
        return timeUpd;
    }

    public void setTimeUpd(Date timeUpd) {
        this.timeUpd = timeUpd;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isSpread() {
        return children.size() > 0;
    }

}
