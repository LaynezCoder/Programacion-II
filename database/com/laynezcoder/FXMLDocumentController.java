/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Laynecito
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TableColumn<Producto, Integer> colId;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, String> colProveedor;

    @FXML
    private TableColumn<Producto, String> colCategoria;

    @FXML
    private TableView table;

    private ObservableList<Producto> listProducts;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadTable();
    }

    @FXML
    private void insert() {
        setProducts(new Producto("222", "Mirinda", 5, "Mirinda de naranja", 1, 1));
        setProducts(new Producto("333", "Grapette", 5, "Grapette", 1, 1));
        setProducts(new Producto("444", "7up", 5, "7up", 1, 1));
        
        loadTable();
    }

    @FXML
    private void loadData() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colProveedor.setCellValueFactory(new PropertyValueFactory<>("proveedor"));
        colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
    }

    private void loadTable() {
        loadData();
        ArrayList<Producto> list = new ArrayList<>();

        try {
            String sql = "SELECT I.id, I.nombre, C.nombre AS categoria, P.nombre AS proveedor FROM Producto AS I JOIN Proveedor AS P ON P.id JOIN Categoria AS C ON C.id;";
            PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Producto producto = new Producto();
                producto.setId(resultSet.getInt("id"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setProveedor(resultSet.getString("proveedor"));
                producto.setCategoria(resultSet.getString("categoria"));
                list.add(producto);
            }

            listProducts = FXCollections.observableArrayList(list);
            table.setItems(listProducts);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setProducts(Producto producto) {
        try {
            String sql = "INSERT INTO Producto (nombre, codigoBarras, precio, descripcion, idProveedor, idCategoria) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
            preparedStatement.setString(1, producto.getNombre());
            preparedStatement.setString(2, producto.getBarcode());
            preparedStatement.setDouble(3, producto.getPrecio());
            preparedStatement.setString(4, producto.getDescripcion());
            preparedStatement.setInt(5, producto.getIdProveedor());
            preparedStatement.setInt(6, producto.getIdCategoria());
            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
