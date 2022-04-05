package com.healthcare.healtcare.controller;


import com.healthcare.healtcare.model.Block;
import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.service.EmployeeService;
import com.healthcare.healtcare.service.GrossingService;
import com.healthcare.healtcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grossing")
public class GrossingController {
    @Autowired
    private GrossingService grossingService;

    //getting information of all block
    @GetMapping(path="/getall")
    public List<Block> getBlockRequest()
    {
        return this.grossingService.getBlockRequest();
    }
    //searching an employee using bid
    @GetMapping("/{bId}")
    public Block  getBlock(@PathVariable Integer bId)
    {
        return this.grossingService.getBlock(bId);
    }



    //Adding block
    @PostMapping( "/add")
    public Block addBlock(@RequestBody Block block)
    {

        return this.grossingService.addBlock(block);
    }
    //updating block record
    @PutMapping("/update")
    public Block updateBlock(@RequestBody Block block)
    {
        return this.grossingService.updateBlock(block);
    }
    //Deleting an block record
    @DeleteMapping("/delete/{bId}")
    public ResponseEntity<HttpStatus> deleteBlock(@PathVariable String bId)
    {
        try{
            this.grossingService.deleteBlock(Long.parseLong(bId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    }


