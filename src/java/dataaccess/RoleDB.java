package dataaccess;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import models.Role;

public class RoleDB 
{
    public List<Role> getAll() throws Exception
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            Query query = em.createNamedQuery("Role.findAll");
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
