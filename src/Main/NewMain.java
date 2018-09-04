///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Main;
//
//import DAOs.DAOLivro;
//import DAOs.DAOVenda;
//import Entidades.Livro;
//import Entidades.Venda;
//import java.util.List;
//
///**
// *
// * @author a1712233
// */
//public class NewMain {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        DAOVenda daoVenda = new DAOVenda();
//        DAOLivro daoLivro = new DAOLivro();
//        
//        Livro l = daoLivro.obter(1);
//        List<Venda> ll = l.getVendaList();
//        ll.add(daoVenda.obter(1));
//        l.setVendaList(ll);
//        daoLivro.atualizar(l);
//    }
//    
//}
