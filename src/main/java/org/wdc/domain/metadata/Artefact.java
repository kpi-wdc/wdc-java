package org.wdc.domain.metadata;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "metadata", name = "artefact")
public class Artefact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artefact_id")
    private int artefactId;

    @Column(name = "artefact_schema")
    private String artefactSchema;

    @Column(name = "artefact_table")
    private String artefactTable;

    @Column(name = "key")
    private String key;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.artefact")
    private Set<ArtefactDef> artefactDefs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.artefact")
    private Set<ArtefactMetadata> artefactMetadatas = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.artefact")
    private Set<Association> associations = new HashSet<>(0);

    public Artefact() { }

    public Artefact(String key) {
        this.key = key;
    }

    public Artefact(String key, String artefactSchema, String artefactTable) {
        this.key = key;
        this.artefactSchema = artefactSchema;
        this.artefactTable = artefactTable;
    }

    public int getArtefactId() {
        return artefactId;
    }

    public void setArtefactId(int artefactId) {
        this.artefactId = artefactId;
    }

    public String getArtefactSchema() {
        return artefactSchema;
    }

    public void setArtefactSchema(String artefactSchema) {
        this.artefactSchema = artefactSchema;
    }

    public String getArtefactTable() {
        return artefactTable;
    }

    public void setArtefactTable(String artefactTable) {
        this.artefactTable = artefactTable;
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

    public Set<Association> getAssociations() {
        return associations;
    }

    public void setAssociations(Set<Association> associations) {
        this.associations = associations;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artefact artefact = (Artefact) o;

        if (key == null) return false;
        return key.equals(artefact.key);
    }

    @Override
    public int hashCode() {
        int result = artefactId;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Artefact{" +
                "artefactId=" + artefactId +
                ", artefactSchema='" + artefactSchema + '\'' +
                ", artefactTable='" + artefactTable + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
