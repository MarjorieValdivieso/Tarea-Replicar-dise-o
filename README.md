# MiTienda - Sistema de Gestión

Sistema de escritorio moderno para controlar productos, categorías y ventas de forma ágil y visual.

---

## Dashboard
<img width="526" height="645" alt="login" src="https://github.com/user-attachments/assets/5576f47f-d37a-4f44-b845-c4e3aac46746" />

<img width="1126" height="973" alt="dashboard" src="https://github.com/user-attachments/assets/6e96396e-1e80-4c62-891f-3a15edb3d59d" />




---

## Tecnologías
* **Java 17 / JavaFX 21:** Lógica de negocio e interfaz gráfica.
* **CSS3:** Estilos personalizados inspirados en interfaces modernas.

---

## Funcionalidades
* **Login Multirrol:** Accesos separados para Administrador, Cajero y Vendedor.
* **CRUD Completo:** Formulario para Crear, Leer, Actualizar y Eliminar productos.
* **Tabla Dinámica:** Control `TableView` adaptativo para visualizar el inventario.

---

## Estructura del Proyecto
```text
mitienda/
├── src/main/
│   ├── java/.../mitienda/
│   │   ├── HelloApplication.java  (Entrada de la app)
│   │   └── HelloController.java   (Controlador del Login)
│   └── resources/.../mitienda/
│       ├── hello-view.fxml        (Vista Login)
│       ├── Administrador.fxml     (Vista Admin)
│       └── styles.css             (Estilos CSS)
└── pom.xml                        (Dependencias Maven)
