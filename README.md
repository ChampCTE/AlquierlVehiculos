# Aplicación de Gestión de Flotas y Ejemplos de Alquiler (Java)

## Descripción del proyecto

Esta aplicación que diseñe para mis estudios con **Java** permite gestionar una flota de vehículos y mostrar un ejemplo completo de creación de clientes, vehículos y contratos de alquiler (correspondiente a la práctica AA1).

La aplicación ofrece un menú interactivo donde el usuario puede:

1. **Añadir vehículos a una flota**
2. **Mostrar los vehículos almacenados**
3. **Eliminar vehículos por matrícula**
4. **Ejecutar un ejemplo completo de alquileres** (vehículos, clientes y contratos)

El propósito del proyecto es reforzar el trabajo con:

* Programación orientada a objetos
* Listas y colecciones (`ArrayList`)
* Menús interactivos
* Manejo de fechas (`LocalDate`)
* Lógica de negocio aplicada a alquiler de vehículos

---

## Tecnologías utilizadas

* Java 8+
* Clases personalizadas: `Vehiculo`, `Coche`, `Moto`, `Camion`, `Cliente`, `ContratoAlquiler`, `Flota`
* Uso de colecciones dinámicas (`ArrayList`)
* API de fechas: `java.time.LocalDate`
* Entrada por teclado mediante `Scanner`

---

## Cómo compilar y ejecutar

### Compilar:

```
javac AA2_AlquilerVehiculos.java
```

*(Si usas paquetes o varias clases, compila todo el directorio)*

### ▶ Ejecutar:

```
java AA2_AlquilerVehiculos
```

---

## Notas importantes

* El sistema de flotas depende totalmente de la clase `Flota` y su estructura interna (`ArrayList` probablemente estática o singleton).
* Para evitar errores de *salto de línea* en `Scanner`, asegúrate de no mezclar `nextInt()` con `nextLine()` sin consumir buffer.
* La clase principal sigue un patrón modular fácil de extender (por ejemplo, añadiendo persistencia o más operaciones).

---

## ✒ Autores

**Cèlia Trullà Estruch para la Universidad Oberta de Catalunya y Jesuïtes Educació.**
