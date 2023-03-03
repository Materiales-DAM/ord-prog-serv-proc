# Ejercicio Inversion of Control (IoC)

Consiste en implementar un programa que permite realizar consultas sobre los datos de una empresa.

## Componentes

- CompanyReader:
  - Dependencias:
    - ObjectMapper
    - El path del archivo con los datos de la empresa (configurado en properties)
  - Métodos:
    - readCompany: 
      - Lee un fichero con los datos de la compañía y devuelve un objeto Company
           `Company company = om.readValue(new File("path"), Company.class);`  
- CompanyApp:
  - Dependencias
    - Scanner
    - CompanyReader
  - Métodos
    - run: 
      - Carga en una variable Company los datos de la empresa usando `CompanyReader` 
      - Crea un bucle que da las siguientes opciones:
        - Mostrar datos de empresa:
          - Muestra en pantalla el CIF y el nombre de la empresa
        - Lista departamentos 
          - Hace un bucle que recorre los departamentos, mostrando el nombre de los mismos
        - Salir

## Configuración

- Configura el proyecto para que se creen todos los beans necesarios. 
- Carga el archivo de propiedades application.properties
  - De este archivo se debe cargar el path del archivo de la empresa. El valor en el properties debe ser: company.json

## Ejecución del programa

La clase main debe crear el contexto de Spring, recuperar el bean `CompanyApp` y ejecutar su método run

## Calificación (3 puntos)

El ejercicio calificará cero puntos en caso de que:
- No compile
- No se cree el contexto de Spring al ejecutar el Main
- No se ejecute nada desde el Main
