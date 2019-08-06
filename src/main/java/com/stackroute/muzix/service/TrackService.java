package com.stackroute.muzix.service;

import com.stackroute.muzix.domain.Track;

import java.util.List;

public interface TrackService {

     Track saveTrack(Track track);

     List<Track>getAllTracks();

     int deleteTrack(long id);

     Track getTrackById(int noteId);

}
