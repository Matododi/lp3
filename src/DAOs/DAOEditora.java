package DAOs;


import Entidades.Editora;
import DAOs.DAOGenerico;
import static DAOs.DAOGenerico.em;
import java.util.ArrayList;
import java.util.List;

public class DAOEditora extends DAOGenerico<Editora> {

    public DAOEditora() {
        super(Editora.class);
    }

    public int autoIdEditora() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idEditora) FROM Editora e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<Editora> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Editora e WHERE e.nome LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<Editora> listById(int id) {
        return em.createQuery("SELECT e FROM Editora e WHERE e.idEditora = :id").setParameter("id", id).getResultList();
    }

    public List<Editora> listInOrderNome() {
        return em.createQuery("SELECT e FROM Editora e ORDER BY e.nome").getResultList();
    }

    public List<Editora> listInOrderId() {
        return em.createQuery("SELECT e FROM Editora e ORDER BY e.idEditora").getResultList();
    }

    public List<String> listInOrderNomeStrings(String qualOrdem) {
        List<Editora> lf;
        if (qualOrdem.equals("id")) {
            lf = listInOrderId();
        } else {
            lf = listInOrderNome();
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getIdEditora() + "-" + lf.get(i).getNome());
        }
        return ls;
    }
public static void main(String[] args) {
        DAOEditora daoEditora = new DAOEditora();
        List<Editora> listaEditora = daoEditora.list();
        for (Editora editora : listaEditora) {
            System.out.println(editora.getIdEditora() + "-" + editora.getNome());
        }
    }}
