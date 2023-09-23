package main;

import Empresa.entities.Cliente;
import Empresa.implementations.ClienteRepositoryImpl;
import Empresa.interfaces.ClienteRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class App {
    public static <Clientes> void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepositoryImpl();

        Cliente cliente1 = new Cliente("+54 9 3572 40 1327", "Mariano", "Brarda",(long)1);
        Cliente cliente2 = new Cliente("+54 9 3572 40 5566", "Roberto", "Ton",(long)2);
        Cliente cliente3 = new Cliente("+54 9 3572 40 8899", "Nier", "Arveja",(long)3);

        //clienteRepository.add(cliente1);
        //clienteRepository.add(cliente2);
        //clienteRepository.add(cliente3);


    }
}
