
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Time;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorgebavaresco@ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
public class TesteListarTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PW-2020-2-ModelPU");
        EntityManager em = emf.createEntityManager();
        List<Time> lista = em.createQuery("from Time where dataFundacao = '15/09/1903'").getResultList();
        for (Time e : lista){
            System.out.println("ID: " + e.getId() + " Nome: " + e.getNome() );
        }
        
        

        em.close();
        emf.close();
        
        
        
    }

}
