# RadarSSE

Server Sent Events is a standard for transmitting data to the client applications using the persistent connection established between the client and the server.  With Server Sent Events (SSE / Event Streaming) approach, our server notifies the browser when the server has some updates in more efficient way.

![image](https://user-images.githubusercontent.com/10458982/160169100-07b8a308-5c9f-4607-a473-6e7b9eadb7f0.png)

http://localhost:8080/api/v1/subscribe : subscribe url registered via EventSource in FE and helped to listed the event change
![image](https://user-images.githubusercontent.com/10458982/160227982-7b242f1a-7b6e-4713-b830-8283578d5642.png)

BE in controller     
![image](https://user-images.githubusercontent.com/10458982/160227933-d7dd4858-65e4-4bf4-b66c-0bac33a239b3.png)



http://localhost:8080/api/v1/dispatchEvent : url to dispatch the event.
![image](https://user-images.githubusercontent.com/10458982/160228043-92fd18b1-0032-44a2-b449-c904db4370db.png)




Data reflected on client from BE as soon as POST request trigerred from postman
![image](https://user-images.githubusercontent.com/10458982/160169238-d633c14d-8f3f-455c-b2e2-b3b0eb36dc4b.png)


Post Request from Postman

![image](https://user-images.githubusercontent.com/10458982/160168237-8e6033d3-7180-446d-9b5b-009f2a67d65c.png)

Data Stored on MongoDB

![image](https://user-images.githubusercontent.com/10458982/160168466-6472d264-d107-4489-9188-7f32ce18fafb.png)


Note* : all the url's are restricted to localhost

