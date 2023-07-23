package io.connectedhelth.datacrawler.dirwatcher.repository;

import io.connectedhelth.datacrawler.dirwatcher.model.PlatformSettingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PlatformSettingsRepository extends JpaRepository<PlatformSettingsEntity, Long> {

    //List<PlatformSettingsEntity> findByTelegraphicNameContainingIgnoreCase(String abaBankName);

}
