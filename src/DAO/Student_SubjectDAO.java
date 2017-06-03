package DAO;

import Pojo.SubjectUser;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class Student_SubjectDAO {
    private final SessionFactory sf = AttendanceUtil.getSessionFactory();
    
    public List<SubjectUser> findAll()
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().getTransaction().begin();
            return sf.getCurrentSession().createCriteria(SubjectUser.class).list();
        }
        catch(HibernateException e)
        {
            return null;
        }
    }
    
    public SubjectUser find(int id)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
                sf.getCurrentSession().beginTransaction();
            return (SubjectUser) sf.getCurrentSession().get(SubjectUser.class, id);
        }
        catch (HibernateException e)
        {
            return null;
        }
    }
    
    public boolean save(SubjectUser S_U)
    {
        try
        {
            if (!sf.getCurrentSession().getTransaction().isActive())
            {
                sf.getCurrentSession().beginTransaction();
            }
            sf.getCurrentSession().save(S_U);
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
