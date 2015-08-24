# RESTful-Messenger
This is my first RESTful API. It is but a simple messenger app that allows a user to post a message, update a message, delete a message and determine whether a particular message is palindromic or not.

#Implementation Architecutre
This project is created using the latest Jave EE Eclipse Mars IDE. A Maven project was used in order to facilitate the task of including the necessary dependancies, namely the 'Jersey' dependancies for taking care of the RESTful component of the project (executing HTTP commands, taking care of path parameters, returning XML and/or JSON responses), and the 'AWS-Java-SDK' to help deploy the application on an AWS instance. The eclipse AWS toolkit is also needed for deployment. The following diagram provides an illustration.
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430907/887a4a46-49d2-11e5-8454-fd29fd814ee9.jpg)

#Use cases

#Deployment
Luckily for me, as this is  my first time to, a) create a RESTful API, and, b) use AWS, eclipse makes the process of deploying on an EC2 instance simple and easy.

1) Firstly, I had to connect to my newly created AWS account. To do so, I went to the AWS toolkit tab in the 'Preferences' window, entered my 'Access Key ID' and 'Secret Access Key'. In order to launch an EC2 instance, I also had to type in my 'AWS Account Number' and provide the paths to the certificate and private key files. 
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430691/38b365ba-49cd-11e5-893c-4834d758b749.jpg)

2) Now it's time to configure an AWS server and launch it. The following screenshots visualize the process. 
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430698/74fe2c58-49cd-11e5-9a28-b2ff10175049.jpg)
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430697/74fe007a-49cd-11e5-819b-2101c3845f70.jpg)
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430699/7503b664-49cd-11e5-891e-4708c286d933.jpg)

3) Finally, an EC2 instance launches and it can be displayed on the the AWS console as well as on the eclipse interface itself.
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430701/750d2276-49cd-11e5-9aab-cf31d45590ff.jpg)


![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430700/75098ce2-49cd-11e5-9cf2-f3353be268e8.jpg)

NOTE: upon configuring an AWS server, you are given the option of creating a new key pair or using an already existing one. Since I did not have an already existing pair, I created a new one and namked it 'messengerPair'.

#REST API Documentation
