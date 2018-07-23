package com.yangying.por.pojo;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Dee on 2018/5/25.
 */
@Embeddable
public class RptRoleEmbeddedId implements Serializable {

    private Integer sysUserId;

    private Integer rptId;

    public Integer getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    public Integer getRptId() {
        return rptId;
    }

    public void setRptId(Integer rptId) {
        this.rptId = rptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RptRoleEmbeddedId that = (RptRoleEmbeddedId) o;

        if (sysUserId != null ? !sysUserId.equals(that.sysUserId) : that.sysUserId != null) {
            return false;
        }
        return rptId != null ? rptId.equals(that.rptId) : that.rptId == null;
    }

    @Override
    public int hashCode() {
        int result = sysUserId != null ? sysUserId.hashCode() : 0;
        result = 31 * result + (rptId != null ? rptId.hashCode() : 0);
        return result;
    }
}
