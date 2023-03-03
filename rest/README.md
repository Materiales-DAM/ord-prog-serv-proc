# Ejercicio REST (4 puntos)

Consiste en implementar un servicio REST que permita gestionar una base de datos de películas y sus actores.

## Configuración

Añade todo lo necesario para que cuando arranque el servicio arranquen los controladores `FilmController` y `ActorController`

## DTO

Implementa los DTO y sus métodos de mapeo

## Endpoints

- Listado de películas
  - Incluye parámetro opcional para filtrar las películas por género
- Añadir un actor a una película 
- Eliminar un actor de una película

Los endpoint deben lanzar los errores que correspondan a cada situación

## Datos precargados

Cada vez que el servicio arranque tendrá los siguientes datos precargados:
- Una película con filmId 1 y un actor asociado a la misma.
- Una película con filmId 2 y otro actor asociado a la misma.

Estos datos nos sirven para comprobar los endpoints que se piden.

## Calificación del ejercicio

El ejercicio puntuará cero puntos en los siguientes casos:
- Si no compila
- Si no arranca
- Si no funciona ningún endpoint
