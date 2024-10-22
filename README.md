# Conversor de Moneda 💱
<p align="left">
   <img src="https://img.shields.io/github/stars/AFernandzG?style=social">
   </p>
¡Bienvenido al Conversor de Moneda! Esta aplicación te permite convertir diversas monedas utilizando la API de **Exchange Rate API**. Además, guarda un historial de consultas en un archivo JSON. 📊

## Características ✨

- Conversión de monedas en tiempo real utilizando la API de Exchange Rate API.
- Validación de entradas para asegurar que los valores ingresados sean correctos.
- Manejo de errores y excepciones.
- Guardado del historial de consultas en un archivo JSON.
- Presentación de la última fecha de actualización de las tasas de cambio. 📅

## Requisitos 🛠️

- Java 11 o superior.
- Biblioteca Gson para serializar y deserializar datos JSON.

## Instalación 🚀

1. Clona este repositorio:
    ```bash
    git clone https://github.com/tu-usuario/conversor-de-moneda.git
    ```

2. Navega al directorio del proyecto:
    ```bash
    cd conversor-de-moneda
    ```

3. Asegúrate de tener la biblioteca Gson en tu proyecto. Puedes agregarlo a tu archivo `pom.xml` si usas Maven:
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.8</version>
    </dependency>
    ```

## Uso 🖥️

1. Compila el programa:
    ```bash
    javac -cp gson-2.8.8.jar:. *.java
    ```

2. Ejecuta el programa:
    ```bash
    java -cp gson-2.8.8.jar:. ConversorDeMoneda
    ```

3. Sigue las instrucciones en pantalla para seleccionar las opciones de conversión y realizar consultas.

## Funcionalidades ⚙️

### Conversión de Monedas 🌍

La aplicación soporta las siguientes conversiones:

1. USD a ARS (Pesos Argentinos)
2. USD a EUR (Euros)
3. USD a MXN (Pesos Mexicanos)
4. BRL (Reales Brasileños) a USD
5. GBP (Libras Esterlinas) a USD
6. JPY (Yen Japonés) a USD

### Validación de Entradas ✅

La aplicación utiliza la clase `ValidadorEntrada` para asegurar que las entradas sean correctas:
- `validarEntero`: Valida que la entrada sea un número entero.
- `validarDecimal`: Valida que la entrada sea un número decimal.

### Historial de Consultas 📜

Las consultas realizadas se guardan en un archivo JSON `historial.json` al salir de la aplicación.

## Contribuciones 👐

¡Las contribuciones son bienvenidas! Si deseas contribuir, por favor sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia 📄

Este proyecto está licenciado bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

