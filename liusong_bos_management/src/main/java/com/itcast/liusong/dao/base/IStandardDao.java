package com.itcast.liusong.dao.base;

import com.itcast.liusong.domain.base.Standard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by l1003 on 2018/1/6.
 */

public interface IStandardDao  extends JpaRepository<Standard,Integer>{

   // void save();
}
