package DAO;

import java.util.*;
import Pojo.*;
import org.hibernate.*;

public class UserDAO {
    private final SessionFactory sf = AttendanceUtil.getSessionFactory();
    public List<User> findAll()
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().getTransaction().begin();
            return sf.getCurrentSession().createCriteria(User.class).list();
        }
        catch(HibernateException e)
        {
            return null;
        }
    }
    
    public User find(String id)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().beginTransaction();
            return (User) sf.getCurrentSession().get(User.class, id);
        }
        catch (HibernateException e)
        {
            return null;
        }
    }
    
    public boolean delete(User us)
    {
        try
        {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().delete(us);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        }
        catch (HibernateException e)
        {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    
    public boolean save(User us)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().save(us);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        }
        catch (HibernateException e)
        {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    
    public boolean update(User us)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().update(us);
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
