# 📚 ForoHub - API REST con Spring Boot 3

¡Bienvenido a **ForoHub**! 🎉  
Este proyecto consiste en el desarrollo de una **API REST en Java con Spring Boot 3**, cuyo objetivo es simular el funcionamiento de un foro donde los usuarios pueden **crear, consultar, actualizar y eliminar tópicos**.  

Se trata de un **Challenge Back End de Alura Latam**, orientado a comprender cómo funcionan las aplicaciones web detrás de escena, cómo se manejan los datos y cómo implementar un sistema de **autenticación y seguridad con JWT**.

---

## ✨ Funcionalidades

La API implementa operaciones CRUD sobre tópicos:

- ➕ **Crear un nuevo tópico**
- 📋 **Listar todos los tópicos creados**
- 🔍 **Consultar un tópico específico**
- ✏️ **Actualizar un tópico**
- 🗑 **Eliminar un tópico**

<img width="248" height="249" alt="imagen" src="https://github.com/user-attachments/assets/46e4e9ff-bf77-482f-8a0d-8b2388fbb50d" />



Además:

- ✅ Validaciones según reglas de negocio.  
- 🗄 Persistencia en base de datos **MySQL**.  
- 🔒 Seguridad con **Spring Security** y **JWT**.  
- 🌐 Endpoints siguiendo las mejores prácticas REST.

---

## 🛠 Tecnologías utilizadas

- **Java JDK 17+**
- **Spring Boot 3**
- **Maven 4+**
- **MySQL 8+**
- **Lombok**
- **Spring Web**
- **Spring Boot DevTools**
- **Spring Data JPA**
- **Flyway Migration**
- **Validation**
- **Spring Security**
- **JWT (Auth0 Library)**

---

## ⚙️ Configuración del proyecto

### 📌 Requisitos previos
Asegúrate de tener instalado:
- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  
- [Maven 4+](https://maven.apache.org/)  
- [MySQL 8+](https://dev.mysql.com/downloads/installer/)  
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (opcional)

### 📌 Creación del proyecto con Spring Initializr
Configuración recomendada:
- **Proyecto:** Maven - JAR  
- **Java:** 17  
- **Dependencias:**  
  - Lombok  
  - Spring Web  
  - Spring Boot DevTools  
  - Spring Data JPA  
  - Flyway Migration  
  - MySQL Driver  
  - Validation  
  - Spring Security  

---

## 🗄️ Diagrama de Base de Datos

El modelo inicial para la entidad **Tópico** incluye los siguientes campos:

- `id`
- `titulo`
- `mensaje`
- `fecha_de_creacion`
- `status`
- `autor`
- `curso`

*(Puedes extender este modelo agregando relaciones con usuarios y respuestas según evolucione el proyecto).*

---

## 🔑 Seguridad y Autenticación

El acceso a la API está restringido a **usuarios autenticados**.  
Se implementa seguridad con **Spring Security** y **JWT**.

### Proceso de autenticación:
1. Enviar credenciales de usuario a `POST http://localhost:8080/login` con un JSON:
   ```json
   {
     "nombre": "usuario",
     "contrasena": "contraseña"
   }
   ```
2. Si son válidas, el sistema responde con un **token JWT**.
Ejemplo de credenciales no validas

<img width="989" height="429" alt="imagen" src="https://github.com/user-attachments/assets/a50f96e2-c05a-48de-ba7e-2d1dca8ef018" />

Ejemplo de credenciales validas

<img width="941" height="470" alt="imagen" src="https://github.com/user-attachments/assets/e8e716f1-7bdf-4977-8705-6db29339ca65" />

4. Para acceder a los endpoints protegidos, incluir el token en el **Auth Authorization**:
   ```
   Authorization: Bearer <tu_token_aquí>
   ```
<img width="947" height="390" alt="imagen" src="https://github.com/user-attachments/assets/78d84999-5b43-4c8b-aeaf-152846acc52f" />


### Configuración clave:
- Clase `SecurityConfigurations` con `HttpSecurity`.  
- DTO para login con `@RestController` y `@PostMapping`.  
- Generación y validación de tokens en `TokenService`.  
- Filtros para validar tokens en cada solicitud.  

---

## 🚀 Ejecución del proyecto

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/foro-hub.git
   ```
2. Configura tu base de datos MySQL y actualiza `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña

   # JWT config
   jwt.secret=mi_clave_secreta
   jwt.expiration=86400000
   ```
3. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```
4. Accede a la API en:  
   ```
   http://localhost:8080
   ```

---

## 📌 Endpoints principales

- **POST** `/topicos` → Crear tópico  
- **GET** `/topicos` → Listar todos los tópicos  
- **GET** `/topicos/{id}` → Consultar tópico por ID  
- **PUT** `/topicos/{id}` → Actualizar tópico  
- **DELETE** `/topicos/{id}` → Eliminar tópico  

## PRUEBAS
Sin el Token no muestra la informacion

<img width="785" height="420" alt="imagen" src="https://github.com/user-attachments/assets/73c9bbad-76cc-464b-8c50-dc9bd41fab4a" />

Con el Token SI nuestra el contenido

<img width="934" height="481" alt="imagen" src="https://github.com/user-attachments/assets/1d1cfbda-a951-4791-847c-30882b6e8a67" />

---

## 🧑‍💻 Contribución

1. Haz un fork del proyecto  
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`)  
3. Realiza tus cambios y haz commit (`git commit -m "Agrega nueva funcionalidad"`)  
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`)  
5. Abre un Pull Request  

---

## 📜 Licencia

Este proyecto fue desarrollado por Adrian Vargas

---
