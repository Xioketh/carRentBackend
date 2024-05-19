package com.project.kaviya.controller;

import com.project.kaviya.Service.VehicalService;
import com.project.kaviya.model.Vehical;
import com.project.kaviya.repositary.VehicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class VehicalController {

    @Autowired
    private VehicalRepository vehicalRepository;

    @Autowired
    private VehicalService vehicalService;

    @PostMapping("/getAllVehical")
    public List<Vehical> getAllVehicals(){
        return vehicalService.getAllVehicals();
    }

    @PostMapping("/addVehical")
    public Vehical createVehical(@RequestBody Vehical vehical){
        return vehicalService.addVehical(vehical);
    }

    @PostMapping("/getCustomVehical")
    public List<Vehical> getActiveVehical(@RequestBody Vehical vehical){
        return vehicalService.getActiveVehical(vehical.getStatus());
    }

//    @GetMapping("getVehical/{id}")
//    public ResponseEntity<vehical> getvehicalbyid(@PathVariable Long id) {
//
//        vehical vehical = vehicalRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Vehical not exist with id :" + id));
//        return ResponseEntity.ok(vehical);
//    }
//
//    // update motherboard rest api
//    @PutMapping("/getVehical/{id}")
//    public ResponseEntity<vehical> updateVehical(@PathVariable Long id, @RequestBody vehical vehicalDetails) {
//
//        vehical vehical= vehicalRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("device not exist with id :" + id));
//        vehical.setName(vehicalDetails.getName());
//        vehical.setPrice(vehicalDetails.getPrice());
//        vehical.setDetails(vehicalDetails.getDetails());
//        vehical.setImage(vehicalDetails.getImage());
//
//        vehical updateDevice = vehicalRepository.save(vehical);
//        return ResponseEntity.ok(updateDevice);
//    }
//
//
//    @PutMapping("/activeVehical/{id}")
//    public  ResponseEntity<vehical> updateActiveVehical(@PathVariable Long id , @RequestBody vehical activevehical){
//         vehical vehical = vehicalRepository.findById(id) .orElseThrow(() -> new ResourceNotFoundException(" vehical id not exist"));
//         vehical.setStates(activevehical.getStates());
//
//         vehical updateActive = vehicalRepository.save(vehical);
//         return  ResponseEntity.ok(updateActive);
//    }
//    @DeleteMapping("/{id}")
//    public String deleteVehical(@PathVariable("id")String id){
//        vehical v1 = vehicalRepository.findById(Long.valueOf(id)).get();
//        if(v1 != null){
//            vehicalRepository.deleteById(Long.valueOf(id));
//        }else{
//            System.out.println("error");
//        }
//        return "Done";
//    }
}
