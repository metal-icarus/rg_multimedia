package com.rgmultimedia.challenge.service;

import com.rgmultimedia.challenge.model.MediaContent;
import com.rgmultimedia.challenge.repository.MultimediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MultimediaServiceImpl implements MultimediaService{

    @Autowired
    private MultimediaRepository multimediaRepository;


    @Override
    public MediaContent findTotalPlayAmountById(int id) {
        return multimediaRepository.findTotalPlayAmountById(id);
    }

    @Override
    public MediaContent getTotalPlayAmountByIdAndByPlayer(int fileId, int playerId) {
        return multimediaRepository.findTotalPlayAmountByIdAndByPlayer(fileId, playerId);
    }
}
