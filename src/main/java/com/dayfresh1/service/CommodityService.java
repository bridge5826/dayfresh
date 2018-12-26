package com.dayfresh1.service;

import com.dayfresh1.mapper.CommodityMapper;
import com.dayfresh1.pojo.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {

    @Autowired
    CommodityMapper commodityMapper;

    public List<Commodity> selectAll(String type) {
        return commodityMapper.selectAll(type);
    }

}
