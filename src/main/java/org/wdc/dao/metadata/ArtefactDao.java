package org.wdc.dao.metadata;

import org.wdc.dao.GenericDao;
import org.wdc.domain.metadata.Artefact;

public interface ArtefactDao extends GenericDao<Artefact, Integer> {
    public Artefact findByKey(String key);
}
