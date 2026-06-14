package com.example.mitienda;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AdminController {


    @FXML private TextField txtCodigo;
    @FXML private TextField txtNombre;
    @FXML private TextField txtPrecio;
    @FXML private TextField txtStock;
    @FXML private ComboBox<String> cmbCategoria;
    @FXML private ComboBox<String> cmbEstado;


    @FXML private TableView<Producto> tablaProductos;
    @FXML private TableColumn<Producto, String> colCodigo;
    @FXML private TableColumn<Producto, String> colNombre;
    @FXML private TableColumn<Producto, String> colCategoria;
    @FXML private TableColumn<Producto, String> colPrecio;
    @FXML private TableColumn<Producto, String> colStock;
    @FXML private TableColumn<Producto, String> colEstado;

    private ObservableList<Producto> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // combos
        cmbCategoria.setItems(FXCollections.observableArrayList(
                "Tecnología", "Ropa", "Hogar", "Alimentos"
        ));

        cmbEstado.setItems(FXCollections.observableArrayList(
                "Activo", "Inactivo"
        ));

        // columnas
        colCodigo.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getCodigo()));
        colNombre.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        colCategoria.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getCategoria()));
        colPrecio.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getPrecio()));
        colStock.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getStock()));
        colEstado.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getEstado()));

        tablaProductos.setItems(lista);
    }


    @FXML
    public void nuevo() {
        limpiar();
    }

    @FXML
    public void guardar() {

        Producto p = new Producto(
                txtCodigo.getText(),
                txtNombre.getText(),
                cmbCategoria.getValue(),
                txtPrecio.getText(),
                txtStock.getText(),
                cmbEstado.getValue()
        );

        lista.add(p);
        limpiar();
    }


    @FXML
    public void actualizar() {
        Producto seleccionado = tablaProductos.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            seleccionado.setCodigo(txtCodigo.getText());
            seleccionado.setNombre(txtNombre.getText());
            seleccionado.setCategoria(cmbCategoria.getValue());
            seleccionado.setPrecio(txtPrecio.getText());
            seleccionado.setStock(txtStock.getText());
            seleccionado.setEstado(cmbEstado.getValue());

            tablaProductos.refresh();
        }
    }

    @FXML
    public void eliminar() {
        Producto seleccionado = tablaProductos.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            lista.remove(seleccionado);
        }
    }

    @FXML
    public void limpiar() {
        txtCodigo.clear();
        txtNombre.clear();
        txtPrecio.clear();
        txtStock.clear();

        cmbCategoria.setValue(null);
        cmbEstado.setValue(null);
    }


    @FXML
    public void seleccionar() {
        Producto p = tablaProductos.getSelectionModel().getSelectedItem();

        if (p != null) {
            txtCodigo.setText(p.getCodigo());
            txtNombre.setText(p.getNombre());
            txtPrecio.setText(p.getPrecio());
            txtStock.setText(p.getStock());
            cmbCategoria.setValue(p.getCategoria());
            cmbEstado.setValue(p.getEstado());
        }
    }
}