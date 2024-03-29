package com.stackroute.muzix.controllers;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.service.TrackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/v1")
public class TrackController {


   private TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }


    @PostMapping("track")
    public ResponseEntity<?> saveTrack( Track track){

        ResponseEntity responseEntity;

        try{
            trackService.saveTrack(track);
            responseEntity = new ResponseEntity<String>("Succesfully saved", HttpStatus.CREATED);


        }catch(Exception e){
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return  responseEntity;

    }

    @GetMapping("track")
    public  ResponseEntity<?> getallTracks(){
        return new ResponseEntity<List<Track>>(trackService.getAllTracks(),HttpStatus.OK);
    }

    @DeleteMapping("track/{id}")
    public 	ResponseEntity<?> delete(@PathVariable long id){

        ResponseEntity responseEntity;

        try{
           int result =  trackService.deleteTrack(id);
            System.out.println(result);
            if(result == 1){
                responseEntity = new ResponseEntity<String>("Succesfully deleted", HttpStatus.CREATED);

            }else{
                responseEntity = new ResponseEntity<String>("Something went wrong", HttpStatus.CONFLICT);

            }


        }catch(Exception e){
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);

        }

        return  responseEntity;

    }

    @PutMapping("track")
    public ResponseEntity<?> updateTrack( Track track){

        ResponseEntity responseEntity;

        try{
            trackService.saveTrack(track);
            responseEntity = new ResponseEntity<String>("Succesfully updated", HttpStatus.CREATED);


        }catch(Exception e){
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return  responseEntity;

    }

}
