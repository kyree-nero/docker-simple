This is a simple docker example of a java web project 
hosted by an alpine linux distribution

<h3>How to build it</h3>
To run it from docker...   

	1. Do a clean install from maven   
	2. Change your working directory to the projects root directory   
	3. Run    docker build -t docker-simple .   
	4. Run    docker run --name=docker-simple --publish=8080:8080 docker-simple:latest   

The project has one dynamic page and one static page you can visit to verify the project is working (see links below)
 
<h3>urls</h3>

static link <http://localhost:8080>

controller link <http://localhost:8080/content>

<h3>other docker commands</h3>

remove it  

	docker stop demo
	docker rm demo
	
There is a kubernetes variant... see the kubernetes README