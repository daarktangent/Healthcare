package com.healthcare.healtcare.controller;

import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Sample;
import com.healthcare.healtcare.service.EmployeeService;
import com.healthcare.healtcare.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Sample")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    //Getting all samples
    @GetMapping(path="/getall")
    public List<Sample> getSampleRequest()
    {
        return this.sampleService.getSampleRequest();
    }


    //getting sample by ID
    @GetMapping("/{sampleId}")
    public Sample getSample(@PathVariable Integer sampleId)
    {
        return this.sampleService.getSample(sampleId);
    }


    //Adding sample
    @PostMapping( "/add")
    public Sample addSample(@RequestBody Sample sample)
    {
        System.out.println(sample);
        return this.sampleService.addSample(sample);
    }

    //updating sample
    @PutMapping("/update")
    public Sample updateSample(@RequestBody Sample sample)
    {
        return this.sampleService.updateSample(sample);
    }




  //Deleting sample
    @DeleteMapping("/delete/{sampleId}")
    public ResponseEntity<HttpStatus> deleteSample(@PathVariable String sampleId)
    {
        try{
            this.sampleService.deleteSample(Long.parseLong(sampleId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
