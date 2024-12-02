package org.example.demo6;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/modul")
public class ModulServelt extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try (EntityManager entityManager=MyListener.EMF.createEntityManager()){
            Integer courseId = Integer.parseInt(getInitParameter("courseId"));
            entityManager.getTransaction().begin();
            List resultList = entityManager.createQuery("select m from Modul m where m.course=:courseId").getResultList();
            entityManager.getTransaction().commit();

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
