package com.duofx.dao;

import com.duofx.model.Person;
import org.springframework.stereotype.Repository;

/**
 *
 * @author duofx
 * @date 2020/6/8
 */
@Repository
public interface PersonMapperDao {
    Person findPersonById(long id);
}
