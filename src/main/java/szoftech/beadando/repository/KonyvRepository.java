package szoftech.beadando.repository;

import szoftech.beadando.entity.Konyv;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class KonyvRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Konyv konyv){
        entityManager.persist(konyv);
    }

    public void delete(Konyv konyv){ entityManager.remove(konyv);}

    public Konyv findById(int id) {
        return entityManager.find(Konyv.class, id);
    }

    public List<Konyv> findAll(){
        return entityManager.createQuery("select t from "+Konyv.class.getSimpleName()+" t").getResultList();
    }
    }



