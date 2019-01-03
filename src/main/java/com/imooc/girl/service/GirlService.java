package com.imooc.girl.service;

import com.imooc.girl.domain.Girl;
import com.imooc.girl.enums.ResultEnum;
import com.imooc.girl.exception.GirlException;
import com.imooc.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**s
 * @author 1639489689@qq.com
 * @date 2018/6/12 0012 下午 5:32
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB=new Girl();
        girlB.setCupSize("B");
        girlB.setAge(16);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl=girlRepository.findGirlById(id);
        Integer age=girl.getAge();
        if(age<10){
            //你还在上小学吧
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age>10 && age<16){
            //你可能在上初中
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     * 通过id查询一个女生信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findGirlById(id);
    }
}
