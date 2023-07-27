package io.connectedhelth.datacrawler.dirwatcher.repository;

import io.connectedhelth.datacrawler.dirwatcher.model.PlatformSettingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PlatformSettingsRepository extends JpaRepository<PlatformSettingsEntity, Long> {

    //List<PlatformSettingsEntity> findByTelegraphicNameContainingIgnoreCase(String abaBankName);
    //@Query(value = "select distinct e.name from table e");
    //List<String> getNameDistinct();
}
