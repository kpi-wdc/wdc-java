package org.wdc.dao.metadata.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.wdc.dao.impl.HibernateDao;
import org.wdc.dao.metadata.ArtefactDao;
import org.wdc.domain.metadata.Artefact;

@Repository("artefactDao")
public class ArtefactDaoImpl extends HibernateDao<Artefact, Integer>
                             implements ArtefactDao {
    @Override
    public Artefact findByKey(String key) {
        return (Artefact) currentSession().
                createCriteria(Artefact.class).
                add(Restrictions.eq("key", key)).
                uniqueResult();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/persistence-config.xml");

        ArtefactDao artefactDao = (ArtefactDao) ctx.getBean("artefactDao");

        System.out.println(artefactDao.findByKey("key1"));
    }
}
