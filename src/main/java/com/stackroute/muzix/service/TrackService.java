package com.stackroute.muzix.service;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.exception.TrackAlreadyExistsException;
import com.stackroute.muzix.exception.TrackNotFoundException;

import java.util.List;

public interface TrackService {

     Track saveTrack(Track track) throws TrackAlreadyExistsException;

     List<Track>getAllTracks() throws TrackNotFoundException;

     int deleteTrack(long id);

     Track getTrackById(int id);

     List<Track> getTrackbyName(String name);

      Track UpdateTrack(int id, Track track)throws TrackNotFoundException;
}
