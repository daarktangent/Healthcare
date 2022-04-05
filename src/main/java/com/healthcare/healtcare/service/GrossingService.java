package com.healthcare.healtcare.service;

import com.healthcare.healtcare.model.Block;
import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Sample;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GrossingService {
    

    List<Block> getBlockRequest();

    Block getBlock(Integer bId);

    Block addBlock(Block block);

    Block updateBlock(Block block);

    void deleteBlock(long parseLong);
}
