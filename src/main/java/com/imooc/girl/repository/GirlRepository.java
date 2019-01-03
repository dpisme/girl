package com.imooc.girl.repository;

import com.imooc.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 1639489689@qq.com
 * @date 2018/6/12 0012 下午 3:45
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    Girl findGirlById(Integer id);
    //通过年龄来查询
    List<Girl> findByAge(Integer age);

    List<Girl> findAllByAge(Integer age);
}
