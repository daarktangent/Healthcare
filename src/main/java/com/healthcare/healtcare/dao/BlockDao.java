package com.healthcare.healtcare.dao;

import com.healthcare.healtcare.model.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockDao extends JpaRepository<Block,Integer> {
    Block getBybId(Integer bId);
}
