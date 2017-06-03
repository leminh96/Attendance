package DAO;

import Pojo.AttendanceId;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class AttendanceIDDAO {
    private final SessionFactory sf = AttendanceUtil.getSessionFactory();
    
    public List<AttendanceId> findAll()
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().getTransaction().begin();
            return sf.getCurrentSession().createCriteria(AttendanceId.class).list();
        }
        catch(HibernateException e)
        {
            return null;
        }
    }
    
    public AttendanceId find(int id)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().beginTransaction();
            return (AttendanceId) sf.getCurrentSession().get(AttendanceId.class, id);
        }
        catch (HibernateException e)
        {
            return null;
        }
    }
    
}
