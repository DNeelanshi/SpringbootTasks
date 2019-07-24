package com.stackroute.muzix.service;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

TrackRepository trackRepository;

@Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {

       Track track1 = trackRepository.save(track);
       return  track1;
    }

    @Override
    public List<Track> getAllTracks() {

    return trackRepository.findAll();
    }

    @Override
    public int deleteTrack(long id) {
        System.out.println(id);

        Long l= new Long(id);
        int i=l.intValue();
    Track track = new Track();
   try {
       trackRepository.deleteById(i);
       return 1;
   }catch (Exception e){
       System.out.println(e.getMessage());
       return 0;
   }

    }

    @Override
    public Track getTrackById(int id) {
        return null;
    }

//    @Override
//    public Track UpdateTrack(Track track) {
//        Track track1 = trackRepository.save(track);
//        return track1;
//    }
}
