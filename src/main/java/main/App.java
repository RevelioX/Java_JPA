package main;

import Empresa.entities.Cliente;
import Empresa.entities.Producto;
import Empresa.entities.Venta;
import Empresa.implementations.ClienteRepositoryImpl;
import Empresa.implementations.ProductoRepositoryImpl;
import Empresa.implementations.VentaRepositoryImpl;
import Empresa.interfaces.ClienteRepository;
import Empresa.interfaces.ProductoRepository;
import Empresa.interfaces.VentaRepository;

import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class App {
    public static <Clientes> void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepositoryImpl();
        VentaRepository ventaRepository = new VentaRepositoryImpl();
        ProductoRepository productoRepository = new ProductoRepositoryImpl();


        Cliente Mariano = clienteRepository.findBy((long)2);

        Producto Luciana = productoRepository.findBy((long)12);
        Producto zapallino = productoRepository.findBy((long)2);

        Venta venta1 = new Venta(Mariano);
        venta1.añadirProducto(Luciana);
        venta1.añadirProducto(zapallino);

        ventaRepository.add(venta1);
    }
}
