# Detector Gen Mutante 


Código realizado en Java Spring Boot y Angular 7 por Lucas Lattuca

## Funcionalidades

  - Se ingresan las cadenas de adn y el nombre del individuo 
  - Listado con los genes ingresados
  
![menu de navegacion](https://github.com/lukalpda/GenMutante-Meli/blob/master/Gen-Back/src/main/resources/static/menu.png)
![registros](https://github.com/lukalpda/GenMutante-Meli/blob/master/Gen-Back/src/main/resources/static/registros.png)
![envio de datos](https://github.com/lukalpda/GenMutante-Meli/blob/master/Gen-Back/src/main/resources/static/envio%20de%20datos.png)


### Desarrollo

El programa se desarrolló con las siguientes herramientas:

* [Angular] - Framework en el cual se trabaja el Frontend (HTML, Typescript, Css)
* [Spring Boot] - Framework en el cual se trabaja el backend (Java)
* [MySQL] - Motor de Base de Datos


### Installation

Dillinger requires [Node.js](https://nodejs.org/) v4+ to run.

Install the dependencies and devDependencies and start the server.

```sh
$ cd dillinger
$ npm install -d
$ node app
```

For production environments...

```sh
$ npm install --production
$ NODE_ENV=production node app
```

#### Building for source
For production release:
```sh
$ gulp build --prod
```
Generating pre-built zip archives for distribution:
```sh
$ gulp build dist --prod
```
### Docker
Dillinger is very easy to install and deploy in a Docker container.

By default, the Docker will expose port 8080, so change this within the Dockerfile if necessary. When ready, simply use the Dockerfile to build the image.

```sh
cd dillinger
docker build -t joemccann/dillinger:${package.json.version} .
```
This will create the dillinger image and pull in the necessary dependencies. Be sure to swap out `${package.json.version}` with the actual version of Dillinger.

Once done, run the Docker image and map the port to whatever you wish on your host. In this example, we simply map port 8000 of the host to port 8080 of the Docker (or whatever port was exposed in the Dockerfile):

```sh
docker run -d -p 8000:8080 --restart="always" <youruser>/dillinger:${package.json.version}
```

Verify the deployment by navigating to your server address in your preferred browser.

```sh
127.0.0.1:8000
```

#### Kubernetes + Google Cloud

See [KUBERNETES.md](https://github.com/joemccann/dillinger/blob/master/KUBERNETES.md)

## Errores
 * La grilla presenta un error, el ultimo campo no se envia al formulario
 * Tampoco se convierte a mayúsculas, esto es un indicador de que no se enviaría para ser procesada
![error en grilla](https://github.com/lukalpda/GenMutante-Meli/blob/master/Gen-Back/src/main/resources/static/error%20en%20grilla.png)





