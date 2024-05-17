package com.agesadev.knhts.simple.knhts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ConceptModel {
    @Id
    private String uuid;
    private String id;
    private String conceptClass;
    private String datatype;
    private String url;
    private boolean retired;
    private String source;
    private String owner;
    private String ownerType;
    private String ownerUrl;
    private String displayName;
    private String displayLocale;
    private String version;
    private String updateComment;
    private String locale;
    private String versionCreatedBy;
    private Date versionCreatedOn;
    private boolean isLatestVersion;
    private String versionsUrl;
    private String versionUrl;
    private String type;
    private int versionedObjectId;
    private Date versionUpdatedOn;
    private String versionUpdatedBy;
    private Object latestSourceVersion;
}
