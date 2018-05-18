package view;

import org.hibernate.Session;
import controller.HibernateUtil;
import model.Alunos;

public class App 
{
    public static void main( String[] args )
    {
        Alunos alunos = new Alunos();
        alunos.setNome("Jeff");
        alunos.setEndereço("Av. Aguia de Haia");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(alunos);
        session.getTransaction().commit();
    }
}
