/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.gestion_de_formations_en_ligne.repository;

import fr.utbm.gestion_de_formations_en_ligne.entity.Course;
import fr.utbm.gestion_de_formations_en_ligne.entity.Location;
import fr.utbm.gestion_de_formations_en_ligne.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Eddie
 */
public class HibernateCourseDAO {
    
    public List<Course> getAllCoursesHibernate()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Course");
        List<Course> listCourse = query.list();
        return listCourse;
    }
    
    public List<Course> getAllCoursesHibernate(String motCle)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String keyWord = "%";
        keyWord.concat(motCle).concat("%");
        Query query = session.createQuery("from Course as course where course.title like :motcle");
        query.setString(0, keyWord);
        List<Course> listCourse = query.list();
        return listCourse;
    }        
    
    public List<Course> getAllCoursesAtDateHibernate(Date date)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query query = session.createQuery("from Course as course"
                + "                        inner join CourseSession as coursesession"
                + "                        where :date <= coursesession.startDate");
        query.setDate(0, date);
        List<Course> listCourse = query.list();
        return listCourse;
    }
    
    public List<Course> getAllCoursesAtLocationHibernate(Location location)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query query = session.createQuery("from Course as course"
                + "                        inner join CourseSession as coursesession"
                + "                        inner join Location as location"
                + "                        where location.city = :ville");
        query.setString(0, location.getCity());
        List<Course> listCourse = query.list();
        return listCourse;
    }
    
}
