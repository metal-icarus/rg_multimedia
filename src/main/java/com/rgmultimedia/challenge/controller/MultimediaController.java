package com.rgmultimedia.challenge.controller;

import com.rgmultimedia.challenge.model.MediaContent;
import com.rgmultimedia.challenge.service.MultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultimediaController {

    @Autowired
    private MultimediaService multimediaService;


    @GetMapping(value="/multimedia/{id}")
    public ResponseEntity<?> getMultimediaAmount(@PathVariable int id){
        MediaContent mediaContent = multimediaService.findTotalPlayAmountById(id);

        return new ResponseEntity<>(mediaContent, HttpStatus.OK);
    }

    @GetMapping (value="/players/{idPlayer}/multimedia/{idMedia}")
    public ResponseEntity<?> getMultimediaAmountByPlayer(@PathVariable int mediaId, @PathVariable int playerId){
        MediaContent mediaContent = multimediaService.getTotalPlayAmountByIdAndByPlayer(mediaId,playerId);

        return new ResponseEntity<>(mediaContent, HttpStatus.OK);
    }


}
