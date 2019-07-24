package com.stackroute.muzix.repository;

import com.stackroute.muzix.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {

    @Query(value = "SELECT * FROM TRACK t WHERE t.name = 'name'",nativeQuery = true)
    public List<Track> getTrackbyName(String name);
}
