package com.project.kaviya.ServiceImpl;

import com.project.kaviya.Service.VehicalService;
import com.project.kaviya.model.Vehical;
import com.project.kaviya.repositary.VehicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicalServiceImpl implements VehicalService {

    @Autowired
    private VehicalRepository vehicalRepository;

    @Override
    public Vehical addVehical(Vehical vehical) {
        vehical.setStatus(1);
        vehicalRepository.save(vehical);
        return vehical;

    }

    @Override
    public List<Vehical> getAllVehicals() {
        return vehicalRepository.findAll();

    }

    @Override
    public List<Vehical> getActiveVehical(int status) {
        List<Vehical> vehicalList = vehicalRepository.getActiveVehical(status);
        System.out.println(vehicalList.size());
        return vehicalList;

    }
}
