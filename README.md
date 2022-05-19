### Spring Boot Users Registration API

Simple API that registers users and sends a confirmation link via email that expires in 15 minutes.
Spring Security is used for authentication/roles and Postgres to store users and tokens.

The API can create users with the roles of USER, ADMIN and MODERATOR. By default, any user registered is assigned with the role USER.

To use this API with a real client (like a React App for example), you should enable and configure CSRF under security/config/WebSecurityConfig.java and add a proper logout function as a POST request.

At the moment, to register a user you have to send a POST request to
/api/v1/registration with the following values (strings):

* firstName
* lastName
* email
* password

And then a token will be returned, which you have to add to the following endpoint to enable the user:

* /api/v1/registration/confirm?token=token-goes-here

I'm currently working to add JWT and a proper template for the verification email.