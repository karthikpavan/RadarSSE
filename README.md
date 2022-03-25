# RadarSSE

Server Sent Events is a standard for transmitting data to the client applications using the persistent connection established between the client and the server.  With Server Sent Events (SSE / Event Streaming) approach, our server notifies the browser when the server has some updates in more efficient way.

![image](https://user-images.githubusercontent.com/10458982/160169100-07b8a308-5c9f-4607-a473-6e7b9eadb7f0.png)

http://localhost:8080/api/v1/subscribe : subscribe url registered via EventSource in FE and helped to listed the event change
http://localhost:8080/api/v1/dispatchEvent : url to dispatch the event.



Data reflected on client from BE as soon as POST request trigerred from postman
![image](https://user-images.githubusercontent.com/10458982/160169238-d633c14d-8f3f-455c-b2e2-b3b0eb36dc4b.png)


Post Request from Postman

![image](https://user-images.githubusercontent.com/10458982/160168237-8e6033d3-7180-446d-9b5b-009f2a67d65c.png)

Data Stored on MongoDB

![image](https://user-images.githubusercontent.com/10458982/160168466-6472d264-d107-4489-9188-7f32ce18fafb.png)


Note* : all the url's are restricted to localhost

