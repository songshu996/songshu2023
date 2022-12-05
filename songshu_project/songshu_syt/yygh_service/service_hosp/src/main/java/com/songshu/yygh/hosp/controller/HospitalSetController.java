package com.songshu.yygh.hosp.controller;

import com.songshu.yygh.hosp.service.HospitalSetService;
import com.songshu.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;

    /**
     * 查询所有医院的信息
     * @return
     */
    @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet(){
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }


    @DeleteMapping("{id}")
    public Boolean removeHospSet(@PathVariable Long id){
        boolean removeFlag = hospitalSetService.removeById(id);
        return removeFlag;
    }


}
