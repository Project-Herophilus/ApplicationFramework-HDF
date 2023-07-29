package io.connectedhelth.datacrawler.datawatcher.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "platformsettings")
public class PlatformSettingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "platformsettingsid", nullable = false)
    private long platformSettingsId;
    @Basic
    @Column(name = "app", nullable = true, length = 35)
    private String app;
    @Basic
    @Column(name = "organization", nullable = true, length = 35)
    private String organization;
    @Basic
    @Column(name = "datatype", nullable = true, length = 20)
    private String datatype;
    @Basic
    @Column(name = "encrypt", nullable = true, length = 1)
    private Boolean encrypt;
    @Basic
    @Column(name = "remotecomponent", nullable = true, length = 99)
    private String remotecomponent;
    @Basic
    @Column(name = "intgrtntype", nullable = true, length = 25)
    private String intgrtntype;
    @Basic
    @Column(name = "intgrtnlocation", nullable = true, length = 129)
    private String intgrtnlocation;
    @Basic
    @Column(name = "intgrtnuid", nullable = true, length = 45)
    private String intgrtnuid;
    @Basic
    @Column(name = "intgrtpwd", nullable = true, length = 356)
    private String intgrtnpwd;
    @Basic
    @Column(name = "intgrtnport", nullable = true, length = 45)
    private long intgrtnport;

}
