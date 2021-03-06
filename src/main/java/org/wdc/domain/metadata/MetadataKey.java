package org.wdc.domain.metadata;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "metadata", name = "metadatakey")
public class MetadataKey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "metadatakey_id")
    private int metadataKeyId;

    @Column(name = "key")
    private String key;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.metadataKey")
    private Set<ArtefactDef> artefactDefs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.metadataKey")
    private Set<ArtefactMetadata> artefactMetadatas = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.metadataKey")
    private Set<MetadataKeyDef> metadataKeyDefs = new HashSet<>(0);

    public MetadataKey() { }

    public MetadataKey(String key) {
        this.key = key;
    }

    public int getMetadataKeyId() {
        return metadataKeyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Set<ArtefactDef> getArtefactDefs() {
        return artefactDefs;
    }

    public void setArtefactDefs(Set<ArtefactDef> artefactDefs) {
        this.artefactDefs = artefactDefs;
    }

    public Set<ArtefactMetadata> getArtefactMetadatas() {
        return artefactMetadatas;
    }

    public void setArtefactMetadatas(Set<ArtefactMetadata> artefactMetadatas) {
        this.artefactMetadatas = artefactMetadatas;
    }

    public Set<MetadataKeyDef> getMetadataKeyDefs() {
        return metadataKeyDefs;
    }

    public void setMetadataKeyDefs(Set<MetadataKeyDef> metadataKeyDefs) {
        this.metadataKeyDefs = metadataKeyDefs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataKey that = (MetadataKey) o;

        if (key == null) return false;
        return key.equals(that.key);
    }

    @Override
    public int hashCode() {
        int result = metadataKeyId;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MetadataKey{" +
                "metadataKeyId=" + metadataKeyId +
                ", key='" + key + '\'' +
                '}';
    }
}
