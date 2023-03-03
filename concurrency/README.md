# Concurrencia

Implementa un programa que sirva para gestionar una fábrica de tornillos.

## Main

El programa debe realizar lo siguiente:
- Pide al usuario la cantidad de tornillos que se quieren fabricar. 
- Arranca dos hilos `WorkerTask` (cada uno representa a un operario de la fábrica). 
- El hilo principal debe esperar a que los dos hilos anteriores finalicen, en ese momento mostrará el mensaje “Se han fabricado los tornillos” y terminará el programa 
- Asegurate de que el código anterior no existe ninguna race condition. Utiliza bloques sincronizados para conseguirlo.

## WorkerTask

Recibe el contador con la cantidad de tornillos que quedan por fabricar.

Run:
- Mientras no se hayan fabricado todos los tornillos, el hilo fabrica un tornillo (decrementando el contador), imprimirá 
“Otro tornillo” y esperará 50 milisegundos antes de volver a fabricar otro tornillo. 
- Cuando el contador llegue a cero los hilos terminan su ejecución.
- 
## Calificación (3 puntos)

La puntuación será cero si:
- No compila
- No se crea/inicia ningún hilo
