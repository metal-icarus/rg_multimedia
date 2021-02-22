package com.rgmultimedia.challenge.repository;

import com.rgmultimedia.challenge.model.MediaContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MultimediaRepository extends JpaRepository {

    @Transactional
    MediaContent findTotalPlayAmountById(int id);


    @Query(value = "SELECT * FROM media_player mp " +
            "JOIN media_content mc ON mc.player_id = mp.id " +
            "WHERE mp.id = ?1 AND mc.id = ?2", nativeQuery=true)
    @Transactional
    MediaContent findTotalPlayAmountByIdAndByPlayer(@Param("file_id") int fileId, @Param("player_id") int playId);

}
