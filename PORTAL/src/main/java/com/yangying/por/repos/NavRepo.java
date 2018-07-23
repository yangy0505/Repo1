package com.yangying.por.repos;

import com.yangying.por.pojo.Rpt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Dee on 2018/5/17.
 */
public interface NavRepo extends JpaRepository<Rpt, Integer>, JpaSpecificationExecutor<Rpt> {

    @Query(value = "select children.* from t_p_rpt children left join t_p_rpt parent on children.parent_id = parent.id where children.flag = 1", nativeQuery = true)
    List<Object[]> findAllNavs();

    @Query(value = "select children.* from (select rpt1.* from t_p_rptofrole rptofrole1 inner join t_p_rpt rpt1 on rptofrole1.rpt_id = rpt1.id where rptofrole1.user_id = ?1) children left join (select rpt.* from t_p_rptofrole rptofrole inner join t_p_rpt rpt on rptofrole.rpt_id = rpt.id where rptofrole.user_id = ?1) parent on children.parent_id = parent.id where children.flag = 1", nativeQuery = true)
    List<Object[]> findNavsByUserId(Integer id);
}
