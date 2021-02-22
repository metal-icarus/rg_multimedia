package com.rgmultimedia.challenge.service;

import com.rgmultimedia.challenge.model.MediaContent;
import org.springframework.stereotype.Service;

@Service
public interface MultimediaService {

    MediaContent findTotalPlayAmountById(int id);

    MediaContent getTotalPlayAmountByIdAndByPlayer(int fileId, int playerId);
}
