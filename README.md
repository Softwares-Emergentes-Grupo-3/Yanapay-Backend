# Yanapay backend: IoT and Machine learning system for greenhouses

Este proyecto despliega una aplicación backend Java (Spring Boot) junto con sus servicios dependientes: **PostgreSQL** y **MongoDB**, utilizando Docker y Docker Compose.

## 📦 Estructura de servicios

| Servicio | Puerto expuesto | Descripción                                                         |
|---------|------------|---------------------------------------------------------------------|
| yanapay | 8080       | Aplicación backend desarrollada en Java con Spring Boot.           |
| postgres | 5432       | Base de datos relacional PostgreSQL para almacenamiento estructurado. |
| mongo   | 27017      | Base de datos NoSQL MongoDB para almacenamiento flexible de documentos. |

## 🔧 Variables de entorno usadas

Estas variables son inyectadas automáticamente por Docker Compose al contenedor `yanapay`.

| Variable                   | Valor por defecto    | Descripción                            |
|---------------------------|----------------------|----------------------------------------|
| `SPRING_DATASOURCE_URL`   | `jdbc:postgresql://postgres:5432/yanapay` | URL de conexión a PostgreSQL          |
| `SPRING_DATASOURCE_USERNAME` | `postgres`         | Usuario de base de datos               |
| `SPRING_DATASOURCE_PASSWORD` | `admin`            | Contraseña de base de datos            |
| `SPRING_DATA_MONGODB_URI` | `mongodb://mongo:27017/Yanapay` | URL de conexión a MongoDB             |

## 🛠️ Pasos para levantar el servicio

```bash
git clone https://github.com/Softwares-Emergentes-Grupo-3/Yanapay-Backend
cd Yanapay-Backend
docker-compose up --build
```

