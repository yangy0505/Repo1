package com.yangying.por.pojo;

import javax.persistence.*;

/**
 * Created by Dee on 2018/5/25.
 */
@Entity
@Table(name = "t_p_rptofrole")
public class RptRole {

    @EmbeddedId
    private RptRoleEmbeddedId id;

    @ManyToOne
    @MapsId("sysUserId")
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private SysUser sysUser;

    @ManyToOne
    @MapsId("rptId")
    @JoinColumn(name = "rpt_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Rpt rpt;

    public RptRoleEmbeddedId getId() {
        return id;
    }

    public void setId(RptRoleEmbeddedId id) {
        this.id = id;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public Rpt getRpt() {
        return rpt;
    }

    public void setRpt(Rpt rpt) {
        this.rpt = rpt;
    }
}
