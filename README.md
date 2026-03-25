# AREP-MATH-SERVICE
### Creamos el scaffolding basico con ayuda de spring initlzr
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

### Creamos las dos instancias en aws 
![alt text](image-9.png)
![alt text](image-10.png)


