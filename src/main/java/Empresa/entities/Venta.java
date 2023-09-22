package Empresa.entities;

import java.util.List;

public class Venta {
    private Long id;
    private Cliente cliente;
    private List<Producto> productoList;

    public Venta(Long id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public void añadirProducto(Producto producto){
        productoList.add(producto);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }
}
