package DAO;

import Pojo.Attendance;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class AttendanceDAO {
    private final SessionFactory sf = AttendanceUtil.getSessionFactory();
    
    public List<Attendance> findAll()
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().getTransaction().begin();
            return sf.getCurrentSession().createCriteria(Attendance.class).list();
        }
        catch(HibernateException e)
        {
            return null;
        }
    }
    
    public Attendance find(int id)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().beginTransaction();
            return (Attendance) sf.getCurrentSession().get(Attendance.class, id);
        }
        catch (HibernateException e)
        {
            return null;
        }
    }
    
    public boolean save(Attendance att)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
            {
                sf.getCurrentSession().beginTransaction();
            }
            sf.getCurrentSession().save(att);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        }
        catch (HibernateException e)
        {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
}
