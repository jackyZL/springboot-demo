package com.zl.dao.repository;

import com.zl.dao.bean.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository -- 是接口 ，不是class.
 *
 * Created by jacky on 2017/3/6.
 */
@Repository
public interface CatRepository extends CrudRepository<Cat,Integer> {

}
