# ServletProjectV1

Telecharger apache-tomcat-7.0.91

Telecharger jdk1.8.0_144

Récuperer le WAR du projet en exécutant la commande suivante dans un invité de commande :

mkdir C:\ServletProject cd C:\ServletProject

mvn scm:checkout -DconnectionUrl=scm:git:https://github.com/maxime20091996/ServletProjectV1

Aller dans target\checkout\ServletProject

mvn install

Deposer le fichier ServletProject.war dans le dossier webapps du serveur Tomcat

Dans le dossier bin du serveur Tomcat lancer le startup.bat

Dans un navigateur web saisir l'adresse suivante : http://localhost:8080/ServletProject/Accueil

Listes des méthodes HTTPRequest : 

Session

Contexte

Local Port

Local addr.

Remote Port

Cookies

Protocol

Remote User

Server name

Reader

Les réponses des méthodes sont affichées dans la console 

