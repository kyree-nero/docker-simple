Simple Kubernetes

An off-shoot of docker-simple this builds off the docker-simple project and uses it in kubernetes.
It assumes you have that docker image in your local repository so if you dont have it... get it.  

1. Go to root of project
1. kubectl apply -f  
1. kubectl expose deployment/docker-simple-deployment --type="NodePort" --port 8080
1. kubectl get pods   (You will see one healthy pod)  
1. kubectl get services (You can see the port number you got here)  

	https://localhost:<whatever the port number is you see>	