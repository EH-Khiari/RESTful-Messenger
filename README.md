# RESTful-Messenger
My first RESTful app.

#Implementation Architecutre
This project is created using the latest Jave EE Eclipse Mars IDE. A Maven project was used in order to facilitate the task of including the necessary dependancies, namely the 'Jersey' dependancies for taking care of the RESTful component of the project (executing HTTP commands, taking care of path parameters, returning XML and/or JSON responses), and the 'AWS-Java-SDK' to help deploy the application on an AWS instance. The eclipse AWS toolkit is also needed for deployment. The following diagram provides an illustration.

#Use cases

#Deployment
Luckily for me, as this is  my first time to a) create a RESTful API and b) use AWS, eclipse makes the process of deploying on an EC2 instance easy.

1) I had to connct to my newly created AWS account. To do so, I went to the AWS toolkit tab in the 'Prefrences' window, entered my 'Access Key ID' and 'Secret Access Key'. To be able to launch an EC2 instance, I also had to type in my 'AWS Account Number' and provide the paths to the certificate and private key files. 
https://cloud.githubusercontent.com/assets/5067413/9430691/38b365ba-49cd-11e5-893c-4834d758b749.jpg
