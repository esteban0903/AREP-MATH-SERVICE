# AREP-MATH-SERVICE
## Scaffolding inicial
### Creamos el scaffolding basico con ayuda de spring initializr
![alt text](image.png)

### Copiamos el codigo base de httpConnection y lo modificamos para que reciba una URL como parametro y ejecute la funcion
![alt text](image-1.png)

### Creamos el controlador basico de proxy con la configuración de que si falla una instancia ejecute la otra (sin links de instancias ya que todavia no estan creadas)
![alt text](image-2.png)


### Creamos la logica principal del problema propuesto de catalan 
![alt text](image-4.png)
![alt text](image-3.png)

### Creamos el controlador para usar la logica de la clase creada de catalan 
![alt text](image-5.png)


### Copiamos y pegamos las clases en el catalanAux que va ser nuestro segundo servidor 
![alt text](image-6.png)


### Configuramos los puertos de los dos servidores en el application.properties para que uno abra en el puerto 8081, otro en el 8082 y el proxy en el 8080
![alt text](image-7.png)
![alt text](image-8.png)


## Probamos algun servicio para ver que funcione bien con el caso de prueba del enunciado 
![alt text](image-11.png)

## AWS instancias
### Creamos las dos instancias en aws 
![alt text](image-9.png)
![alt text](image-31.png)

### Miramos el proyecto compilado de catalan y buscamos el target el .jar
![alt text](image-12.png)

### Nos conectamos a la instancia , en este caso sera la primera catalanPrincipal 

### Mediante sftp subimos el .jar compilado del target a la instancia 
![alt text](image-13.png)

### Ahora, nos conectamos con ssh e instalamos java. Para eso miramos la documentacion dada por el profesor y lo instalamos 
![alt text](image-14.png)
![alt text](image-15.png)

### Corremos el jar que subimos anteriormente con sftp
![alt text](image-16.png)

### El servidor ya esta corriendo y la instancia tambien, pero falta permitir el puerto 8081 en las security inbounds ya que por ahi esta corriendo el jar
![alt text](image-17.png)


### Ahora probamos que el endpoint este funcionando en la instancia:
![alt text](image-18.png)

### Repetimos los mismos pasos pero para la instancia 2 (subir jar, instalar java, compilar, habilitar puerto 8082)
![alt text](image-10.png)
![alt text](image-19.png)
![alt text](image-20.png)
![alt text](image-21.png)

## Configuracion proxy y AWS
### Una vez las dos instancias funcionando y corriendo, ahora configuramos los links en el proxy controller 
![alt text](image-22.png)

### Configuramos el index html en base al dado por el profesor, cambiamos endpoints y valores de acuerdo a nuestro proxy Controller
![alt text](image-23.png)

### Corremos el back y miramos que funcione y redirija a la instancia configurada
![alt text](image-32.png) 
![alt text](image-24.png)

### Una vez funcionando, entonces repetimos el mismo proceso que hicimos con las otras dos instancias para la instancia del proxy .( Crear instancia, conectarse, subir el jar, instalar java, correr el jar, configurar security inbounds ( en este caso 8080 (proxy), 8081(catalan1), 8082(catalan2) ) y probar la url del ec2 para ver que todo funciona correctamente ) 
![alt text](image-33.png)
![alt text](image-26.png)
![alt text](image-27.png)
![alt text](image-28.png)
![alt text](image-29.png)
![alt text](image-30.png)

## Conclusiones finales: 
### Total instancias creadas:
![alt text](image-34.png)
### Arquitectura implementada:
![alt text](image-38.png)
### Pruebas en postman del servicio catalan:
![alt text](image-36.png)
### Pruebas en postman del servicio catalanaux:
![alt text](image-35.png)
### Pruebas en postman del servicio proxy:
![alt text](image-37.png)

## Todos los endpoints son GET
### Endpoints locales catalan y catalanaux (examples):
#### http://localhost:8081/catalan?value=10
#### http://localhost:8082/catalan?value=10

### Endpoints proxy (examples):
#### http://localhost:8080/
#### http://localhost:8080/proxy?value=10


### Como correr los servicios?
#### mvn spring-boot:run ( desde la raiz de cada proyecto)

## Video de funcionamiento en vivo
### El video muestra como el proxy esta desplegado en ec2 en el puerto 8080 con su index.html
### Ademas hay 2 servicios de catalan, si uno no llega a funcionar el otro responde. Estos 2 servicios estan desplegados en EC2 con un backend en java 
####  https://pruebacorreoescuelaingeduco-my.sharepoint.com/:v:/g/personal/esteban_aguilera-c_mail_escuelaing_edu_co/IQDLaVktdUrDTb-H8eHCqcTXAe_EEY1-pnCkJ4JM3mdJCR8?e=pNHE2Z

# Autor
### Esteban Aguilera Contreras
### Arquitecturas empresariales
### Escuela Colombiana de Ingeniería Julio Garavito 


