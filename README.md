# RESTful-Messenger
This is my first RESTful API. It is but a simple messenger app that allows a user to post a message, update a message, delete a message and determine whether a particular message is palindromic or not.

#Implementation Architecutre
This project is created using the latest Jave EE Eclipse Mars IDE. I used a Maven project in order to facilitate the task of including the necessary dependancies, namely the 'Jersey' dependancies for taking care of the RESTful component of the project (handling HTTP requests, taking care of path parameters, returning XML and/or JSON responses), and the 'AWS-Java-SDK' to help deploy the application on an AWS instance. The eclipse AWS toolkit is also crucial for deployment. The following diagram provides an illustration.
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430995/b13ef0e6-49d5-11e5-8ec3-f064a7d38108.jpg)

#Use cases
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9431435/2c5d6e8e-49df-11e5-8e32-c298c7991f33.jpg)
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9431434/2c56e4ec-49df-11e5-9bf4-219104ecca0e.jpg)
NOTES:
- This assumes that the user is typing a proper URI
- An invalid ID refers to an ID of a message that does not exist

#Deployment
Luckily for me, as this is  my first time to, a) create a RESTful API, and, b) use AWS, eclipse makes the process of deploying on an EC2 instance simple and easy.

1) Firstly, I had to connect the Maven project to my newly created AWS account. To do so, I went to the AWS toolkit tab in the 'Preferences' window, entered my 'Access Key ID' and 'Secret Access Key'. In order to launch an EC2 instance, I also had to type in my 'AWS Account Number' and provide the paths to the certificate and private key files. 
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430691/38b365ba-49cd-11e5-893c-4834d758b749.jpg)

2) Now it's time to configure an AWS server and launch it. The following screenshots visualize the process. 
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430698/74fe2c58-49cd-11e5-9a28-b2ff10175049.jpg)
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430697/74fe007a-49cd-11e5-819b-2101c3845f70.jpg)
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430699/7503b664-49cd-11e5-891e-4708c286d933.jpg)

3) Finally, an EC2 instance launches and it is displayed on the the AWS console as well as on the eclipse interface itself.
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430701/750d2276-49cd-11e5-9aab-cf31d45590ff.jpg)


![alt tag](https://cloud.githubusercontent.com/assets/5067413/9430700/75098ce2-49cd-11e5-9cf2-f3353be268e8.jpg)

NOTE: upon configuring an AWS server, you are given the option of creating a new key pair or using an already existing one. Since I did not have an already existing pair, I created a new one and named it 'messengerPair'.

Once the application is deployed, a public DNS is provided. The one produced by my EC2 instance is:
*http://messengerenvironment-exhtahi7nu.elasticbeanstalk.com*

#REST API Documentation
I used 'Postman' (a chrome plugin) to test the GET, POST, PUT and DELETE requests. Here's a screenshot:
![alt tag](https://cloud.githubusercontent.com/assets/5067413/9431538/55dfb814-49e1-11e5-9109-28fde00fca5a.jpg)

Here's how to use the GET, POST, PUT and DELETE requests:
- **GET**  *.../MessengerAPI/messages* => to retrieve all the messages
- **GET**   *.../MessengerAPI/messages/id* => to retrieve message with *id* and see if it's plaindromic or not
- **POST**  *.../MessengerAPI/messages* => to post a message. The message should be provided in the body in a json format
- **PUT**   *.../MessengerAPI/messages/id* =>  to replace message with *id* with a new message provided in the body in a json format
- **DELETE**  *.../MessengerAPI/messages/id* => to delete message with *id*

#Future Works
Besides making the application more meaningful, I plan to a) provide a UI and, more importantly, b) deploy it within a container. I have already attempted the latter by exploring Docker. I've spent many hours researching online on ways to integrate my Maven project, AWS and Docker, but to no avail. I was able to find an eclipse Docker image but was not able to make it work due to the lack of documentation. 
