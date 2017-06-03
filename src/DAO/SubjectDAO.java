package DAO;

import Pojo.Subject;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class SubjectDAO {
    
private final SessionFactory sf = AttendanceUtil.getSessionFactory();
    public List<Subject> findAll()
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().beginTransaction();
            return sf.getCurrentSession().createCriteria(Subject.class).list();
        }
        catch(HibernateException e)
        {
            return null;
        }
    }
    
    public Subject find(String id)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().beginTransaction();
            return (Subject) sf.getCurrentSession().get(Subject.class, id);
        }
        catch (HibernateException e)
        {
            return null;
        }
    }
    
    public boolean delete(Subject su)
    {
        try
        {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().delete(su);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        }
        catch (HibernateException e)
        {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    
    public boolean save(Subject su)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
            {
                sf.getCurrentSession().beginTransaction();
            }
            sf.getCurrentSession().save(su);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        }
        catch (HibernateException e)
        {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    
    public boolean update(Subject su)
    {
        try
        {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().update(su);
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

