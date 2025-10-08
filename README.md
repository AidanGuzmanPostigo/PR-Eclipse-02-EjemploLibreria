# Actividad P1 Tema 2 - Entorno de Desarrollo
---
## Agregar una librería externa
---
## 1. ¿Qué pasaría si exporto el proyecto a un .zip y se lo paso a un amigo o me lo llevo al ordenador de casa? ¿Funcionaría? Razona la respuesta.
Funcionaría siempre y cuando se descomprima el archivo y se disponga del JRE (en caso de Java), aún así es importante aclarar que para que funcione correctamente es necesario que el archivo .zip contenga los archivos ocultos del proyecto, en caso de no ser así ocurriran errores a la hora de importar el proyecto y se tendrán que volver a configurar las librerías externas. 

## 2. ¿Qué pasaría si eliminas el archivo .jar de la carpeta lib? (puedes moverla a otro directorio para probarlo) ¿Qué ha pasado y por qué?
Saltan errores cuando se referencia a la librería elminada y no se puede ejecutar, esto ocurre ya que Eclipse no encuentra a la clase que está siendo referenciada en el código.

## 3. Y si agrego la librería con Add External JARs.... ¿Observas alguna diferencia en la configuración del Build Path? ¿Crees que si lo exporto a .zip y se lo paso a un compañero le funcionaría?
Una de las principales diferencias es el uso de las rutas, si usamos esta opción, al exportar el proyecto a otro equipo no será posible ejecutar el .jar Eclipse no sería capaz de localizar la librería referenciada, lo que causaría errores de ejecución.

## 4. ¿Por qué no es recomendable usar Add External JARs… en proyectos que vas a compartir?
Porque luego el IDE no sería capaz de localizar la librería debido a que es una ruta absoluta. 
