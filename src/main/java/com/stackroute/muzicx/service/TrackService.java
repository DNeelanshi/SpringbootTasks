package com.stackroute.muzicx.service;

import com.stackroute.muzicx.domain.Track;
import com.stackroute.muzicx.exception.TrackAlreadyExistsException;
import com.stackroute.muzicx.exception.TrackNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TrackService {

     Track saveTrack(Track track) throws TrackAlreadyExistsException;

     List<Track>getAllTracks() throws TrackNotFoundException;

     int deleteTrack(long id);

     Track getTrackById(int id) throws TrackNotFoundException;

    void getTopTracks();

     Track UpdateTrack(int id, Track track)throws TrackNotFoundException;


}
