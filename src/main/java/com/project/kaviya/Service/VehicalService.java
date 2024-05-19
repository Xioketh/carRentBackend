package com.project.kaviya.Service;

import com.project.kaviya.model.Vehical;

import java.util.List;

public interface VehicalService {

    Vehical addVehical(Vehical vehical);

    List<Vehical> getActiveVehical(int status);

    List<Vehical> getAllVehicals();
}
