package com.wrf.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.wrf.mall.mbg.mapper.PmsBrandMapper;
import com.wrf.mall.mbg.model.PmsBrand;
import com.wrf.mall.mbg.model.PmsBrandExample;
import com.wrf.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mall
 * @description: PmsBrandService实现
 * @author: WRF
 * @create: 2022-06-09 18:00
 **/
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    private final PmsBrandMapper brandMapper;

    public PmsBrandServiceImpl(PmsBrandMapper brandMapper) {
        this.brandMapper = brandMapper;
    }

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}