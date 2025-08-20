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

<img width="1254" height="643" alt="imagen" src="https://github.com/user-attachments/assets/98fdaf98-06b3-4b8a-ac8a-1c2083da8f45" />


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
     "username": "usuario",
     "password": "contraseña"
   }
   ```
2. Si son válidas, el sistema responde con un **token JWT**.
3. Para acceder a los endpoints protegidos, incluir el token en el **header Authorization**:
   ```
   Authorization: Bearer <tu_token_aquí>
   ```

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
