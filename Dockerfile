# FROM specified which image i want to download
FROM camunda/camunda-bpm-platform:latest

#Author of the Docker File
LABEL "Maintainer"="Solutionbto"

# Copy war in folder for deploy
COPY target/my-camunda.war /camunda/webapps/