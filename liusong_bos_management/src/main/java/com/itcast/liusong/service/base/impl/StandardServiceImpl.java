package com.itcast.liusong.service.base.impl;

import com.itcast.liusong.dao.base.IStandardDao;
import com.itcast.liusong.service.base.IStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by l1003 on 2018/1/6.
 */
@Service
@Transactional
public class StandardServiceImpl implements IStandardService{
    @Autowired
    private IStandardDao standardDao;
    @Override
    public void save() {
        //standardDao.save();
    }
}
