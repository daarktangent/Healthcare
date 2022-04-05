package com.healthcare.healtcare.service;

import com.healthcare.healtcare.dao.BlockDao;
import com.healthcare.healtcare.dao.SampleDao;
import com.healthcare.healtcare.model.Block;
import com.healthcare.healtcare.model.Employee;
import com.healthcare.healtcare.model.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrossingServiceImpl implements  GrossingService{
    @Autowired
    private BlockDao blockDao;


    //getting all block request
    @Override
    public List<Block> getBlockRequest() {
        return this.blockDao.findAll();
    }

    // getting specific block
    @Override
    public Block getBlock(Integer bId) {
        Block one= blockDao.getBybId(bId);
        return one;
    }

    // adding one block record
    @Override
    public Block addBlock(Block block) {
       blockDao.save(block);
       return block;
    }
    //updating block record
    @Override
    public Block updateBlock(Block block) {
        blockDao.save(block);
        return block;
    }
 //deleting block
    @Override
    public void deleteBlock(long bId) {
        Block one = blockDao.getOne((int) bId);
        blockDao.delete(one);
    }


}
