package com.example.mitienda;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasenia;

    @FXML
    private ComboBox<String> CboxRol;

    @FXML
    private Label lblMensaje;

    @FXML
    private Button btnIngresar;

    @FXML
    public void initialize() {

        CboxRol.getItems().add("Administrador");
        CboxRol.getItems().add("Cajero");
        CboxRol.getItems().add("Vendedor");
    }

    @FXML
    public void ingresar() {
        String usuario = txtUsuario.getText().trim();
        String contrasenia = txtContrasenia.getText().trim();
        String rol = CboxRol.getValue();


        if (usuario.isEmpty() || contrasenia.isEmpty()) {
            lblMensaje.setText("Complete todos los campos");
            return;
        }

        if (rol == null) {
            lblMensaje.setText("Seleccione un rol");
            return;
        }

        try {
            Stage stage = (Stage) btnIngresar.getScene().getWindow();
            String rutaFxml = "";

            if (usuario.equals("admin") && contrasenia.equals("1234") && rol.equals("Administrador")) {
                rutaFxml = "Administrador.fxml";
            }
            else if (usuario.equals("cajero") && contrasenia.equals("1234") && rol.equals("Cajero")) {
                rutaFxml = "Cajero.fxml";
            }
            else if (usuario.equals("vendedor") && contrasenia.equals("1234") && rol.equals("Vendedor")) {
                rutaFxml = "Vendedor.fxml";
            }
            else {
                lblMensaje.setText("Usuario, contraseña o rol incorrectos");
                return;
            }


            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaFxml));
            Scene nuevaEscena = new Scene(loader.load());

            String css = getClass().getResource("/com/example/mitienda/styles.css").toExternalForm();
            nuevaEscena.getStylesheets().add(css);

            stage.setScene(nuevaEscena);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
            lblMensaje.setText("Error al abrir la ventana del sistema");
        }
    }
}