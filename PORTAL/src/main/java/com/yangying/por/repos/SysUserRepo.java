package com.yangying.por.repos;

import com.yangying.por.pojo.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface SysUserRepo extends JpaRepository<SysUser, Integer>, JpaSpecificationExecutor<SysUser> {

    @Query("from SysUser s where s.name = ?1 and s.password = ?2")
    SysUser findOne(String username, String password);

//    SysUser findByNameAndPassword(String name, String password);
}
